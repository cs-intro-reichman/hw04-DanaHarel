import java.util.Arrays;

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
        String string = "HELLO world";
        System.out.println(camelCase (string) );
     
    }

    public static String capVowelsLowRest (String string) {
        String Final = "";
        String Vowels = "aeiouAEIOU";
        int i = 0;
        char c = string.charAt(i) ;

        //Outer loop for all String
        for (i = 0; i < string.length(); i++)
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
        char c;
        int e = 0; // will be the indicate for the i-1 place in string
        
        //loop for all String
        for (i = 0; i < string.length(); i++)
        {
            c = string.charAt(i); // c is the character at place i in string
            if ((string.charAt(i)) != ' ' ) //Is c a letter
            {
                if ((string.charAt(i) >= 'A') && (string.charAt(i)<= 'Z')) //Is c upper case?
                {
                    c = Character.toLowerCase(string.charAt(i)); //change c to lower case

                } 
                if ((i!=0) && (string.charAt(e)) == ' ')
                 {
                  c = Character.toUpperCase(string.charAt(i)); //change c to upper case
                 }
                 
                 Final = Final + c;
                 e = i;
            }

        }
        return Final;
    }

    public static int[] allIndexOf (String string, char chr) {
        
        int count = 0;
        for (int n = 0; n < string.length(); n++)
        {
            if ((string.charAt(n)) == chr)
            {
                count++;
            }
        }
        
        int[] arr = new int[count];
        int j = 0;

        for (int i = 0; i < string.length(); i++)
        {
            if ((string.charAt(i)) == chr)
            {
                arr[j] = i;
                j++;
            }
        }
        
        return arr;
    }

}
