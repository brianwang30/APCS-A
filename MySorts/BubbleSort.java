// TNPG: All Brians (Brian Kang, Brian Wang, Ryan Lau)
// APCS
// HW51 -- Dat Bubbly Tho
// 2022-1-3
// time spent: 1 hr

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO: 1. Start with the end of the loop (The size of the array).
 2. Iterate through the array from right to left, checking two at a time.
 3. For each check, determine if the value is less than or greater than the previous index.
 If the right element is greater or equal to the left element, maintain the order. Else, swap the order and repeat with the previous index as the focused index and the index before the focused index.
 4. Repeat Step 3 x times where x is the number of elements in the array - 2.
 *
 * DISCO
 * Possible optimizations we discovered during coding:
 * Possibility of implementing a short circuit, although not finally implemented due to problems in implementation
 * Possibility of not checking the first p elements of the arraylist, where p is the number of passes
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: If a pass requires no swaps, then the array is already sorted.
 *
 * q1: After pass p, what do you know?
 * a1: After pass p, we know that the first p elements are sorted.
 *
 * q2: How many passes are necessary to completely sort?
 * a2: The number of passess necessary to completely sort is the length of the array - 1.
 *
 * Is there a way to copy an ArrayList without manually copying it?
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{



  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    for(int i = data.size() - 1 ; i > 0 ; i -= 1){
      for(int j = data.size() - 1 ; j > 0 ; j -= 1){

        if(data.get(j).compareTo(data.get(j - 1)) < 0){
          System.out.println(data);
          data.set(j, data.set(j - 1, data.get(j)));
        }
      }
    }
  }



}//end class BubbleSort
