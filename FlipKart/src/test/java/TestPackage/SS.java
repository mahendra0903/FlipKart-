package TestPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class SS {
	
	public static void screenshot (TakesScreenshot driver) throws IOException {
		Date currentdate = new Date();
		String screenshotfilename = "mahendra "+currentdate.toString().replace(" ","-").replace(":","-");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "C:\\ananta\\"+screenshotfilename+".png";
		File p = new File(path);
		FileHandler.copy(src, p);
	}

}
