import java.io.*;
import java.util.*;

public class Balance {
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
				
				String STR="";
				int mark2 = 0;
				ArrayList<String> STRARRAY = new ArrayList<String>();
				for(int k = 0; k < chr.length-1; k++){
					if(chr[k].equals("]") && chr[k+1].equals("[") || chr[k].equals("]") && chr[k+1].equals("{") || chr[k].equals("]") && chr[k+1].equals("(") || chr[k].equals("}") && chr[k+1].equals("[") || chr[k].equals("}") && chr[k+1].equals("{") || chr[k].equals("}") && chr[k+1].equals("(") || chr[k].equals(")") && chr[k+1].equals("[") || chr[k].equals(")") && chr[k+1].equals("{") || chr[k].equals(")") && chr[k+1].equals("(")){
					
						STR = STR + chr[k];
						STRARRAY.add(STR);
						mark2 = mark2+STR.length();
						STR = "";
					}
					else{
						STR = STR + chr[k];
					}
				}

				//System.out.println(mark2);
				String last = str.substring(mark2,str.length());
				STRARRAY.add(last);
				for(int l = 0; l < STRARRAY.size(); l++){
					//System.out.println(STRARRAY.get(l));



					//PART

					String[] chr1 = new String[STRARRAY.get(l).length()];
			for(int i = 0; i < STRARRAY.get(l).length(); i++){
				chr1[i] = STRARRAY.get(l).substring(i,i+1);
			}

			//String STATUS = "true";
			if((chr1.length)%2 == 0){
				
				String[] status = new String[chr1.length];
				for(int j = 0; j <= chr1.length-1; j=j+2){
					
					if((chr1[j].equals("[") && chr1[(chr1.length-1)-j].equals("]")) || (chr1[j].equals("{") && chr1[(chr1.length-1)-j].equals("}")) || (chr1[j].equals("(") && chr1[(chr1.length-1)-j].equals(")"))){
							status[j] = "true";
					}
					else if((chr1[j].equals("[") && chr1[j+1].equals("]")) || (chr1[j].equals("{") && chr1[j+1].equals("}")) || (chr1[j].equals("(") && chr1[j+1].equals(")"))){
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
				//System.out.println(STATUS);
			}
			else{
				//System.out.println("false");
				STATUS="false";
			}


					//PART_END

					
				}
				System.out.println(STATUS);

			}
			else{
				System.out.println("false");
			}
		}
	}
}
