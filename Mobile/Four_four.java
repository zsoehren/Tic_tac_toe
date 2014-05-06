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

public class Four_four extends ActionBarActivity {
	Board_4d game = new Board_4d(4);
	int player = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four_four);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.four_four, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_four_four,
					container, false);
			return rootView;
		}
	}
	int has_won = 0;
	public void Assign(View view){
		Button b = (Button)view;
		String buttonText = b.getText().toString();
		switch(view.getId()){
		case R.id.Top_Left_Top_Left:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 0, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Top_LM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 1, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Top_RM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 2, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Top_Right:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 3, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,3,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_UM_Left:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1, 0, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(1,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_UM_LM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1, 1, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(1,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_UM_RM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1, 2, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(1,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_UM_Right:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1, 3, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(1,3,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_LM_Left:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2, 0, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(2,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_LM_LM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2, 1, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(2,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_LM_RM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2, 2, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(2,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_LM_Right:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2, 3, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(2,3,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Bot_Left:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(3, 0, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(3,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Bot_LM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(3, 1, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(3,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Bot_RM:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(3, 2, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(3,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Bot_Right:
			if(buttonText =="X"||buttonText=="O"){
				
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(3, 3, 0, 0, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(3,3,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
			//////////////////////////////////////////////////////
			case R.id.Top_LM_Top_Left:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0, 0, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0,0,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Top_LM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0, 1, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0,1,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Top_RM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0, 2, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0,2,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Top_Right:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0, 3, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0,3,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_UM_Left:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(1, 0, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(1,0,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_UM_LM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(1, 1, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(1,1,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_UM_RM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(1, 2, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(1,2,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_UM_Right:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(1, 3, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(1,3,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_LM_Left:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2, 0, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(2,0,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_LM_LM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2, 1, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(2,1,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_LM_RM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2, 2, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(2,2,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_LM_Right:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2, 3, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(2,3,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Bot_Left:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(3, 0, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(3,0,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Bot_LM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(3, 1, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(3,1,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Bot_RM:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(3, 2, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(3,2,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_LM_Bot_Right:
				if(buttonText =="X"||buttonText=="O"){
					
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(3, 3, 0, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(3,3,0,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
				//////////////////////////////////////
				case R.id.Top_RM_Top_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 0, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,0,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Top_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 1, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,1,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Top_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 2, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,2,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Top_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 3, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,3,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_UM_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 0, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,0,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_UM_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 1, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,1,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_UM_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 2, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,2,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_UM_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 3, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,3,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_LM_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 0, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,0,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_LM_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 1, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,1,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_LM_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 2, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,2,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_LM_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 3, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,3,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Bot_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 0, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,0,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Bot_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 1, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,1,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Bot_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 2, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,2,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_RM_Bot_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 3, 0, 2, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,3,0,2,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
					/////////////////////////////////
				case R.id.Top_Right_Top_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 0, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,0,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Top_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 1, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,1,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Top_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 2, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,2,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Top_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(0, 3, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(0,3,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_UM_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 0, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,0,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_UM_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 1, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,1,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_UM_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 2, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,2,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_UM_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(1, 3, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(1,3,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_LM_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 0, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,0,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_LM_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 1, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,1,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_LM_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 2, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,2,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_LM_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(2, 3, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(2,3,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Bot_Left:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 0, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,0,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Bot_LM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 1, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,1,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Bot_RM:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 2, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,2,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
				case R.id.Top_Right_Bot_Right:
					if(buttonText =="X"||buttonText=="O"){
						
					}else if(player==1){
						b.setText("X");
						player=2;
						has_won = game.add_piece(3, 3, 0, 3, 1);
					}else{
						b.setText("O");
						player=1;
						has_won = game.add_piece(3,3,0,3,2);
					}
					if(has_won>0){
						b.setBackgroundColor(Color.RED);
					}
					break;
					case R.id.UM_Left_Top_Left:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(0, 0, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(0,0,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Top_LM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(0, 1, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(0,1,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Top_RM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(0, 2, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(0,2,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Top_Right:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(0, 3, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(0,3,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_UM_Left:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(1, 0, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(1,0,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_UM_LM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(1, 1, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(1,1,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_UM_RM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(1, 2, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(1,2,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_UM_Right:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(1, 3, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(1,3,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_LM_Left:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(2, 0, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(2,0,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_LM_LM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(2, 1, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(2,1,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_LM_RM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(2, 2, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(2,2,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_LM_Right:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(2, 3, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(2,3,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Bot_Left:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(3, 0, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(3,0,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Bot_LM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(3, 1, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(3,1,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Bot_RM:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(3, 2, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(3,2,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
					case R.id.UM_Left_Bot_Right:
						if(buttonText =="X"||buttonText=="O"){
							
						}else if(player==1){
							b.setText("X");
							player=2;
							has_won = game.add_piece(3, 3, 1, 0, 1);
						}else{
							b.setText("O");
							player=1;
							has_won = game.add_piece(3,3,1,0,2);
						}
						if(has_won>0){
							b.setBackgroundColor(Color.RED);
						}
						break;
						case R.id.UM_LM_Top_Left:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(0, 0, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(0,0,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Top_LM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(0, 1, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(0,1,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Top_RM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(0, 2, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(0,2,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Top_Right:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(0, 3, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(0,3,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_UM_Left:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(1, 0, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(1,0,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_UM_LM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(1, 1, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(1,1,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_UM_RM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(1, 2, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(1,2,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_UM_Right:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(1, 3, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(1,3,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_LM_Left:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(2, 0, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(2,0,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_LM_LM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(2, 1, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(2,1,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_LM_RM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(2, 2, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(2,2,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_LM_Right:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(2, 3, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(2,3,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Bot_Left:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(3, 0, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(3,0,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Bot_LM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(3, 1, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(3,1,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Bot_RM:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(3, 2, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(3,2,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
						case R.id.UM_LM_Bot_Right:
							if(buttonText =="X"||buttonText=="O"){
								
							}else if(player==1){
								b.setText("X");
								player=2;
								has_won = game.add_piece(3, 3, 1, 1, 1);
							}else{
								b.setText("O");
								player=1;
								has_won = game.add_piece(3,3,1,1,2);
							}
							if(has_won>0){
								b.setBackgroundColor(Color.RED);
							}
							break;
							case R.id.UM_RM_Top_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 0, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,0,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Top_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 1, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,1,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Top_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 2, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,2,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Top_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 3, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,3,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_UM_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 0, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,0,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_UM_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 1, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,1,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_UM_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 2, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,2,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_UM_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 3, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,3,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_LM_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 0, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,0,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_LM_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 1, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,1,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_LM_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 2, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,2,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_LM_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 3, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,3,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Bot_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 0, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,0,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Bot_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 1, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,1,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Bot_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 2, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,2,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_RM_Bot_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 3, 1, 2, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,3,1,2,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Top_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 0, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,0,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Top_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 1, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,1,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Top_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 2, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,2,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Top_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(0, 3, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(0,3,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_UM_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 0, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,0,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_UM_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 1, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,1,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_UM_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 2, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,2,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_UM_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(1, 3, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(1,3,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_LM_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 0, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,0,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_LM_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 1, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,1,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_LM_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 2, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,2,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_LM_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(2, 3, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(2,3,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Bot_Left:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 0, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,0,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Bot_LM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 1, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,1,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Bot_RM:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 2, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,2,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
							case R.id.UM_Right_Bot_Right:
								if(buttonText =="X"||buttonText=="O"){
									
								}else if(player==1){
									b.setText("X");
									player=2;
									has_won = game.add_piece(3, 3, 1, 3, 1);
								}else{
									b.setText("O");
									player=1;
									has_won = game.add_piece(3,3,1,3,2);
								}
								if(has_won>0){
									b.setBackgroundColor(Color.RED);
								}
								break;
								////////////////////////////////////////////////////////////
								case R.id.LM_Left_Top_Left:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(0, 0, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(0,0,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Top_LM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(0, 1, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(0,1,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Top_RM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(0, 2, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(0,2,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Top_Right:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(0, 3, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(0,3,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_UM_Left:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(1, 0, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(1,0,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_UM_LM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(1, 1, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(1,1,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_UM_RM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(1, 2,2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(1,2,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_UM_Right:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(1, 3,2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(1,3,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_LM_Left:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(2, 0, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(2,0,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_LM_LM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(2, 1, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(2,1,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_LM_RM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(2, 2, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(2,2,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_LM_Right:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(2, 3, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(2,3,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Bot_Left:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(3, 0, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(3,0,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Bot_LM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(3, 1, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(3,1,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Bot_RM:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(3, 2, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(3,2,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
								case R.id.LM_Left_Bot_Right:
									if(buttonText =="X"||buttonText=="O"){
										
									}else if(player==1){
										b.setText("X");
										player=2;
										has_won = game.add_piece(3, 3, 2, 0, 1);
									}else{
										b.setText("O");
										player=1;
										has_won = game.add_piece(3,3,2,0,2);
									}
									if(has_won>0){
										b.setBackgroundColor(Color.RED);
									}
									break;
									//////////////////////////////////////////////////////
									case R.id.LM_LM_Top_Left:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(0, 0, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(0,0,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Top_LM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(0, 1, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(0,1,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Top_RM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(0, 2, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(0,2,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Top_Right:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(0, 3, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(0,3,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_UM_Left:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(1, 0, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(1,0,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_UM_LM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(1, 1, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(1,1,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_UM_RM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(1, 2, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(1,2,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_UM_Right:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(1, 3, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(1,3,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_LM_Left:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(2, 0, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(2,0,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_LM_LM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(2, 1, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(2,1,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_LM_RM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(2, 2, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(2,2,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_LM_Right:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(2, 3, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(2,3,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Bot_Left:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(3, 0, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(3,0,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Bot_LM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(3, 1, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(3,1,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Bot_RM:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(3, 2, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(3,2,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
									case R.id.LM_LM_Bot_Right:
										if(buttonText =="X"||buttonText=="O"){
											
										}else if(player==1){
											b.setText("X");
											player=2;
											has_won = game.add_piece(3, 3, 2, 1, 1);
										}else{
											b.setText("O");
											player=1;
											has_won = game.add_piece(3,3,2,1,2);
										}
										if(has_won>0){
											b.setBackgroundColor(Color.RED);
										}
										break;
										//////////////////////////////////////
										case R.id.LM_RM_Top_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 0, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,0,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Top_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 1, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,1,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Top_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 2, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,2,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Top_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 3, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,3,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_UM_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 0, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,0,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_UM_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 1, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,1,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_UM_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 2, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,2,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_UM_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 3, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,3,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_LM_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 0, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,0,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_LM_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 1, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,1,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_LM_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 2, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,2,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_LM_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 3, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,3,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Bot_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 0, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,0,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Bot_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 1, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,1,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Bot_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 2, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,2,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_RM_Bot_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 3, 2, 2, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,3,2,2,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
											/////////////////////////////////
										case R.id.LM_Right_Top_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 0, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,0,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Top_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 1, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,1,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Top_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 2, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,2,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Top_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(0, 3, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(0,3,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_UM_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 0, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,0,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_UM_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 1, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,1,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_UM_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 2, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,2,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_UM_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(1, 3, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(1,3,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_LM_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 0, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,0,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_LM_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 1, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,1,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_LM_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 2, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,2,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_LM_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(2, 3, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(2,3,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Bot_Left:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 0, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,0,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Bot_LM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 1, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,1,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Bot_RM:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 2, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,2,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
										case R.id.LM_Right_Bot_Right:
											if(buttonText =="X"||buttonText=="O"){
												
											}else if(player==1){
												b.setText("X");
												player=2;
												has_won = game.add_piece(3, 3, 2, 3, 1);
											}else{
												b.setText("O");
												player=1;
												has_won = game.add_piece(3,3,2,3,2);
											}
											if(has_won>0){
												b.setBackgroundColor(Color.RED);
											}
											break;
											//////////////////////////////
											/////////////////////////////
											case R.id.Bot_Left_Top_Left:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(0, 0, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(0,0,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Top_LM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(0, 1, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(0,1,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Top_RM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(0, 2, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(0,2,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Top_Right:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(0, 3, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(0,3,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_UM_Left:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(1, 0, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(1,0,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_UM_LM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(1, 1, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(1,1,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_UM_RM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(1, 2, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(1,2,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_UM_Right:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(1, 3, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(1,3,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_LM_Left:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(2, 0, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(2,0,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_LM_LM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(2, 1, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(2,1,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_LM_RM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(2, 2, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(2,2,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_LM_Right:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(2, 3, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(2,3,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Bot_Left:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(3, 0, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(3,0,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Bot_LM: 
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(3, 1, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(3,1,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Bot_RM:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(3, 2, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(3,2,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
											case R.id.Bot_Left_Bot_Right:
												if(buttonText =="X"||buttonText=="O"){
													
												}else if(player==1){
													b.setText("X");
													player=2;
													has_won = game.add_piece(3, 3, 3, 0, 1);
												}else{
													b.setText("O");
													player=1;
													has_won = game.add_piece(3,3,3,0,2);
												}
												if(has_won>0){
													b.setBackgroundColor(Color.RED);
												}
												break;
												//////////////////////////////////////////////////////
												case R.id.Bot_LM_Top_Left:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(0, 0, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(0,0,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Top_LM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(0, 1, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(0,1,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Top_RM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(0, 2, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(0,2,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Top_Right:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(0, 3, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(0,3,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_UM_Left:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(1, 0, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(1,0,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_UM_LM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(1, 1, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(1,1,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_UM_RM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(1, 2, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(1,2,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_UM_Right:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(1, 3, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(1,3,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_LM_Left:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(2, 0, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(2,0,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_LM_LM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(2, 1, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(2,1,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_LM_RM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(2, 2, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(2,2,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_LM_Right:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(2, 3, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(2,3,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Bot_Left:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(3, 0, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(3,0,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Bot_LM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(3, 1, 0, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(3,1,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Bot_RM:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(3, 2, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(3,2,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
												case R.id.Bot_LM_Bot_Right:
													if(buttonText =="X"||buttonText=="O"){
														
													}else if(player==1){
														b.setText("X");
														player=2;
														has_won = game.add_piece(3, 3, 3, 1, 1);
													}else{
														b.setText("O");
														player=1;
														has_won = game.add_piece(3,3,3,1,2);
													}
													if(has_won>0){
														b.setBackgroundColor(Color.RED);
													}
													break;
													//////////////////////////////////////
													case R.id.Bot_RM_Top_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 0, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,0,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Top_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 1, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,1,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Top_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 2, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,2,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Top_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 3, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,3,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_UM_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 0, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,0,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_UM_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 1, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,1,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_UM_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 2, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,2,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_UM_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 3, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,3,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_LM_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 0, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,0,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_LM_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 1, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,1,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_LM_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 2, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,2,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_LM_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 3, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,3,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Bot_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 0, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,0,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Bot_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 1, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,1,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Bot_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 2, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,2,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_RM_Bot_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 3, 3, 2, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,3,3,2,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
														/////////////////////////////////
													case R.id.Bot_Right_Top_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 0, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,0,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Top_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 1, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,1,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Top_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 2, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,2,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Top_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(0, 3, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(0,3,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_UM_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 0, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,0,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_UM_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 1, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,1,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_UM_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 2, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,2,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_UM_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(1, 3, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(1,3,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_LM_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 0, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,0,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_LM_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 1, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,1,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_LM_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 2, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,2,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_LM_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(2, 3, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(2,3,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Bot_Left:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 0, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,0,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Bot_LM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 1, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,1,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Bot_RM:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 2, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,2,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
													case R.id.Bot_Right_Bot_Right:
														if(buttonText =="X"||buttonText=="O"){
															
														}else if(player==1){
															b.setText("X");
															player=2;
															has_won = game.add_piece(3, 3, 3, 3, 1);
														}else{
															b.setText("O");
															player=1;
															has_won = game.add_piece(3,3,3,3,2);
														}
														if(has_won>0){
															b.setBackgroundColor(Color.RED);
														}
														break;
		}
	}
}
