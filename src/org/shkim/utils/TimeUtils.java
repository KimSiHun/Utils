package org.shkim.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils
{
	/**
	 * 
	 * @param startTime
	 * @param endTime
	 * @return long sec
	 */
	public static long timeDiff(long startTime, long endTime)
	{
		return (endTime - startTime) / 1000L;
	}

	public static long getSystemTime()
	{
		return System.currentTimeMillis();
	}

	/**
	 * 
	 * @param time
	 * @return input long timestamp_time, String date format -> output
	 *         dateformat string time
	 */
	public static String format_string_time(long time, String format)
	{
		return new SimpleDateFormat(format).format(new Date(time));
	}

}
