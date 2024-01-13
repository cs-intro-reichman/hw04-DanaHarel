public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {2,8,3,7,8};
        System.out.println(secondMaxValue(array));


        
    }
    
    public static int findMissingInt (int [] array) 
    {
        int missing = 0;
        for(int i = 0; i<=array.length; i++) //checks for every x in the aaray if it exsists
        {
            int count = 0; 

            for(int n = 0; n<array.length; n++) //checks all integers in the array
            {
                
                if(array[n] == i) //indicates if x was found in the array
                {
                    count++;
                    break; //breakes the inner loop once the int is found
                }
            }

            if(count==0) //sests missing if x wasnt found in the array
            {
                missing= i;//breaks the loop once the missing int is found
                break;

            }

        }
        
        return missing;
    }

    public static int secondMaxValue(int [] array) 
    {
        int max1 = array [0]; // sets max1 to be the first in the array
        for(int i = 0; i<array.length; i++)
        {
            if(array[i] >= max1)
            {
                max1 = array[i];//sets max1 to be the max value of array
            }
        }
        int max2 = array [0]; // sets max2 to be the first in the array

        for(int n = 0; n<array.length; n++)
        {
            if( (array[n] <= max1) && (array[n] >max2)) 
            {
                max2 = array[n];//sets max2 to be the 2nd max value of array
            }
        }

        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        boolean found = true;
        int count = 0; 
          for(int a1 = 0; a1<array1.length; a1++) // outer loop over array1
          {
            count =0;

             for(int a2 = 0; a2<array2.length; a2++) //inner loop over array2
             {
                if(array1[a1] == array2[a2]) // if the same elemnt was found
                {
                    count++; //indicates when an elemnt was found 
                    break; // breaks the loop once the element was found
                }
             }

             if(count==0) //the element was not found for array[a1]
             {
                found = false; //the function will return false since the elemnt was not found
                break; // breaks the outer loop since the element was not found
             }
          }
       
        return found;
    }

    


    

    public static boolean isSorted(int [] array) {
        
        if (array[0] <= array[1]) //checks if the array is optinally sorted increasingly, from the minimum value to the maximum value
        {
            boolean increasing = true;
            for(int i = 0; i<array.length - 1; i++)
            {
                if ((array.length > 1) && (array[i] > array[i+1]))
                {
                   increasing = false;
                   break;
                }
            }

            return increasing;

        }

        else // if the array is optinally stored decreasingly, from the maximum value to the minimum value. 
        {
            boolean decreasing = true;
            for(int i = 0; i<array.length -1; i++)
            {
                if (array[i] < array[i+1])
                {
                   decreasing = false;
                   break;
                }
            }

            return decreasing;

        }
        
    }

}
