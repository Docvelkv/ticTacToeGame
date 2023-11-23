import java.util.Random;
import java.util.Scanner;

public class GameField {
    public static final char DOT_AI = '0';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_EMPTY = '.';
    public static char[][] gameField;
    public static final int hFieldSize = 10;
    public static final int vFieldSize = 10;
    public static final int winCount = 4;
    private static final Scanner scan = new Scanner(System.in);

    /**
     * Инициализация игрового поля
     */
    public static void initGameField(){
        gameField = new char[hFieldSize][vFieldSize];
        for(int h = 0; h < hFieldSize; h++){
            for (int v = 0; v < vFieldSize; v++){
                gameField[h][v] = DOT_EMPTY;
            }
        }
    }

    /**
     * Печать текущего состояния игрового поля
     */
    public static void printGameField(){
        System.out.print("  ");
        for(int h = 0; h < hFieldSize; h++){
            if (h < 9) System.out.print("|" + (h + 1) + "  ");
            else System.out.print("|" + (h + 1) + " ");
        }
        System.out.println("|");
        for(int v = 0; v < vFieldSize; v++){
            if (v < 9){
                System.out.print((v + 1) + " |");
            }
            else System.out.print((v + 1) + "|");
            for(int h = 0; h < hFieldSize; h++){
                System.out.print(" " + gameField[h][v] + " |");
            }
            System.out.println();
        }
    }

    /**
     * Проверка ячейки на доступность для хода
     * @param h позиция по горизонтали
     * @param v позиция по вертикали
     * @return ложь или истина
     */
    public static boolean isCellEmpty(int h, int v){
        return gameField[h][v] == DOT_EMPTY;
    }

    /**
     * Проверка правильности координат хода
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return ложь или истина
     */
    private static boolean isCellValid(int h, int v){
        return h >= 0 && h < hFieldSize && v >= 0 && v < vFieldSize;
    }

    /**
     * Ход человека
     */
    public static void humanMove(){
        int h, v;
        do{
            System.out.printf("Введите координаты хода (от 1 до %d)\nчерез пробел: ", hFieldSize);
            h = scan.nextInt() - 1;
            v = scan.nextInt() - 1;
        }
        while (!isCellValid(h, v) || !isCellEmpty(h, v));
        gameField[h][v] = DOT_HUMAN;
    }

    /**
     * Ход компьютера
     */
    public static void aiMove(){
        int h, v;
        if(GameMechanics.preWin()[2] != 0){
            gameField[GameMechanics.preWin()[0]][GameMechanics.preWin()[1]] = DOT_AI;
        }
        else {
            do{
                h = new Random().nextInt(hFieldSize);
                v = new Random().nextInt(vFieldSize);
            }
            while (gameField[h][v] != DOT_EMPTY);
            gameField[h][v] = DOT_AI;
        }
    }

    /**
     * Новая игра
     * @return ложь или истина
     */
    public static boolean newGame(){
        System.out.println("Желаете сыграть (да - y): ");
        return scan.next().equals("y");
    }
}
