package com.edifxio.jsonFasBuilder.test;

import org.junit.Test;

import com.edifixio.jsonFastBuild.ObjectBuilder.JsonObjectBuilder;
import com.edifixio.jsonFastBuild.selector.JsonHandleUtil;
import com.google.gson.JsonObject;

public class Demo {
	@Test
	public void demoObject(){
		JsonObject jo=JsonHandleUtil.jsonString("{cc:\"tt\" }").getAsJsonObject();
		
		System.out.println(
		JsonObjectBuilder.init()
			.begin()
				.putArray("firstArray")
				.begin()
					.putObject()
					.begin()
						.putEmptyArray("array")
						.putEmptyObject("obj")
						.putElement("test", jo)
					.end()
				.end()
				.putObject("firstobject")
				.begin()
					.putEmptyObject("cc")
				.end()
			.end()
			.getJsonElement());
	}

}
