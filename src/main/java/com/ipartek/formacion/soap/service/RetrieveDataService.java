package com.ipartek.formacion.soap.service;

import com.ipartek.formacion.web_service_soap.GetAlumnoResponse;

/**
 * 
 * @author SEBASTIAN CARDONA
 *
 */

public interface RetrieveDataService {

	GetAlumnoResponse getAlumno(String nif);
}
