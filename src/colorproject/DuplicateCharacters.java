package colorproject;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		
		String s = "anand";
		
		char[] inp = s.toCharArray();
		
		for(int i = 0; i<s.length(); i++) {
			
			for(int j = i+1; j<s.length(); j++) {
				
				if(inp[i] == inp[j]) {
					
					System.out.println(inp[i]);
				}
			}
			
			
		}

	}

}
