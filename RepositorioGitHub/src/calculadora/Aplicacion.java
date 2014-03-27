package calculadora;

import javax.swing.JFrame;

import calculadora.vista.Frame1;

public class Aplicacion {
	//Atributos
	private Frame1 ventana;

	//Constructor
	Aplicacion() {
		ventana = new Frame1();
		ventana.setTitle("Uso de GridLayout");
		ventana.setSize(300, 200);
		ventana.setLocation(200, 200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * Método main para comenzar la ejecución creando un objeto de la propia
	 * clase.
	 */
	public static void main(String[] args) {
		//Crear el objeto aplicacion
		new Aplicacion();
	}
}

