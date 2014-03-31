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
	//TODO:ordne dynamisk stripping og/eller en bedre måte å behandle data på
        ArrayList<String> eventTimes = new ArrayList<String>();

        String[] splitArray = parseString.split("BEGIN:VEVENT", -2);

//        System.out.println(splitArray.length);
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
//	System.out.print(eventTimes.size());
	String[][] parsed = new String[eventTimes.size()/2][2];
	int c = 0;
	//Putter tidspunkt/dato inn i en array av arrays ved navn parsed
	for(int i = 0; i<eventTimes.size() && c < eventTimes.size();i++){
			
			if(c==(eventTimes.size()-1)){
//			System.out.println(c+ " "+eventTimes.size()+ " " + i +" ");
			}
		
		for(int j= 0; j < 2;j++){
//			System.out.println(eventTimes.get(c) + " " + c);
			parsed[i][j]=eventTimes.get(c);
//			System.out.println(parsed[i][j] + " " + i + " " +j);
			c++;
		}
	}    

return parsed;
}

}
