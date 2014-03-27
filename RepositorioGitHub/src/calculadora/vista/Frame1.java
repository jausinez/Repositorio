package calculadora.vista;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame1 extends JFrame {
	//Atributo
	private JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonPunto, botonIgual, botonDiv, botonPor, botonMenos, botonMas;

	public Frame1() {
		//Crear los botones
		boton0 = new JButton("0");
		boton1 = new JButton("1");
		boton2 = new JButton("2");
		boton3 = new JButton("3");
		boton4 = new JButton("4");
		boton5 = new JButton("5");
		boton6 = new JButton("6");
		boton7 = new JButton("7");
		boton8 = new JButton("8");
		boton9 = new JButton("9");
		botonPunto = new JButton(".");
		botonIgual = new JButton("=");
		botonDiv = new JButton("/");
		botonPor = new JButton("*");
		botonMenos = new JButton("-");
		botonMas = new JButton("+");


		Container contenedor = getContentPane();
		setSize(400, 400);
		setLocation(200, 200);
		//Crear un gestor de diseño
		GridLayout gestorDiseño = new GridLayout(4, 4);
		contenedor.setLayout(gestorDiseño);

		//Añadir la etiqueta al contenedor
		contenedor.add(boton7);
		contenedor.add(boton8);
		contenedor.add(boton9);
		contenedor.add(botonDiv);

		contenedor.add(boton4);
		contenedor.add(boton5);
		contenedor.add(boton6);
		contenedor.add(botonPor);

		contenedor.add(boton1);
		contenedor.add(boton2);
		contenedor.add(boton3);
		contenedor.add(botonMenos);

		contenedor.add(boton0);
		contenedor.add(botonPunto);
		contenedor.add(botonIgual);
		contenedor.add(botonMas);
	};

}
