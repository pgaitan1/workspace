package pack1;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class DataDrivenPractice {
	
private WebDriver mydriver;
//private WebDriver myfirstdriver;
String myURL ="https://www.facebook.com/";
String firstname;
String lastname;
String email;
String password;
int myRows,myCols;
	
	@Before
	public void setup()throws Exception{
	
	
	
	
	mydriver=new FirefoxDriver();
	
	
	
	}
	
	@Test
	public void mymaintest()throws Exception{
		
	String SheetPath="/Users/paul/Desktop/Excel Projects/Testdata.xls";
	
    
	
	String [][] myXLSheet= readXLSheet(SheetPath,"data");
	
	
	//this is the for loop for navigating excel file 
	
	for (int k=0;k<myRows;k++){
		
		
	firstname=myXLSheet[k][0];
	lastname = myXLSheet[k][1];
	email = myXLSheet[k][2];
	password = myXLSheet[k][3];
	
	mydriver.navigate().to(myURL);	
	
	mydriver.findElement(By.xpath(".//*[@id='u_0_2']")).sendKeys(firstname);
	mydriver.findElement(By.xpath(".//*[@id='u_0_4']")).sendKeys(lastname);
	mydriver.findElement(By.xpath(".//*[@id='u_0_7']")).sendKeys(email);
	mydriver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys(password);
	
	
	
	}
	
	}
	
	
	
	// Method/Function for reading data from Excel Sheet
		public String[][] readXLSheet(String SheetPath, String SheetName) throws Exception{

			String[][] xData;                                                                
			
			File myXLSheet = new File(SheetPath);                                
			FileInputStream myStream = new FileInputStream(myXLSheet);                                
			HSSFWorkbook myWB = new HSSFWorkbook(myStream);                                
			HSSFSheet mySheet = myWB.getSheet(SheetName);                                 
			myRows = mySheet.getLastRowNum()+1;                                
			myCols = mySheet.getRow(0).getLastCellNum();                                
			xData = new String[myRows][myCols];        
			for (int i = 0; i < myRows; i++) {                           
					HSSFRow row = mySheet.getRow(i);
					for (int j = 0; j < myCols; j++) {                               
						HSSFCell cell = row.getCell(j);                               
						String value = cellToString(cell);                               
						xData[i][j] = value;                               
						}        
					}                                      
			return xData;
		}

	

	
	

	//Method/Function to Change cell type
		public static String cellToString(HSSFCell cell) { 
						int type = cell.getCellType();                        
			Object result;                        
			switch (type) {                            
				case HSSFCell.CELL_TYPE_NUMERIC: //0                                
					result = cell.getNumericCellValue();                                
					break;                            
				case HSSFCell.CELL_TYPE_STRING: //1                                
					result = cell.getStringCellValue();                                
					break;                            
				case HSSFCell.CELL_TYPE_FORMULA: //2                                
					throw new RuntimeException("We can't evaluate formulas in Java");  
					case HSSFCell.CELL_TYPE_BLANK: //3                                
					result = "-";                                
					break;                            
				case HSSFCell.CELL_TYPE_BOOLEAN: //4     
					result = cell.getBooleanCellValue();       
					break;                            
				case HSSFCell.CELL_TYPE_ERROR: //5       
					throw new RuntimeException ("This cell has an error");    
				default:                  
					throw new RuntimeException("We don't support this cell type: " + type); 
					}                        
			return result.toString();      
			}


	@After
	public void teardown()throws Exception{
	mydriver.quit();
}
}
	



