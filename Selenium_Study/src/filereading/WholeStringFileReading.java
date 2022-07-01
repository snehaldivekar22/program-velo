package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WholeStringFileReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("E:\\Myexcelfile.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		short Totalcell = mysheet.getRow(0).getLastCellNum();
		int TotalRow = mysheet.getLastRowNum();
		for(int i=0;i<=TotalRow;i++)
		{
			for(int j=0;j<=Totalcell-1;j++)
			{
				String v1 = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(v1+"  ");
			}
			System.out.println();
		}


	}

}
