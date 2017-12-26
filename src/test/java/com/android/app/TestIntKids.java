package com.android.app;

import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.android.ddmlib.Log;

import io.appium.java_client.TouchAction;


public class TestIntKids extends CommonTest{
		
	@Test
	public void FirstTest() throws InterruptedException, IOException {
		 
//Получение размера экрана
// /*
  		Dimension dimensions = driver.manage().window().getSize();
		  int screenWidth = dimensions.getWidth();
		  int screenHeight = dimensions.getHeight();
		  System.out.println(screenWidth);
		  System.out.println(screenHeight);
//Засыпаем, пока не появится кнопка
		  Thread.sleep(22000);
//Нажатие на кнопку подтверждения записи
		  TouchAction a2 = new TouchAction(driver);
		  a2.tap(897, 810).perform();		  
		  Thread.sleep(2000);
//Нажатие на кнопку подтверждения записи		  
		  a2.tap(1230, 650).perform();		  
		  Thread.sleep(13000);
//Нажать на вагон с пазлами		  
		  a2.tap(1230, 650).perform();
		  Thread.sleep(2000);
//Нажать на пазл, ждем, пока загрузится
		  a2.tap(1230, 650).perform();
		  Thread.sleep(20000);
//Нажать на пазл
		  a2.tap(1230, 650).perform();
		  Thread.sleep(2000);
//Swipe на координаты 0.0		  
		  a2.press(1230, 950).moveTo(0, 0).perform();
// */
//Тут запускается параллельный поток для adb
		  AdbThread thread = new AdbThread();
			 System.out.println(thread.getName());
			 thread.sleep(5000);
 
//Запустить Adb-команду (вероятно, тут надо поток завершить)
			 thread.run("shell"+" "+"input"+" "+ "tap"+" "+ "1230"+" "+ "650");
//Основной поток засыпает
		  Thread.sleep(60000);
	  
			 
		
	}

	


}
