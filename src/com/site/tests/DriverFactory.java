package com.site.tests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static Map<String, WebDriver> drivers = new HashMap<>();
	
	public static WebDriver getDriver(String name) {
		return drivers.computeIfAbsent(name, d -> new FirefoxDriver());
	}

}
