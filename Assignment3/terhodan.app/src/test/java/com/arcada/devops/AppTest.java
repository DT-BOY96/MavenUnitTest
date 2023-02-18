package com.arcada.devops;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.Repeatable;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	String[] msg = App.fetchFriends("https://www.facebook.com/profile.php?id=Danny");
    	System.out.println(msg);
    	
    	if (msg == null) 
    	{
    		assertTrue( false );
    	}
    	
    	else if (msg.length < 1) 
    	{
    		assertTrue( false );
    	}
    	
    	else
    	{
    		assertTrue( true );
    	}
        
    }
    @Test
    public void testDatatype() {
    	
    	String type = App.fetchFriends("https://www.facebook.com/profile.php?id=Danny").getClass().getSimpleName();
        if (type == "String[]") {
        	assertTrue( true );
        }
    }
    
    
    @Test
    public void testGetFriendListWithValidProfileLink() {
        String[] expected = {"Kalle", "Jonas", "Michael"};
        String[] actual = App.fetchFriends("https://www.facebook.com/profile.php?id=Danny");
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetFriendListWithInvalidProfileLink() {
        String[] expected = {};
        String[] actual = App.fetchFriends("invalid profile link");
        assertArrayEquals(expected, actual);
    }
    
    @Test
    public void testGetFriendListWithNullProfileLink() {
        String[] expected = {};
        String[] actual = App.fetchFriends(null);
        assertArrayEquals(expected, actual);
    }

    
}

