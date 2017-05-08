import java.util.Observable;
import java.util.Observer;

public class Logica implements Observer{
	PApplet app;
	private int  pantalla;
	
	
	public Logica(Papplet app){
		this.app=app;
	}
	
	public void draw(){
		
	}



	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}

}
