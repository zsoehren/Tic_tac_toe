import java.util.*;
import java.io.*;
import java.awt.*;
import java.net.*;

public Get_Turn extends Thread{
	int Pos_x;
	int Pos_y;
	int Pos_z;
	int Pos_h;
	int finished;
	
	PrintWriter out;
	BufferedReader in;
	
	
	public void Get_Turn(PrintWriter going, BufferedReader reciever){
		out = going;
		in = reciever;
	}
	
	public void run(){
		Pos_x = Integer.ParseInt(in.readLine());
		Pos_y = Integer.ParseInt(in.readLine());
		Pos_z = Integer.ParseInt(in.readLine());
		Pos_h = Integer.ParseInt(in.readLine());
		finished = 1;
	}
	
}