package streams;

import java.io.FileInputStream;

public class StreamApp {


	public static void byteStream() throws Exception   {
		FileInputStream entrada = new FileInputStream("C:/eclipse-workspace/JAVALambdasStreamsInterfacesGr�ficas/src/streams/dados.txt");
		
		int contador = 0;
		
		while((entrada.read()) != -1) 
			contador ++;
			System.out.println("N�mero de caracteres � :" +contador);
			entrada.close();
		
	}
	
	public static void main(String[] args) {
		
		
		try {
			byteStream();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
