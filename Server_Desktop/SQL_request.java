
import java.io.*;
import java.net.*;
import java.util.*;
import java.sql.*;
import java.io.*;
import java.util.*;


///////////////////////////// Server /////////////////////////////

/**
   This class handles the client input for one server socket connection. 
*/

class SQL_request implements Runnable
{ 
	int valid = 0;
	int portnumber = 5433;
	Socket client;
	PrintWriter out;
	BufferedReader in;
	
	String command;
	String name;
	String pass;

   public static Connection getConnection() throws SQLException, IOException
   {
      Properties props = new Properties();
      FileInputStream in = new FileInputStream("database.properties");
      props.load(in);
      in.close();
      try{
    	  Class.forName("com.mysql.Driver");
      }catch(Exception e){
      }
      String drivers = props.getProperty("jdbc.drivers");
      if (drivers != null)
        System.setProperty("jdbc.drivers", drivers);
      String url = props.getProperty("jdbc.url");
      String username = props.getProperty("jdbc.username");
      String password = props.getProperty("jdbc.password");
      //System.out.println("url="+url+" user="+username+" password="+password);

      return DriverManager.getConnection( url,"root","marvin");
   }



   void getUserInfo() {

      Connection conn=null;
      try
      {
	conn = getConnection();

	PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user WHERE name LIKE ?");
	pstmt.setString(1, name); 
	ResultSet result = pstmt.executeQuery();

	//System.out.println(args[1]);
	while(result.next()) {
		if(pass.equals(result.getString(2))){
  		  try{
			  out.println("1");
		  }catch(Exception e){
		  }
		}else{
  		  try{
			  out.println("0");
		  }catch(Exception e){
		  }
		}
		result.close();
		return;
	}

	result.close();
      }
      catch (Exception e) {
	System.out.println(e.toString());
      }
      finally
      {
	try {
         if (conn!=null) conn.close();
	}
	catch (Exception e) {
	}
      }
   }   
   void makeUserInfo() {
      Connection conn=null;
      try
      {
    	  conn = getConnection();

    	  PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM user WHERE name LIKE ?");
    	  pstmt.setString(1, name); 
    	  ResultSet result = pstmt.executeQuery();

    	  //System.out.println(args[1]);
    	  while(result.next()) {
    		  try{
    			  out.println("0");
    		  }catch(Exception e){
    		  }
    		  result.close();
    		  return;
    	  }
    	  result.close();
    	  pstmt = conn.prepareStatement("INSERT INTO user VALUES("+name+","+pass+");");
	   }
	   catch (Exception e) {
		   System.out.println(e.toString());
	   }finally{
		   try {
			   if (conn!=null) conn.close();
		   }catch (Exception e) {
		   }
	   }
   }
   
   
   void handleRequest(){


	try {
		// Check user and password. Now it is sent in plain text.
		// You should use Secure Sockets (SSL) for a production environment.

		// Do the operation
		if (command.equals("GET-USER-INFO")) {
			getUserInfo();
		}else{
			makeUserInfo();
		}
		
	}
	catch (Exception e) {		
	}
   }

   public void run() {  
	   try{
		   ServerSocket serverSocket = new ServerSocket(portnumber);
		   client = serverSocket.accept();
		   out = new PrintWriter(client.getOutputStream(), true);
		   in = new BufferedReader(new InputStreamReader(client.getInputStream()));
    	   command = in.readLine();
    	   name = in.readLine();
    	   pass = in.readLine();
       }catch(Exception e){
       }
	   handleRequest();
	   try{
		   out.close();
		   in.close();
		   client.close();
	   }catch(Exception e){
	   }
   }
   
   public static void main(String args[]){
	   new SQL_request().run();
	   return;
   }
 }

