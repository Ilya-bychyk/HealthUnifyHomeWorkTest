package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HealthHomeWork {

        WebDriver driver;

    @Test
    public void verifyWeight1Test() {
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("59");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("180");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        String text = driver.findElement(By.xpath("//input[@name='desc']")).getAttribute("value");
        Assert.assertEquals(text, "Your category is Underweight");
    }
    @Test
    public void verifyWeight2Test() {
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("60");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("180");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        String text = driver.findElement(By.xpath("//input[@name='desc']")).getAttribute("value");
        Assert.assertEquals(text, "Your category is Normal");
    }
    @Test
    public void verifyWeight3Test() {
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("100");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("180");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        String text = driver.findElement(By.xpath("//input[@name='desc']")).getAttribute("value");
        Assert.assertEquals(text, "Your category is Obese");
    }
    @Test
    public void verifyWeight4Test() {
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("80");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("180");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        String text = driver.findElement(By.xpath("//input[@name='desc']")).getAttribute("value");
        Assert.assertEquals(text, "Your category is Normal");
    }

    @Test
    public void verifyWeight5Test() {
        driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.xpath("//input[@name='wg']")).sendKeys("82");
        driver.findElement(By.xpath("//input[@name='ht']")).sendKeys("180");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();
        String text = driver.findElement(By.xpath("//input[@name='desc']")).getAttribute("value");
        Assert.assertEquals(text, "Your category is Overweight");
    }

    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }
}
