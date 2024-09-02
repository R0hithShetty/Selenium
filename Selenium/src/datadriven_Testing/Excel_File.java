package datadriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_File {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    String data = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
    System.out.println(data);
    String data1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
    System.out.println(data1);
   
	}

}
