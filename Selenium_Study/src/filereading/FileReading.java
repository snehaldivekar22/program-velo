package filereading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	File myfile=new File("E:\\Myexcelfile.xlsx");
//get String Value
	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
    System.out.println(name);

//get integer value
     double num = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
	System.out.println(num);
	
//get Boolean Value
	System.out.println(WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue());
	
	
	}

}
