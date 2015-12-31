package com.hotfey.flume.util;

import java.util.Calendar;
import java.util.Date;

public class DateAssign {
	/**
	 * Adds or subtracts the specified amount of time to the given calendar
	 * field, based on the calendar's rules. For example, to subtract 5 days
	 * from the current time of the calendar, you can achieve it by calling:
	 * add(Calendar.DAY_OF_MONTH, -5).
	 * 
	 * @param days
	 *            - the amount of days to be added to the field.
	 * @return
	 */
	public static Date assignDay(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}

	/**
	 * Adds or subtracts the specified amount of time to the given calendar
	 * field, based on the calendar's rules. For example, to subtract 5 hours
	 * from the current time of the calendar, you can achieve it by calling:
	 * add(Calendar.HOUR_OF_DAY, -5).
	 * 
	 * @param hours
	 *            - the amount of hours to be added to the field.
	 * @return
	 */
	public static Date assignHour(int hours) {
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(Calendar.YEAR, Calendar.getInstance().get(Calendar.YEAR));
		calendar.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH));
		calendar.set(Calendar.DAY_OF_MONTH, Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		calendar.set(Calendar.HOUR_OF_DAY, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		calendar.add(Calendar.HOUR_OF_DAY, hours);
		return calendar.getTime();
	}
}
