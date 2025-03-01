package com.ag.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder 
{
	@Autowired
	LocalDate ld; // HAS_A property
	
	// business method 
	public String findseason()
	{
		int month = ld.getMonthValue();
		
		if(month>=2 && month<=5)
			return "Summer Season";
		else if(month>=6 && month<=9)
			return "Rainy season";
		else 
			return "Winter Season";
	}

}
