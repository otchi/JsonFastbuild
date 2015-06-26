package com.edifixio.jsonFastBuild.ArrayBuilder;

import com.edifixio.jsonFastBuild.ObjectBuilder.IStartBuildJsonObject;


public interface IBuildJsonArray<ParentType> {
	public IStartBuildJsonObject<IBuildJsonArray<ParentType>> putObject();
	public ParentType end();

}
