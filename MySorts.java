// Brianiacs (JingYi Feng, Brian Kang, Brian Wang)
// APCS pd6
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent: .4  hrs

/*
Bubble:
1. Start with the end of the loop (The size of the array).
2. Iterate through the array from right to left, checking two at a time.
3. For each check, determine if the value is less than or greater than the previous index.
   If the right element is greater or equal to the left element, maintain the order. Else, swap the order and repeat with the previous index as the focused index and the index before the focused index.
4. Repeat Step 3 x times where x is the number of elements in the array - 2.
Insertion:
ALGO: Partition list into sorted and unsorted regions, start between element 0 and element 1
Walk element from unsorted to proper position in sorted list by comparing the values and swapping if necessary
Increase size of partition by 1 each time
Once partition is at the end of the list, the list is sorted
Selection:
1. Select smallest element, move to end.
2. Select next smallest, move to next to end.
3. Repeat until no elements not sorted
*/
import java.util.ArrayList;
public class MySorts{


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


}
