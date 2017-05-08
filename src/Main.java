import processing.core.PApplet;

public class Main  extends PApplet{
	Logica app;

	public static void main(String []args){
		PApplet.main("Ejecutable");
	}
	
	public void settings(){
		size(1143,604);
		
	}
	
	public void setup(){
		app= new Logica(this);
		
	}
	
	public void draw(){
		app.ejecutableLogica();
			}
	 
	public void mousePressed(){
	}
	
	public void keyPressed(){
	}
}
