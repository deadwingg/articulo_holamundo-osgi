package com.somospnt.saludo.impl;

import com.somospnt.saludo.api.SaludoService;

import org.osgi.service.component.annotations.Component;

/**
 * @author Rei
 */
@Component(
	immediate = true,
	property = {
	},
	service = SaludoService.class
)
public class SaludoServiceImpl implements SaludoService {
	@Override
	public void saludar(String nombre) {
		System.out.println("Hola " + nombre + "!");
	}

}