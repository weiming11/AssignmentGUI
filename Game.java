import java.awt.print.PrinterJob;
import java.io.*;
import java.util.*;

public class Game {
  Novice player;
  public Game(){
    player = new Novice(); 
  }

  public static void main(String args[])
  {
       new ImageViewer();
  }
  public void changejob(int todo1, Novice player){
    if ( todo1 == 1){
         this.player = new Archer(player);
        }
    else if ( todo1 == 2){
        this.player = new Saint(player);
        } 
      }
}