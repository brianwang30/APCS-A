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
* a3: A pass boils down to locating the smallest value in the array and swapping it
*
* Why does java like to complain that maxPos might not have been initialized if it is impossible for it to not be initialized? Just a java thing? Because it is in a for?
******************************/
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


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
      System.out.println( "\nbegin pass " + (data.size() - pass) );//diag
      for( int searched = data.size() - pass ; searched >= 0 ; searched -= 1 ) { //Loop to find index of maximum unsorted value
        System.out.println(searched);
        if(data.get(searched).compareTo(data.get(maxPos)) > 0){ //tests if current value greater than maxPos
          maxPos = searched;
          System.out.println( "maxPos: " + maxPos );//diag
          System.out.println( data );//diag
        }

      }
      //swap maxPos and pass values
      data.set(data.size() - pass, data.set(maxPos, data.get(data.size() - pass)));

      System.out.println( "maxPos: " +  maxPos + "\npass: " + pass );//diag
      System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    /*===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );

      ============================================*/


      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
          /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
