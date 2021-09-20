package com.everis.mvniniciales;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( capitalize("hello word"));
        
    }
    
    public static String capitalize(String str) {
    	return StringUtils.capitalize(str);
    }
}
