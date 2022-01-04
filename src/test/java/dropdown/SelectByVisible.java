package dropdown;

import com.sun.org.apache.bcel.internal.generic.Select;

public class SelectByVisible {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://gmail.com");
        Select fruits=new Select(driver.findElement(By.id("fruit")));
        fruits.selectByvisibleText("banana");
        fruits.selectByIndex(1);
    }
}
