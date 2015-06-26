package com.edifixio.jsonFastBuild.ObjectBuilder;

public interface IBuildJsonObject<ParentType> {
	public IStartBuildJsonObject<IPutProprety<ParentType>> putObject();

}
