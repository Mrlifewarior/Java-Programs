package com.javatpoint;
import java.io.*;
class BufferReader
{
	public static void main(String args[]) throws IOException
	{
		String sample;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name :  ");
		sample = br.readLine();
	}
}