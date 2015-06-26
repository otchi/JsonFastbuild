package com.edifixio.jsonFastBuild.ObjectBuilder;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class JsonObjectBuilder<ParentType> implements IBuildJsonObject<ParentType>,IRootJsonBuilder,IPutProprety<ParentType>,IStartBuildJsonObject<ParentType>{

	private ParentType parent;
	private JsonObject jsonObject;
	private String proprety;
	
	
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
		// TODO Auto-generated method stub
		return (IPutProprety<ParentType>) this;
	}

	public ParentType emptyObject() {
		// TODO Auto-generated method stub
		//System.out.print(((IRootJsonBuilder)parent).getJsonElement()+"\n");
		return this.parent;
	}

	public IBuildJsonObject<ParentType> putPreprety(String proprety) {
		// TODO Auto-generated method stub
		this.proprety=proprety;
		//System.out.print(((IRootJsonBuilder)parent).getJsonElement()+"\n");
		return this;
	}

	public ParentType end() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	public IStartBuildJsonObject<IPutProprety<ParentType>> putObject() {
		// TODO Auto-generated method stub
		IStartBuildJsonObject<IPutProprety<ParentType>> jsob=new JsonObjectBuilder<IPutProprety<ParentType>>(this);
		this.jsonObject.add(proprety, ((IRootJsonBuilder)jsob).getJsonElement());
		//System.out.print(((IRootJsonBuilder)parent).getJsonElement());
		return ( IStartBuildJsonObject<IPutProprety<ParentType>>)jsob;
	}

		
	
	
	
	public static IStartBuildJsonObject<IRootJsonBuilder> init(){
		
		return new JsonObjectBuilder<IRootJsonBuilder>();
	}

	public JsonElement getJsonElement() {
		// TODO Auto-generated method stub
		return this.jsonObject;
	}
	


}
