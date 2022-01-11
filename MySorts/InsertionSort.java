// Brianiacs (JingYi Feng, Brian Kang, Brian Wang)
// APCS pd6
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent: .4 hrs

/******************************
 * class InsertionSort -- implements InsertionSort algorithm
 *
 * ALGO: Partition list into sorted and unsorted regions, start between element 0 and element 1
Walk element from unsorted to proper position in sorted list by comparing the values and swapping if necessary
Increase size of partition by 1 each time
Once partition is at the end of the list, the list is sorted
 *
 * DISCO
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: We need n passes to sort n elements.
 * q1: What do you know after pass p?
 * a1: After pass p, we know that p values are in ascending order.
 * q2: How will you know when sorted?
 * a2: We will know when its sorted if we check each value and its greater than its previous term.
 * q3: What constitues a pass?
 * a3: A pass is determined when the next index in line is sorted in order.
 * q4: What must you track?
 * a4: We must track the value we are trying to sort as we "walk" it down the array.
 ******************************/


import java.util.ArrayList;

public class InsertionSort
{


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  {
    for( int partition = 1 ; partition < data.size() ; partition += 1 ) {
      //partition marks first item in unsorted region
      //traverse sorted region from right to left
      for( int i = partition ; i > 0 ; i -= 1 ) {


        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i - 1)) < 0)  {
          data.set(i, data.set(i - 1, data.get(i)));


        }
        else
          break;
      }
    }

  }//end insertionSortV






}//end class InsertionSort
