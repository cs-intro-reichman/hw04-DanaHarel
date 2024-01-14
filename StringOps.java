public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        
    }

    public static String capVowelsLowRest (String string) {
        String Final = "";
        String Vowels = "aeiouAEIOU";
        char c ;

        //Outer loop for all String
        for (int i = 0; i < string.length(); i++)
        {   
            c = string.charAt(i); // c is the character at place i in string

            if (Character.isLetter(string.charAt(i))) //Is c a letter
            {
                if ((string.charAt(i) >= 'A') && (string.charAt(i)<= 'Z')) //Is c upper case?
                {
                    c = Character.toLowerCase(string.charAt(i)); //change c to lower case
                } 
                   
                    //Checks if the character is a vowel
                    for (int v = 0; v < Vowels.length(); v++)
                     {
                       if(c == (Vowels.charAt(v))) //In case the character is a vowel
                       {
                         c = Character.toUpperCase(string.charAt(i)); // Change vowel to upper case
                         break;
                       }
                     }
                   }
                   
              else // c is space
                {c = string.charAt(i);}

          Final = Final + c;      

        }
        return Final;
    }

    public static String camelCase (String string) 
    {
        String Final = "";
        int i = 0;
        //change first char to lower case
        char c = Character.toLowerCase(string.charAt(i)); //change first char to lower casc 
        Final = Final + c;
        
        //loop for all String
        for (i = 1; i < string.length(); i++)
        {
            c = string.charAt(i); // c is the character at place i in string
            
            if ((string.charAt(i)) != ' ' ) //Is c a letter
            {
                if ((string.charAt(i) >= 'A') && (string.charAt(i)<= 'Z')) //Is c upper case?
                {
                    c = Character.toLowerCase(string.charAt(i)); //change c to lower case

                } 
                
                if ((string.charAt(i-1)) == ' ')
                 {
                  c = Character.toUpperCase(string.charAt(i)); //change c to upper case
                 }
                 
                 Final = Final + c;
            }

              
    

        }
        return Final;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }

}
