package pl.pwn.reaktor.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	
	public static String convertDate(Date date) {
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
		return dtf.format(date);
	}                      

	public static Date convertString(String value) throws ParseException {
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
		return dtf.parse(value);
		
		
	}
	
}
