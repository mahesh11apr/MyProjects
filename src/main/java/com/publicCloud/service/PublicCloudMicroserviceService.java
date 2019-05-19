package com.publicCloud.service;

import com.publicCloud.model.PublicCloudMicroserviceModel;

public class PublicCloudMicroserviceService 
{
	
	String output;	
	
	public String fetchResponse() 
	{
		PublicCloudMicroserviceModel model1 = new PublicCloudMicroserviceModel("Hello Java");
		PublicCloudMicroserviceModel model2 = new PublicCloudMicroserviceModel("Hello World");
		
		model1.getInputSearch();
		output = model2.getInputSearch();
		
		return output;
	}

}
