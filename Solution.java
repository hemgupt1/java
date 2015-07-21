import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		String count = input.readLine();
		String[] array = new String[Integer.parseInt(count)];
		int i=0;
		do{
			String numbers = input.readLine();
                        array[i]=numbers;
			i=i+1;
		}while(i < Integer.parseInt(count));

		for(int j=0; j<array.length; j++){
			BigInteger NUM=new BigInteger(array[j]);
                        BigInteger byteMin = new BigInteger("-129");
                        BigInteger byteMax = new BigInteger("128");

                        BigInteger shortMin = new BigInteger("-32769");
                        BigInteger shortMax = new BigInteger("32768");

                        BigInteger intMin = new BigInteger("-2147483649");
                        BigInteger intMax = new BigInteger("2147483648");

                        BigInteger LongMin = new BigInteger("-9223372036854775809");
                        BigInteger LongMax = new BigInteger("9223372036854775808");


			int resultbyte1 = NUM.compareTo(byteMin);
			int resultbyte2 = NUM.compareTo(byteMax);

			int resultshort1 = NUM.compareTo(shortMin);
			int resultshort2 = NUM.compareTo(shortMax);

			int resultint1 = NUM.compareTo(intMin);
			int resultint2 = NUM.compareTo(intMax);

			int resultLong1 = NUM.compareTo(LongMin);
			int resultLong2 = NUM.compareTo(LongMax);
                        

			if(resultbyte1==1 && resultbyte2==-1){
			System.out.println(array[j] + " can be fitted in:");
				System.out.println("* byte");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			}
			else if(resultshort1==1 && resultshort2==-1){
			System.out.println(array[j] + " can be fitted in:");
				System.out.println("* short");
				System.out.println("* int");
				System.out.println("* long");
			}
			else if(resultint1==1 && resultint2==-1){
			System.out.println(array[j] + " can be fitted in:");
				System.out.println("* int");
				System.out.println("* long");
			}
			else if(resultLong1==1 && resultLong2==-1){
			System.out.println(NUM + " can be fitted in:");
				System.out.println("* long");
			}
			else{
			System.out.println(NUM + " can't be fitted anywhere.");
			}
		
		}
	}
}
