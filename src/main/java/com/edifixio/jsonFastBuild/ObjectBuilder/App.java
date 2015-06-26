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
    			.putPreprety("tt").putObject()
    					.begin()
    						.putPreprety("cc").putObject().emptyObject()
    						.putPreprety("dd").putObject()
    							.begin()
    								.putPreprety("tt").putObject().emptyObject()
    							.end()
    					.end()
    			.putPreprety("dd").putObject().emptyObject()
    		.end()
    		.getJsonElement());
    	
    	
       	System.out.println(       
       	    	JsonArrayBuilder.init().begin().putObject()
       	    										.begin().putPreprety("cc").putObject().emptyObject()
       	    										.end()
       	    							.end().getJsonElement());
    }
}
