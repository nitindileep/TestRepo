package com;

import java.io.*;

public class Input {
	public static void main(String[] args) {
		BufferedReader b = null;
		try{
			b = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a number: ");
			int i = Integer.parseInt(b.readLine());
			System.out.println("You Entered "+i);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
