 package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

public class MainActivity extends ActionBarActivity {
	public final static String EXTRA_MESSAGE = "com.helloworld.MESSAGE";
	Game_On game = new Game_On();
	int mode = 1;
	int size = 1;

	@Override 
	protected void onCreate(Bundle savedInstanceState) {   
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main); 

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit(); 
		}
	}

	@Override  
	public boolean onCreateOptionsMenu(Menu menu) {   

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override 
	public boolean onOptionsItemSelected(MenuItem item) { 
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.  
	 */
	public static class PlaceholderFragment extends Fragment { 

		public PlaceholderFragment() {
		}

		@Override 
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}
	public void Connect(View view){
		int player=0;
		Intent Game_Mode = new Intent(this, Game_Mode.class);
		Intent two_three = new Intent(this, Two_three.class);
		
		//player = game.connect("sslab05.cs.purdue.edu", 5432);
		player=1;
		if(player==1){
			startActivity(Game_Mode);
		}else if(player ==2){
			game.sendGameMode(0,0);
			if(game.gameMode==1 && game.gameSize==3){
				startActivity(two_three);
			}
		}
	}
}
			
