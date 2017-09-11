package day24.testuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteEmployee  extends BaseClass{
	@Test
	public void deleteTest()
	{
		driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		WebElement table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals("8080"))
				{
					cols.get(j-1).click();
					break;
				}
			}
		}
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		
	}

}
