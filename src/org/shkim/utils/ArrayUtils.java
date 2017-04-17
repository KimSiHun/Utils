package org.shkim.utils;

public class ArrayUtils
{
	public static int get_max_value(int A[])
	{

		int N = A.length;

		if (N == 0)
		{
			try
			{
				throw new Exception("arrays length is 0");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		int min = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++)
		{
			if (A[i] > min)
			{
				min = A[i];
			}
		}

		return min;
	}

	public static int get_min_value(int A[])
	{

		int N = A.length;
		if (N == 0)
		{
			try
			{
				throw new Exception("is not array");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		int max = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++)
		{
			if (A[i] < max)
			{
				max = A[i];
			}
		}

		return max;
	}

}
