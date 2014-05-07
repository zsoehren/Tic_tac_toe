
import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.*;
import java.io.*;
import java.util.*;


///////////////////////////// Mutlithreaded Server /////////////////////////////

/**
   This class handles the client input for one server socket connection. 
*/
public class Sql_talk extends Thread{
	int valid;
	
	int port = 5433;
	String server_name = "data.cs.purdue.edu";
	
	String command;
	String name;
	String pass;
	
    Socket server;
    PrintWriter out;
    BufferedReader in;
    
    public int Sql_talk(int comm, String nam, String pas){
    	if(comm = 1){
    		command = "GET-USER-INFO";
    	}else{
    		command = "NOT-IMPORTANT";
    	}
    	valid = -1;
    	name = name;
    	pass = pas;
    	new Sql_talk(1,name,pas).start;
    	while(valid == -1)
    	{
    		try{
    			this.wait(10);
    		}catch(Exception e){
    		}
    	}
    	return valid;
    }
    
    public void run(){
    	 try{
    		 server = new Socket(host, port);
    		 out = new PrintWriter(server.getOutputStream(), true);
    		 in = new BufferedReader(new InputStreamReader(server.getInputStream()));
    	 }catch(IOException e){
    	     System.out.println("Error!");
    	     valid = 0;
    	     return;
    	 }
    	 try{
    		 out.println(command);
    		 out.println(name);
    		 out.println(pass);
    		 in.readLine();
    	 }catch(Exception e){
    		 valid = 0;
    		 return;
    	 }
    }
}
