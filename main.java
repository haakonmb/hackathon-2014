import java.util.ArrayList;

//import ./API_interface.java;

public class main{

public static void main(String[ ] args)
{

	API_interface a = new API_interface();
//	String str ="INFO110";
	String result = null;
//	result = a.getCal(str);
	Parser p = new Parser();
	String[][] parsed = null;
//	p.parse(result, "Forelesning");	
	Konflikt konflikt = new Konflikt();

for(String str : args){
	result = a.getCal(str);
	parsed = p.parse(result, "Forelesning");
	
}

//	konflikt.sjekk(liste[1],liste[2]);
}
}
