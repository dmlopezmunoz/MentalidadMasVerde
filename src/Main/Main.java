package Main;
import processing.core.PApplet;

public class Main extends PApplet {
	Logica app;

	public static void main(String[] args) {
		System.setProperty("java.net.preferIPv4Stack", "true"); // To connect. 
		PApplet.main("Main.Main");
	}

	public void settings() {
		//size(1143, 604);
		fullScreen(); // Método para ejecutar la app en fullScreen();

	}

	public void setup() {
		background(255);
		app = new Logica(this); // Creo mi Lógica.
		imageMode(CENTER);
	}

	public void draw() {
		app.ejecutableLogica();
	}

	public void mousePressed() {
		
	}

	public void keyPressed() {
		app.keys(); // Llamo al método del teclado. 
	}
}
