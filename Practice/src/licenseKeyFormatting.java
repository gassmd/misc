import java.util.*; 

public class licenseKeyFormatting {
	
	
		public static String licenseKeyFormatting(String S, int K) { 
			
			StringBuilder result = new StringBuilder();
			int len = S.length();
			for(int i = len - 1, k = K; i >=0; i--) {
				char ch = S.charAt(i);
				if(ch != '-' || ch != ' ') {
					if(k==0) {
						result.append("-");
						k=K;
					}
					result.append(Character.toUpperCase(ch));
					k--; 
				}
			}
			return result.reverse().toString(); 
		}
	

public static void main(String[] args) {
	
	System.out.print(licenseKeyFormatting("fffffffffffffffffffffffffeeeeeffffffffffffff", 9));
}
}

	