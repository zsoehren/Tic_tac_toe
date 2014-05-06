package com.example.tictactoe;

import android.content.Intent;
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

public class Two_three extends ActionBarActivity {
	Board_2d game = new Board_2d(3);
	String grid[][] = new String[3][3];
	Game_On both = new Game_On();
	int user=0;
	int hm=0;
	int first = 0;
	int cat_check = 0;
	int size = 3;
	
	public void Connect(){
		int player = 0;
		player = both.connect("data.cs.purdue.edu",5432);
		if(player==1){
			both.sendGameMode(1, 3);
		}else if(player==2){
			both.sendGameMode(1,3);
		}
		user = player;	 
	}
	public void forplay(){
		if(user == 2 && first == 0){
			Adder();
			first++;
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two_three);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
		Connect();
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
	
	
	
	int Turn = 1;
	int has_won = 0;
	public void game_set(){
		Button first = (Button)findViewById(R.id.first_move);
		if(user==2){
			first.setVisibility(View.VISIBLE);
		}
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
	public void Adder(){
		System.out.println("Test");
		int x = 0;
		int y = 0;
		System.out.println(Turn);
		if(user==1){
			both.movePiece(0,0,0,0,3,2);
		}else if(user==2){
			System.out.println("in if");
			both.movePiece(0,0,0,0,3,1);
		}
		System.out.println("here");
		x=both.positionX;
		y=both.positionY;
		System.out.println(x);
		System.out.println(y);
		Add(grid[x][y]);
		System.out.println("Added the opponents piece, exiting adder");
		System.out.println(Turn);
		hm=1;
		cat_check++;
		return;
		
	}
	public void Add(String name){
		System.out.println(name);
		switch(name){
		case "Top_Left":
			Button TL = (Button)findViewById(R.id.Top_Left);
			if(Turn!=1){
				TL.setText("O");
				Turn = 1;
				//both.movePiece(0, 0, 0, 0, 3, 2);
				//has_won = game.add_piece(0, 0, 2);
			}else if(Turn==1){
				TL.setText("X");
				Turn = 2;
				//both.movePiece(0, 0, 0, 0, 3, 1);
				//has_won = game.add_piece(0,0,1);
			}
			if(has_won>0){
				TL.setBackgroundColor(Color.RED);
			}
			break;
		case "Top_Middle":
			Button TM = (Button)findViewById(R.id.Top_Middle);
			if(Turn!=1){
				TM.setText("O");
				Turn = 1;
				//both.movePiece(0, 1, 0, 0, 3, 2);
				//has_won = game.add_piece(0, 1, 2);
			}else if(Turn==1){
				TM.setText("X");
				Turn =2;
				//both.movePiece(0, 1, 0, 0, 3, 1);
				//has_won = game.add_piece(0,1,1);
			}
			if(has_won>0){
				TM.setBackgroundColor(Color.RED);
			}
			break;
	case "Top_Right":
		Button TR = (Button)findViewById(R.id.Top_Right);
		if(Turn!=1){
			TR.setText("O");
			Turn = 1;
			//both.movePiece(0, 2, 0, 0, 3, 2);
			//has_won = game.add_piece(0, 2, 2);
		}else if(Turn==1){
			TR.setText("X");
			Turn =2;
			//both.movePiece(0, 2, 0, 0, 3, 1);
			//has_won = game.add_piece(0,2,1);
		}
		if(has_won>0){
			TR.setBackgroundColor(Color.RED);
		}
		break;
	case "Middle_Left":
		Button ML = (Button)findViewById(R.id.Middle_Left);
		if(Turn!=1){
			ML.setText("O");
			Turn =1;
			//both.movePiece(1, 0, 0, 0, 3, 2);
			//has_won = game.add_piece(1, 0, 2);
		}else if(Turn==1){
			ML.setText("X");
			Turn =2;
			//has_won = game.add_piece(1,0,1);
			//both.movePiece(1, 0, 0, 0, 3, 1);
		}
		if(has_won>0){
			ML.setBackgroundColor(Color.RED);
		}
		break;
	case "Middle_Middle":
		System.out.println("IN CASE");
		Button MM = (Button)findViewById(R.id.Middle_Middle);
		System.out.println("AFTER THIS");
		System.out.println(Turn);
		if(Turn!=1){
			MM.setText("O");
			Turn = 1;
			//has_won = game.add_piece(1, 1, 2);
			System.out.println("in turn 2 of mm");
			//both.movePiece(1, 1, 0, 0, 3, 2);
			
		}else if(Turn==1){
			System.out.println("Turn==1");
			MM.setText("X");
			Turn = 2;
			
			//both.movePiece(1, 1, 0, 0, 3, 1);
			//has_won = game.add_piece(1,1,1);
		}
		if(has_won>0){
			MM.setBackgroundColor(Color.RED);
		}
		break;
	case "Middle_Right":
		Button MR = (Button)findViewById(R.id.Middle_Right);
		if(Turn!=1){
			MR.setText("O");
			Turn = 1;
			//has_won = game.add_piece(0, 0, 2);
			//both.movePiece(1, 2, 0, 0, 3, 2);
		}else if(Turn==1){
			MR.setText("X");
			Turn = 2;
			//both.movePiece(1, 2, 0, 0, 3, 1);
			//has_won = game.add_piece(0,0,1);
		}
		if(has_won>0){
			MR.setBackgroundColor(Color.RED);
		}
		break;
	case "Bottom_Left":
		Button BL = (Button)findViewById(R.id.Bottom_Left);
		if(Turn!=1){
			BL.setText("O");
			//has_won = game.add_piece(2, 0, 2);
			Turn = 1;
			//both.movePiece(2, 0, 0, 0, 3, 2);
		}else if(Turn==1){
			BL.setText("X");
			Turn =2;
			//has_won = game.add_piece(2,0,1);
			//both.movePiece(2, 0, 0, 0, 3, 1);
		}
		if(has_won>0){
			BL.setBackgroundColor(Color.RED);
		}
		break;
	case "Bottom_Middle":
		Button BM = (Button)findViewById(R.id.Bottom_Middle);
		if(Turn!=1){
			BM.setText("O");
			//has_won = game.add_piece(2, 1, 2);
			//both.movePiece(2, 1, 0, 0, 3, 2);
			Turn = 1;
		}else if(Turn==1){
			BM.setText("X");
			//has_won = game.add_piece(2,1,1);
			Turn = 2;
			//both.movePiece(2, 1, 0, 0, 3, 1);
		}
		if(has_won>0){
			BM.setBackgroundColor(Color.RED);
		}
		break;
	case "Bottom_Right":
		Button BR = (Button)findViewById(R.id.Bottom_Right);
		if(Turn!=1){
			BR.setText("O");
			//has_won = game.add_piece(2, 2, 2);
			Turn = 1;
			//both.movePiece(2, 2, 0, 0, 3, 2);
		}else if(Turn==1){
			BR.setText("X");
			//has_won = game.add_piece(2,2,1);
			Turn =2;
			//both.movePiece(2, 2, 0, 0, 3, 1);
		}
		if(has_won>0){
			BR.setBackgroundColor(Color.RED);
		}
		break;
		}
	}
	
	
	
	public void get_first(View view){
		Button b = (Button)view;
		if(first == 0 && user==2){
			forplay();
		}
		
	}
	public void back(View view){
		Intent res = new Intent(this,MainActivity.class);
		startActivity(res);
	}
	public void Assign(View view){
		//if(first == 0 && user==2){
		//	forplay();
		//}else{
		Button r = (Button)findViewById(R.id.reset);
		Button b = (Button)view;
		String buttonText = b.getText().toString();
		cat_check++;
		switch(view.getId()){
			case R.id.Top_Left:
				if(buttonText == "X"||buttonText =="O"){
					//do nothing
				}else if(Turn==1 && Turn ==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(0, 0, 0, 0, 3, 1);
					//has_won = game.add_piece(0, 0, 1);
				}else if(Turn==2 && Turn == user){
					b.setText("O");
					Turn = 1;
					both.movePiece(0, 0, 0, 0, 3, 2);
					//has_won = game.add_piece(0, 0, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				
				break;
			case R.id.Top_Middle:
				if(buttonText == "X"||buttonText =="O"){
					//do nothing)
				}else if(Turn==1&& Turn==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(0, 1, 0, 0, 3, 1);
					//has_won = game.add_piece(0, 1, 1);
				}else if(Turn==2&&Turn ==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(0, 1, 0, 0, 3, 2);
					//has_won = game.add_piece(0, 1, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Top_Right:
				if(buttonText == "X"||buttonText =="O"){
					//do nothing)
				}else if(Turn==1&&Turn==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(0, 2, 0, 0, 3, 1);
					//has_won = game.add_piece(0,2,1);
				}else if(Turn==2 && Turn==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(0, 2, 0, 0, 3, 2);
					//has_won = game.add_piece(0,2,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Middle_Left:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn==1&&Turn==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(1, 0, 0, 0, 3, 1);
					//has_won = game.add_piece(1,0,1);
				}else if(Turn==2&&Turn==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(1, 0, 0, 0, 3, 2);
					//has_won = game.add_piece(1,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Middle_Middle:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn==1&&Turn == user){
					b.setText("X");
					Turn = 2;
					both.movePiece(1, 1, 0, 0, 3, 1);
					//has_won = game.add_piece(1,1,1);
				}else if(Turn==2&&Turn==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(1, 1, 0, 0, 3, 2);
					//has_won = game.add_piece(1,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Middle_Right:
				System.out.println("MIddle_Right");
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn==1&&Turn==user){
					System.out.println("in if");
					b.setText("X");
					Turn =2;
					both.movePiece(1, 2, 0, 0, 3, 1);
					has_won = game.add_piece(1,2,1);
				}else if(Turn==2&&Turn==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(1, 2, 0, 0, 3, 2);
					//has_won = game.add_piece(1, 2, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			//here here here
			case R.id.Bottom_Left:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn==1&&Turn==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(2, 0, 0, 0, 3, 1);
					//has_won = game.add_piece(2,0,1);
				}else if(Turn==2&&Turn==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(2, 0, 0, 0, 3, 2);
					//has_won = game.add_piece(2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bottom_Middle:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn==1&&Turn==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(2, 1, 0, 0, 3, 1);
					//has_won = game.add_piece(2,1,1);
				}else if(Turn==2&&Turn==user){
					b.setText("O");
					Turn = 1;
					both.movePiece(2, 1, 0, 0, 3, 2);
					//has_won = game.add_piece(2,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bottom_Right:
				if(buttonText == "X" || buttonText =="O"){
					//do nothing
				}else if(Turn==1&&Turn==user){
					b.setText("X");
					Turn = 2;
					both.movePiece(2, 2, 0, 0, 3, 1);
					//has_won = game.add_piece(2, 2, 1);
					}else if(Turn==2&&Turn==user){
					b.setText("O");
					Turn = 1;		
					both.movePiece(2, 2, 0, 0, 3, 2);
					//has_won = game.add_piece(2,2,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
		}
		if(both.game_over==0 && cat_check!=(size*size)){
			Adder();
		}else if(both.game_over>=1 || cat_check==(size*size)){
			r.setVisibility(View.VISIBLE);
		}
	}
	//}
}
