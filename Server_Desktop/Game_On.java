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
  
  int positionX;
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
      their_move = new Get_Turn(out, in);
      
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
    set.run();
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
     int game_over = 0;
     if(player == turn){
     //if you are the player making the move
          my_move.Pos_x = x;
          my_move.Pos_y = y;
          my_move.Pos_x = z;
          my_move.Pos_x = h;
          my_move.finished = 0;
          my_move.run();
          while(my_move.finished == 0){
        	  try {
				this.wait(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
          positionX = my_move.Pos_x;
          positionY = my_move.Pos_y;
          positionZ = my_move.Pos_z;
          positionH = my_move.Pos_h;
          game_over = board.add_piece(x,y,z,h,turn);
      }else{
        //if you are the player recieving the positions
        //(the player who did not make the move)
    	  their_move.finished = 0;
    	  their_move.run();
    	  while(their_move.finished == 0){
    		  try {
				this.wait(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	  }
          positionX = their_move.Pos_x;
          positionY = their_move.Pos_y;
          positionZ = their_move.Pos_z;
          positionH = their_move.Pos_h;
          game_over = board.add_piece(positionX,positionY,positionZ,positionH,turn);
      }
      if(game_over>0){
       	out.println("Bye.");
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
