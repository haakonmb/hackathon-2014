import java.util.*;
import java.net.*;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


//import java.*;

public class API_interface{

	private String emne;
	private String data;

public void API_interface(){
	emne =null;
	data=null;
}
	public void API_interface(String emne){
		this.emne = emne;	
		data=getCal(this.emne);	
	
	}

	/*
	 *GetCal tar inn en streng og kaller API-en med denne og returnerer resultatet
	 *
	 * @param String
	 * @return String
	 *
	 */
	public String getCal(String kode){
		String result="";
		URL url =null;
		InputStreamReader i= null;
		BufferedReader in = null;
		String inputLine = null;
		try{
			url = new URL("https://miside-timeplan.data.uib.no/"+kode.toUpperCase());
			i = new InputStreamReader(url.openStream());
			in = new BufferedReader(i);
			while((inputLine = in.readLine()) != null){
			//	System.out.print("Se her");
				result = result.concat(inputLine + "\r\n");
			//	System.out.print(inputLine);
			}
		} catch(MalformedURLException e){
			System.err.println(e);
		}
		catch(IOException e){
			System.err.println(e);
		}
		
	/*	Bufferedreader in = new BufferedReader(new InputStreamReader(url.openStream()));
		while ((inputLine = in.readLine()) != null)
               {
        	         result = result.concat(inputLine);
               }
	*/	
	return result;
	}


	public void test(){
	System.out.print("test");}

	public String getData()
		{ 
		return this.data;
		}
}
