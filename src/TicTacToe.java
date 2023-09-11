import java.util.Scanner;


public class TicTacToe {

    public static void grid(String[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + table[i][j] + " |");
            }
            if (i != 2) System.out.println("\n----|----|-----");
        }
    }

    public static String computer(String[][] table) {
        int x = (int) (Math.random() * 9 + 1);
        switch (x) {
            case 1: {
                if (table[0][0].equals(" ")) {
                    return table[0][0] = "o";
                } else {
                    return computer(table);
                }
            }
            case 2: {
                if (table[0][1].equals(" ")) {
                    return table[0][1] = "o";
                } else {
                    return computer(table);
                }
            }
            case 3: {
                if (table[0][2].equals(" ")) {
                    return table[0][2] = "o";
                } else {
                    return computer(table);
                }
            }
            case 4: {
                if (table[1][0].equals(" ")) {
                    return table[1][0] = "o";
                } else {
                    return player(table);
                }
            }
            case 5: {
                if (table[1][1].equals(" ")) {
                    return table[1][1] = "o";
                } else {
                    return computer(table);
                }
            }
            case 6: {
                if (table[1][2].equals(" ")) {
                    return table[1][2] = "o";
                } else {
                    return computer(table);
                }
            }
            case 7: {
                if (table[2][0].equals(" ")) {
                    return table[2][0] = "o";
                } else {
                    return computer(table);
                }
            }
            case 8: {
                if (table[2][1].equals(" ")) {
                    return table[2][1] = "x";
                } else {
                    return computer(table);
                }
            }
            case 9: {
                if (table[2][2].equals(" ")) {
                    return table[2][2] = "x";
                } else {
                    return computer(table);
                }
            }
            default:
                return null;
        }
    }

    public static String player(String[][] table) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a valid empty place for your move: ");
        String place = sc.next();
        switch (place) {
            case "a": {
                if (table[0][0].equals(" ")) {
                    return table[0][0] = "x";
                } else {
                    return player(table);
                }
            }
            case "b": {
                if (table[0][1].equals(" ")) {
                    return table[0][1] = "x";
                } else {
                    return player(table);
                }
            }
            case "c": {
                if (table[0][2].equals(" ")) {
                    return table[0][2] = "x";
                } else {
                    return player(table);
                }
            }
            case "d": {
                if (table[1][0].equals(" ")) {
                    return table[1][0] = "x";
                } else {
                    return player(table);
                }
            }
            case "e": {
                if (table[1][1].equals(" ")) {
                    return table[1][1] = "x";
                } else {
                    return player(table);
                }
            }
            case "f": {
                if (table[1][2].equals(" ")) {
                    return table[1][2] = "x";
                } else {
                    return player(table);
                }
            }
            case "g": {
                if (table[2][0].equals(" ")) {
                    return table[2][0] = "x";
                } else {
                    return player(table);
                }
            }
            case "h": {
                if (table[2][1].equals(" ")) {
                    return table[2][1] = "x";
                } else {
                    return player(table);
                }
            }
            case "i": {
                if (table[2][2].equals(" ")) {
                    return table[2][2] = "x";
                } else {
                    return player(table);
                }
            }
            default:
                return player(table);
        }
    }

    public static void game(String[][] table) {
        boolean result = false;
        for (int j = 0; j < 4; j++) {
            player(table);
            grid(table);
            if (table[0][0].equals("x") && table[0][1].equals("x") && table[0][2].equals("x")) {
                System.out.println("You Won");
                result = true;
                break;
            }
            if (table[1][0].equals("x") && table[1][1].equals("x") && table[1][2].equals("x")) {
                System.out.println("You Won");
                result = true;


                break;
            }
            if (table[2][0].equals("x") && table[2][1].equals("x") && table[2][2].equals("x")) {
                System.out.println("You Won");
                result = true;

                break;
            }
            if (table[0][0].equals("x") && table[1][0].equals("x") && table[2][0].equals("x")) {
                System.out.println("You Won");
                result = true;

                break;
            }
            if (table[0][1].equals("x") && table[1][1].equals("x") && table[2][1].equals("x")) {
                System.out.println("You Won");
                result = true;

                break;
            }
            if (table[0][2].equals("x") && table[1][2].equals("x") && table[2][2].equals("x")) {
                System.out.println("You Won");
                result = true;

                break;
            }
            if (table[0][0].equals("x") && table[1][1].equals("x") && table[2][2].equals("x")) {
                System.out.println("You Won");
                result = true;

                break;
            }
            if (table[0][2].equals("x") && table[1][1].equals("x") && table[2][0].equals("x")) {
                System.out.println("You Won");
                result = true;
                break;
            }

            System.out.println("Computer's Turn");
            computer(table);
            grid(table);
            if (table[0][0].equals("o") && table[0][1].equals("o") && table[0][2].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[1][0].equals("o") && table[1][1].equals("o") && table[1][2].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[2][0].equals("o") && table[2][1].equals("o") && table[2][2].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[0][0].equals("o") && table[1][0].equals("o") && table[2][0].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[0][1].equals("o") && table[1][1].equals("o") && table[2][1].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[0][2].equals("o") && table[1][2].equals("o") && table[2][2].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[0][0].equals("o") && table[1][1].equals("o") && table[2][2].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }
            if (table[0][2].equals("o") && table[1][1].equals("o") && table[2][0].equals("o")) {
                System.out.println("You Lose");
                result = true;
                break;
            }

        }
        if (result == false) {
            System.out.println("Tie");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[][] table = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i][j] = ("  ");
            }
        }

        grid(table);
    }

}
