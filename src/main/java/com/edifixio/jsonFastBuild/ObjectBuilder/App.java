package com.edifixio.jsonFastBuild.ObjectBuilder;

import com.edifixio.jsonFastBuild.ArrayBuilder.JsonArrayBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {  
    	System.out.println(       
    	JsonObjectBuilder.init()
    		.begin()
    			.putObject("tt")
    					.begin()
    						.putPreprety("ssss", "dssfdqsfqsk")
    						.putPreprety("kkkkkk", true)
    						.putPreprety("df")
    						.putArray()
    							.begin()
    								.putEmptyObject()
    								.putEmptyArray()
    								.putEmptyObject()
    								
    							.end()
    						.putEmptyArray("ddddddjjjjjjjjjjjjjjjj")
    						.putEmptyObject("dssd")
    						.putObject("zzzzz")
    							.begin()
    								.putEmptyObject("dd")
    							.end()
    					.end()
    			.putEmptyObject("ddddd")
    			.putEmptyObject("bbbbbbbbbvvcc")
    		.end()
    		.getJsonElement());
    	
 
    	
       	System.out.println(       
       	    	JsonArrayBuilder.init()
       	    	.begin().putArray().emptyArray()
       	    	.putObject()
       	    			.begin()
       	    				.putEmptyObject("dd")
       	    			.end()
       	    	.end().getJsonElement());
    }
}
