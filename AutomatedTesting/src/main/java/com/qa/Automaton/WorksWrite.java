package com.qa.Automaton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorksWrite {

	public void saveResult(String string, int fightthepowah) throws IOException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(Constants.pathDDT + Constants.DDTSheet1);
		} catch (FileNotFoundException fnfe) {
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			file.close();
			FileOutputStream stream = null;
			try {
				stream = new FileOutputStream(Constants.pathDDT + Constants.DDTSheet1);
			} catch (FileNotFoundException fnfe1) {
			}
			XSSFCell cell = sheet.getRow(fightthepowah).getCell(3);
			if (cell == null) {
				cell = sheet.getRow(fightthepowah).createCell(3);
			}
			cell.setCellType(CellType.STRING);
			cell.setCellValue(string);
			cell = sheet.getRow(fightthepowah).getCell(4);
			if (cell == null) {
				cell = sheet.getRow(fightthepowah).createCell(4);

			}
			cell.setCellType(CellType.STRING);
			cell.setCellValue(string.equals("**Successful Login**") ? "Pass" : "Fail");
			workbook.write(stream);
			stream.close();
			workbook.close();
		} catch (IOException ioe) {
			System.out.println("You done goofed! " + ioe.toString());
		}
		file.close();
	}

}
