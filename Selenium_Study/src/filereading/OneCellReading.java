package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OneCellReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//static cell reading
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		for(int i=0;i<=1;i++)
		{
			String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		//dynamic cell reading
		short TotalCell = mysheet.getRow(0).getLastCellNum();
		System.out.println(TotalCell);
		int totalRor = mysheet.getLastRowNum();
		System.out.println(totalRor);
		for(int i=0;i<=totalRor;i++)
		{
			String v1 = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(v1);
		}

	}

}
