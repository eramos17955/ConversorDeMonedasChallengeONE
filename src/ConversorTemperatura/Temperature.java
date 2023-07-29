package ConversorTemperatura;

import javax.swing.JOptionPane;

/**
 * Clase Temperature que permite realizar la conversión de temperaturas.
 * Esta clase presenta un menú para que el usuario elija la conversión deseada y realiza la conversión en función de la opción seleccionada.
 * Utiliza la clase ConvertirTemperatura para llevar a cabo las conversiones.
 * @author Edwin Ramos
 */
public class Temperature {
    
    // Instancia de la clase que realiza las conversiones de temperaturas
    private ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
    /**
     * Método para realizar la conversión de temperaturas.
     * @param cantidadInput Cantidad de grados que se desea convertir.
     * @author Edwin Ramos
     */
    public void ConvertirTemperatura(double cantidadInput) {
    	
        // Muestra un cuadro de diálogo con opciones para elegir la conversión de temperatura
    	Object[] opciones = {"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Kelvin", "Grados Fahrenheit a Grados Celsius",
                             "Kelvin a Grados Celsius", "Kelvin a Grados Fahrenheit"};
    	
    	String opcion = (String) JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", 
                                            JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion");

        // Realiza la conversión basada en la opción seleccionada
    	if (opcion != null) {
    	    switch (opcion) {
                case "Grados Celsius a Grados Fahrenheit":
                    temperatura.ConvertirCelciusAFarenheit(cantidadInput);
                    break;
                case "Grados Celsius a Kelvin":
                    temperatura.ConvertirCelciusAKelvin(cantidadInput);
                    break;
                case "Grados Fahrenheit a Grados Celsius":
                    temperatura.ConvertirFarenheitACelcius(cantidadInput);
                    break;
                case "Kelvin a Grados Celsius":
                    temperatura.ConvertirKelvinACelcius(cantidadInput);
                    break;
                case "Kelvin a Grados Fahrenheit":
                    temperatura.ConvertirKelvinAFarenheit(cantidadInput);
                    break;
            }   
    	} else {
    	    JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna opción de conversión.", "Información", 
                                    JOptionPane.INFORMATION_MESSAGE);
    	}     
    }       
}
