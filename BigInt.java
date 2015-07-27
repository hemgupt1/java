import java.util.*;
import java.io.*;
import java.math.*;

public class BigInt {
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);

		String int1 = in.nextLine();
		String int2 = in.nextLine();

		BigInteger num1 = new BigInteger(int1);
		BigInteger num2 = new BigInteger(int2);
		
		System.out.println(num1.add(num2));
		System.out.println(num1.multiply(num2));
	}
}
