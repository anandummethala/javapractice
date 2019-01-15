package colorproject;

public class Removespaces {

	public static void main(String[] args) {
	
		String s = "  A fdf dsfdsfs df";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
