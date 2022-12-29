package algorithm.com;

public class InsertionSort {

	public static void sortWords(String[] color) {
		int length=color.length;
		String temp="";
		
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(color[i].compareToIgnoreCase(color[j])>0) {
					temp=color[i];
					color[i]=color[j];
					color[j]=temp;
				}
			}
		}
		
		for(int i=0;i<length;i++) {
			System.out.print(color[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		String []color= {"pink","yellow","black","blue"};
         sortWords(color);
	}

}
