package com.Shopping.Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataDrivenTesting 
{
	//DATA DRIVEN TESTING
		// @Test(dataProvider="DataPro")  (in test case file)
		
		//Provide data
		@DataProvider(name="DataPro")
		public String[][] getData() throws Exception
		{
			String s1[][]=getExcelData();
			return s1;
		}
		
		//Access File data like=Excel
		public String[][] getExcelData() throws Exception
		{
			String fileName="/Users/dhanishkumar/Desktop/Book1.xlsx";//File Location
			FileInputStream fn=new FileInputStream(fileName);//Access file
			XSSFWorkbook wb=new XSSFWorkbook(fn);//Access workbook
			XSSFSheet ws=wb.getSheet("Sheet1");//Access sheet
			int rowcount=ws.getLastRowNum()+1;//find how many row
			int colcount=ws.getRow(0).getLastCellNum();//find how many column
			String s2[][]=new String[rowcount][colcount];
			for(int i=0;i<rowcount;i++)//check data
			{
				for(int j=0;j<colcount;j++)
				{
					s2[i][j]=ws.getRow(i).getCell(j).toString();
				}
			}
			return s2;//all data store in s2
		}
}
