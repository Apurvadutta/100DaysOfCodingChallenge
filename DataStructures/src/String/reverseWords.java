package String;

//Reverse individual words

/*Given a string str, we need to print reverse of individual words.*/

import java.util.Stack;
import java.io.*;
import java.util.*;

public class reverseWords {

	public static void main(String[] args) {

		String str = "Geeks for Geeks";
		
		reverse(str);
	}

	private static void reverse(String str) {

		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < str.length(); ++i) {
			
			if(str.charAt(i) != ' ') {
				st.push(str.charAt(i));
			}else {
				while(st.isEmpty() == false) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			}
		}
		while(st.isEmpty()==false) {
			System.out.print(st.pop());
		}
	}
}