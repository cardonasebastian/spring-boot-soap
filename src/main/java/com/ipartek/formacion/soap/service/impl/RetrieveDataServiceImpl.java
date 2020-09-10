package com.ipartek.formacion.soap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipartek.formacion.soap.domain.Alumno;
import com.ipartek.formacion.soap.mapping.RetrieveDataMapping;
import com.ipartek.formacion.soap.service.RetrieveDataService;
import com.ipartek.formacion.web_service_soap.GetAlumnoResponse;

/**
 * 
 * @author SEBASTIAN CARDONA
 *
 */

@Service
public class RetrieveDataServiceImpl implements RetrieveDataService {

	
	@Autowired
	private RetrieveDataMapping mapping;
	
	@Override
	public GetAlumnoResponse getAlumno(String nif) {
		Alumno student = mapping.findAlumno(nif);
		return mapping.buildAlumno(student);
	}
}
