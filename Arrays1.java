/*Arrays Basic operations -declaring, initializing , accessing individual elements
printing array elements, finding maximum and minimum numbers in array, reverse print an 
array etc */

public class Arrays1 {
     
// Method to display all array elements
	
	public static void printArray(int[] array) {
		int i=0;
		while (i < array.length) {
			System.out.print(array[i]+ " ");
			i++;
		}
		System.out.println();
	}
	
// Method to remove even numbers in array and display it
	
	public static int[] removeEven(int[] array) {
		int i = 0, oddcount = 0;
		
		
		while (i < array.length) {
			if (array[i]%2 !=0) {
				oddcount++;
				}
			i++;
		}
		
		int k = 0;
		int noEvenArray[] = new int[oddcount];
		
		for(int j=0;j<array.length;j++) {
			if (array[j]% 2 !=0) {
				noEvenArray[k] = array[j];
				k++;
			}
		}
		return noEvenArray;
	}
	
/* Method to reverse elements
 * Use two pointers one for array[0] and another for array[array.length-1]
 * reverse these two elements in a loop till start pointer is < end pointer.
 * start pointer is incremented by one and end pointer is decremented by one
 */
	
	public static int[] reverseArray(int[] array){
		int start_ptr = 0, temp;
		int end_ptr = array.length-1;
		
		while ((start_ptr!=end_ptr) && (start_ptr < end_ptr)) {
			temp=array[start_ptr];
			array[start_ptr]=array[end_ptr];
			array[end_ptr]=temp;
			start_ptr++;
			end_ptr--;
		}
		return array;
			
	}

/* Method to find Max number
 * Initialize Maximum to array[0] and compare it with each array element
 * if Maximum is < array[i], update Maximum to array[i]
 * return Maximum
 */
	
	public static int findMax(int[] array) {
	
		int max =array[0];
		
		for (int i=1;i < array.length; i++) {
			  if (max < array[i]) {
				  max = array[i];
			  }
		
		}
		return max;
	}
	
/*	Method to find Minimum number. 
 *  Initialize minimum to array[0] and compare it with each array element
 *  If minimum is greater than array[i], then update minimum to array[i]
 *  return array[i]
 */
	
		public static int findMin(int[] array) {
			
			int min = array[0];
			
			for (int i=1;i < array.length; i++) {
				  if (min > array[i]) {
					  min = array[i];
				  }
				
			}
			return min;
		}
	
/* Method to find second maximum value
 * Set max and second_max to Integer.MIN_VALUE.Compare max with each array element
 * If array[i] > max, set second_max to max, and max to array[i]
 * return second_max
 */
		
		public static int findSecondMax(int[] array) {
			
			int max = Integer.MIN_VALUE, second_max = Integer.MIN_VALUE;
			
			for (int i=0;i < array.length; i++) {
				if (array[i] > max) {
					second_max = max;
					max = array[i];
				}
			}
			return second_max;
		}
		
	public static void main(String[] args) {
		
// Different ways of declaring and initializing Arrays	

		int[] a = {5,9,3,15,1,2,6};
		int[] b = a;
		int c[] = new int[5]; 
		int i   = 0;
	 
 // Populating Array elements dynamically 
		
        while (i < c.length) {
        	c[i] = i*i;
        	i++;
        	
        }
       
 // Print elements of Array
        
        printArray(a);
       
// Print Maximum, minimum, and Second Maximum elements of Array
        
       System.out.println("Max number in the array is " + findMax(a));
       System.out.println("Min number in the array is " + findMin(a));
       System.out.println("Second Max number in the array is " + findSecondMax(a));
          
// Print elements of Array in reverse
       
       System.out.print("\nArray after reversing it is ");
       printArray(reverseArray(a));   
        
// Remove even numbers from array a and print
       
       System.out.print("\nArray after removing even numbers is ");
       printArray(removeEven(a));
           	
	}
}
