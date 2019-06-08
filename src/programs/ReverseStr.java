package programs;

public class ReverseStr {

	public String reverse(String str) {
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		
		return reverse;
	}

}

