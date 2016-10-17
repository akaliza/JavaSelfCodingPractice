package designpatterns;

/**
 * Created by florakalisa on 10/17/16.
 */
public class TestFactoryMethod {

    public static void main(String[] args) {


    }
}

class CardGame{

    public static CardGame createCardGame(GameType gameType){
        if(gameType == GameType.POCKER_GAME){
            new PokerGame();
        } else if(gameType == GameType.BLACK_JACK_GAME){
            new BlackJackGame();

        }
    return  null;
    }




}

class PokerGame {

}


class BlackJackGame {
}

enum GameType {
    POCKER_GAME, BLACK_JACK_GAME;
}
