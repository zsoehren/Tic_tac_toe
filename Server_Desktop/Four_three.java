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

public class Four_three extends ActionBarActivity {
	Board_4d game = new Board_4d(3);
	int player = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four_three); 

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.four_three, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_four_three,
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
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player = 2;
				has_won = game.add_piece(0,0,0,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(0,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Top_Middle:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0,1,0,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(0,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Top_Right:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0,2,0,0,1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Middle_Left:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player =2;
				has_won = game.add_piece(1,0,0,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(1,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Middle_Middle:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1,1,0,0,1);
			}else{
				b.setText("O");
				player =1;
				has_won = game.add_piece(1,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			
			break;
		case R.id.Top_Left_Middle_Right:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player =2;
				has_won = game.add_piece(1,2,0,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(1,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Bot_Left:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2,0,0,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(2,0,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break; 
		case R.id.Top_Left_Bot_Middle:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2,1,0,0,1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(2,1,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Left_Bot_Right:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2,2,0,0,1);
			}else{
				b.setText("O");
				player =1;
				has_won = game.add_piece(2,2,0,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Middle_Top_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Middle_Top_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Middle_Top_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Middle_Middle_Left:
			System.out.println(player);
			if(buttonText =="X"|| buttonText=="O"){
				
				//do notihng
			}else if(player==1){
				System.out.println("TEST");
				b.setText("X");
				has_won = game.add_piece(1, 0, 0, 1, 1);
				player=2;
			}else if(player==2){
				b.setText("O");
				player=1;
				has_won = game.add_piece(1,0,0,1,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Middle_Middle_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Middle_Middle_Right:
			if(buttonText =="X"|| buttonText=="O"){
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1, 2, 0, 1, 1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(1,2,0,1,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Middle_Bot_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Middle_Bot_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Middle_Bot_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Top_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Top_Middle:
			if(buttonText =="X"|| buttonText=="O"){
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 1, 0, 2, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0, 1, 0, 2, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Top_Right_Top_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Middle_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Middle_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Middle_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Bot_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Bot_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Top_Right_Bot_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
			/////////////////////////////////////////////////////
		case R.id.Middle_Left_Top_Left:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player = 2;
				has_won = game.add_piece(0,0,1,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(0,0,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Top_Middle:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0,1,1,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(0,1,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Top_Right:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0,2,1,0,1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,2,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Middle_Left:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player =2;
				has_won = game.add_piece(1,0,1,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(1,0,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Middle_Middle:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1,1,1,0,1);
			}else{
				b.setText("O");
				player =1;
				has_won = game.add_piece(1,1,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Middle_Right:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player =2;
				has_won = game.add_piece(1,2,1,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(1,2,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Bot_Left:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2,0,1,0,1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(2,0,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break; 
		case R.id.Middle_Left_Bot_Middle:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2,1,1,0,1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(2,1,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Left_Bot_Right:
			if(buttonText == "X" || buttonText =="O"){
				//do noting
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(2,2,1,0,1);
			}else{
				b.setText("O");
				player =1;
				has_won = game.add_piece(2,2,1,0,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Middle_Top_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Middle_Top_Middle:
			if(buttonText =="X"|| buttonText=="O"){
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 1, 1, 1, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0,1,0,1,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Middle_Top_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Middle_Middle_Left:
			System.out.println(player);
			if(buttonText =="X"|| buttonText=="O"){
				
				//do notihng
			}else if(player==1){
				System.out.println("TEST");
				b.setText("X");
				has_won = game.add_piece(1, 0, 1, 1, 1);
				player=2;
			}else if(player==2){
				b.setText("O");
				player=1;
				has_won = game.add_piece(1,0,1,1,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Middle_Middle_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Middle_Middle_Right:
			if(buttonText =="X"|| buttonText=="O"){
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(1, 2, 1, 1, 1);
			}else{
				b.setText("O");
				player = 1;
				has_won = game.add_piece(1,2,1,1,2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Middle_Bot_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Middle_Bot_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Middle_Bot_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Top_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Top_Middle:
			if(buttonText =="X"|| buttonText=="O"){
			}else if(player==1){
				b.setText("X");
				player=2;
				has_won = game.add_piece(0, 1, 1, 2, 1);
			}else{
				b.setText("O");
				player=1;
				has_won = game.add_piece(0, 1, 1, 2, 2);
			}
			if(has_won>0){
				b.setBackgroundColor(Color.RED);
			}
			break;
		case R.id.Middle_Right_Top_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Middle_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Middle_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Middle_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Bot_Left:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Bot_Middle:
			if(buttonText =="X"|| buttonText=="O"){
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
		case R.id.Middle_Right_Bot_Right:
			if(buttonText =="X"|| buttonText=="O"){
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
			////////////////////////////////////////////////////////////
			case R.id.Bot_Left_Top_Left:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player = 2;
					has_won = game.add_piece(0,0,2,0,1);
				}else{
					b.setText("O");
					player = 1;
					has_won = game.add_piece(0,0,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Left_Top_Middle:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0,1,2,0,1);
				}else{
					b.setText("O");
					player = 1;
					has_won = game.add_piece(0,1,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Left_Top_Right:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0,2,2,0,1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0,2,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Left_Middle_Left:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player =2;
					has_won = game.add_piece(1,0,2,0,1);
				}else{
					b.setText("O");
					player = 1;
					has_won = game.add_piece(1,0,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Left_Middle_Middle:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(1,1,2,0,1);
				}else{
					b.setText("O");
					player =1;
					has_won = game.add_piece(1,1,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				
				break;
			case R.id.Bot_Left_Middle_Right:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player =2;
					has_won = game.add_piece(1,2,2,0,1);
				}else{
					b.setText("O");
					player = 1;
					has_won = game.add_piece(1,2,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Left_Bot_Left:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2,0,2,0,1);
				}else{
					b.setText("O");
					player = 1;
					has_won = game.add_piece(2,0,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break; 
			case R.id.Bot_Left_Bot_Middle:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2,1,2,0,1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(2,1,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Left_Bot_Right:
				if(buttonText == "X" || buttonText =="O"){
					//do noting
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2,2,2,0,1);
				}else{
					b.setText("O");
					player =1;
					has_won = game.add_piece(2,2,2,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Middle_Top_Left:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Middle_Top_Middle:
				if(buttonText =="X"|| buttonText=="O"){
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0, 1,2, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0,1,2,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Middle_Top_Right:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Middle_Middle_Left:
				System.out.println(player);
				if(buttonText =="X"|| buttonText=="O"){
					
					//do notihng
				}else if(player==1){
					System.out.println("TEST");
					b.setText("X");
					has_won = game.add_piece(1, 0, 2, 1, 1);
					player=2;
				}else if(player==2){
					b.setText("O");
					player=1;
					has_won = game.add_piece(1,0,2,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Middle_Middle_Middle:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Middle_Middle_Right:
				if(buttonText =="X"|| buttonText=="O"){
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(1, 2, 2, 1, 1);
				}else{
					b.setText("O");
					player = 1;
					has_won = game.add_piece(1,2,2,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Middle_Bot_Left:
				if(buttonText =="X"|| buttonText=="O"){
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(2, 0,2, 1, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(2,0,2,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Middle_Bot_Middle:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Middle_Bot_Right:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Top_Left:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Top_Middle:
				if(buttonText =="X"|| buttonText=="O"){
				}else if(player==1){
					b.setText("X");
					player=2;
					has_won = game.add_piece(0, 1, 2, 2, 1);
				}else{
					b.setText("O");
					player=1;
					has_won = game.add_piece(0, 1, 2, 2, 2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
				}
				break;
			case R.id.Bot_Bot_Top_Right:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Middle_Left:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Middle_Middle:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Middle_Right:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Bot_Left:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Bot_Middle:
				if(buttonText =="X"|| buttonText=="O"){
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
			case R.id.Bot_Bot_Bot_Right:
				if(buttonText =="X"|| buttonText=="O"){
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
		}
	}
}
