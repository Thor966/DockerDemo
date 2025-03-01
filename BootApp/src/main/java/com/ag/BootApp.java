package com.ag;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ag.sbeans.SeasonFinder;

@SpringBootApplication
public class BootApp {

	@Bean(name="ld")
	public LocalDate createDate()
	{
	   return LocalDate.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext aca = SpringApplication.run(BootApp.class, args);
		
		// getting the spring bean object
		SeasonFinder finder = aca.getBean("sf",SeasonFinder.class);
		
		// invoking the business method
		String msg = finder.findseason();
		
		System.out.println();
		System.out.println("The current Season is: "+ msg);
		
		// closing the IOC container
		((ConfigurableApplicationContext) aca).close();
		
	}

}
