package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingAnyDataType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		int totalrow = mysheet.getLastRowNum();
		int totalcell = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalrow;i++)
		{
		  for(int j=0;j<=totalcell;j++)
		  {
		
		Cell cell = mysheet.getRow(i).getCell(j);
		CellType type = cell.getCellType();
		if(type==CellType.STRING)
		{
			System.out.println(cell.getStringCellValue());
		}
		else if(type==CellType.NUMERIC)
		{
			System.out.print(cell.getNumericCellValue());
		}
		else if (type==CellType.BOOLEAN)
         { 
	       System.out.print(cell.getBooleanCellValue());
         }
		else if(type==CellType.BLANK)
        {
	       System.out.print("==");
          }
	   }
		  System.out.println();
		}
	}
}
