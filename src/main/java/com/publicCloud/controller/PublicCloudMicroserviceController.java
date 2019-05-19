package com.publicCloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.publicCloud.service.PublicCloudMicroserviceService;

@Controller
@RequestMapping("/publicCloud")
public class PublicCloudMicroserviceController 
{
	
	PublicCloudMicroserviceService service = new PublicCloudMicroserviceService();
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String fetchReponse()
	{
		return service.fetchResponse();
	}
	
}
