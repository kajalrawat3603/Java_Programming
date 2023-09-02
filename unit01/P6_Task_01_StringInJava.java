package unit01;

public class P6_Task_01_StringInJava {

	public static void main(String[] args){
		String str="121";
		checkPalindrome(str);
	}
	public static void checkPalindrome(String str) {
		int n=str.length();
		int s=0,e=n-1;
		while(s<e) {
			if(str.charAt(s)!=str.charAt(e)) {
				System.out.print(str+" is not a palindrome");
				break;
			}
			s++;
			e--;
		}
		if(s==e)
			System.out.print(str+" is a palindrome");
	}
}
