// WON (Brian, Paul, Ethan)
//APCS
//HW 77 -- Insert Remove -- Linked Lists
//2020--03--15
//time spent: .2 hours


/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

 /*
 ALGOS:
 Ins: Walk to location, and couple in the new node inbetween this and the next node.
 Rem: Walk to location, and recouple prev node to node after deleted node. 
 */

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }


  //remove node from list, return its data
  public String remove( int index ) {
    LLNode tmp = _head;
    for( int i=0; i < index-1; i++ )
      tmp = tmp.getNext();
    LLNode rmNode = tmp.getNext();
    tmp.setNext(rmNode.getNext());
    _size--;
    return rmNode.getCargo();
  }

  public void insert( String newVal, int index ) {
    LLNode tmp = _head;
    for( int i=0; i < index-1; i++ )
      tmp = tmp.getNext();
    tmp.setNext(new LLNode(newVal, tmp.getNext()));
    _size++;
  }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    james.remove(2); //remove a
    System.out.println( james );

    james.insert("JASDKASDA", 1);
    System.out.println( james );
  }

}//end class LList
