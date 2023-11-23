public class GameMechanics {

    /**
     * Проверка пред выигрышной ситуации по горизонтали вправо
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int[3]
     */
    private static int[] horRight(int h, int v){
        if(GameField.gameField[h][v] == GameField.DOT_EMPTY &&
            GameField.gameField[h + 1][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 3][v] == GameField.DOT_HUMAN) return new int[]{h, v, 1};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 3][v] == GameField.DOT_EMPTY) return new int[]{h + 3, v, 1};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v] == GameField.DOT_EMPTY) return new int[]{h + 2, v, 1};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v] == GameField.DOT_EMPTY &&
            GameField.gameField[h + 2][v] == GameField.DOT_HUMAN) return new int[]{h + 1, v, 1};

        return new int[3];
    }

    /**
     * Проверка пред выигрышной ситуации по диагонали вниз вправо
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int[3]
     */
    private static int[] diagDownRight(int h, int v){
        if(GameField.gameField[h][v] == GameField.DOT_EMPTY &&
            GameField.gameField[h + 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 3][v + 3] == GameField.DOT_HUMAN) return new int[]{h, v, 2};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 3][v + 3] == GameField.DOT_EMPTY) return new int[]{h + 3, v + 3, 2};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v + 2] == GameField.DOT_EMPTY) return new int[]{h + 2, v + 2, 2};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v + 1] == GameField.DOT_EMPTY &&
            GameField.gameField[h + 2][v + 2] == GameField.DOT_HUMAN) return new int[]{h + 1, v + 1, 2};

        return new int[3];
    }

    /**
     * Проверка пред выигрышной ситуации по вертикали вниз
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int[3]
     */
    private static int[] vertDown(int h, int v){
        if(GameField.gameField[h][v] == GameField.DOT_EMPTY &&
            GameField.gameField[h][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 3] == GameField.DOT_HUMAN) return new int[]{h, v, 3};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 3] == GameField.DOT_EMPTY) return new int[]{h, v + 3, 3};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 2] == GameField.DOT_EMPTY) return new int[]{h, v + 2, 3};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 1] == GameField.DOT_EMPTY &&
            GameField.gameField[h][v + 2] == GameField.DOT_HUMAN) return new int[]{h, v + 1, 3};

        return new int[3];
    }

    /**
     * Проверка пред выигрышной ситуации по диагонали вниз влево
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int[3]
     */
    private static int[] diagDownLeft(int h, int v){
        if(GameField.gameField[h][v] == GameField.DOT_EMPTY &&
            GameField.gameField[h - 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 2][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 3][v + 3] == GameField.DOT_HUMAN) return new int[]{h, v, 4};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 2][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 3][v + 3] == GameField.DOT_EMPTY) return new int[]{h - 3, v + 3, 4};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 2][v + 2] == GameField.DOT_EMPTY) return new int[]{h - 2, v + 2, 4};
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 1][v + 1] == GameField.DOT_EMPTY &&
            GameField.gameField[h - 2][v + 2] == GameField.DOT_HUMAN) return new int[]{h - 1, v + 1, 4};

        return new int[3];
    }

    /**
     * Проверка пред выигрышной ситуации по всему полю
     * @return int[3]
     */
    public static int[] preWin(){
        for(int h = 0; h <= GameField.hFieldSize - GameField.winCount; h++){
            for (int v = GameField.vFieldSize - GameField.winCount + 1; v < GameField.vFieldSize; v++){
                if(horRight(h, v)[2] != 0) return horRight(h, v);
            }
        }
        for(int h = GameField.hFieldSize - GameField.winCount + 1; h < GameField.hFieldSize; h++){
            for(int v = 0; v <= GameField.vFieldSize - GameField.winCount; v++){
                if(diagDownLeft(h, v)[2] != 0) return diagDownLeft(h, v);
                if(vertDown(h, v)[2] != 0) return vertDown(h, v);
            }
        }
        for(int h = 0; h < GameField.winCount - 1; h++){
            for(int v = 0; v <= GameField.vFieldSize - GameField.winCount; v++){
                if(horRight(h, v)[2] != 0) return horRight(h, v);
                if(diagDownRight(h, v)[2] != 0) return diagDownRight(h, v);
                if(vertDown(h, v)[2] != 0) return vertDown(h, v);
            }
        }
        for(int h = GameField.winCount - 1; h <= GameField.hFieldSize - GameField.winCount; h++){
            for(int v = 0; v <= GameField.vFieldSize - GameField.winCount; v++){
                if(horRight(h, v)[2] != 0) return horRight(h, v);
                if(diagDownRight(h, v)[2] != 0) return diagDownRight(h, v);
                if(vertDown(h, v)[2] != 0) return vertDown(h, v);
                if(diagDownLeft(h, v)[2] != 0) return diagDownLeft(h, v);
            }
        }
        return new int[3];
    }

    /**
     * Проверка выигрышной ситуации по горизонтали вправо
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int
     */
    private static int winHorRight(int h, int v){
        if(GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 3][v] == GameField.DOT_HUMAN) return 0;
        if(GameField.gameField[h][v] == GameField.DOT_AI &&
            GameField.gameField[h + 1][v] == GameField.DOT_AI &&
            GameField.gameField[h + 2][v] == GameField.DOT_AI &&
            GameField.gameField[h + 3][v] == GameField.DOT_AI) return 1;
        return -1;
    }

    /**
     * Проверка выигрышной ситуации по диагонали вниз вправо
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int
     */
    private static int winDiagDownRight(int h, int v) {
        if (GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 2][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h + 3][v + 3] == GameField.DOT_HUMAN) return 0;
        if (GameField.gameField[h][v] == GameField.DOT_AI &&
            GameField.gameField[h + 1][v + 1] == GameField.DOT_AI &&
            GameField.gameField[h + 2][v + 2] == GameField.DOT_AI &&
            GameField.gameField[h + 3][v + 3] == GameField.DOT_AI) return 1;
        return -1;
    }

    /**
     * Проверка выигрышной ситуации по вертикали вниз
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int
     */
    private static int winVertDown(int h, int v) {
        if (GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h][v + 3] == GameField.DOT_HUMAN) return 0;
        if (GameField.gameField[h][v] == GameField.DOT_AI &&
            GameField.gameField[h][v + 1] == GameField.DOT_AI &&
            GameField.gameField[h][v + 2] == GameField.DOT_AI &&
            GameField.gameField[h][v + 3] == GameField.DOT_AI) return 1;
        return -1;
    }

    /**
     * Проверка выигрышной ситуации по диагонали вниз влево
     * @param h координата по горизонтали
     * @param v координата по вертикали
     * @return int
     */
    private static int winDiagDownLeft(int h, int v) {
        if (GameField.gameField[h][v] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 1][v + 1] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 2][v + 2] == GameField.DOT_HUMAN &&
            GameField.gameField[h - 3][v + 3] == GameField.DOT_HUMAN) return 0;
        if (GameField.gameField[h][v] == GameField.DOT_AI &&
            GameField.gameField[h - 1][v + 1] == GameField.DOT_AI &&
            GameField.gameField[h - 2][v + 2] == GameField.DOT_AI &&
            GameField.gameField[h - 3][v + 3] == GameField.DOT_AI) return 1;
        return -1;
    }

    /**
     * Проверка выигрышной ситуации по всему полю
     * @return int
     */
    private static int checkWin(){
        for(int h = 0; h <= GameField.hFieldSize - GameField.winCount; h++){
            for (int v = GameField.vFieldSize - GameField.winCount + 1; v < GameField.vFieldSize; v++){
                if(winHorRight(h, v) != -1) return winHorRight(h, v);
            }
        }
        for(int h = GameField.hFieldSize - GameField.winCount + 1; h < GameField.hFieldSize; h++){
            for(int v = 0; v <= GameField.vFieldSize - GameField.winCount; v++){
                if(winDiagDownLeft(h, v) != -1) return winDiagDownLeft(h, v);
                if(winVertDown(h, v) != -1) return winVertDown(h, v);
            }
        }
        for(int h = 0; h < GameField.winCount - 1; h++){
            for(int v = 0; v <= GameField.vFieldSize - GameField.winCount; v++){
                if(winHorRight(h, v) != -1) return winHorRight(h, v);
                if(winDiagDownRight(h, v) != -1) return winDiagDownRight(h, v);
                if(winVertDown(h, v) != -1) return winVertDown(h, v);
            }
        }
        for(int h = GameField.winCount - 1; h <= GameField.hFieldSize - GameField.winCount; h++){
            for(int v = 0; v <= GameField.vFieldSize - GameField.winCount; v++){
                if(winHorRight(h, v) != -1) return winHorRight(h, v);
                if(winDiagDownRight(h, v) != -1) return winDiagDownRight(h, v);
                if(winVertDown(h, v) != -1) return winVertDown(h, v);
                if(winDiagDownLeft(h, v) != -1) return winDiagDownLeft(h, v);
            }
        }
        return -1;
    }

    /**
     * Проверка игровой ситуации
     * @return int
     */
    public static int checkGameSituation(){
        if(checkWin() == 0) return 0;
        if(checkWin() == 1) return 1;
        if(checkWin() == -1){
            for(int h = 0; h < GameField.hFieldSize; h++){
                for(int v = 0; v < GameField.vFieldSize; v++){
                    if(!GameField.isCellEmpty(h, v)) return -1;
                    else return 2;
                }
            }
        }
        return 2;
    }
}
