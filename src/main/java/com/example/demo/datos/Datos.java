/**
 * 
 */
package com.example.demo.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

/**
 * @author rodri
 *
 */

@Component
public class Datos implements IDatos {
	@Override
	public String consultaDatos(String nombre) throws IOException{
		File f = new File("C:\\Users\\201909\\Documents//imc.txt");
		BufferedReader br;
		int peso;
		int altura;
		String datos = "nada";
		
		br = new BufferedReader(new FileReader(f));
		String linea;
		while((linea = br.readLine()) != null) {
	         if(linea.split("-")[0].equalsIgnoreCase(nombre)) {
	        	 datos = linea; 
	         }
		}
		return datos;
	}
}
