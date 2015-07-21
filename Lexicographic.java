import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
@SuppressWarnings("unchecked")

public class Lexicographic {

	public static void main(String[] args) throws IOException{
		Hashtable alphabates = new Hashtable();
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		
		alphabates.put("a", new Double(1));
		alphabates.put("b", new Double(2));
		alphabates.put("c", new Double(3));
		alphabates.put("d", new Double(4));
		alphabates.put("e", new Double(5));
		alphabates.put("f", new Double(6));
		alphabates.put("g", new Double(7));
		alphabates.put("h", new Double(8));
		alphabates.put("i", new Double(9));
		alphabates.put("j", new Double(10));
		alphabates.put("k", new Double(11));
		alphabates.put("l", new Double(12));
		alphabates.put("m", new Double(13));
		alphabates.put("n", new Double(14));
		alphabates.put("o", new Double(15));
		alphabates.put("p", new Double(16));
		alphabates.put("q", new Double(17));
		alphabates.put("r", new Double(18));
		alphabates.put("s", new Double(19));
		alphabates.put("t", new Double(20));
		alphabates.put("u", new Double(21));
		alphabates.put("v", new Double(22));
		alphabates.put("w", new Double(23));
		alphabates.put("x", new Double(24));
		alphabates.put("y", new Double(25));
		alphabates.put("z", new Double(26));
	
		String line = input.readLine();
		String num = input.readLine();
		String MaxStr="";
		String MinStr="";
		double MaxDbl=0;
		double MinDbl=10000000;
		int numInt = Integer.parseInt(num);
		int len = line.length();
		for(int i=0; i<len-(numInt-1); i++){
		String str = line.substring(i,(numInt+i));
		char[] substr = str.toCharArray();
		double sum=0;
		for(int j=0; j<substr.length; j++){
			String ch = String.valueOf(substr[j]);
			//System.out.println(alphabates.get(ch));			
			sum = sum + (Double) alphabates.get(ch);
		}
		if(sum >MaxDbl){
		MaxDbl = sum;
		MaxStr=str;
		}

		if(sum <MinDbl){
		MinDbl = sum;
		MinStr=str;
		}			
		}

		System.out.println(MaxStr);
		System.out.println(MinStr);
	}
}
