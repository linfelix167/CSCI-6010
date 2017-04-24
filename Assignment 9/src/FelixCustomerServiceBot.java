import java.net.*;
import java.io.*;
 
public class FelixCustomerServiceBot {
    private static final int WAITING = 0;
    private static final int SENTRESPONSE = 1;
    private static final int SENTREQUEST = 2;
    private static final int ANOTHER = 3;
 
    private int state = WAITING;
 
    private String[] items = { "apples", "bananas", "oranges", "lemons", "grapes" };
    private String[] answers = { "The apples cost $5.", "The bananas cost $10.",
            "The oranges costs $15.", "The lemons cost $20.",
            "The grapes costs $25." };
 
    public String processInput(String theInput) {
        String theOutput = null;
 
        if (state == WAITING) {
            theOutput = "Hi, my name is Server and I am a bot. How can I help you?";
            state = SENTRESPONSE;
        } else if (state == SENTRESPONSE) {
            if (theInput.equalsIgnoreCase("I want to buy some fruits.")) {
                theOutput = "Which one do you want? 1.Apples 2.Bananas 3.Oranges 4.Lemons 5.Grapes";
                state = SENTREQUEST;
            } else {
                theOutput = "You're supposed to say \"I want to buy some fruits.\"! " +
                "Try again. Hi, my name is Server and I am a bot. How can I help you?";
                state = SENTRESPONSE;
            }
        } else if (state == SENTREQUEST) {
            if (theInput.equalsIgnoreCase(items[0])) {
                theOutput = answers[0] + " Want another? (y/n)";
                state = ANOTHER;
            } 
            else if (theInput.equalsIgnoreCase(items[1])) {
                theOutput = answers[1] + " Want another? (y/n)";
                state = ANOTHER;
            } 
            else if (theInput.equalsIgnoreCase(items[2])) {
                theOutput = answers[2] + " Want another? (y/n)";
                state = ANOTHER;
            } 
            else if (theInput.equalsIgnoreCase(items[3])) {
                theOutput = answers[3] + " Want another? (y/n)";
                state = ANOTHER;
            } 
            else if (theInput.equalsIgnoreCase(items[4])) {
                theOutput = answers[4] + " Want another? (y/n)";
                state = ANOTHER;
            } 
            else {
                theOutput = "You're supposed to ask a fruit\"" + 
                "! Try again. 1.Apples 2.Bananas 3.Oranges 4.Lemons 5.Grapes";
                state = SENTREQUEST;
            }
        } else if (state == ANOTHER) {
            if (theInput.equalsIgnoreCase("y")) {
            	theOutput = "Which one do you want? 1.Apples 2.Bananas 3.Oranges 4.Lemons 5.Grapes";
                
                state = SENTREQUEST;
            } else {
                theOutput = "Bye.";
                state = WAITING;
            }
        }
        return theOutput;
    }
}