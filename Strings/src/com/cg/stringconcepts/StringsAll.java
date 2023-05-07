package com.cg.stringconcepts;

public class StringsAll{    
public static void main(String args[]){    
	String s1="java";
	char ch[]={'s','t','r','i','n','g','s'};    
	String s2=new String(ch);
	String s3=new String("example");  
	System.out.println(s1);    
	System.out.println(s2);    
	System.out.println(s3);    
	
	int value=30;  
	String s=String.valueOf(value);  
	System.out.println(s+10);
}}    