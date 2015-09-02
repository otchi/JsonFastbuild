package com.edifixio.jsonFastBuild.ObjectBuilder;

import com.edifixio.jsonFastBuild.ArrayBuilder.IStartBuildJsonArray;
import com.edifixio.jsonFastBuild.ArrayBuilder.JsonArrayBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonObjectBuilder<ParentType> implements IBuildJsonObject<ParentType>,IRootJsonBuilder,IPutProprety<ParentType>,IStartBuildJsonObject<ParentType>{

	private ParentType parent;
	private JsonObject jsonObject;
	private String property;
	
	
	@SuppressWarnings("unchecked")
	public JsonObjectBuilder(){
		this.parent=(ParentType) this;
		this.jsonObject=new JsonObject();
	}
	public JsonObjectBuilder(ParentType parent){
		this.parent=parent;
		this.jsonObject=new JsonObject();
	}
	

	public IPutProprety<ParentType> begin() {
		return (IPutProprety<ParentType>) this;
	}

	public ParentType emptyObject() {

		return this.parent;
	}

	public IBuildJsonObject<ParentType> putPreprety(String property) {
		this.property=property;
		return this;
	}

	public ParentType end() {
		return this.parent;
	}

	public IStartBuildJsonObject<IPutProprety<ParentType>> putObject() {
		
		IStartBuildJsonObject<IPutProprety<ParentType>> jsob=new JsonObjectBuilder<IPutProprety<ParentType>>(this);
		
		this.jsonObject.add(property, ((IRootJsonBuilder)jsob).getJsonElement());
		
		return ( IStartBuildJsonObject<IPutProprety<ParentType>>)jsob;
	}

	public static IStartBuildJsonObject<IRootJsonBuilder> init(){
		return new JsonObjectBuilder<IRootJsonBuilder>();
	}

	public JsonElement getJsonElement() {
		return this.jsonObject;
	}
	
	public IStartBuildJsonArray<IPutProprety<ParentType>> putArray() {
		
		IStartBuildJsonArray<IPutProprety<ParentType>> jsab=new JsonArrayBuilder<IPutProprety<ParentType>>(this);
		this.jsonObject.add(property, ((IRootJsonBuilder)jsab).getJsonElement());
		
		return jsab;
	}
	
	public IPutProprety<ParentType> putValue(String value) {
		this.jsonObject.addProperty(property, value);
		return this;
	}
	
	public IPutProprety<ParentType> putValue(Number value) {
		this.jsonObject.addProperty(property, value);
		return this;
	}
	
	public IPutProprety<ParentType> putValue(Character value) {
		this.jsonObject.addProperty(property, value);
		return this;
	}
	
	public IPutProprety<ParentType> putValue(Boolean value) {
		this.jsonObject.addProperty(property, value);
		return this;
	}
	public IStartBuildJsonObject<IPutProprety<ParentType>> putObject(String proprety) {
		return this.putPreprety(proprety).putObject();
	}
	
	public IPutProprety<ParentType> putEmptyObject(String proprety) {
		 this.putPreprety(proprety).putObject();
		 return this;
	}
	public IPutProprety<ParentType> putPreprety(String proprety, String value) {
		return this.putPreprety(proprety).putValue(value);
	}
	
	public IPutProprety<ParentType> putPreprety(String proprety, Number value) {
		return this.putPreprety(proprety).putValue(value);
	}
	
	public IPutProprety<ParentType> putPreprety(String proprety, Character value) {
		return this.putPreprety(proprety).putValue(value);
	}
	
	public IPutProprety<ParentType> putPreprety(String proprety, Boolean value) {
		return this.putPreprety(proprety).putValue(value);
	}
	
	public IStartBuildJsonArray<IPutProprety<ParentType>> putArray(String proprety) {
		return this.putPreprety(proprety).putArray();
	}
	
	public IPutProprety<ParentType> putEmptyArray(String proprety) {
		 this.putPreprety(proprety).putArray();
		 return this;
	}
	
	public IPutProprety<ParentType> putElement(JsonElement jsonElement) {
		 this.jsonObject.add(property, jsonElement);
		 return this;
	}
	public IPutProprety<ParentType> putElement(String proprety, JsonElement jsonElement) {
		return this.putPreprety(proprety).putElement(jsonElement);
	}


}
