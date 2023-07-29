package main;

import javax.swing.JOptionPane;
import ConversorMonedas.Coins;
import ConversorTemperatura.Temperature;
/**
 * Clase principal que contiene el programa de conversión de monedas y temperaturas.
 * @author Edwin Ramos
 *
 */
public class principal {
    public static void main(String[] args) {

        Coins monedas = new Coins();
        Temperature temperatura = new Temperature();

        while (true) {
            // Mostrar el cuadro de diálogo de selección de opciones
            String[] opciones = { "Conversor de Moneda", "Conversor de Temperatura" };
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción de conversión ", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

            if (seleccion == -1) {
                // Si el usuario cerró el cuadro de diálogo sin seleccionar ninguna opción
                break; // Salir del bucle y finalizar el programa
            }

            switch (seleccion) {
            case 0: // Conversor de Moneda
                String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                if (ValidarNumero(input)) {
                    double CantidadInput = Double.parseDouble(input);
                    monedas.ConvertirMonedas(CantidadInput);

                    // Solicita si el usuario desea realizar otra conversión
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                    if (respuesta != JOptionPane.OK_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                        return; // Finaliza el programa cuando el usuario no desea realizar otra conversión
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
                break;

            case 1: // Conversor de Temperatura
                input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                if (ValidarNumero(input)) {
                    double CantidadInput = Double.parseDouble(input);
                    temperatura.ConvertirTemperatura(CantidadInput);

                    // Solicita si el usuario desea continuar con más conversiones de temperatura
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                    if (respuesta != JOptionPane.OK_OPTION) {
                        JOptionPane.showMessageDialog(null, "Programa terminado");
                        return; // Finaliza el programa cuando el usuario no desea continuar
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }
                break;
            }
        }
    }
/**
 * Método para validar si un string puede ser convertido a un número decimal
 * @param input
 * @return
 */
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
