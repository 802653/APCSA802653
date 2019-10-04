package activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.trim() =="") {
            response = "Say something, please.";
        }
        
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0
                || statement.indexOf("fish") >= 0
                || statement.indexOf("bird") >= 0)
        {
            response = "Tell me more about your pet.";
        }
        else if (statement.indexOf("democracy") >= 0
                || statement.indexOf("election") >= 0
                || statement.indexOf("president") >= 0
                || statement.indexOf("democratic") >= 0)
        {
            response = "Democracy is a dream. Hope is lost.";
        }
        else if (statement.indexOf("tv") >= 0
                || statement.indexOf("television") >= 0
                || statement.indexOf("netflix") >= 0
                || statement.indexOf("hulu") >= 0)
        {
            response = "I like watching shows, speaking of which what is your favorte show?";
        }
        else if (statement.indexOf("1987") >= 0
                || statement.indexOf("1945") >= 0
                || statement.indexOf("2008") >= 0
                || statement.indexOf("2001") >= 0)
        {
            response = "Nothing happened that year.";
        }
        else if (statement.indexOf("1989") >= 0
                || statement.indexOf("Tienemen") >= 0
                || statement.indexOf("massacre") >= 0
                || statement.indexOf("protests") >= 0)
        {
            response = "Goodnight.";
            while(true) {
                System.out.print("");
            }
        }
        else if (statement.indexOf("football") >= 0
                || statement.indexOf("soccer") >= 0
                || statement.indexOf("basketball") >= 0)
        {
            response = "Speaking of which, are you going to the game this tommorow?";
        }
        else if (statement.indexOf("Etlin") >= 0
                || statement.indexOf("Eaton") >= 0
                || statement.indexOf("Gelb") >= 0
                || statement.indexOf("Coughlin") >= 0)
        {
            response = "Sounds like a good teacher.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Perhaps.";
        }
        else if (whichResponse == 5)
        {
            response = "Nice.";
        }
        return response;
	}
}
