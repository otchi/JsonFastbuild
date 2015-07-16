package com.edifixio.jsonFastBuild.ArrayBuilder;

import com.edifixio.jsonFastBuild.ObjectBuilder.IStartBuildJsonObject;


public interface IBuildJsonArray<ParentType> {
	public IStartBuildJsonObject<IBuildJsonArray<ParentType>> putObject();
	public IBuildJsonArray<ParentType> putEmptyObject();
	public ParentType end();
	public IStartBuildJsonArray<IBuildJsonArray<ParentType>> putArray(); 
	public IBuildJsonArray<ParentType> putEmptyArray(); 

}
