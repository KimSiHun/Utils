package org.shkim.utils;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class StringUtils
{
	/**
	 * 
	 * @param target
	 * @return target encode utf8
	 */
	public static String encodeUtf8(String target)
	{
		String result = null;
		try
		{
			result = new String(target.getBytes(), "UTF-8");
		} catch (UnsupportedEncodingException e)
		{
			System.err.println("ERROR! encode utf8 failed - " + e);
		}
		return result;
	}

	/**
	 * 
	 * @param target
	 * @return target encode base64 bytes
	 */
	public static byte[] encodeBase64(String target)
	{
		byte[] encoded = Base64.encodeBase64(target.getBytes());

		return encoded;
	}

	/**
	 * 
	 * @param target
	 * @return base64 bytes target decode string
	 */
	public static String decodeBase64(byte[] target)
	{
		String result = null;
		byte[] decoded = Base64.decodeBase64(target);

		try
		{
			result = new String(decoded, "UTF-8");
		} catch (UnsupportedEncodingException e)
		{
			System.err.println("ERROR! decode base64 to string failed - " + e);
		}

		return result;
	}
}
