import java.io.*;
import java.util.Scanner;
import java.util.*;

class Demo {
	public static void main(String []argh) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		String str1 = input.readLine();
		String str = str1.replaceAll("^\\s+", "");
		String[] strA = str.split("[\\s\\?\\'\\,\\!\\_\\@\\.]+");
		
		if(strA.length !=0 && strA[0].length() == 0){
		System.out.println(0);
		}
		else{
		System.out.println(strA.length);
		for(int i=0; i<strA.length; i++){
			System.out.println(strA[i]);
		}
		}
	}
}


