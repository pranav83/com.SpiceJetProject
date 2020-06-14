import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Table {
    /*
    What is our test case is that every thing is in sorted list
    when I click sorted then I get sorted list
    So to reterive data in asscending order we have to first retrevie the arraylist of items
    Arraylist ---- create another arraylist and then sort it
     */

    WebDriver driver;

    @Test
    public void unSortedgorder() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        List<WebElement> firstColumnlist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        ArrayList<String> orignalList = new ArrayList<>();
//        for (int i=0; i<firstColumnlist.size(); i++){
//            System.out.println(firstColumnlist.get(i).getText());
//        }
        for (int i = 0; i < firstColumnlist.size(); i++) {
            orignalList.add(firstColumnlist.get(i).getText());
        }
        System.out.println(orignalList);
        // Now lets make third webelements arraylist
        ArrayList<String> sortedList = new ArrayList<>();
        for (int x = 0; x < orignalList.size(); x++) {
            sortedList.add(orignalList.get(x));
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);
        Assert.assertFalse(orignalList.equals(sortedList));
        Thread.sleep(2000);
        driver.quit();
    }

    // Lets write ascending order test case

    @Test
    public void sortedList() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();
        driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();


        List<WebElement> firstColumnlist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        ArrayList<String> orignalList = new ArrayList<>();
//        for (int i=0; i<firstColumnlist.size(); i++){
//            System.out.println(firstColumnlist.get(i).getText());
//        }
        for (int i = 0; i < firstColumnlist.size(); i++) {
            orignalList.add(firstColumnlist.get(i).getText());
        }
        System.out.println(orignalList);
        // Now lets make third webelements arraylist
        ArrayList<String> sortedList = new ArrayList<>();
        for (int x = 0; x < orignalList.size(); x++) {
            sortedList.add(orignalList.get(x));
        }
        Collections.sort(sortedList);
        System.out.println(sortedList);
        Assert.assertTrue(orignalList.equals(sortedList));
        driver.quit();}

        // Lets write descending order test case

    @Test
    public void sortedDecsendingList() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();
      //  driver.findElement(By.xpath("//b[contains(text(),'Veg')]")).click();


        List<WebElement> firstColumnlist = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        ArrayList<String> orignalList = new ArrayList<>();
//        for (int i=0; i<firstColumnlist.size(); i++){
//            System.out.println(firstColumnlist.get(i).getText());
//        }
        for (int i = 0; i < firstColumnlist.size(); i++) {
            orignalList.add(firstColumnlist.get(i).getText());
        }
        System.out.println(orignalList);
        // Now lets make third webelements arraylist
        ArrayList<String> sortedList = new ArrayList<>();
        for (int x = 0; x < orignalList.size(); x++) {
            sortedList.add(orignalList.get(x));
        }
        Collections.sort(sortedList);
        Collections.reverse(sortedList);
        System.out.println(sortedList);
        Assert.assertTrue(orignalList.equals(sortedList));
        driver.quit();}




}
