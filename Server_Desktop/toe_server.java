import java.util.*;
import java.io.*;
import java.awt.*;
import java.net.*;

/**
 * Server Side Tic Tac Toe
 * 
 * Zachary M Soehren
 * 
 * 
 */


public class toe_server extends Thread{
  static int portNumber = 5432;
  static int lock = 0;
  static Socket clientSocket1;
  static Socket clientSocket2;
  static PrintWriter out1;
  static BufferedReader in1;
  static PrintWriter out2;
  static BufferedReader in2;
  
  public void run(){
    String passed;
    Socket client1 = clientSocket1;
    Socket client2 = clientSocket2;
    PrintWriter r_out1 = out1;
    PrintWriter r_out2 = out2;
    BufferedReader r_in1 = in1;
    BufferedReader r_in2 = in2;
    lock = 0;
    int boardSize;
    try{
      passed = r_in1.readLine();
      boardSize = Integer.parseInt(passed)+1;
      //System.out.println(boardSize);
      r_out2.println(passed);
      //System.out.println(passed);
      r_out2.println(r_in1.readLine());
    }catch(IOException e){
      System.out.println("System exit on getting game mode!");
      return;
    }
    while(true){
    	//System.out.print("1: ----->  ");
        for(int n = 0; n < boardSize; n++){
        	try{
        		passed = r_in1.readLine();
        	}catch(Exception e){
        		System.out.println("Player one has exited the game early");
        		passed = Integer.toString(-1);
        	}
        	//System.out.print(passed);
        	//System.out.print(" ");
        	if(passed==null){
        		System.out.println("Player one has exited the game early");
        		passed = Integer.toString(-1);
        	}
        	if(passed.equals("Bye.")||passed.equals("-1")){
        		try{
        			r_out2.close();
        			r_in2.close();
        			client2.close();
        		}catch(Exception e){
        		}
        		try{
        			r_out1.close();
        			r_in1.close();
        			client1.close();
        		}catch(Exception e){
        		}
        		return;
        	}
        	//System.out.print(passed);
        	//System.out.println();
        	r_out2.println(passed);
        	}
  	  	//System.out.print("2: ----->  ");
        for(int n = 0; n < boardSize; n++){
        	try{
        		passed = r_in2.readLine();
        	}catch(Exception e){
        		System.out.println("Player two has exited the game early");
        		passed = Integer.toString(-1);
        	}
        	//System.out.print(passed);
        	//System.out.print(" ");
        	if(passed==null){
        		System.out.println("Player two has exited the game early");
        		passed = Integer.toString(-1);
        	}
        	if(passed.equals("Bye.")||passed.equals("-1")){
          	  try{
        		  r_out2.close();
        		  r_in2.close();
        		  client2.close();
        	  }catch(Exception e){
        	  }
        	  try{
        		  r_out1.close();
        		  r_in1.close();
        		  client1.close();
        	  }catch(Exception e){
        	  }
                return;
        	}
        	//System.out.print(passed);
        	r_out1.println(passed);
        	//System.out.println();
        }
    }
  }
  
  public static void main(String args[]){
    try{
      ServerSocket serverSocket = new ServerSocket(portNumber);
      while(true){
        clientSocket1 = serverSocket.accept();
        System.out.println("Player one has connected");
        clientSocket2 = serverSocket.accept();
        System.out.println("Player two has connected");
        out1 = new PrintWriter(clientSocket1.getOutputStream(), true);
        in1 = new BufferedReader(new InputStreamReader(clientSocket1.getInputStream()));
        out1.println("1");
        out2 = new PrintWriter(clientSocket2.getOutputStream(), true);
        in2 = new BufferedReader(new InputStreamReader(clientSocket2.getInputStream()));
        out1.println("2");
        out2.println("2");
        lock = 1;
        new toe_server().start();
        System.out.println("Starting game");
        System.out.println();
        while(lock == 1){
          try{
            Thread.sleep(10);
          }catch(InterruptedException e){
          }
        }
        clientSocket1=null;
        clientSocket2=null;
      } 
    }catch(IOException e){
      System.out.println("Error!");
    }
  }
}