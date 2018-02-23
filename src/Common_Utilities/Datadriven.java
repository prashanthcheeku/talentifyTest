package Common_Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven
{
	String path="G:\\Prashanth\\BT\\Business_Talent\\Testdata\\BT.xlsx";
public String get(String sname,int rnum,int cnum) throws IOException
{
	FileInputStream fis=new FileInputStream(path);
	XSSFWorkbook x=new XSSFWorkbook(fis);
	XSSFSheet s=x.getSheet(sname);
	String data=s.getRow(rnum).getCell(cnum).getStringCellValue();
	return data;
}
}
