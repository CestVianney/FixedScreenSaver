package com.screensaver.screensaver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
@ComponentScan({"com.screensaver.*"})
public class ScreensaverApplication {

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ScreensaverApplication.class);
		builder.headless(false);
		ConfigurableApplicationContext context = builder.run(args);
	}

}
