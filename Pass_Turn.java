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
		out.println(Integer.toString(Pos_x));
		out.println(Integer.toString(Pos_y));
		out.println(Integer.toString(Pos_z));
		out.println(Integer.toString(Pos_h));
		finished = 1;
	}
	
}