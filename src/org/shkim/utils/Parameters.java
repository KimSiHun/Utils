package org.shkim.utils;

public class Parameters
{
	// null
	public static final String	DOMAIN_KEY			= "%00";
	// url header staet
	public static final String	URL_KEY				= "%01";

	private static final String	delimeters[]		= { "?", "&", "=" };
	private static final String	encodedDelimiters[]	= { "%3F", "%26", "%3D" };

	// % -> bytes
	private static final byte	p25[]				= "%25".getBytes();

	// check ut8
	private static final boolean isUtf8(byte bytes[])
	{
		int expectedLen;
		for (int i = 0; i < bytes.length; i++) {
	        // Lead byte analysis
	        if      ((bytes[i] & 0b10000000) == 0b00000000) continue;
	        else if ((bytes[i] & 0b11100000) == 0b11000000) expectedLen = 2;
	        else if ((bytes[i] & 0b11110000) == 0b11100000) expectedLen = 3;
	        else if ((bytes[i] & 0b11111000) == 0b11110000) expectedLen = 4;
	        else if ((bytes[i] & 0b11111100) == 0b11111000) expectedLen = 5;
	        else if ((bytes[i] & 0b11111110) == 0b11111100) expectedLen = 6;
	        else    return false;

	        // Count trailing bytes
	        while (--expectedLen > 0) {
	            if (++i >= bytes.length) {
	                return false;
	            }
	            if ((bytes[i] & 0b11000000) != 0b10000000) {
	                return false;
	            }
	        }
	    }
		return true;
	}
}
