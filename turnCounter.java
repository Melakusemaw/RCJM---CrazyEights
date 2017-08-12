public class turnCounter{
  int numberofturns = discardPile.length();
  int count;
  public int turns(int numberofturns){
    for(int i = 0; i < numberofturns; i++){
      count++;
    }
    return count;
  }
}