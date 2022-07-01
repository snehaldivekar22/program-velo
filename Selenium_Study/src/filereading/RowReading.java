package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//get one value
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Workbook file = WorkbookFactory.create(myfile);
		Sheet mysheet = file.getSheet("Sheet1");
		Row row = mysheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();//to get return type
		System.out.println(type);
		String value = cell.getStringCellValue();
		System.out.println(value);

	}

}
