package com.qa.Automaton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Unlimited {
	public List<String[]> makeList() throws IOException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(Constants.pathDDT + Constants.DDTSheet1);
		} catch (FileNotFoundException fnfe) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException ioe) {
		}
		XSSFSheet sheet = workbook.getSheetAt(0);
		List<String[]> returnable = new ArrayList<String[]>();
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			String[] temp = { sheet.getRow(i).getCell(0).getStringCellValue(),
					sheet.getRow(i).getCell(1).getStringCellValue(), sheet.getRow(i).getCell(2).getStringCellValue(), "" + i };
			returnable.add(temp);
		}
		file.close();
		return returnable;
	}
	
}
