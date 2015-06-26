package com.edifixio.jsonFastBuild.ObjectBuilder;

import com.edifixio.jsonFastBuild.ArrayBuilder.JsonArrayBuilder;
import com.google.gson.JsonObject;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {  JsonObject js=new JsonObject();
    	System.out.println(       
    	JsonObjectBuilder.init()
    		.begin()
    			.putPreprety("tt").putObject()
    					.begin().putPreprety("ddf").putValue("cc")
    						.putPreprety("df").putArray()
    							.begin()
    								.putObject().emptyObject()
    								.putObject().emptyObject()
    							.end()
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
       	    	JsonArrayBuilder.init()
       	    	.begin().putArray().emptyArray()
       	    	.putObject()
       	    			.begin()
       	    				.putPreprety("cc").putObject().emptyObject()
       	    			.end()
       	    	.end().getJsonElement());
    }
}
