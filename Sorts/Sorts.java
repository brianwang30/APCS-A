import java.util.ArrayList;

public class Sorts{
  public static void bubble(ArrayList<Comparable> unsorted){
    BubbleSort.bubbleSortV(unsorted);
  }

  public static void insertion(ArrayList<Comparable> unsorted){
    InsertionSort.insertionSortV(unsorted);
  }

  public static void selection(ArrayList<Comparable> unsorted){
    SelectionSort.selectionSortV(unsorted);
  }

  public static void main(String[] illsortyourfaceout){
    ArrayList test = new ArrayList<Integer>();
    for(int i = 0 ; i < 15 ; i += 1){
      test.add((int)(Math.random()*100));
    }
    System.out.println(test);
    //Sorts.bubble(test);
    //Sorts.insertion(test);
    Sorts.selection(test);
    System.out.println(test);
  }
}
