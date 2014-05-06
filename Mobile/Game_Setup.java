package com.example.tictactoe;

import java.io.*;


public class Game_Setup extends Thread{
	int mode;
	int size;
	int player;
	int finished;
	
	PrintWriter out;
	BufferedReader in;
	
	
	public Game_Setup(PrintWriter going, BufferedReader reciever, int mo, int si, int play){
		out = going;
		in = reciever;
		player = play;
		mode = mo;
		size = si;
	}
	
	public void run(){ 
		if(player == 1){
			out.println(Integer.toString(mode));
			out.println(Integer.toString(size));
		}else{
			try {
				mode = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				size = Integer.parseInt(in.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		finished = 1;
	}
	
}