package test12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		BufferedReader Reader= new BufferedReader(new InputStreamReader (System.in) );
		
		System.out.println("Enter First String");
		String S1=Reader.readLine();
		
		char[] S1_CharArr= S1.toCharArray();
		Arrays.sort(S1_CharArr);
		
String S1_sorted= new String(S1_CharArr);
		
		System.out.println(S1_sorted);
		System.out.println("Enter First String");
		String S2=Reader.readLine();
		
		char[] S2_CharArr= S2.toCharArray();
		Arrays.sort(S2_CharArr);
String S2_sorted= new String(S2_CharArr);
		
		System.out.println(S2_sorted);
		
		if(S1_sorted.equalsIgnoreCase(S2_sorted))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
