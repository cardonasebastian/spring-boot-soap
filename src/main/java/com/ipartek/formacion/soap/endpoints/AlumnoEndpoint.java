package com.ipartek.formacion.soap.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ipartek.formacion.soap.service.RetrieveDataService;
import com.ipartek.formacion.web_service_soap.GetAlumnoRequest;
import com.ipartek.formacion.web_service_soap.GetAlumnoResponse;

import lombok.extern.slf4j.Slf4j;


@Endpoint
@Slf4j
public class AlumnoEndpoint {
	private static final String NAMESPACE_URI = "http://formacion.ipartek.com/web-service-soap";

	@Autowired
	private  RetrieveDataService studentService;
		
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAlumnoRequest")
	@ResponsePayload
	public GetAlumnoResponse getCountry(@RequestPayload GetAlumnoRequest request) {
		GetAlumnoResponse response = studentService.getAlumno(request.getNif());
		log.info("response {}", response.getAlumnoInfo().getNif());
		return response;
	}
}
