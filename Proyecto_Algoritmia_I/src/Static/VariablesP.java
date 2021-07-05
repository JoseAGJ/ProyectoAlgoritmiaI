package Static;

public class VariablesP {

	// Datos mínimos de la primera marca 
	public static String marca[] = {"Class Bond","Copy Premium","Master Bond","Vision Bond","Copy Paper"};
			
	//  Datos mínimos de la segunda marca 	
	public static String dimension[]={"21.6 x 28.0 cm","21.6 x 27.9 cm","21.6 x 28.0 cm","21.6 x 27.9 cm","21.6 x 27.9"};
	
	// Datos mínimos de la tercera marca 
	public static double gramaje[]={74.8,74.3, 74.4, 74.5,75.0};
	
	// Datos mínimos de la cuarta marca 
	public static double blancura[]={90.2,90.0,90.3,96.1,93.9};

	//  Datos mínimos de la quinta marca 
	public static double precio[]={12.0,11.5,13.0,14.5,11.0};	
		
	// Porcentajes de descuento 
	public static double porcenDesc[]={4.0,5.5,7.0,8.5};
	
	// Valor por defecto del tipo de cambio
	public static double tipoCambio = 2.82;
	
	// Cantidad toal óptima de resmas vendidas 
	public static int cantidadTotalOptima = 50; 
	 
	// Cantidad mínima de resmas adquiridas para obtener el obsequio 
	public static int cantidadObsequiable = 6; 
	 
	// Obsequio 
	public static String obsequio = "Un lapicero"; 
	 
	// Número de cliente que recibe el premio sorpresa 
	public static int numeroClienteSorpresa = 5; 
	 
	// Premio sorpresa 
	public static String premioSorpresa = "Un chocolate"; 
		
	// Redondea a 2 Decimales
	public static double Redondear(double numero){
		return Math.round(numero * 100.0) / 100.0;
	}
	
}
