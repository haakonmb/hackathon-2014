public class Konflikt{
	public void Konflikt(){

}

	public void sjekk(String[][] str1,String[][]str2){
		int i =0;
		for(String[] arr : str1){
			i++;	
			for(int j = 0; j < 2; j++){
				System.out.println(arr[j]+ " "+ i+" "+  j);	

			}
		}	
	}
}
