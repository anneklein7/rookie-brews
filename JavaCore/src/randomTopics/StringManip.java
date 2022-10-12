package randomTopics;

public class StringManip {
	public static void main(String args[]) {
		
		// CREATING STRINGS
		
        // method 1 (less memory), output will be: Hello World!
		String strLiteral = "Hello World!";
        System.out.println(strLiteral);
        
        /* method 2 (more memory), output will be Hello World! 
         * Java will see strings as different objects even if their values are the same */
        String strObject = new String("Hello World!");
        System.out.println(strObject);
        
        // Method 1     
        String str1 = "I like strings";
        String str2 = "I like strings";
        System.out.println(str1 == str2); // output will be: true

        // Method 2
        String str3 = new String("I like strings");
        String str4 = new String("I like strings");
        System.out.println(str3 == str4); // output will be: false
        
        // can still compare them using equals() method, output will be: true
        String str5 = new String("I like strings");
        String str6 = new String("I like strings");
        System.out.println(str5.equals(str6));
        
        // create string through arrays
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
        String helloString = new String(helloArray);  
        System.out.println(helloString); // prints out Hello.
        
        
        // CHECK THE LENGTH OF A STRING (IN CHARACTERS)
        
        // output will be: String Length is 14
        String myStr = "I like strings";
        int stringLength = myStr.length();
        System.out.println("String Length is " + stringLength);
        
        // CONCATENATING STRINGS
        
        //example 1
        String myStr1 = "My cat's name is ".concat("Copycat");
        System.out.println(myStr1);
        // output will be: My cat's name is Copycat

        //example 2
        String myStr2 = "Hello, " + "World" + "!" ;
        System.out.println(myStr2);
        // output will be: Hello, World!

        //example 2.5, output will be: Hello,World! because no spaces were included
        String myStr3 = "Hello," + "World" + "!"; // don't forget to add spaces!
        System.out.println(myStr3);

        //example 3, output will be: Welcome to Java!
        String string1 = "Welcome ";
        String string2 = "to ";
        String string3 = "Java";
        String string4 = "!";
        System.out.println(string1 + string2 + string3 + string4);
        
        
        // OTHER RANDOM THINGS AND WAYS OF MANIPULATING STRINGS
        
        String str7 = "ThIsIsSoMeTeXt";
        String str8 = "thisissometext";

        // Converts text to lowercase
        System.out.println(str7.toLowerCase());// output will be: thisisometext

        // Converts text to UPPERCASE
        System.out.println(str7.toUpperCase()); // output will be: THISISSOMETEXT

        // Returns the character at the specified index
        System.out.println(str7.charAt(3)); // output will be: s

        // Returns the first position of the character specified.
        System.out.println(str7.indexOf("I")); // output will be: 2

        // Returns true or false if the string ends with the specified character
        System.out.println(str7.startsWith("t")); // output will be: false

        // Returns true or false if the string ends with the specified character
        System.out.println(str7.endsWith("t")); // output will be: true

        // Returns true or false if the string contains the specified characters
        System.out.println(str7.contains("So")); // output will be: true

        // Returns a new string that is a substring of this string.
        // start index is inclusive and endindex is exclusive
        System.out.println(str7.substring(1, 3)); // output will be: hIs

        // Checks if the values of two strings are the same:
        System.out.println(str7.equals(str8)); // output will be: false

        // Compares two strings ignoring case considerations:
        System.out.println(str7.equalsIgnoreCase(str8)); // output will be: true

        //Searches a string for a specified value and then replaces it with another value
        System.out.println(str7.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt

        // TESTING
        
        String weather1 = "Yesterday it was raining";
        String weather2 = "Today it is sunny";
        
        System.out.println(weather1.toUpperCase() + ", " + weather2.toUpperCase());
        
        
        
    }

}
