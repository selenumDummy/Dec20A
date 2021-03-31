
public class RevString {
public static void main(String[] args) {
	
	String str="abcba";
	String rev="";  //yti
		
	      //7 6                  5>=0 
	for (int i =str.length()-1 ; i>=0; i--) {
		rev= rev + str.charAt(i);  //y
			// yt + i
	}
	
	System.out.println(rev);
	
	if(str.equals(rev)) {
		System.out.println("palindrome");
	}else {
		System.out.println("not a palindrome");
	}
	
	
}
}
