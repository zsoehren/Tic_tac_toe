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

public class Three_three extends ActionBarActivity {
		Board_3d game = new Board_3d(3);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three_three);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.three_three, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_three_three,
					container, false);
			return rootView;
		}
	}
	boolean Turn = true;

	int has_won = 0;
	public void Assign(View view){
		Button b = (Button)view;
		String buttonText = b.getText().toString();
		switch(view.getId()){
		case R.id.Top_Top_Left:
			if(buttonText =="X" ||buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 0, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,0,2,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Top_Middle:
			if(buttonText =="X" || buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0,1,2,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,1,2,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Top_Right:
			if(buttonText=="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0,2,2,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,2,2,1);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Middle_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,0,2,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 0, 2, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Middle_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do noting
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,1,2,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 1, 2, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Middle_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 2, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,2,2,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Bottom_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 0, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,0,2,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Bottom_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,1,2,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,1,2,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Bottom_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 2, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,2,2,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Top_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 0, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 0, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Top_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 1, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,1,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Top_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 2, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,2,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Mid_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 0, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,0,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Mid_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,1,1,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,1,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Mid_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,2,1,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,2,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Bot_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,0,1,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,0,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Bot_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,1,1,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,1,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Bot_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,2,1,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,2,1,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Top_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0,0,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,0,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Top_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0,1,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,1,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Top_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0,2,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0,2,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Mid_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,0,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,0,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Mid_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,1,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,1,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Mid_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1,2,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1,2,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Bot_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,0,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,0,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Bot_Middle:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,1,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,1,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Bot_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2,2,0,1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2,2,0,2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		
		}
		
	}
}
