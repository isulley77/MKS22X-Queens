public class Driver{



  public static void main(String args[]){


    QueenBoard board = new QueenBoard(8);

    board.addQueen(0, 0);
    board.removeQueen(0,0);
    board.addQueen(0, 8);
    board.removeQueen(0, 8);
    board.addQueen(3, 4);

  }

}
