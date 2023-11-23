

public class Main {
    public static void main(String[] args) {
        while (GameField.newGame()){
            GameField.initGameField();
            GameField.printGameField();
            while (GameMechanics.checkGameSituation() == 2){
                GameField.humanMove();
                GameField.printGameField();
                GameField.aiMove();
                GameField.printGameField();
            }
            if(GameMechanics.checkGameSituation() == -1) System.out.println("GAME OVER: Ничья");
            if(GameMechanics.checkGameSituation() == 0) System.out.println("GAME OVER: Победил человек");
            if(GameMechanics.checkGameSituation() == 1) System.out.println("GAME OVER: Победил компьютер");
        }
    }
}
