package Validaciones;

import Alertas.Alerta3;

public class Validacion {

	public static String isNumeric(String cadena,String campo){
		try {
			Double.parseDouble(cadena);
			return "OK";
		} catch (NumberFormatException nfe){
			new Alerta3().setVisible(true);
			Alerta3.lblGraba1.setText("Campo : " + campo + " Solo Numeros !");
			return "NO";
		}
	}
	
	public static String isLetra(String cadena,String campo){
		try {
			Double.parseDouble(cadena);
			new Alerta3().setVisible(true);
			Alerta3.lblGraba1.setText("Campo : " + campo + " Solo Letras !");
			return "NO";
		} catch (NumberFormatException nfe){
			return "OK";
		}
	}
}
