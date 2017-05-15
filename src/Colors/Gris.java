package Colors;
import processing.core.PApplet;
import processing.core.PImage;

public class Gris {
	private PApplet app;
	protected PImage pic;
	protected int posX, posY;
	public int tipo;
	
	public Gris(PApplet app, PImage pic, int posX, int posY, int tipo) {
		super();
		this.app = app;
		this.pic = pic;
		this.posX = posX;
		this.posY = posY;
		this.tipo = tipo;
	}
	
	public void pintarGrises(){
		app.image(pic, posX, posY);
	}
	
	public void caida(){
		posY += 5;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getTipo() {
		return tipo;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}	
}