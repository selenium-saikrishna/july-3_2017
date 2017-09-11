package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperations {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\gandh\\Documents\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			int colCount=r.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				String data=r.getCell(j).getStringCellValue();
				System.out.print(data+"   ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}
