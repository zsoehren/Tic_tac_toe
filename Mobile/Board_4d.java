package com.example.tictactoe;

import java.awt.*;
import java.util.*;
/**
 * Implements the storage and checks necessary for a 4-d tic tac toe game.
 * 
 * Zachary Soehren
 * 
 * zsoehren@purdue.edu
 *  
 **/
public class Board_4d{
  private int size;
  private Board_3d board[];
 
  public Board_4d(int level){
    size = level;
    board = new Board_3d[size];
    for(int x = 0; x < size; x++){
      board[x] = new Board_3d(size);
    }
  }
  
  public int piece_at(int x, int y, int z, int t){
    return board[t].piece_at(x,y,z);
  }
  
  public int add_piece(int x, int y, int z, int t, int player){
    int has_won = 0;
    has_won = board[t].add_piece(x,y,z,player);
    has_won += same_spot(x,y,z,player);
    has_won += time_shift_2d(x,y,z,player);
    has_won += time_shift_diagonals(x, y, z, player);
    has_won += pure_diagonals(player);
    return has_won;
  }
  
  private int same_spot(int x, int y, int z, int player){
    for(int n = 0; n < size; n++){
      if(board[n].piece_at(x,y,z)!=player){
        return 0;
      }
    }
    return 1;
  }
  
  private int time_shift_2d(int x, int y, int z, int player){
    int complete = 6;
    //timeshifted along the x axis
    for(int n = 0; n < size; n++){
      if(piece_at(n, y, z, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1, y, z, n)!=player){
        complete--;
        break;
      }
    }
    //timeshifted along the y axis
        for(int n = 0; n < size; n++){
      if(piece_at(x, n, z, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(x,size-n-1, z, n)!=player){
        complete--;
        break;
      }
    }
    //timeshifted along the z axis
    for(int n = 0; n < size; n++){
      if(piece_at(x, y, n, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(x, y, size-n-1, n)!=player){
        complete--;
        break;
      }
    }
    return complete;
  }
  
  
  //The 3-d diagonals
  private int time_shift_diagonals(int x, int y, int z, int player){
    int complete = 12;
    
//The x/y axis
    for(int n = 0; n < size; n++){
      if(piece_at(n, n, z, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1, n, z, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n, n, z, size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1, n, z, size-n-1)!=player){
        complete--;
        break;
      }
    }
//The x/z axis
    for(int n = 0; n < size; n++){
      if(piece_at(n, y, n, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1, y, n, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n, y, n, size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1, y, n, size-n-1)!=player){
        complete--;
        break;
      }
    }
//The y/z axis
    for(int n = 0; n < size; n++){
      if(piece_at(x, n, n, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(x, size-n-1, n, n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(x, n, n, size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(x, size-n-1, n, size-n-1)!=player){
        complete--;
        break;
      }
    }
    return complete;
  }
    
  
  private int pure_diagonals(int player){
    int complete = 16;
    //Traversing forwards in t!
    for(int n = 0; n < size; n++){
      if(piece_at(n,n,n,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,n,n,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n,size-n-1,n,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n,n,size-n-1,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,size-n-1,n,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,n,size-n-1,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n,size-n-1,size-n-1,n)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,size-n-1,size-n-1,n)!=player){
        complete--;
        break;
      }
    }
    //Traversing backwards in t
    for(int n = 0; n < size; n++){
      if(piece_at(n,n,n,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,n,n,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n,size-n-1,n,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n,n,size-n-1,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,size-n-1,n,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,n,size-n-1,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(n,size-n-1,size-n-1,size-n-1)!=player){
        complete--;
        break;
      }
    }
    for(int n = 0; n < size; n++){
      if(piece_at(size-n-1,size-n-1,size-n-1,size-n-1)!=player){
        complete--;
        break;
      }
    }
    return complete;
  }
}