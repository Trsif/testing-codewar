package xsando;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import removechars.RemoveChars;

public class AppTest 
{

    @Test
    public void testRemoval()
    {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }
}
