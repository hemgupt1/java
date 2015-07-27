import java.io.*;
import java.util.*;

public class Test {
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		
		Hashtable braces = new Hashtable();
		braces.put("[","]");
		braces.put("{","}");
		braces.put("(",")");

		while(in.hasNextLine()){
			String str = in.nextLine();
			//str.split("");
			String[] chr = new String[str.length()];
			for(int i = 0; i < str.length(); i++){
				chr[i] = str.substring(i,i+1);
			}

			String STATUS = "true";
			if((chr.length)%2 == 0){
				
				String[] status = new String[chr.length];
				for(int j = 0; j <= chr.length-1; j=j+2){
					
					if((chr[j].equals("[") && chr[(chr.length-1)-j].equals("]")) || (chr[j].equals("{") && chr[(chr.length-1)-j].equals("}")) || (chr[j].equals("(") && chr[(chr.length-1)-j].equals(")"))){
							status[j] = "true";
					}
					else if((chr[j].equals("[") && chr[j+1].equals("]")) || (chr[j].equals("{") && chr[j+1].equals("}")) || (chr[j].equals("(") && chr[j+1].equals(")"))){
							status[j] = "true";
					}
					else {
						status[j] = "false";
					}	
				}
				for(int k =0; k < status.length; k++){
					if(status[k] == "false") STATUS = "false";
					break;
				}
				System.out.println(STATUS);
			}
			else{
				System.out.println("false");
			}
		}
	}
}
