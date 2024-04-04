import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    /* to be implemented in part (a) */
    int balls = 0;
    for(int i = 0; i < myList.size(); i++)
     if(myList.get(i).length() == len) 
       balls++;
    
    return balls;
  }

  
public void removeWordsOfLength(int len){
  int i = 0; 
  
  while (i < myList.size())
  {
    if(myList.get(i).length() == len)
    myList.remove(i); 
    else i++;
  }
}
  
}
