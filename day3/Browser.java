package week1.day3;

public class Browser {

	public String launchBrowser (String browserName) {
		System.out.println("Browser Launched Sucessfully - "+ browserName);
		return browserName;
	}
	 void loadUrl() {
		System.out.println("Applications URL Loaded Sucessfully");
	}
	public static void main(String[] args) {
		
		Browser b= new Browser();
		b.launchBrowser("Chrome");
		b.loadUrl();
	
	}

}
