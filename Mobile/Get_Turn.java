package com.example.tictactoe;
import java.util.*;
import java.io.*;
import java.awt.*;
import java.net.*;

public class Get_Turn extends Thread{
	int Pos_x;
	int Pos_y;
	int finished;
	
	static Socket serve;
	static PrintWriter out;
	static BufferedReader in;
	
	
	public Get_Turn(Socket the_server, PrintWriter going, BufferedReader reciever){
		serve = the_server;
		out = going;
		in = reciever;
		System.out.println("IN");
		System.out.println(in);
		
	}
	public void run(){
		String ur_mah_gurd;
		System.out.println("What do you do when you cannot run");
		try {
			System.out.println("Are you not entertained?");
			ur_mah_gurd = in.readLine();
				System.out.println(ur_mah_gurd);
			Pos_x = Integer.parseInt(ur_mah_gurd);
			System.out.println(Pos_x);
		} catch (Exception e) {
			System.out.println("Why do numbers hate?");
			e.printStackTrace();
		}/* catch (IOException e) {
			System.out.println("Because 7 8 9");
			e.printStackTrace();
		}*/
		try {
			System.out.println("Say What again, I triple dog dare you");
			Pos_y = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			System.out.println("How large is this error?");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("As large as Brian's Mom");
			e.printStackTrace();
		}
		finished = 1;
	}
	
}