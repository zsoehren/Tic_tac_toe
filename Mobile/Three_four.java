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

public class Three_four extends ActionBarActivity {
		Board_3d game = new Board_3d(4);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three_four);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.three_four, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_three_four,
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
				has_won = game.add_piece(0, 0, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 0, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Top_LM:
			if(buttonText =="X" || buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 1, 3, 1);
			}else{
				Turn = true;
				b.setText("O");
				has_won = game.add_piece(0, 1, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Top_RM:
			if(buttonText=="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 2, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 2, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Top_Right:
			if(buttonText =="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 3, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 3, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_UM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 0, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 0, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_UM_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do noting
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 1, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 1, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_UM_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 2, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 2, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_UM_Right:
			if(buttonText =="X" ||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 3, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 3, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
			////////////////////////////////////////////////////
		case R.id.Top_LM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 0, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 0, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_LM_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do noting
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 1, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 1, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_LM_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 2, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 2, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_LM_Right:
			if(buttonText =="X" ||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 3, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 3, 3, 2);
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
				has_won = game.add_piece(3, 0, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 0, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Bottom_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 1, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 1, 3, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Bottom_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 2, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 2, 3, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Bottom_Right:
			if(buttonText =="X" ||buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 3, 3, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 3, 3, 2);
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
				has_won = game.add_piece(0, 0, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 0, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Top_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 1, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 1, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Top_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 2, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 2, 2, 2);
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
				has_won = game.add_piece(0, 3, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 3, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_UM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 0, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 0, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_UM_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 1, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 2, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_UM_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 2, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 2, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_UM_Right:
			if(buttonText =="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 3, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 3, 2, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
			///////////////////////////////////////////////
		case R.id.Mid_LM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 0, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 0, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_LM_ML:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 1, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 1, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_LM_MR:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 2, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 2, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_LM_Right:
			if(buttonText =="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 3, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 3, 2, 2);
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
				has_won = game.add_piece(3, 0, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 0, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Bot_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 1, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 1, 2, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Mid_Bot_RM:
			if(buttonText =="X"|| buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 2, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 2, 2, 2);
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
				has_won = game.add_piece(3, 3, 2, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 3, 2, 2);
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
		case R.id.Bot_Top_ML:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 1, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 1, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Top_MR:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 2, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 2, 1, 1);
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
				has_won = game.add_piece(0, 3, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 3, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_UM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 0, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 0, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_UM_MLeft:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 1, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 1, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_UM_MRight:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 2, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 2, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_UM_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 3, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 3, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_LM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 0, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 0, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_LM_MLeft:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 1, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 1, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_LM_MRight:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 2, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 2, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_LM_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 3, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 3, 1, 1);
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
				has_won = game.add_piece(3, 0, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 0, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Bot_M_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 1, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 1, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Bot_M_Right:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 2, 1, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 2, 1, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Bot_Bot_Right:
			if(buttonText =="X" || buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 3, 1, 1);
			}else{
				b.setText("O");
				Turn= true;
				has_won = game.add_piece(3, 3, 1, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
			/////////////////////////////////////////here//////////////////////
		case R.id.LB_Top_Left:
			if(buttonText =="X" ||buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 0, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 0, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_Top_LM:
			if(buttonText =="X" || buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 1, 0, 1);
			}else{
				Turn = true;
				b.setText("O");
				has_won = game.add_piece(0, 1, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_Top_RM:
			if(buttonText=="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 2, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 2, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_Top_Right:
			if(buttonText =="X" || buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(0, 3, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(0, 3, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_UM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 0, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 0, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_UM_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do noting
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 1, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 1, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_UM_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 2, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 2, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_UM_Right:
			if(buttonText =="X" ||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(1, 3, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(1, 3, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
			////////////////////////////////////////////////////
		case R.id.LB_LM_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 0, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 0, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_LM_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do noting
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 1, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 1, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_LM_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 2, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 2, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_LM_Right:
			if(buttonText =="X" ||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(2, 3, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(2, 3, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
			
		case R.id.LB_Bottom_Left:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 0, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 0, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_Bottom_LM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 1, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 1, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_Bottom_RM:
			if(buttonText =="X"||buttonText=="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 2, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 2, 0, 2);
			} 
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.LB_Bottom_Right:
			if(buttonText =="X" ||buttonText =="O"){
				//do nothing
			}else if(Turn){
				b.setText("X");
				Turn = false;
				has_won = game.add_piece(3, 3, 0, 1);
			}else{
				b.setText("O");
				Turn = true;
				has_won = game.add_piece(3, 3, 0, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		
		}
		
	}
}
