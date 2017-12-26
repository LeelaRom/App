package com.android.app;

import java.io.IOException;

import com.android.ddmlib.Log;

public class AdbThread extends Thread {
// Конструктор
    AdbThread() {
        // Создаём новый поток
        super("Новый поток");
        System.out.println("Создан поток ADB ");
//      start(); // Запускаем поток
    }
    public void run(String adbCommand) {
    	System.out.println("Поток ADB запущен");

        try {
            for (int i = 1; i > 0; i--) {
            	System.out.println("Поток: "+i);
            	excAdbCommand(adbCommand);
        		Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
        	System.out.println("Поток ADB прерван");
        }
    }
    
	/*
	 * Решение по запуску abd команд не кроссплатформенное. Работает только на винде
	 */
	public void excAdbCommand(String commandAdb){
		String[] cmdd = new String[] {"cmd /c start AdbBat.bat", "devices"};
		String cmd = ("cmd /c start AdbBat.bat"+" \""+ commandAdb+"\"");
	    try {
	    	    // Execute command
	    	    Process child = Runtime.getRuntime().exec(cmd);
	    	} catch (IOException e) {}
	    	
	}

		/*		try {
		ProcessBuilder pb = new ProcessBuilder("adb", "-s", "X9LDU16226002597", "shell", "input", "1230", "650");
		Process pc = pb.start();
		Process proc = new ProcessBuilder("cmd.exe", "/C", "devices").start();
		System.out.println("Done");
		} catch (IOException e) {
			System.out.println("Not Done");
		}
*/		
	}


