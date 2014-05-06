package com.example.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView; 

public class Two_three extends ActionBarActivity {
	Board_2d game = new Board_2d(3);
	String grid[][] = new String[3][3];
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two_three);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		game_set();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.two_three, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_two_three,
					container, false);
			return rootView;
		}
	}
	boolean Turn = true;
	
	int has_won = 0;
	public void game_set(){
			grid[0][0] = "Top_Left";
			grid[0][1] = "Top_Middle";
			grid[0][2] = "Top_Right";
			grid[1][0] = "Middle_Left";
			grid[1][1] = "Middle_Middle";
			grid[1][2] = "Middle_Right";
			grid[2][0] = "Bottom_Left";
			grid[2][1] = "Bottom_Middle";
			grid[2][2] = "Bottom_Right";
	}
	public void Test(String name){
		switch(name){
		case "Top_Left":
			Button t = (Button)findViewById(R.id.Top_Left);
			t.setText("L");
		}
	}
	public void Assign(View view){
		Button b = (Button)view;
		String buttonText = b.getText().toString();
		switch(view.getId()){
			case R.id.Top_Left:
				if(buttonText == "X"||buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(0, 0, 1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(0, 0, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				
				break;
			case R.id.Top_Middle:
				if(buttonText == "X"||buttonText =="O"){
					//do nothing)
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(0, 1, 1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(0, 1, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_Right:
				if(buttonText == "X"||buttonText =="O"){
					//do nothing)
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(0,2,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(0,2,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Middle_Left:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(1,0,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(1,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Middle_Middle:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(1,1,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(1,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Middle_Right:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(1,2,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(1, 2, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			//here here here
			case R.id.Bottom_Left:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(2,0,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bottom_Middle:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(2,1,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(2,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bottom_Right:
				if(buttonText == "X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(2, 2, 1);
					}else{
					b.setText("O");
					Turn = true;					
					has_won = game.add_piece(2,2,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
		}
	}
}
