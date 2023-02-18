package com.arcada.devops;

import java.util.ArrayList;
import java.util.List;


public final class App 
{
	public static String[] fetchFriends(String name) {
		System.out.println(name);
		
		List<String> friendList = new ArrayList<>();
        friendList.add("Kalle");
        friendList.add("Jonas");
        friendList.add("Michael");
		
		if (name == "https://www.facebook.com/profile.php?id=Danny") {
			
			return friendList.toArray(new String[0]);
		}
    	
    	return null;
    }
		
		
	 
    public static final void main(final  String[] args )
    {
    	String link = "https://www.facebook.com/profile.php?id=Danny";
    
    	
    	String[] friends = fetchFriends(link);
    	
    	
    	for (int i = 0; i < friends.length; i++) {
    		System.out.println(friends[i]);
    	}
    	
    	
    }//main closes
    

}//class App closes
