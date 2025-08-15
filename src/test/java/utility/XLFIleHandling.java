package utility;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class XLFIleHandling {

	public static void main(String[] args) {
		String filePath = "TestData.xlsx";

		try {
			// -------------------- WRITE DATA --------------------
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet("Data");

			Row row0 = sheet.createRow(0);
			row0.createCell(0).setCellValue("Name");
			row0.createCell(1).setCellValue("Age");

			Row row1 = sheet.createRow(1);
			row1.createCell(0).setCellValue("John");
			row1.createCell(1).setCellValue(25);

			FileOutputStream fos = new FileOutputStream(filePath);
			workbook.write(fos);
			fos.close();
			workbook.close();

			System.out.println("Excel file created successfully!");

			// -------------------- READ DATA --------------------
			FileInputStream fis = new FileInputStream(filePath);
			Workbook readWorkbook = new XSSFWorkbook(fis);
			Sheet readSheet = readWorkbook.getSheet("Data");

			for (Row row : readSheet) {
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue() + "\t");
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t");
						break;
					default:
						System.out.print("Unknown\t");
					}
				}
				System.out.println();
			}

			readWorkbook.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
