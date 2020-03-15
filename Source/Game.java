import java.io.*;
import java.util.*;

public class Game {
  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  // The random number generator used throughout
//  public static RandomInterface r = new LinearCongruentialGenerator();


  public static void main(String[] args) throws Exception {
    // Ask whether to play a card game or a die game

    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();
    GameFactory factory = new GameFactory();
    Game2 game = factory.createGame(ans);
    game.playGame();
    }


}
