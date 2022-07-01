package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AnydataRowReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
		int totalRow = mysheet.getLastRowNum();
		System.out.println(totalRow);
		short totalcell = mysheet.getRow(0).getLastCellNum();
		for(int i=0;i<=totalcell-1;i++)
		{
		Cell cell = mysheet.getRow(0).getCell(i);
		CellType type = cell.getCellType();
		if(type==CellType.STRING)
		{
			System.out.println(cell.getStringCellValue());
		}
		else if(type==CellType.NUMERIC)
		{
			System.out.println(cell.getNumericCellValue());
		}
		else if(type==CellType.BOOLEAN)
		{
			System.out.println(cell.getBooleanCellValue());
		}
//		else if(type==null)
//		{
//			 System.out.println("");
//		}
//		else if(type==CellType.BLANK)
//		{
//			
//			cell.setBlank();
//			
//			
//			
//		}
		}
	}

}








