package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasASoles {
	
	public void ConvertirDolaresASoles(double valor) {
		// tipo de cambio 1 Dólar estadounidense es igual a 3.59 Sol peruano fecha: 28/07/23
		double monedaDolar = valor*3.59;
		monedaDolar = Math.round(monedaDolar * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaDolar+ " Nuevos Soles");
	}
	
	public void ConvertirEurosASoles(double valor) {
		// 1 Euro Es igual a 3.96 Sol peruano fecha: 28/07/23
		double monedaEuro = valor*3.96;
		monedaEuro = Math.round(monedaEuro * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaEuro+ " Nuevos Soles");
	}
	
	public void ConvertirLibrasASoles(double valor) {
		// 1 Libra esterlina Es igual a 4.61 Sol peruano  fecha: 28/07/23
		double monedaLibra = valor*4.61;
		monedaLibra = Math.round(monedaLibra * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaLibra+ " Nuevos Soles");
	}
	
	public void ConvertirYenASoles(double valor) {
		// 1 Yen japonés Es igual a 0.025 Sol peruano  fecha: 28/07/23
		double monedaYen = valor*0.0258648;
		monedaYen = Math.round(monedaYen * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaYen+ " Nuevos Soles");
	}
	
	public void ConvertirWonASoles(double valor) {
		// 1 Won surcoreano Es igual a 0.0028 Sol peruano  fecha: 28/07/23
		double monedaWon = valor*0.0028;
		monedaWon = Math.round(monedaWon * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes S/. " +monedaWon+ " Nuevos Soles");
	}
}
