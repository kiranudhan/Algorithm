package algorithm.com;

public class StringPermutations {
    
	public static void printPermutation(String string,String ans) {
		if(string.length()==0) {
			System.out.print(ans+" ");
		}
		for(int i=0;i<string.length();i++) {
			char ch=string.charAt(i);//t
			String rest=string.substring(0, i)+string.substring(i+1);//ab
			printPermutation(rest,(ans+ch));//ab,t
		}
	}
	
	public static void main(String[] args) {
	     String string="tab";
	     printPermutation(string,"");
     }

}
