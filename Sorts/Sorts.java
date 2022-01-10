import java.util.ArrayList;

public class Sorts{
  public static void bubble(ArrayList<Comparable> unsorted){
    //BubbleSort.bubbleSortV(unsorted);
    BubbleSort.bubbleSort(unsorted);
  }

  public static void insertion(ArrayList<Comparable> unsorted){
    //InsertionSort.insertionSortV(unsorted);
    InsertionSort.insertionSort(unsorted);
  }

  public static void selection(ArrayList<Comparable> unsorted){
    //SelectionSort.selectionSortV(unsorted);
    SelectionSort.selectionSort(unsorted);
  }

  public static void main(String[] illsortyourfaceout){
    ArrayList test = new ArrayList<Integer>();
    for(int i = 0 ; i < 5 ; i += 1){
      test.add((int)(Math.random()*100));
    }
    System.out.println(test);
    System.out.println("bubble: ");
    Sorts.bubble(test);
    System.out.println("\ninsertion: ");
    Sorts.insertion(test);
    System.out.println("\nselection: ");
    Sorts.selection(test);
    //System.out.println(test);
  }
}
