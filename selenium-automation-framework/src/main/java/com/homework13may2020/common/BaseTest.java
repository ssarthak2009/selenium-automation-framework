package com.homework13may2020.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners(InvokedMethodListnerImpl.class)
public class BaseTest {

	@DataProvider(name="excelData")
	public String[][] getExcelData() throws Exception
	{
		String fileName = "C:\\Users\\jsamdus\\Desktop\\Selenium_Workspace\\selenium-automation-framework\\src\\main\\java\\com\\homework13may2020\\test\\LoginTest.xlsx";
		return ExcelReader.getExcelTableArray(fileName,"verifyAdminLogin");
	}
	
	
	@DataProvider(name="loginData")
	public String[][] getLoginData()
	{
		String data[][] = {
				{"Admin","admin"},
				{"User" ,"user"},
				{"TSarthak","sarthak2009"}
		};
		return data;
	}
	
	@DataProvider(name="csvData")
	public String[][] getCSVData() throws IOException
	{
		String csvFile = "C:\\Selenium\\CSV.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		String data[][] = new String[3][2];
		br = new BufferedReader(new FileReader(csvFile));
        int i = 0;
		while ((line = br.readLine()) != null) {
        
			// use comma as separator
			String[] loginDataLine = line.split(cvsSplitBy);			
			System.out.println(line);
            data[i]=loginDataLine;
            i=i+1;
		}
		return data;
	}
	
}
