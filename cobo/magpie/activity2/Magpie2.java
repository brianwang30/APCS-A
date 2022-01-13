/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
// Brianiacs (JingYi Feng, Brian Kang, Brian Wang)
// APCS pd6
// HW56 -- Turing Training Wheels
// 2022-01-12r
// time spent: 1 hrs
/*
ANSWERS:
Keyword:       Response:
covid/covid-19 I hate lockdown!
magpie         That's me!
Brian/JingYi   They helped create me!

When more than one keyword is present the first keyword listed in the else-if chain will be considered.
The best way to priortize would be to move the more "important" responses up in the code.

1. They will still be detected and considered a keyword.
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
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr.") >= 0)
		{
			response = "I'm sure he's a great teacher!";
		}
		else if (statement.indexOf("Mrs.") >= 0
		|| statement.indexOf("Ms.") >= 0)
		{
			response = "I'm sure she's a great teacher!";
		}
		else if(statement.indexOf("Doctor") >= 0)
		{
			response = "I'm sure they are a great teacher!";
		}
		else if(statement.indexOf("covid") >= 0
		|| statement.indexOf("covid-19") >= 0)
		{
			response = "I hate lockdown!";
		}
		else if(statement.indexOf("magpie") >= 0)
		{
			response = "That's me!";
		}
		else if(statement.indexOf("Brian") >= 0
		|| statement.indexOf("JingYi") >= 0)
		{
			response = "They helped create me!";
		}
		else if(statement.trim().length() < 1)
		{
			response = "Why so shy?";
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
			response = "Continue!";
		}
		else if (whichResponse == 5)
		{
			response = "No way.";
		}

		return response;
	}
}
