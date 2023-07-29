package ConversorTemperatura;

import javax.swing.JOptionPane;


/**
 * Clase ConvertirTemperatura que realiza diferentes conversiones de temperaturas.
 * Esta clase contiene métodos para convertir grados Celsius a Fahrenheit, grados Celsius a Kelvin, grados Fahrenheit a Celsius, Kelvin a Celsius y Kelvin a Fahrenheit.
 * @author Edwin Ramos
 */
public class ConvertirTemperatura {
	
	/**
	 *  Método para convertir grados Celsius a Fahrenheit
	 * @param valor  Cantidad de grados Celsius que se desea convertir
	 * @return Valor equivalente en grados Fahrenheit.
	 */
	public double ConvertirCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +farenheit+ " Grados Farenheit ");
		return farenheit;
	}
	
	/**
	 * Método para convertir grados Celsius a Kelvin.
	 * @param valor Cantidad de grados Celsius que se desea convertir
	 */
	public void ConvertirCelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Celcius son " +kelvin+ " Kelvin");
	}
	
	/**
	 * Método para convertir grados Fahrenheit a Celsius
	 * @param valor
	 */
	public void ConvertirFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celcius+ " Celcius");
	}
	
	
	public double ConvertirKelvinACelcius(double valor) {
		 double kelvinCelcius = valor - 273.15;
         kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinCelcius+ " Celcius");
         return kelvinCelcius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = ConvertirKelvinACelcius(valor);
		kelvinFarenheit = ConvertirCelciusAFarenheit(kelvinFarenheit);
		kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kelvinFarenheit+ " Celcius");
	}
}
