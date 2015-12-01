
public class problem05 
{public static int linearSearch( int array2[], int key ) 
{ 
    // loop through array elements
    for ( int cntr = 0; cntr < array2.length; cntr++ ) 
    { 
        // if array element equals key value, 
        // return location 
        if ( array2[ cntr ] == key ) 
           return cntr; 
    }
    
    return -1;  // key not found
}


//method to perform binary search of an array
public static int binarySearch( int array2[], int key )
{
     int low = 0;                  // low element subscript
     int high = array2.length - 1; // high element subscript
     int middle;                   // middle element subscript

     // loop until low subscript is greater than high subscript
     while ( low <= high ) 
     {
        // determine middle element subscript
        middle = ( low + high ) / 2;

        // if key matches middle element, return middle location
        if ( key == array2[ middle ] )
        {
           return middle;
        }
        // if key less than middle element, set new high element
        else 
        {
           if ( key < array2[ middle ] )
           {
              high = middle - 1;
           }
           // key greater than middle element, set new low element
           else
           {
              low = middle + 1;
           }
        }

     } // end while loop

     return -1;   // key not found

}  // end method binarySearch
	public static void main(String[] args) 
	{
		int list[] = { 240, 321, 333, 987, 90, 876, 12, 132, 564, 654, 241, 322, 334, 988, 91, 877, 13, 133, 565, 655, 242, 323, 335, 989, 92, 878, 14, 134, 566, 656 };
		int idxHolder = 91, index;
		
		index = linearSearch(list, idxHolder);
		index = binarySearch(list, idxHolder);
		
		if (index != -1)
		{
			System.out.println("The value " + idxHolder + " was found at index " + index);
		}
		else 
		{
			System.out.println("The value " + idxHolder + " is not in the array");

		}
	}

}