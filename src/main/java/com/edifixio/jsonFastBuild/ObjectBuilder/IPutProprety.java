package com.edifixio.jsonFastBuild.ObjectBuilder;

public interface IPutProprety<ParentType> {
	public IBuildJsonObject<ParentType> putPreprety(String proprety);
	public  ParentType end();
}
