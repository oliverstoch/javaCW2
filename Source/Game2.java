import java.io.*;
import java.util.*;

interface Game2 {



  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  public static RandomInterface r = new LinearCongruentialGenerator();

  //public static ArrayList<String> cardList;
  //public static HashSet<String> cardsChosen=new HashSet<String>();
  //public static HashSet<Integer> numbersRolled=new HashSet<Integer>();

  public  void playGame()throws Exception;
  public  void initialiseGame() throws Exception;
  public  void mainGame()throws Exception;
  public  void declareGameWinner() throws Exception;

}
