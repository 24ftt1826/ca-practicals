import java.util.Scanner;

public class TicTacToeWithComputer {
    private static char[][] board = new char[3][3];
    private static boolean gameOver = false;
    private static char currentPlayer = 'X'; // Player is 'X', Computer is 'O'
    
    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        
        Scanner scanner = new Scanner(System.in);
        
        while (!gameOver) {
            if (currentPlayer == 'X') {
                // Player's turn
                System.out.println("Player's turn");
                System.out.print("Enter a row (0,1 or 2): ");
                int row = scanner.nextInt();
                System.out.print("Enter a column (0,1 or 2): ");
                int col = scanner.nextInt();
                
                if (isValidMove(row, col)) {
                    board[row][col] = 'X';
                    printBoard();
                    
                    if (checkWin('X')) {
                        System.out.println("Game ended, Player Win");
                        gameOver = true;
                    } else if (isBoardFull()) {
                        System.out.println("Game ended, Draw");
                        gameOver = true;
                    } else {
                        currentPlayer = 'O';
                    }
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            } else {
                // Computer's turn
                System.out.println("Computer's turn");
                makeComputerMove();
                printBoard();
                
                if (checkWin('O')) {
                    System.out.println("Game ended, CPU Win");
                    gameOver = true;
                } else if (isBoardFull()) {
                    System.out.println("Game ended, Draw");
                    gameOver = true;
                } else {
                    currentPlayer = 'X';
                }
            }
        }
        
        scanner.close();
    }
    
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
        System.out.println();
    }
    
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }
    
    private static void makeComputerMove() {
        int row, col;
        do {
            row = (int)(Math.random() * 3);
            col = (int)(Math.random() * 3);
        } while (!isValidMove(row, col));
        
        board[row][col] = 'O';
    }
    
    private static boolean checkWin(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        
        return false;
    }
    
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}