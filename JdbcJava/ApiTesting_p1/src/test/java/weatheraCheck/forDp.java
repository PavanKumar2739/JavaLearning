package weatheraCheck;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class forDp {
  @Test(dataProvider = "data3")
  public void f(String n1,String n2,String email,String age) {
	  System.out.println(n1+" "+n2+" "+email+"  "+age);
  }

  @DataProvider
  public Object[][] dp1() {
    return new Object[][] {
      new Object[] { "pavan", "kumar","pavn@gmail" },
      new Object[] { "yuvi", "singh","yuvi@gmail" },
      new Object[] { "raina", "","raina@gmail" },
    };
  }
  @DataProvider(name = "data2")
  public Object[][] dp2() {
	  Object obj[][]=new Object[][] {{"pavan","kumar","kumar@gmail"}, { "yuvi", "singh","yuvi@gmail" },{ "raina", "","raina@gmail" }};
	  return obj;
}
  @DataProvider(name = "data3")
  public Object[][] dp3() throws Exception {
	  FileInputStream file = new FileInputStream("D:\\selenium\\excel\\data.xlsx");
	  XSSFWorkbook xlBook= new XSSFWorkbook(file);
	  XSSFSheet xlSheet =xlBook.getSheetAt(0);
	  DataFormatter df=new DataFormatter();
	  int rowLen=xlSheet.getLastRowNum()-xlSheet.getFirstRowNum();
	  int colLen=xlSheet.getRow(0).getLastCellNum();
	  Object obj[][]=new Object[rowLen][colLen] ;
	  System.out.println(colLen+" "+rowLen);
	  for(int i=0;i<rowLen;i++) {
		  
			  obj[i][0]=df.formatCellValue(xlSheet.getRow(i+1).getCell(0)) ;
			  obj[i][1]=df.formatCellValue(xlSheet.getRow(i+1).getCell(1)) ;
			  obj[i][2]=df.formatCellValue(xlSheet.getRow(i+1).getCell(2)) ;
			  obj[i][3]=(int)(xlSheet.getRow(i+1).getCell(3).getNumericCellValue()) ;

	  }
	  xlBook.close();
	  file.close();
	  return obj;
}
}
