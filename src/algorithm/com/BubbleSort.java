package algorithm.com;

public class BubbleSort {
	
	public static void sortArray(int []array) {
		int temp;
		//no of rounds
		for(int i=0;i<array.length;i++) {
			//for swapping
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		//for printing element
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {10,2,6,7,8};
        sortArray(arr);
	}

}
