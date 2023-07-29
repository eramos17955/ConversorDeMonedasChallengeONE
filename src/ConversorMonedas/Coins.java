package ConversorMonedas;

import javax.swing.JOptionPane;

/**
 * Clase Coins que permite realizar la conversión de monedas.
 * Esta clase presenta un menú para que el usuario elija la conversión deseada y realiza la conversión en función de la opción seleccionada.
 * Utiliza las clases ConvertirMonedas y ConvertirMonedasASoles para llevar a cabo las conversiones.
 * @author Edwin Ramos
 */
public class Coins {

    // Instancias de las clases que realizan las conversiones de monedas y de monedas a soles
    private ConvertirMonedas monedas = new ConvertirMonedas();
    private ConvertirMonedasASoles soles = new ConvertirMonedasASoles();
	
    /**
     * Método para realizar la conversión de monedas.
     * @param cantidadInput Cantidad de dinero que se desea convertir.
     */
    public void ConvertirMonedas(double cantidadInput) {
    	
        // Muestra un cuadro de diálogo con opciones para elegir la moneda de destino
    	Object[] opciones = {"De Soles a Dólar", "De Soles a Euro", "De Soles a Libra", "De Soles a Yen", "De Soles a Won", 
                             "De Dólar a Soles", "De Euro a Soles", "De Libra a Soles", "De Yen a Soles", "De Won a Soles"};
    	
    	String opcion = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", 
                                            "Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccion");

        // Realiza la conversión basada en la opción seleccionada
    	if (opcion != null) {
    	    switch (opcion) {
                case "De Soles a Dólar":
                    monedas.ConvertirSolesADolares(cantidadInput);
                    break;
                case "De Soles a Euro":
                    monedas.ConvertirSolesAEuros(cantidadInput);
                    break;
                case "De Soles a Libra":
                    monedas.ConvertirSolesALibras(cantidadInput);
                    break;
                case "De Soles a Yen":
                    monedas.ConvertirSolesAYen(cantidadInput);
                    break;
                case "De Soles a Won":
                    monedas.ConvertirSolesAWon(cantidadInput);
                    break;
                case "De Dólar a Soles":
                    soles.ConvertirDolaresASoles(cantidadInput);
                    break;
                case "De Euro a Soles":
                    soles.ConvertirEurosASoles(cantidadInput);
                    break;
                case "De Libra a Soles":
                    soles.ConvertirLibrasASoles(cantidadInput);
                    break;
                case "De Yen a Soles":
                    soles.ConvertirLibrasASoles(cantidadInput);
                    break;
                case "De Won a Soles":
                    soles.ConvertirLibrasASoles(cantidadInput);
                    break;
            }   
    	} else {
    	    JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna opción de conversión.", "Información", 
                                    JOptionPane.INFORMATION_MESSAGE);
    	}     
    }       
}
