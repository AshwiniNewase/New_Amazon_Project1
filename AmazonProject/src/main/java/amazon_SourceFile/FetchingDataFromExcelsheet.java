package amazon_SourceFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.DataProvider;

public class FetchingDataFromExcelsheet 
{
	public static String username1;
	public static String password1;
	public static String username2;
	public static String password2;
	public String username3;
	public String password3;
	
	public void
	amazon_logindeatils() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("/Users/kiranshinde/eclipse-workspace/AmazonProject/AmazonLoginData/amazon_data.xlsx");
		Workbook workbook=WorkbookFactory.create(file);
		 username1=workbook.getSheet("LoginDetails").getRow(0).getCell(0).getStringCellValue();
		 password1=workbook.getSheet("LoginDetails").getRow(0).getCell(1).getStringCellValue();
		 username2=workbook.getSheet("LoginDetails").getRow(1).getCell(0).getStringCellValue();
		 password2=workbook.getSheet("LoginDetails").getRow(1).getCell(1).getStringCellValue();
		 username3=NumberToTextConverter.toText(workbook.getSheet("LoginDetails").getRow(2).getCell(0).getNumericCellValue());
		 password3=workbook.getSheet("LoginDetails").getRow(2).getCell(1).getStringCellValue();
		 file.close();
	
	}
}
