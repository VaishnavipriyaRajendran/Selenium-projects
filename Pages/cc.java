package Pages;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class cc
{
	public static void main(String[] args) throws IOException {
		
	
	XSSFWorkbook wb=new XSSFWorkbook("./data/data.xlsx");

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
		
	}
}
