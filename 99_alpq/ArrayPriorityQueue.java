import java.util.ArrayList;
public class ArrayPriorityQueue{
  public ArrayList<Integer> pQueue = new ArrayList<Integer>();

  //linear
  public void add(int x){
    ArrayList<Integer> repQueue = new ArrayList<Integer>();
    int insInd = 0;
    for(int i = 0 ; i < pQueue.size() && pQueue.get(i) < x ; i++){
      insInd = i;
      repQueue.add(pQueue.get(i));
    }
    repQueue.add(x);
    for(int j = insInd ; j < pQueue.size() ; j++){
      repQueue.add(pQueue.get(j));
    }
    pQueue = repQueue;
  }

  //constant
  public boolean isEmpty(){
    return !(pQueue.size()>0);
  }

  //constant
  public int peekMin(){
    return pQueue.get(pQueue.size()-1);
  }

  //constant
  public int removeMin(){
    return pQueue.remove(pQueue.size()-1);
  }

  public String toString(){
    return pQueue.toString();
  }
}
