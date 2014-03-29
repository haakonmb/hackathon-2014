import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Parser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parser
{
    public Parser(){
    }

    public String[][] parse(String parseString, String eventType){

        //gettere og settere for hva vi skal splitte på

        ArrayList<String> eventTimes = new ArrayList<String>();

        String[] splitArray = parseString.split("BEGIN:VEVENT", -2);

        System.out.println(splitArray.length);
        for(int i =1; i < splitArray.length; i++){
            if(splitArray[i].contains(eventType)){

                String[] lineArray = splitArray[i].split("\r\n");
                for(String line : lineArray){
                    if(line.contains("DTSTART")) 
                        eventTimes.add(line.substring(8,21));
                    else if(line.contains("DTEND"))
                        eventTimes.add(line.substring(6,19));
                }
            }           
        }
        for(int i = 0; i < eventTimes.size(); i++)
            System.out.println(eventTimes.get(i));

	String[][] parsed = null;
/*	for(int i = 0; i<(eventTimes.size()/2);i++){
		for(int j = 0; j < 3 ; j++)
{		
	parsed[i][j] = eventTimes.get(j);
}
	}
*/
    return parsed;
}

}
