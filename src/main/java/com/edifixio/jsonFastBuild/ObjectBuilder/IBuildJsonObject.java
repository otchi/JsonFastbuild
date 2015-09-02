package com.edifixio.jsonFastBuild.ObjectBuilder;

import com.edifixio.jsonFastBuild.ArrayBuilder.IStartBuildJsonArray;
import com.google.gson.JsonElement;

public interface IBuildJsonObject<ParentType> {
	public IStartBuildJsonObject<IPutProprety<ParentType>> putObject();
	public IStartBuildJsonArray<IPutProprety<ParentType>> putArray();
	public IPutProprety<ParentType> putValue(String value);
	public IPutProprety<ParentType> putValue(Number value);
	public IPutProprety<ParentType> putValue(Character value);
	public IPutProprety<ParentType> putValue(Boolean value);
	public IPutProprety<ParentType> putElement(JsonElement jsonElement);

}
