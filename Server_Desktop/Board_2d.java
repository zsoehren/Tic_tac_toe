package com.example.tictactoe;
import java.awt.*;
import java.util.*;
/**
 * Implements the storage and checks necessary for a 2-d tic tac toe game.
 * 
 * Zachary Soehren
 * 
 * zsoehren@purdue.edu
 *  
 **/
public class Board_2d{
  private int size;
  private int grid[][];
 
  public Board_2d(int level){
    size = level;
    grid = new int[size][size];
    for(int x = 0; x < size; x++){
      for(int y = 0; y < size; y++){
        grid[x][y]=0;
      }
    }
  }
  
  public int piece_at(int x, int y){
    return grid[x][y];
  }
  
  public int add_piece(int x, int y, int player){
    int has_won = 0;
    grid[x][y] = player;
    has_won = horizontal_check(y);
    has_won += verticle_check(x);
    has_won += diagonal_check();
    if(has_won>0){
      return has_won;
    }
    return has_won;
  }
  
  private int horizontal_check(int y){
    int complete = 1;
    for(int n = 0; n < size; n++){
      if(grid[n][y]!=grid[0][y]){
        complete = 0;
      }
    }
    return complete;
  }
  
  private int verticle_check(int x){
    int complete = 1;
    for(int n = 0; n < size; n++){
      if(grid[x][n]!=grid[x][0]){
        complete = 0;
      }
    }
    return complete;
  }
  
  private int diagonal_check(){
    int complete = 2;
    for(int n = 0; n < size; n++){
      if(grid[n][n]!=grid[0][0]||grid[n][n]==0){
        complete=1;
      }
    }
    for(int n = 0; n < size; n++){
      if(grid[size-n-1][n]!=grid[size-1][0]||grid[size-n-1][n]==0){
        complete--;
        return complete;
      }
    }
    return complete;
  }
  
  public void print_Board(){
    System.out.println("Current Board:");
    System.out.println("");
    for(int n = 0; n < size-1; n++){
      for(int x = 0; x < size-1 ; x++){
        System.out.print(piece_at(x,n)+"|");
      }
      System.out.println(piece_at(size-1,n));
      System.out.println("-----------------");
    }
    for(int x = 0; x < size-1 ; x++){
      System.out.print(piece_at(x,size-1)+"|");
    }
    System.out.println(piece_at(size-1,size-1));
    System.out.println("");
  }
}
