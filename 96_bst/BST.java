/*
FRED (Brian Wang, Brian Kang, Ethan Lam)
APCS
HW95 BST
2022--05--09
time spent: .5 hrs
*/

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
  BST()
  {
    /*** YOUR IMPLEMENTATION HERE ***/
  }


  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    if(_root == null){
      _root = newNode;
    }
    else{
      insert(_root, newNode);
    }
  }
  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    //System.out.println(newNode.getValue());
    if(newNode.getValue() > stRoot.getValue()){
      if(stRoot.getRight() != null){
        insert(stRoot.getRight(), newNode);
      }
      else{
        stRoot.setRight(newNode);
      }
    }
    else{
      if(stRoot.getLeft() != null){
        insert(stRoot.getLeft(), newNode);
      }
      else{
        stRoot.setLeft(newNode);
      }
    }
  }//end insert()




  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
  {
    System.out.print(currNode.getValue());
    if(currNode.getLeft()  != null){
      preOrderTrav(currNode.getLeft());
    }
    if(currNode.getRight()  != null){
      preOrderTrav(currNode.getRight());
    }
  }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    if(currNode.getLeft()  != null){
      inOrderTrav(currNode.getLeft());
    }
    System.out.print(currNode.getValue());
    if(currNode.getRight()  != null){
      inOrderTrav(currNode.getRight());
    }
  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
    postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if(currNode.getLeft()  != null){
      postOrderTrav(currNode.getLeft());
    }
    if(currNode.getRight()  != null){
      postOrderTrav(currNode.getRight());
    }
    System.out.print(currNode.getValue());
  }

  TreeNode search( int target )
  {
    return search(target, _root);
  }
  TreeNode search( int target, TreeNode curNode){
    if(target == curNode.getValue()){
      return curNode;
    }
    else if(target > curNode.getValue() && curNode.getRight() != null){
      return search(target, curNode.getRight());
    }
    else if(target < curNode.getValue() && curNode.getLeft() != null){
      return search(target, curNode.getLeft());
    }
    else{
      return null;
    }
  }


  /*****************************************************
   * int height()
   * returns height of this tree (length of longest leaf-to-root path)
   * eg: a 1-node tree has height 1
   *****************************************************/
  public int height()
  {
    return height(_root);
  }
  public int height(TreeNode curNode){
if(curNode == null){
  return 0;
  //height may be 1 off, test if it should be 0 or -1
}
    else if(height(curNode.getLeft()) > height(curNode.getRight())){
      return height(curNode.getLeft()) + 1;
    }
    else{
      return height(curNode.getRight()) + 1;
    }

  }


  /*****************************************************
   * int numLeaves()
   * returns number of leaves in tree
   * PROBABLY DOES NOT WORK CURRENTLY
   *****************************************************/
  public int numLeaves()
  {
    return numLeaves(_root, 0);
  }
  public int numLeaves(TreeNode curNode, int curLeaves){
    if(curNode.getLeft() != null){
      curLeaves = numLeaves(curNode.getLeft(), curLeaves);
    }
    if(curNode.getRight() != null){
      curLeaves = numLeaves(curNode.getRight(), curLeaves);
    }
    if(curNode.getLeft() == null && curNode.getRight() == null){
      return curLeaves + 1;
    }

    return curLeaves;
  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  //main method for testing
  public static void main( String[] args )
  {

      BST arbol = new BST();

      /*
                4
              /  \
             2    5
           /  \    \
          1    3    6

          PRE: 421356
          IN: 123456
          POST: 132654

      */

      //PROTIP: sketch state of tree after each insertion
      //        ...BEFORE executing these.
      arbol.insert( 4 );
      arbol.insert( 2 );
      arbol.insert( 5 );
      arbol.insert( 6 );
      arbol.insert( 1 );
      arbol.insert( 3 );

      System.out.println( "\n-----------------------------");
      System.out.println( "pre-order traversal:" );
      arbol.preOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "in-order traversal:" );
      arbol.inOrderTrav();

      System.out.println( "\n-----------------------------");
      System.out.println( "post-order traversal:" );
      arbol.postOrderTrav();

      System.out.println( "\n-----------------------------");

      System.out.println("other testing");
      System.out.println(arbol.height());
      System.out.println(arbol.numLeaves());
      System.out.println(arbol.search(3).getValue());
      System.out.println(arbol.search(11));
      /*~~~~~~~~~~~~move~me~down~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class
