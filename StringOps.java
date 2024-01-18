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
        String string = " Hello world";
        System.out.println(camelCase(string));
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


    // public static String camelCase(String string) {
    //     String finalStr = "";
    //     //int i = 0;
    //     // char c = string.charAt(i);
    //     char p = ' ';
    //     // if (Character.isWhitespace(c)) // c is white space 
    //     // {
    //     //     p = c;
    //     // }
    //     //  else
    //     //  {
    //     //     c = Character.toLowerCase(string.charAt(i)); // change c to lower case
    //     //     finalStr = finalStr + c;
    //     //     p = c;
    //     //  }
    
    //     // loop for all String from i = 1
    //     for (int i = 0; i < string.length(); i++) 
    //     {
    //         char c = string.charAt(i); // c is the character at place i in string
    //         if (Character.isWhitespace(c)) // if c is white space
    //         {
    //             p = c;
    //         }
    //          else 
    //          {
    //             if (Character.isWhitespace(p)) // p (privious char) is white space 
    //             {
    //              c = Character.toUpperCase(string.charAt(i)); // change c to upper case
    //              finalStr = finalStr + c;
    //              p=c;
    //             }
    //              else
    //              {
    //                c = Character.toLowerCase(string.charAt(i)); // change c to lower case
    //                finalStr = finalStr + c;
    //                p = c;
    //               }

    //          }
            
    //           } 

    //           return finalStr;
    //     }

    public static String camelCase (String str) 
    {
       
        String res = "";
        String temp = "";
        int start = 0;
        int stop = 0;
        int c = 0; 
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)== ' ')
            {
                c++;
            }
        }

        //c = amountOfSpaces(str);
        if(c == 0)// if there is no space, return the word in small leters
        {
            res = lowerCase(str);
        }
        else// there are some spaces
        {
           for(int i = 0; i<=c; i++)
           {
                if(start == 0)// makes the first word in small leters
                {
                    stop = str.indexOf(' ');
                    res+= lowerCase(str.substring(start,stop));
                    
                }
                else
                {
                    stop = str.indexOf(' ',start);
                    if(stop == -1)
                    {
                        res+= makesItPerfect(str.substring(start));
                    }
                    else
                    {
                        res+= makesItPerfect(str.substring(start, stop));
                        start = stop+1;
                    }
                }
                start = stop+1;
           }
        }
        return res ;
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


    public static boolean isThereSpace(String str) 
    {
        boolean flag = false;
        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i)!= ' ')
            {
                continue;
            }
            else
            {
                flag = true;
                break;
            }
        }
      
        return flag;
    }

    public static String makesItPerfect(String str) 
    {
        String res = "";
        char ch = str.charAt(0);
        int ascii = ch ;
        if (ascii>=97 && ascii<=122)// if small leter make it capital
            {
                int asciiC = ascii - 32; 
                res = res + ((char)asciiC);
            }
        else
        {
            res += str.charAt(0);
        }
        for (int i = 1; i< str.length(); i++)
        {
            ch = str.charAt(i);
            ascii = ch ;
            if (ascii>=64 && ascii<=90)// if capital leter make it small
            {
                int asciiLow = ascii + 32; 
                res = res + ((char)asciiLow);
            }
            else
            {
                res += str.charAt(i);
            }
        }
      
        return res;
    }

    public static String lowerCase(String s) 
    {
        
        String res = "";
        for (int i = 0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            int ascii = ch ;
            if (ascii>=65 && ascii<=94)
            {
                int asciiLow = ascii + 32; 
                res = res + ((char)asciiLow);
            }
            else
            {
                res = res + ch;
            }
        }
        return res;
    }


}
