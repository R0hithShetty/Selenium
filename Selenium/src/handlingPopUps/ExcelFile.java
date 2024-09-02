package handlingPopUps;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
    Workbook var = WorkbookFactory.create(fis);
     String data = var.getSheet("testscript").getRow(1).getCell(1).getStringCellValue();
     System.out.println(data);
	}

}
