package com.android.app;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

public class MonkeyTest extends CommonTest{
	@Test
	public void FirstTest() throws InterruptedException, IOException {
		 
// /*
		  System.out.println("MonkeyTest");
//Засыпаем, пока не появится кнопка
		  Thread.sleep(20000);
//Нажатие на кнопку подтверждения записи
		  TouchAction a2 = new TouchAction(driver);
		  a2.tap(897, 810).perform();		  
		  Thread.sleep(2000);
//Нажатие на кнопку подтверждения записи		  
		  a2.tap(1230, 650).perform();		  
		  Thread.sleep(13000);
//Тут запускается параллельный поток для adb
		  AdbThread thread = new AdbThread();
			 System.out.println(thread.getName());
			 thread.sleep(5000);
			 thread.run("shell"+" "+"monkey"+" "+"-p"+" "+"com.intellectokids.academy"+" "+"--throttle"+" "+"500"+" "+"-v"+" "+"1000");
//Основной поток засыпает
		  Thread.sleep(60000);
// */	  
			 
		
	}

}
