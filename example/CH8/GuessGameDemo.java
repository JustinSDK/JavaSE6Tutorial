public class GuessGameDemo {
    public static void main(String[] args) {
        AbstractGuessGame guessGame = 
                    new TextModeGame();
        guessGame.setNumber(50);
        guessGame.start();
    }
}