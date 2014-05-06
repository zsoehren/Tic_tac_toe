package com.example.tictactoe;

import java.awt.*;
import java.util.*;
/**
 * Implements the storage and checks necessary for a 3-d tic tac toe game.
 * 
 * Zachary Soehren
 * 
 * zsoehren@purdue.edu
 *  
 **/
public class Board_3d{
  private int size;
  private Board_2d[] board;
 
  public Board_3d(int level){
	 size = level;
    board = new Board_2d[size];
    for(int x = 0; x < size; x++){
      board[x] = new Board_2d(size);
    }
  }
  
  public int piece_at(int x, int y, int z){
    return board[z].piece_at(x,y);
  }
  
  public int add_piece(int x, int y, int z, int player){
    int has_won = 0;
    has_won = board[z].add_piece(x,y,player);
    has_won += verticle_check(x, y);
    has_won += diagonal_check(x,y,player);
    return has_won;
  }
  
  private int verticle_check(int x, int y){
    int complete = 1;
    int piece = board[0].piece_at(x,y);
    for(int n = 0; n < size; n++){
      if(piece!=board[n].piece_at(x,y)){
        complete = 0;
      }
    }
    return complete;
  }
  
  private int diagonal_check(int x, int y, int player){
    int complete = 8;
    
    //Check the y axis height diagonals
    for(int n = 0; n < size; n++){
      if(board[n].piece_at(n,y)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(board[size-n-1].piece_at(n,y)!=player){
        complete--;
        break;
      }
    }
    
    //Check the x axis height diagonals
    for(int n = 0; n < size; n++){
      if(board[n].piece_at(x,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(board[size-n-1].piece_at(x,n)!=player){
        complete--;
        break;
      }
    }
    
    //Check the true height diagonals
    for(int n = 0; n < size; n++){
      if(board[n].piece_at(n,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(board[size-n-1].piece_at(n,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(board[n].piece_at(size-n-1,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(board[size-n-1].piece_at(size-n-1,n)!=player){
        complete--;
        break;
      }
    }
    return complete;
  }
}
