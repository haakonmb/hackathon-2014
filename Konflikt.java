public class Konflikt{

	int[] indexes;
	public void Konflikt(){

}
	//Skal returnere true når en konflikt eksisterer
	public boolean sjekk(String[][] str1,String[][]str2){
		int i =0;
		for(String[] arr : str1){
			i++;	
			for(int j = 0; j < 2; j++){
				System.out.println(arr[j]+ " "+ i+" "+  j);	
				
			}
		}
		//TODO:fiks return
		return true;	
	}

	private void konf(int i, int j){
		
	}

}
