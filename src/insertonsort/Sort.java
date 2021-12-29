package insertonsort;

import java.util.Arrays;

public class Sort {

	public void sortarray(String[] array) {
		String temp="";
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i].compareToIgnoreCase(array[j])>0){
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}	
		}
	}
}
