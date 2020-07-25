package com.testing;

public class RemovalOfFirstTwoAs {
	public String remove(String string) {
		String ans="";
		if(string.length()<2) {
			if(string.equals("")||string.charAt(0)=='A')
				ans+="";
			else 
				ans=string;
		}
		else {
		if(string.charAt(0)=='A')
			ans+="";
		else
			ans+=string.charAt(0);
		
		if(string.charAt(1)=='A')
			ans+=string.substring(2,string.length());
		else
		    ans+=string.substring(1,string.length());
		}
		return ans;
	}
}
