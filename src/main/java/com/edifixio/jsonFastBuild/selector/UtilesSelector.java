package com.edifixio.jsonFastBuild.selector;

import com.google.gson.JsonElement;

public class UtilesSelector {

	public static JsonElement selection(String query,JsonElement jse){
		String[] items=query.split("::");
		if(items.length==0) return jse;
		int i=0;
		
		JsonElement inter=null;
		if(jse.isJsonObject())inter=jse.getAsJsonObject();
		if(jse.isJsonArray())inter=jse.getAsJsonArray();
		if(jse.isJsonPrimitive()) return null;
		
		while((inter!=null)&&i<items.length){
			if(inter.isJsonObject())
				inter=inter.getAsJsonObject().get(items[i]);
			else
				if(inter.isJsonArray())
					inter=inter.getAsJsonArray().get(Integer.parseInt(items[i]));
				else
					if(inter.isJsonPrimitive()) return null;
			i++;
		};
		
		return inter;
	}
	

}
