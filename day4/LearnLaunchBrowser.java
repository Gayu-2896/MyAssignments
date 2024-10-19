package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://platform.testleaf.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

		
	}

}
