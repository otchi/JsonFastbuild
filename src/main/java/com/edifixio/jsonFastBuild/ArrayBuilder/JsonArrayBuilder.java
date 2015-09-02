package com.edifixio.jsonFastBuild.ArrayBuilder;

import com.edifixio.jsonFastBuild.ObjectBuilder.IRootJsonBuilder;
import com.edifixio.jsonFastBuild.ObjectBuilder.IStartBuildJsonObject;
import com.edifixio.jsonFastBuild.ObjectBuilder.JsonObjectBuilder;
import com.edifixio.jsonFastBuild.selector.JsonHandleUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class JsonArrayBuilder<ParentType> 	implements IRootJsonBuilder,
												IStartBuildJsonArray<ParentType>, 
												IBuildJsonArray<ParentType>{
	
	private ParentType parent;
	private JsonArray jsonArray;
	
	@SuppressWarnings("unchecked")
	private JsonArrayBuilder(){
		this.jsonArray=new JsonArray();
		this.parent=(ParentType) this;
	}
	
	public JsonArrayBuilder(ParentType parent){
		this.jsonArray=new JsonArray();
		this.parent=parent;
	}
	
	public JsonElement getJsonElement() {
		return this.jsonArray;
	}



	public IBuildJsonArray<ParentType> begin() {
		return (IBuildJsonArray<ParentType>) this;
	}



	public ParentType emptyArray() {
		return this.parent;
	}

	
	public static IStartBuildJsonArray<IRootJsonBuilder> init(){
		
		return new JsonArrayBuilder<IRootJsonBuilder>();
	}

	public IStartBuildJsonObject<IBuildJsonArray<ParentType>> putObject() {
		
		IStartBuildJsonObject<IBuildJsonArray<ParentType>> jsob=new JsonObjectBuilder<IBuildJsonArray<ParentType>>(this);
		
		this.jsonArray.add(((IRootJsonBuilder)jsob).getJsonElement());
		
		return ( IStartBuildJsonObject<IBuildJsonArray<ParentType>>)jsob;
	
	}

	public ParentType end() {
		return this.parent;
	}

	public IStartBuildJsonArray<IBuildJsonArray<ParentType>> putArray() {
		IStartBuildJsonArray<IBuildJsonArray<ParentType>> jsab=new JsonArrayBuilder<IBuildJsonArray<ParentType>>(this);
		this.jsonArray.add(((IRootJsonBuilder)jsab).getJsonElement());
		return jsab;
	}

	public IBuildJsonArray<ParentType> putEmptyObject() {
		this.putArray();
		return this;
	}

	public IBuildJsonArray<ParentType> putEmptyArray() {
		this.putObject();
		return this;
	}

	public IBuildJsonArray<ParentType> putValue(String value) {
		this.jsonArray.add(JsonHandleUtil.JP.parse(value));
		return this;
	}

	public IBuildJsonArray<ParentType> putValue(Number value) {
		this.jsonArray.add(JsonHandleUtil.JP.parse(value.toString()));
		return this;
	}

	public IBuildJsonArray<ParentType> putValue(Character value) {
		this.jsonArray.add(JsonHandleUtil.JP.parse(value.toString()));
		return this;
	}

	public IBuildJsonArray<ParentType> putValue(Boolean value) {
		this.jsonArray.add(JsonHandleUtil.JP.parse(value.toString()));
		return this;
	}

	public IBuildJsonArray<ParentType> putElement(JsonElement jsonElement) {
		this.jsonArray.add(jsonElement);
		return this;
	}



}
