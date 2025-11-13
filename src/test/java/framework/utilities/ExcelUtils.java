package framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String[][] readData(String fileName, String sheetName) {

		String data[][] = null;

		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sheet = wb.getSheet(sheetName);

			int totalRows = sheet.getPhysicalNumberOfRows();
			int totalColums = sheet.getRow(0).getPhysicalNumberOfCells();

			data = new String[totalRows][totalColums];

			for (int r = 0; r < totalRows; r++) {

				for (int c = 0; c < totalColums; c++) {

					data[r][c] = sheet.getRow(r).getCell(c).getStringCellValue();

					System.out.println(data[r][c]);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

	public static void main(String[] args) {

		readData("TestData.xlsx", "Sheet1");
	}

}
