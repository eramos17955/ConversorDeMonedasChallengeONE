package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	public void ConvertirSolesADolares(double valor) {
		// 1 Sol peruano Es igual a 0.28 Dólar estadounidense fecha: 28/07/23
		double monedaDolar = valor * 0.28;
		monedaDolar = Math.round(monedaDolar * 100.0) / 100.0;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	public void ConvertirSolesAEuros(double valor) {
		// 1 Sol peruano Es igual a 0.25 Euro fecha: 28/07/23
		double monedaEuro = valor * 0.25;
		monedaEuro = Math.round(monedaEuro * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes € " +monedaEuro+ " Euros");
	}
	public void ConvertirSolesALibras(double valor) {
		// 1 Sol peruano Es igual a 0.22 Libra esterlina fecha: 28/07/23
		double monedaLibras = valor * 0.22;
		monedaLibras = Math.round(monedaLibras * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes £ " +monedaLibras+ " Libras");
	}
	public void ConvertirSolesAYen(double valor) {
		//1 Sol peruano Es igual a 39.34 Yen japonés fecha: 28/07/23
		double monedaYen = valor * 39.34;
		monedaYen = Math.round(monedaYen * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes ¥ " +monedaYen+ " Yen");
	}
	public void ConvertirSolesAWon(double valor) {
		//1 Sol peruano Es igual a 355.33 Won surcoreano fecha: 28/07/23
		double monedaYen = valor * 355.33;
		monedaYen = Math.round(monedaYen * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, "Tienes ¥ " +monedaYen+ " Won");
	}
}
