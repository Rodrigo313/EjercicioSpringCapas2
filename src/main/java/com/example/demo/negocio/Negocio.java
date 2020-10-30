/**
 * 
 */
package com.example.demo.negocio;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.datos.Datos;
import com.example.demo.datos.IDatos;



/**
 * @author rodri
 *
 */

@Component
public class Negocio implements INegocio {
	@Autowired
	IDatos d;
	
	@Override
	public double calculoMasa(String nombre) throws IOException {
		//IDatos d = new Datos();
		double peso;
		double altura;
		peso = Double.parseDouble(d.consultaDatos(nombre).split("-")[1]);
		altura = Double.parseDouble(d.consultaDatos(nombre).split("-")[2]);
		return peso/altura*100;
	}
}

