package org.shkim.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils
{
	public static final long	ONE_SEC		= 1000L;
	public static final long	ONE_MINUTE	= 60 * ONE_SEC;
	public static final long	ONE_HOUR	= 60 * ONE_MINUTE;
	public static final long	ONE_DAY		= 24 * ONE_HOUR;

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

	public static boolean isRealTime(long chkTime)
	{
		if (System.currentTimeMillis() - chkTime < 300L)
		{
			return true;
		}
		return false;
	}

}
