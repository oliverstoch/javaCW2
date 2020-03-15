import java.io.*;
import java.util.*;

public class GameFactory {
  public Game2 createGame(String typeOfGame) throws Exception {
    System.out.println("type nlbvnfr:::"+typeOfGame+"ss");
    System.out.println("888888");

    if (typeOfGame.equals("c")){
      return new CardGame();
    }
    if (typeOfGame.equals("d")){
      return new DieGame();
    }

		//else if (typeOfGame == "d") return new DieGame();
    System.out.println("Failllll in game factory.");
    return null;
	}
}
