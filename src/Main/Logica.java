package Main;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import Colors.Amarillo;
import Colors.Azul;
import Colors.Gris;
import Colors.Rojo;
import Colors.Verde;
import processing.core.PApplet;
import processing.core.PImage;

public class Logica implements Observer {
	PApplet app;
	private int pantalla; // Pantallas
	private int pantallaA; // Entero para el control de pantallas. 
	private Connection con;
	private String IPGRUPO;
	
	private int posX, posY;
	
	// -----Pics
	
	// GRIS
	private PImage periodico, revista, cajaDeCarton, libroViejo, hojasDePapel;
	// AZUL
	private PImage botellaDePlastico, bolsaDePlastico, tarroDeJugo, tablaDeCortar, medicamentos;
	// ROJO
	private PImage baterias, pilas, jeringa, celular, vidrios, cd;
	// AMARILLO
	private PImage lataCocaCola, lataAbierta, aluminio, lataDeAtun, bombillos;
	// VERDE
	private PImage queso, carne, pescado, fruta, vegetales, empaquePapasFritas;
	
	private PImage screenOneBg;
	
	// -----Basuras
	private ArrayList <Verde> basurasVerdes;
	private ArrayList <Azul> basurasAzules;
	private ArrayList <Rojo> basurasRojas;
	private ArrayList <Gris> basurasGrises; 
	private ArrayList <Amarillo> basurasAmarillas;


	public Logica(PApplet app) {
		this.app = app;
		
		screenOneBg = app.loadImage("data/pics/screen-one-bg.png");
		
		// GRIS
		periodico = app.loadImage("data/Pantallas/basuras/basuras-01.png");
		revista = app.loadImage("data/Pantallas/basuras/basuras-02.png");
		cajaDeCarton = app.loadImage("data/Pantallas/basuras/basuras-05.png");
		libroViejo = app.loadImage("data/Pantallas/basuras/basuras-03.png");
		hojasDePapel = app.loadImage("data/Pantallas/basuras/basuras-04.png");
		
		// AZUL
		botellaDePlastico = app.loadImage("data/Pantallas/basuras/basuras-16.png");
		bolsaDePlastico = app.loadImage("data/Pantallas/basuras/basuras-18.png");
		tarroDeJugo = app.loadImage("data/Pantallas/basuras/basuras-17.png");
		tablaDeCortar = app.loadImage("data/Pantallas/basuras/basuras-20.png");
		medicamentos = app.loadImage("data/Pantallas/basuras/basuras-27.png");
		
		// ROJO
		baterias = app.loadImage("data/Pantallas/basuras/basuras-29.png");
		pilas = app.loadImage("data/Pantallas/basuras/basuras-25.png");
		jeringa = app.loadImage("data/Pantallas/basuras/basuras-28.png");
		celular = app.loadImage("data/Pantallas/basuras/basuras-21.png");
		vidrios = app.loadImage("data/Pantallas/basuras/basuras-08.png");
		cd = app.loadImage("data/Pantallas/basuras/basuras-19.png");
		
		// AMARILLO
		lataCocaCola = app.loadImage("data/Pantallas/basuras/basuras-24.png");
		lataAbierta = app.loadImage("data/Pantallas/basuras/basuras-22.png");
		//aluminio = app.loadImage("data/Pantallas/basuras/basuras-08.png");
		lataDeAtun = app.loadImage("data/Pantallas/basuras/basuras-31.png");
		bombillos = app.loadImage("data/Pantallas/basuras/basuras-23.png");
		
		// VERDE
		queso = app.loadImage("data/Pantallas/basuras/basuras-11.png");
		carne = app.loadImage("data/Pantallas/basuras/basuras-12.png");
		pescado = app.loadImage("data/Pantallas/basuras/basuras-13.png");
		fruta = app.loadImage("data/Pantallas/basuras/basuras-14.png");
		vegetales = app.loadImage("data/Pantallas/basuras/basuras-15.png");
		empaquePapasFritas = app.loadImage("data/Pantallas/basuras/basuras-30.png");
	}

	public void draw() {
		app.imageMode(PApplet.CENTER);
		app.background(0);
		
		switch(pantalla){
		case 0:
			pantallaA = 0; // Do not touch this line.
			screenOne();
			break;
			
			// Instruction Screen
		case 1: 
			pantallaA = 1; // Do not touch this line.
			
			break;
			
			// Inteaction Screen
		case 2:
			pantallaA = 2; // Do not touch this line.
			
			break;
			
			// Winner
		case 3:
			break;
			
			// Looser
		case 4:
			break;
		}
	}
	
	public void screenOne(){
		app.image(screenOneBg, app.width/2, app.height/2, app.width, ((app.width)/16)*9);
	}
	
	public void screenTwo(){
		
	}
	
	public void screenThree(){
		
	}
	
	public void screenFour(){
		
	}
	
	public void screenFive(){
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

	public void ejecutableLogica() {
		// TODO Auto-generated method stub
		draw(); // Pinto todo
	}
	
	public void keys(){
		if(app.keyPressed){
			if(app.keyCode == 'N' && pantallaA == 0){
				pantalla = 1;
			}
		}
	}

}
