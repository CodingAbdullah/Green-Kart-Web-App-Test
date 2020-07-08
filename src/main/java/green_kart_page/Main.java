package green_kart_page;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Set<Integer> vegetableSet = new HashSet<Integer>();
		
		System.setProperty("webdriver.chrome.driver", "//Users//fresh//Desktop//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000");
		driver.findElement(By.xpath("//nav//div[contains(@class, 'navbar-collapse')][1]//ul//li[1]")).click(); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000L);

		// Pick a random vegetable, pick a random numberOfItems
		Map<Integer, Vegetable> vegetableQuantityMap = new HashMap<Integer, Vegetable>();
		
		
		for (int i = 0; i < 5; i++) {
			int randomVegetable = (int) ((int) 30 * Math.random() + 1);
			
			while (vegetableSet.contains(randomVegetable)) {
				randomVegetable = (int)((int) 30 * Math.random() + 1);
			}
			
			vegetableSet.add(randomVegetable); // Add to set to avoid duplicate
			int randomQuantity = (int)((int) 5 * Math.random() + 1); // Add the random quantity of vegetables
			
			
			// Find vegetable name
			String vegetableName = driver.findElement(By.xpath("//div[@class='container']//div[@class='product-card'][" + randomVegetable + "]//h5")).getText();
			
			// Find the vegetable price
			double price = Double.parseDouble(driver.findElement(By.xpath("//div[@class='container']//div[@class='product-card'][" + randomVegetable + "]//h6")).getText().split(" ")[1].split("/")[0].substring(1));
			
			// Create a new vegetable with the available information
			vegetableQuantityMap.put(randomVegetable,  new Vegetable(vegetableName, price, randomQuantity));
			
			for (int j = 0; j < randomQuantity; j++) {
				Thread.sleep(4000L);
				driver.findElement(By.xpath("//div[@class='container']//div[@class='product-card'][" + randomVegetable + "]//div[@class='card']//div[2]//button")).click();
			}
		}
		
		for (int k = 0 ; k < vegetableQuantityMap.keySet().toArray().length; k++) {
			System.out.println(vegetableQuantityMap.keySet().toArray()[k] + " " + vegetableQuantityMap.get(vegetableQuantityMap.keySet().toArray()[k]).getName() + " " + vegetableQuantityMap.get(vegetableQuantityMap.keySet().toArray()[k]).getPrice() + " " + vegetableQuantityMap.get(vegetableQuantityMap.keySet().toArray()[k]).getQuantity());
		}
	}
}
