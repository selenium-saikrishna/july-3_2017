package day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperations {
	public static void main(String[] args) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\gandh\\Documents\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=ws.getRow(0);
		r.getCell(1).setCellValue("AAAAAA");
		
		r=ws.getRow(1);
		r.createCell(3).setCellValue("BBBBB");
		
		r=ws.createRow(3);
		r.createCell(0).setCellValue("DDDDDD");
		
		
		
		
		
		
		
		
		
		FileOutputStream f=new FileOutputStream("C:\\Users\\gandh\\Documents\\Book1.xlsx");
		wb.write(f);
		
	}

}
