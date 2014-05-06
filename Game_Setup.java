import java.util.*;
import java.io.*;
import java.awt.*;
import java.net.*;

public Get_Turn extends Thread{
	int mode;
	int size;
	int player;
	int finished;
	
	PrintWriter out;
	BufferedReader in;
	
	
	public void Get_Turn(PrintWriter going, BufferedReader reciever,int mode, int size, int play){
		out = going;
		in = reciever;
		player = play;
	}
	
	public void run(){
		if(player == 1){
			
			
		}else{
			mode = Integer.ParseInt(in.readLine());
			size = Integer.ParseInt(in.readLine());
		}
		finished = 1;
	}
	
}