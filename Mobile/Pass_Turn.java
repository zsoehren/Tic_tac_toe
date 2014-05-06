package com.example.tictactoe;
import java.io.*;

public class Pass_Turn extends Thread{
	int Pos_x;
	int Pos_y;
	int finished;
	
	PrintWriter out;
	BufferedReader in;
	
	
	public Pass_Turn(PrintWriter going, BufferedReader reciever){
		out = going;
		in = reciever;
	}
	
	public void run(){
		System.out.println("We have entered the void, M'Lord");
		out.println(Integer.toString(Pos_x));
		out.println(Integer.toString(Pos_y));
		finished = 1;
	}
	
}