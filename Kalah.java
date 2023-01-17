import java.util.*;

public class Kalah {
    private int [] game_board = new int[14];
    private int player;
    private int game_winner_player = -1;

    public Kalah(){
        for (int i = 0; i < game_board.length; i++){
            if (i == 0 || i == 7 ){
                game_board[i] = 0;
            }
            else{
                game_board[i] = 4;
            }
        }
    }

    public boolean isGameOver(){
        boolean player_1_game = false;
        for (int i = 1; i< 7; i++){
            if (game_board[i] != 0){
                player_1_game = true;
            }
        }
        boolean player_2_game = false;
        for (int i = 8; i< 14; i++){
            if (game_board[i] != 0){
                player_2_game = true;
            }
        }
        if (!player_1_game || !player_2_game){
            return true;
        }
        return false;

    }

    public int getWinner(){
        for (int i = 0; i < game_board.length; i++){
            if (i > 7){
                game_board[7] += game_board[i];
            }
            else if (i > 0 && i < 7){
                game_board[0] += game_board[i];
            }
        }
        if (game_board[0] < game_board[7]){
            game_winner_player = 2;
        }
        else if (game_board[0] > game_board[7]){
            game_winner_player = 1;
        }
        return game_winner_player;
    }

    public int getNextPlayer(){ 
        if (player == 1){
            player = 2;
        }
        else{
            player = 1;
        }
        return player;
    }

    public boolean isSteal(int end_house){
        int start = 0;
        int end = 0;
        if (player == 1){
            start = 0;
            end = 7;
        }
        else{
            start = 7;
            end = 14;
        }

        if ((end_house > start && end_house < end) && (game_board[end_house] == 1)){
            return true;
        }
        return false;

    }

    public void makeMove(Scanner input){
        int house_num = input.nextInt();
        int house_index = house_num;
        if (player == 2){
            house_index = 14-house_num;
        }

        if (house_num < 1 || house_num > 6 || game_board[house_index] == 0){
            throw new IllegalArgumentException("Please enter valid house that you'd like to play (number between 1-6)\n");
        }

        int in_hand = game_board[house_index];
        game_board[house_index] = 0;
        for (int i = 0; i < in_hand; i ++ ){
            house_index--;
            if ((player == 1 && house_index == 7) || (player == 2 && house_index == 0)){
                house_index--;
            }

            if (house_index < 0){
                house_index = 13;
            }

            game_board[house_index]++;
        }

        if (isSteal(house_index)){
            System.out.println("Mancala Steal!");
            int stolen_seeds = 1 + game_board[14-house_index];
            game_board[14-house_index] = 0;
            game_board[house_index] = 0;

            if (player == 1){
                game_board[0] += stolen_seeds;
            }
            else{
                game_board[7] += stolen_seeds;
            }
        }

        if ((player == 2 && house_index == 7) || (player == 1 && house_index == 0)){
            System.out.println("Your stones landed on your endzone! You get an extra turn");
            this.getNextPlayer();
        }
        
    }

    public String toString(){
        String print_board = "Game Board \n";
        String board = "---------------------------------\n|   | " +
        game_board[1] + " | "
        + game_board[2] + " | " + game_board[3] + " | " + game_board[4] + " | " + game_board[5] 
        + " | " + game_board[6] +  " |   |" + "\n" + 
        "| " + game_board[0] + " |-----------------------| " + game_board[7] + " | " + "\n" +
        "|   | " + game_board[13] + " | " + game_board[12] + " | " + game_board[11] + " | " + game_board[10] + " | " + game_board[9] 
        + " | " + game_board[8] + " |   |" + "\n" +
        "---------------------------------" + "\n";
        String play_side = "*P1*..1...2...3...4...5...6..*P2*\n";

        if (player == 1){
            print_board += board + play_side;
        }
        else{
            print_board += play_side + board;
        }

        return print_board;
    }
}
