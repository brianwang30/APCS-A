// Brianiacs (JingYi Feng, Brian Kang, Brian Wang)
// APCS pd6
// HW53 -- implementing insertion sort
// 2022-01-06r
// time spent: .4 hrs
/*
DISCO:
Our code for OAL is significantly slower than AL due to having to ensure that the OAL is always sorted.


QCC:
The initialization of an array is constant, right?
Is it still linear if n is 0? Namely, for remove, if we are removing the last element, would it be constant or linear?
Would the worst case for toString be an infinite length OAL? Is that valid?

*/
import java.util.ArrayList;

public class OrderedArrayList {
  private ArrayList<Integer> _data;

// Best case: -
// Worst case: -
// Time complexity: CONSTANT
// Only difference is length.
  public OrderedArrayList(){
    _data = new ArrayList<Integer>();
  }

// Best case: Element added is smallest in OAL
// Worst case: Element added is largest in OAL, and expansion is required
// Time complexity: LINEAR
// Add itself is amortized constant, and  calcIndex is linear.
  public boolean add(int newVal) {
    int idx = calcIndex(newVal);
    _data.add(idx, newVal);
    return true;
  }

// Best case: Element is last in OAL
// Worst case: Element is first on OAL
// Time complexity: LINEAR
// Only runs AL's remove. AL's remove is linear.
  public int remove(int idx) {
    int temp = _data.get(idx);
    _data.remove(idx);
    return temp;
  }

// Best case: -
// Worst case: -
// Time complexity: CONSTANT
// Literally just AL's get. No difference whatsoever between size.
  public int size() {
    return _data.size();
  }

// Best case: Element is smallest in OAL
// Worst case: Element is largest in OAL
// Time complexity: LINEAR
// Iterates through every element until the correct spot is found.
  private int calcIndex(int newVal) {
    for (int i = 0; i < _data.size(); i += 1) {
      if (_data.get(i) > newVal) {
        return i;
      }
    }

    return size();
  }

// Best case: -
// Worst case: -
// Time complexity: CONSTANT
// Literally just AL's get, which is constant. No difference whatsoever. 
  public int get(int index) {
      return _data.get(index);
  }

// Best case: OAL of 0 length
// Worst case: ??? (qcc)
// Time complexity: LINEAR
// Requires adding every element in a OAL to string
  public String toString(){
    String result = "[";
    for(int i = 0 ; i < _data.size() ; i += 1){
      result += _data.get(i) + ", ";
    }
    if ( result.length() > 1 )
            //shave off trailing comma
            result = result.substring( 0, result.length() - 2 );
    result += "]";
    return result;
  }

}
