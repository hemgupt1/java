import java.util.*;
import java.io.*;
import java.math.*;

public class BigDec {
	public static void main(String []argh) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in); 

		String cs = input.readLine();
		int c = Integer.parseInt(cs);		
		ArrayList<BigDecimal> decArray = new ArrayList<BigDecimal>();
		int i = 0;
		while(i < c){
			String dec = input.readLine();
			decArray.add(new BigDecimal(dec));
			i++;
		}	
		Collections.sort(decArray);
		Collections.reverse(decArray);
		for(int j =0; j<decArray.size(); j++){
			System.out.println(decArray.get(j));				

			//System.out.println();
		}

	}
}
