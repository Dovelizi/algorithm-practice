package com.lizi.year2021.day1209;

/**
 * @author lizi
 * @description TODO
 * @date 2021/12/9 09:42
 **/
public class OneTopic {
    public static void main(String[] args) {
        validTicTacToe(new String[]{"XOX","XOO","OXX"});
    }
    public static boolean validTicTacToe(String[] board) {
        int numO = 0;
        int numX = 0;
        char middleChar = board[1].charAt(1);
        for(int i = 0; i < 3; i++){
            String str = board[i];
            for(int j = 0; j < 3; j++){
                if(str.charAt(j) == 'X'){
                    numX++ ;
                }
                if(str.charAt(j) == 'O'){
                    numO++ ;
                }
            }
        }
        if(numO > numX || (numX == 0 && numO != 0) || (numX - numO) > 1){
            return false;
        }
        if(numX == 5){
            if(middleChar == 'X'){
                if(!(middleChar == board[0].charAt(0) && middleChar == board[2].charAt(2)) &&
                        !(middleChar == board[0].charAt(2) && middleChar == board[2].charAt(0)) ){
                    return false;
                }
            }
            if(middleChar == 'O'){
                if( (board[0].charAt(0) != board[0].charAt(1) || board[0].charAt(0) != board[0].charAt(2)) &&
                        (board[2].charAt(0) != board[2].charAt(1) || board[2].charAt(0) != board[2].charAt(2)) &&
                        (board[0].charAt(0) != board[1].charAt(0) || board[0].charAt(0) != board[2].charAt(0)) &&
                        (board[0].charAt(2) != board[1].charAt(2) || board[0].charAt(2) != board[2].charAt(2))
                ){
                    return false;

                }
            }
        }
        if(middleChar == ' '){
            if((board[0].charAt(0) != board[2].charAt(2) && board[0].charAt(2) != board[2].charAt(0)) )
            {
                int time = 0;
                for (int i = 0; i < board.length; i++) {
                    if( (board[i].charAt(0) ^ board[i].charAt(1) ^ board[i].charAt(2)) != 32 && (board[i].charAt(0) ^ board[i].charAt(1) ^ board[i].charAt(2)) != 88 && (board[i].charAt(0) ^ board[i].charAt(1) ^ board[i].charAt(2)) != 79 &&
                            ( (board[0].charAt(i) ^ board[1].charAt(i) ^ board[2].charAt(i)) != 32 ) && ( (board[0].charAt(i) ^ board[1].charAt(i) ^ board[2].charAt(i)) != 88 ) &&( (board[0].charAt(i) ^ board[1].charAt(i) ^ board[2].charAt(i)) != 79 ) ){
                        time++ ;
                    }
                    if(time == 3){
                        return false;
                    }
                }
            }
        }

        if(numO == numX){
            for (int i = 0; i < board.length; i++) {
                if (board[i].equals("XXX")) {
                    return false;
                }
                if ((board[0].charAt(i) == board[1].charAt(i) && board[0].charAt(i) == board[2].charAt(i) && board[0].charAt(i) == 'X')) {
                    return false;
                }
            }
        }
        return true;
    }
}
