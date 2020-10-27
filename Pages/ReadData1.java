package Pages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Base.ProjectSpecificMethodsOlay;

public class ReadData1 extends ProjectSpecificMethodsOlay
{
	@DataProvider(name="readData")
	
public static String[][] readData(String filename) throws IOException 
{
	//create workbook
XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");

//create sheet
XSSFSheet ws = wb.getSheetAt(0);

//find the Rows numbers
int rowCount = ws.getLastRowNum();

//find column
int  columncount = ws.getRow(0).getLastCellNum();

String[][] data=new String[rowCount][columncount];

for (int i = 1; i <=rowCount; i++) 
{
	for (int j = 0; j <=columncount-1; j++)
	{	
	String cellvalue=data[i-1][j]=ws.getRow(i).getCell(j).getStringCellValue();
	System.out.println(cellvalue);
		}
	
	}
	return data;
	
}



}

