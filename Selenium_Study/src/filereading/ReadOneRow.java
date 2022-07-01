package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadOneRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Static Row reading
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		for(int i=0;i<=2;i++)
		{
			String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value);
		}
		System.out.println();
		//dynamic column reading
		short TotalNoCell = mysheet.getRow(0).getLastCellNum();
		int TotalRow = mysheet.getLastRowNum();
		System.out.println(TotalRow);
		for(int i=0;i<=TotalNoCell-1;i++)
		{
			String v1 = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(v1);
		}

	}

}
