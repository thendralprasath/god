import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Good {
	public static void main(String[] args) {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\ARI\\Desktop\\eworkspace\\God\\driver\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com" );
	       String ti=driver.getTitle();
	       System.out.print(ti);
	       
	     String url=driver.getCurrentUrl();
	       System.out.print(url);
}
}
