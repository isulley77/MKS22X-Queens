public class QueenBoard{

  private int[][]board;


// Constructor
  public QueenBoard(int size){
    board = new int[size][size];
  }



  public boolean addQueen(int r, int c){

    //space is threatened by a queen
    if(board[r][c] != 0){
      return false;
    }

    if(board[r][c] == 0){


      board[r][c] = -1;//placeQueen

    for(int i = 1; i < board.length - c; i++){
      board[r][c + i] += 1;

      if(r - i >= 0){
        board[r - i][c + i] += 1;
      }

      if(r + i < board.length){
        board[r + i][c + i] += 1;
      }
      return true;
    }
  }
return false;

  }



  public boolean removeQueen(int r, int c){

    if(board[r][c] == -1){ //check if space is a queen

      board[r][c] = 0;// remove queen

      //remove marked spaces
      for(int i = 1; i < board.length - c; i++){
        board[r][c + i] -= 1;

        if(r - i >= 0){
          board[r - i][c + i] -= 1;
        }

        if(r + i < board.length){
          board[r + i][c + i] -= 1;
        }
        return true;
      }
    }
  
    return false;
  }

    /**
     *@return The output string formatted as follows:
     *All numbers that represent queens are replaced with 'Q'
     *all others are displayed as underscores '_'
     *There are spaces between each symbol:
     *"""_ _ Q _
     *Q _ _ _

     *_ _ _ Q

     *_ Q _ _"""
     *(pythonic string notation for clarity,
     *excludes the character up to the *)
     */
     public String toString(){
  
       String s = "";
       for(int i = 0; i < board.length; i++){
         for(int j = 0; j < board[0].length; j++){
           
           //if -1 put Q
           if(board[i][j] ==  -1){
             s += "Q";
           }
           
           if(board[i][j] != -1){
             s += "_";
           }
           
           if(j < board[j].length - 1){
             s += " ";
             
           }
           
           if(j >= board[j].length - 1){
             s += "\n";
           }
         }
       }
      return s;
     }



     /**
     *@return false when the board is not solveable and leaves the board filled with zeros;

     *        true when the board is solveable, and leaves the board in a solved state

     *@throws IllegalStateException when the board starts with any non-zero value

     */
     public boolean solve(){
       if(board[0][0] == 0){
         throw new IllegalStateException();
       }
       
       if


     }
  
      public boolean solveR(int col){
       if(col > board.length){
          return true;
       }
       for(int i = 0; i < board[0].length; i++){
           if(addQueen(r + i, c)){
               if solveR(col+1){
                   return true;
               }
               removeQueen(r + i, c);
               }
       return false;
      }


     /**
     *@return the number of solutions found, and leaves the board filled with only 0's
     *@throws IllegalStateException when the board starts with any non-zero value
     */
//     public int countSolutions(){


  //   }

}
