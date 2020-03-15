import java.io.*;
import java.util.*;

public class GameFactory {
  public Game2 createGame(String typeOfGame) throws Exception {

    if (typeOfGame.equals("c")){
      return new CardGame();
    }
    else if (typeOfGame.equals("d")){
      return new DieGame();
    }

   System.out.println("Input not understood");
   return null;
	}
}
