package com.edifixio.jsonFastBuild.selector;

import com.edifixio.jsonFastBuild.ArrayBuilder.JsonArrayBuilder;
import com.edifixio.jsonFastBuild.ObjectBuilder.JsonObjectBuilder;
import com.google.gson.JsonObject;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {  	JsonObject jo;
    	System.out.println(   jo=JsonObjectBuilder.init()
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
    								.putValue("99")
    								
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
    		.getJsonElement().getAsJsonObject());
    	
 
    	
       	System.out.println(       
       	    	JsonArrayBuilder.init()
       	    	.begin().putArray().emptyArray()
       	    	.putObject()
       	    			.begin()
       	    				.putEmptyObject("dd")
       	    			.end()
       	    	.end().getJsonElement());
       	
       	System.out.println(JsonHandleUtil.seletor("tt::df",jo ));
    }
}
