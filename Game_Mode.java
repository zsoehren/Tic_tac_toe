package com.example.tictactoe;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.os.Build;

public class Game_Mode extends ActionBarActivity {
	int mode = 1;
	int size = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game__mode);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game__mode, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_game__mode,
					container, false);
			return rootView;
		}
	}
	public void Rules(View view){ 
		Intent intent = new Intent(this, Rules.class);
		startActivity(intent); 
		
		//Do Someting in response
	}
	public void GameMode(View view) { 
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	     
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.two_D:
	            if (checked)
	                mode = 2;
	            break; 
	        case R.id.three_D:
	            if (checked)
	                mode = 3;
	            break; 
	        case R.id.four_D:
	        	if(checked)
	        		mode = 4;
	        	break;
	    }
	}
	public void GameSize(View view){
		boolean checked = ((RadioButton)view).isChecked();
		
		switch(view.getId()){
		case R.id.threeXthree:
			if(checked)
				size = 2;
				break;
		case R.id.fourXfour: 
			if(checked)
				size = 3;
				break;
		}
	}
	public void Start(View view){
		Intent two_three = new Intent(this, Two_three.class);
		Intent two_four = new Intent(this, Two_four.class);
		Intent three_three = new Intent(this,Three_three.class);
		Intent three_four = new Intent(this,Three_four.class);
		Intent four_three = new Intent(this, Four_three.class);
		Intent four_four = new Intent(this,Four_four.class);
		
		if(mode==2&&size==2){  //2d by three game
			startActivity(two_three);
		}else if(mode ==2&&size==3){ //2d by four game
			startActivity(two_four);
		}else if(mode ==3&&size==2){ //3d by three game
			startActivity(three_three);
		}else if(mode ==3&&size==3){
			startActivity(three_four);//3d by four game
		}else if(mode ==4&&size==2){
			startActivity(four_three);//4d by three game
		}else if(mode ==4&&size ==3){
			startActivity(four_four); //4d by four game
		}else{
			startActivity(two_three); //default game 2d by three
		}
	}

}
