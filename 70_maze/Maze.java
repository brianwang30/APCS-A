// Twang: Jeffery Tang, Brian Wang, Raven (Ruiwen) Tang
// APCS pd06
// HW70 -- Thinkers of the Corn / maze solving (blind, depth-first)
// 2022-03-03
// time spent: 00.5 hrs

/***
* SKEELTON for
* class MazeSolver
* Implements a blind depth-first exit-finding algorithm.
* Displays probing in terminal.
*
* USAGE:
* $ java Maze [path/to/mazefile]
* (mazefile is ASCII representation of a maze, using symbols below)
*
* ALGORITHM for finding exit from starting position:
*
* 1) Check if your current position is an exit, a valid path, or another feature.
* 2a) If it is an exit, mark it as hero, and you’re done. End the program.
* 2b) If it is a valid path, mark it as hero. Starting from the top neighbor and progressing in the clockwise direction, repeat this algorithm from step 1.
* 2c) If the current position is another feature, it  does not lead to a solution. End this possibility.
* 3) If you’ve reached this step, meaning none of the attempts in 2b resulted in a valid path, mark the current position as visited.
*
* DISCO
* Multiple classes can be in one file. Here, we have MazeSolver and Maze in the same file, and the file is named Maze.java. This organization makes sense because we would like to compile and execute Maze, as it is the class which contains the main method of interest.
* The algorithm for solving the maze is very similar to a knight tour, in that we call the solve method for all the neighbors without first checking if those neighbors are valid paths. This property will be checked within the next method.
* We don’t have to explicitly check if positions are WALL or VISITED_PATH. These both fall into the “other” category in that we simply recognize that the attempted path is a failed possibility if we run into either of these.
* QCC
* What if we put the random start into the solver, so as to bypass needing an accessor to acces h and w of the maze?
* Is there another way to do this without the need of accessors for the random start?
* Should we put a "default maze" like the default 8x8 board in the knight's tour? 
***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 100;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
        w = line.length();

        for( int i=0; i<line.length(); i++ )
        _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
      _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
  * "stringify" the board
  **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
      retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
  * helper method to keep try/catch clutter out of main flow
  * @param n      delay in ms
  **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
  * void solve(int x,int y) -- recursively finds maze exit (depth-first)
  * @param x starting x-coord, measured from left
  * @param y starting y-coord, measured from top
  **/
  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if ( _maze[x][y] == EXIT ) {
      _maze[x][y] = HERO;
      System.out.println( this );
      _solved = true;

      System.exit(0);

    }
    //other base cases
    else if ( _maze[x][y] == PATH) {
      _maze[x][y] = HERO;
      solve(x, y-1);
      solve(x+1, y);
      solve(x, y+1);
      solve(x-1, y);
      if(_maze[x][y] == HERO){
        _maze[x][y] = VISITED_PATH;
      }

    }

  //otherwise, recursively solve maze from next pos over,
  //after marking current location
  else {

    System.out.println( this ); //refresh screen
    return;
  }
}

//accessor method to help with randomized drop-in location
public boolean onPath( int x, int y) {
  if(x > w){
    return false;
  }
  if(y > h){
    return false;
  }
  return (_maze[x][y] == PATH || _maze[x][y] == EXIT);
}

public int retw(){
  return w;
}
public int reth(){
  return h;
}

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos

    //ms.solve( 1, 1 );

    //drop our hero into maze at random location on path
    // YOUR RANDOM-POSITION-GENERATOR CODE HERE
    int startX = (int)(Math.random()*ms.retw());
    int startY = (int)(Math.random()*ms.reth());
    while(ms.onPath(startX, startY) == false){
      startX = (int)(Math.random()*ms.retw());
      startY = (int)(Math.random()*ms.reth());
    }
    ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
