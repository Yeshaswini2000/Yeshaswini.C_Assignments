package day5;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {

	@Test
	public void testDate() {
		Date date=new Date();
		System.out.println(date);                /*
											*HH-hour mm-Minute ss-SECOND SS-MILLISECONS YY/YYYY-YEAR MM/MMM-MONTH DD-NUMBER OF DAYS COUNT IN THE YEAR dd-DATE */
		DateFormat df=new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss:SS");
		System.out.println(df.format(date));
		}
	
@Test
public void testDateOldWay() {
Date date=new Date(47,7,15);
System.out.println(date); 
//System.out.println(df.format(date));
}


@Test
public void testDatewithCal() {
	Calendar cal=Calendar.getInstance();
	cal.set(Calendar.YEAR,1947);
	cal.set(Calendar.MONTH,Calendar.AUGUST);
	cal.set(Calendar.DATE,15);
	Date date=cal.getTime();
	System.out.println(date);
	DateFormat df=new SimpleDateFormat("dd-MMM-YYYY HH:mm:ss:SS");
	System.out.println(df.format(date));
}

@Test
public void testDateFromString() throws Exception {
	DateFormat df=new SimpleDateFormat("dd-MM-YYYY");
	Date date=df.parse("15-08-1997");
	System.out.println(date);
	
}


}
