/* Problem Statement
Ishaan is playing with strings these days. He has found a new string. He wants to modify it as per the following rules:

1. The string should not have three consecutive same characters (Refer example for explanation).
2. He can add any number of characters anywhere in the string.
Find the minimum number of characters which Ishaan must insert in the string. */
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		while(t>0){
			t--;
			String str=sc.next();
			int count=0;
			for(int i=0;i<str.length()-2;i++){
				if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)){
					count++;
					i++;
				}
			}
			// if(count==str.length()-2){
			// 	count-=1;
			// }
			System.out.println(count);

		}
	}
}