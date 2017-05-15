package Main;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Observable;

public class Connection extends Observable{
	private boolean vida;
	
	private static final int PUERTO = 7070;
	private ServerSocket serverSo;
	//private ArrayList<Device> decives;
	
	public Connection(){
		vida = true;
		
		try{
			serverSo = new ServerSocket(PUERTO);
			System.out.println("Server ON");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public static int getPuerto() {
		return PUERTO;
	}
	
}
