package src;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final String[][] BOARD = new String[3][3];
    private static final Random RANDOM = new Random();
    private static final String X = "X";
    private static final String O = "O";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        fillBoard();
//        String[] a = new String[5];
//        a[0] = "привет";
//        String[] b = new String[]{"привет", "бу", "го"};
//        String[][] c = new String[][]{{"привет", "бу", "го"}, {"dsaudasd", "sdasdasda"}};

        while (true) {
            x();
        }
    }

    private static void x() {
        try {
            System.out.println("Введи число");
            int i = SCANNER.nextInt();
            System.out.println(i);
            fillBoard(i, X);
            printBoard();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный символ!");
            x();
        }
    }

    private static void fillBoard(int index, String symbol) {
        switch (index) {
            case 1:
                BOARD[0][0] = symbol;
                break;
            case 2:
                BOARD[0][1] = symbol;
                break;
            case 3:
                BOARD[0][2] = symbol;
                break;
            case 4:
                BOARD[1][0] = symbol;
                break;
            case 5:
                BOARD[1][1] = symbol;
                break;
            case 6:
                BOARD[1][2] = symbol;
                break;
            case 7:
                BOARD[2][0] = symbol;
                break;
            case 8:
                BOARD[2][1] = symbol;
                break;
            default:
                BOARD[2][2] = symbol;
        }
    }

    private static void fillBoard() {
//        boolean isPlayerMove = isPlayerMove();
//        int count = 1;
        for (int i = 0; i < BOARD.length; i++) {
            for (int j = 0; j < BOARD[i].length; j++) {
                BOARD[i][j] = "-";
//                BOARD[i][j] = String.valueOf(count++);
//                board[i][j] = isPlayerMove ? "X" : "O";
            }
        }
    }

    private static void printBoard() {
        for (int j = 0; j < BOARD.length; j++) {
            System.out.println(Arrays.toString(BOARD[j]));
        }
    }

    private static boolean isPlayerMove() {
        int i = RANDOM.nextInt(2);
        System.out.println(i + " = " + (i % 2 == 0));
        return i % 2 == 0;
    }

    final Scanner in = new Scanner(System.in);
    int inputInt;

//    do {  // Цикл до тех пор, пока мы не получим правильный ввод
//        System.out.print("Укажите целое число от 1 до 9: ");
//        try {
//            inputInt = in.nextInt(); // Блоки для пользовательского ввода
//            if (inputInt >= 1 && inputInt <= 9) {
//                break;    // Получил действительный ввод, прекрати зацикливаться
//            } else {
//                System.out.println("Вы не ввели число от 0 до 5. Пробовать снова.");
//                continue; // цикл перезапуска, неправильный номер
//            }
//        } catch (final InputMismatchException e) {
//            System.out.println("You have entered an invalid input. Try again.");
//            in.next();    // discard non-int input
//            continue;     // restart loop, didn't get an integer input
//        }
//    }while(true);
}

