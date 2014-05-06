package com.example.tictactoe;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.net.*;
/**
 * Tic-Tac-Toe
 * 
 * GAME ON 2
 * 
 * Game On2 how delagates
 * what needs to be done, Game On
 * previously just did everything in one big blob
 * ,but we basically want to make everything cleaner
 * so we are reorganizing it.
 * 
 * Game on will have functions that will be called
 * that will specifically manage each element of the game.
 */

public class Game_On extends Thread{
  
  static String host;
  static Socket server;
  static PrintWriter out;
  static BufferedReader in;
  static Board_4d board;
  
  static int port;
  static int gameMode;
  static int gameSize;
  static int lock;
  static int game_over;
  
  static int positionX;
  static int positionY;
  static int positionZ;
  static int positionH;
  
  static Get_Turn their_move;
  static Pass_Turn my_move;
  
  static int player;
  
  static int winner = 0;
  
  static boolean isWinner = false;
  
  public int connect(String hostName, int portNum){
    //this connects to the server
    
    //Scanner stdin = new Scanner(System.in);
    
      host = hostName;
      port = portNum;
      lock = 1;
      this.start();
      while(lock == 1){
    	  try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      } 
      
      my_move = new Pass_Turn(out, in);
      their_move = new Get_Turn(server, out, in);
      
      /*try{
        server = new Socket(hostName, portNum);
        out = new PrintWriter(server.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(server.getInputStream()));
      }catch(IOException e){
        System.out.println("Error!");
        return -1;
      }*/

    return player;
  }
  
  public void run(){ 
	  try{	
		  server = new Socket(host, port);
		  out = new PrintWriter(server.getOutputStream(), true);
		  in = new BufferedReader(new InputStreamReader(server.getInputStream()));
	  }catch(IOException e){
		  System.out.println("Error!");
	  }
      try{
          String response;
          response = in.readLine();
          if(Integer.parseInt(response)==1){
            player = 1;
            in.readLine();
          }else{
            player = 2;
          }
        }catch(IOException e){
          System.out.println("Error!");
        }
	  lock = 0;
	  /*while(true){
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }*/
  }
  	
  
  public void sendGameMode(int mode, int size){
    //this is meant to get information about the game mode from 
    //player 1 and send that info to player 2
    Game_Setup set = new Game_Setup(out, in, mode, size, player); 
    System.out.println("IN SEND");
    System.out.println(mode);
    set.start();
    if(player == 2){
    	mode = set.mode;
    	size = set.size;
    	
    }
	  
	board = new Board_4d(size);
    return; 
  }
  
  public void movePiece(int x, int y, int z, int h, int size, int turn){
    positionX = 0;
      positionY = 0;
      positionZ = 0;
      positionH = 0;
      game_over = 0;
      if(player == turn){
    	  Pass_Turn my_next = new Pass_Turn(out, in);
    	  my_next.Pos_x = x;
    	  my_next.Pos_y = y;
    	  my_next.finished = 0;
    	  
    	  my_next.start();
        //if you are the player making the move
        
          //my_move.Pos_x = x;
          //my_move.Pos_y = y;
          //my_move.finished = 0;
          	//System.out.println("before send");
          	//try{
          		//	my_move.start();
          	//}catch(Exception e){
          		//e.printStackTrace();
          	//}
          	System.out.println("after send");
          while(my_next.finished == 0){
        	  try {
				this.wait(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
          positionX = x;
          positionY = y;
          positionZ = z;
          positionH = h;
          game_over = board.add_piece(x,y,z,h,turn);
      }else{
    	  Get_Turn their_next = new Get_Turn(server, out, in);
    	  //System.out.print(player);
    	  //System.out.print(" ");
    	  //System.out.println(turn);
    	  
        //if you are the player recieving the positions
        //(the player who did not make the move)
    	  their_next.finished = 0;
    	  //System.out.println("We represent the lollypop gang, mutha F****er");
    	  //System.out.println(in);
    	  try{
    		  their_next.start();
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
    	  //System.out.println("When titans fall");
    	  while(their_next.finished == 0){
    		  //System.out.println("we should have arrived on impact");
    		  try {
    			  //System.out.println("Just keep swimming....");
				this.wait(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//System.out.println("We need to sleeeeeeepses");
				//e.printStackTrace();
			}
    	  }
    	  System.out.println("Say what again");
    	  positionX = their_next.Pos_x;
    	  positionY = their_next.Pos_y;
    	  System.out.println("i said what agian");
    	  try{
    		  game_over = board.add_piece(positionX,positionY,positionZ,positionH,turn);
    	  }catch(Exception e){
    		  e.printStackTrace();
    	  }
          System.out.println("what are you going to do about it");
        if(game_over>0){
        	out.println("Bye."); 
        }
      }
  }
  
  /*public void hasWon(int player,boolean win){
    //this is used if one of the players has won
    //the player who called it is the winner
    //the boolean is if the "player" is the winner
        if(win == true){
          //the player that inputed true is the winner
          //that side of the client will return true to them
          isWinner = true;
          winner = player;
         }
  }*/
  
}
