package com.edifixio.jsonFastBuild.ArrayBuilder;

import com.edifixio.jsonFastBuild.ObjectBuilder.IRootJsonBuilder;
import com.edifixio.jsonFastBuild.ObjectBuilder.IStartBuildJsonObject;
import com.edifixio.jsonFastBuild.ObjectBuilder.JsonObjectBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class JsonArrayBuilder<ParentType> 
									implements IRootJsonBuilder,
												IStartBuildJsonArray<ParentType>, 
												IBuildJsonArray<ParentType>{
	
	private ParentType parent;
	private JsonArray jsonArray;
	
	@SuppressWarnings("unchecked")
	private JsonArrayBuilder(){
		this.jsonArray=new JsonArray();
		this.parent=(ParentType) this;
	}
	
	private JsonArrayBuilder(ParentType parent){
		this.jsonArray=new JsonArray();
		this.parent=parent;
	}
	
	public JsonElement getJsonElement() {
		// TODO Auto-generated method stub
		return this.jsonArray;
	}



	public IBuildJsonArray<ParentType> begin() {
		// TODO Auto-generated method stub
		return (IBuildJsonArray<ParentType>) this;
	}



	public ParentType emptyArray() {
		// TODO Auto-generated method stub
		return this.parent;
	}




	
	
	public static IStartBuildJsonArray<IRootJsonBuilder> init(){
		
		return new JsonArrayBuilder<IRootJsonBuilder>();
	}

	public IStartBuildJsonObject<IBuildJsonArray<ParentType>> putObject() {
		
		IStartBuildJsonObject<IBuildJsonArray<ParentType>> jsob=new JsonObjectBuilder<IBuildJsonArray<ParentType>>(this);
		this.jsonArray.add(((IRootJsonBuilder)jsob).getJsonElement());
		//System.out.print(((IRootJsonBuilder)parent).getJsonElement());
		return ( IStartBuildJsonObject<IBuildJsonArray<ParentType>>)jsob;
		// TODO Auto-generated method stub
	
	}

	public ParentType end() {
		// TODO Auto-generated method stub
		return this.parent;
	}

}
