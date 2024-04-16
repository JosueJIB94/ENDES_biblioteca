package com.endes.biblioteca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
        System.out.println( "Hello World!" + Estado_cuenta.ACTIVA);
        
        for( Estado_cuenta estado : Estado_cuenta.values()) {
        	System.out.print(estado);
        }
    }
}
