import java.util.*;
import java.io.*;

public class Stack {
	public static void main(String []argh) {
		Scanner input = new Scanner(System.in);

		while(true){
			String str = input.nextLine();
			String[] strList = str.split("");
			ArrayList<String> strArray = new ArrayList<String>();
		if(str.length()%2 == 0){
			for(int k =0; k < strList.length; k++) {
				strArray.add(strList[k]);
			}

			int i = 0;
			while(i<strArray.size()) {
				if((strArray.get(i).equals("[") && strArray.get(i+1).equals("]")) || (strArray.get(i).equals("{") && strArray.get(i+1).equals("}")) || (strArray.get(i).equals("(") && strArray.get(i+1).equals(")"))) {
					strArray.remove(i);
					strArray.remove(i);
					i = 0;
				}
				else{
					i++;
				}
			}
			if((strArray.size()-1)==0){
				System.out.println("true");
			}
			else{
				System.out.println("false");
			}
			}
		else{
			System.out.println("false");
		}
		}
		}
}
