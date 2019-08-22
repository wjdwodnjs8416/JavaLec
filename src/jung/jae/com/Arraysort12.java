package jung.jae.com;

import java.util.Arrays;

public class Arraysort12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {48,7,1,4,2};
		int length = array.length;
		for(int j=0 ; j<length ; j++) {
			for(int i=0 ; i<length-1 ; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));}

}
