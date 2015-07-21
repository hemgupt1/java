import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

public class Eof{
	public static void main(String[] args) throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(in);
		ArrayList<String> all = new ArrayList<String>();
		String lines=""; int i=0; int status=0;
		do{
			lines = input.readLine();
			all.add(lines);
			if(lines.indexOf("end-of-file") != -1) status=1;
			if(i == 9999) status=1;
			i=i+1;
		}while(status != 1);
		for(int j=0; j<all.size(); j++){
			System.out.println(j+1 + " " + all.get(j));
		}
	}
}
