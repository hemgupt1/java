import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Loop{
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		String count = input.readLine();
		String[] lines = new String[Integer.parseInt(count)];
		int i=0;
		do{
			lines[i] = input.readLine();
			i=i+1;
		}while(i < Integer.parseInt(count));
		for(int j=0; j<lines.length; j++){
			String[] subline = lines[j].split(" ");
			for(int l=0; l<Integer.parseInt(subline[2]); l++){
				int temp =Integer.parseInt(subline[0]);
				for(int m=0; m<=l; m++){
					temp = temp + (Math.pow(2,m) * Integer.parseInt(subline[1]));
				System.out.println(Math.pow(2,m));
				}
				//System.out.println(subline[0] + " " + subline[1] + " " +subline[2]);
				System.out.println(temp); System.out.println("========================");
			}
			System.out.println("========================");
		}
	}
}
