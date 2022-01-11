// Brianiacs (JingYi Feng, Brian Kang, Brian Wang)
// APCS pd6
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent: .5  hrs

/******************************
*   class SelectionSort -- implements SelectionSort algorithm
*
* ALGO: 1. Select smallest element, move to end.
2. Select next smallest, move to next to end.
3. Repeat until no elements not sorted
* (Algo for implemented search is in reverse, seeking the largest and moving to the right, as my liege requests)
*
* DISCO
* possible optimization: Ignore final swap
*
* QCC
* q0: How many passes to sort n elements?
* a0: We need n passes to sort n elements because we carefully match each index in consecutive order.
* q1: What do you know after pass p?
* a1: p elements are sorted in order
* q2: How do you know if sorted?
* a2: We know if the array is sorted if the values are in ascending order. That is, that starting from the end to the start of the array, the value should be decreasing.
* q3: What does a pass boil down to?
* a3: A pass boils down to the most simplified version of the array, meaning the array placed in ascending order from left to right.
* Each n pass symbolizes that n values are in chronological order.
*
* Why does java like to complain that maxPos might not have been initialized if it is impossible for it to not be initialized? Just a java thing? Because it is in a for?
******************************/



import java.util.ArrayList;

public class SelectionSort
{



  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = 0;

    for( int pass = 1 ; pass < data.size() ; pass += 1 ) {
      maxPos = 0; //reset maxPos every time
      for( int searched = data.size() - pass ; searched >= 0 ; searched -= 1 ) { //Loop to find index of maximum unsorted value

        if(data.get(searched).compareTo(data.get(maxPos)) > 0){ //tests if current value greater than maxPos
          maxPos = searched;
        }

      }
      //swap maxPos and pass values
      data.set(data.size() - pass, data.set(maxPos, data.get(data.size() - pass)));

    }
  }//end selectionSort



}//end class SelectionSort
