package com.Module4;

public class SearchString {
	public static void main(String []args) {
		System.out.println(isSubString("The", "The cat in the hat.") );  //Check the "The"
		System.out.println(isSubString("hat", "The cat in the hat.") );//Check the "hat
		System.out.println(isSubString("cat", "The cat in the hat.") );//check the "cat"
	}
	
	public static boolean isSubString(String specialString,String targetString) { //Declare the public method
		for(int i=0;i<targetString.length()-specialString.length();i++){
			//i and j means the index of the targetString
			for(int j=i;(j-i)<specialString.length();j++)  
				//j-i means the index of the specialString
			{
				//if one specialString's char is different the targetString'char,return break
				if(specialString.charAt(j-i)!=targetString.charAt(j)) {			   
					break;                                          
				}
				//if three continuously specialString's char is the same as targetString'char,return true
				if((j-i)==specialString.length()-1) {	
					return true;                     
				}
					
			}
		}		
		return false;// If there is no matching value,then return false
	}
}
