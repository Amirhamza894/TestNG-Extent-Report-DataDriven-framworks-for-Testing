package DataDrivenDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String testcase) throws IOException
	{
		ArrayList<String> a = new ArrayList<String>();
		
		FileInputStream file = new FileInputStream("D:\\eclipse-workspace\\TestNGpractice\\Data\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i=0; i<sheets; i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet2"))
			{
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while(ce.hasNext())
				{
					Cell value = ce.next();
					if(value.getStringCellValue().equals("TestCase"))
					{
						column = k;
					}
					k++;
				}
				System.out.println(column);
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcase))
					{
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext())
						{
							Cell cr = cv.next();
							if(cr.getCellType() == CellType.STRING)
							{
								a.add(cr.getStringCellValue());
							}
							else {
								a.add(NumberToTextConverter.toText(cr.getNumericCellValue()));
								
							}
						}
					}
				}
				
			}
		}
		
		return a;
		//check sample testcase file, there we got the data.
	}

	public static void main(String[] args) throws IOException {
		


	}

}
