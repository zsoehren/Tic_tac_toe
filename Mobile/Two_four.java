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

public class Two_four extends ActionBarActivity {
	Board_2d game = new Board_2d(4);
	int cat_check = 0;
	int size =4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two_four);
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.two_four, menu);
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
			View rootView = inflater.inflate(R.layout.fragment_two_four,
					container, false);
			return rootView;
		}
	}
	boolean Turn = true;
	
	int has_won = 0;
	public void back(View view){
		Intent res = new Intent(this,MainActivity.class);
		startActivity(res);
	}
	public void Assign(View view){
		cat_check++;
		Button r = (Button)findViewById(R.id.reset);
		Button b = (Button)view;
		String buttonText = b.getText().toString();
		switch(view.getId()){
			case R.id.Upper_Left:
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
					r.setVisibility(View.VISIBLE);;
				}
				
				break;
			case R.id.Upper_LM:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.Upper_RM:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.Upper_Right:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(0,3,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(0,3,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.UM_Left:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.UM_LM:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.UM_RM:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.UM_Right:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(1,3,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(1,3,1);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			//here here here
				
			case R.id.LM_Left:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.LM_LM:
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
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.LM_RM:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(2,2,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(2,2,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.LM_Right:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(2, 3, 1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(2,3,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.Bottom_left:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(3,0,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(3,0,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.Bottom_LM:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(3,1,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(3,1,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.Bottom_RM:
				if(buttonText =="X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(3,2,1);
				}else{
					b.setText("O");
					Turn = true;
					has_won = game.add_piece(3,2,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
				}
				break;
			case R.id.Bottom_Right:
				if(buttonText == "X" || buttonText =="O"){
					//do nothing
				}else if(Turn){
					b.setText("X");
					Turn = false;
					has_won = game.add_piece(3, 3, 1);
					}else{
					b.setText("O");
					Turn = true;					
					has_won = game.add_piece(3,3,2);
				}
				if(has_won>0){
					b.setBackgroundColor(Color.RED);
					r.setVisibility(View.VISIBLE);
					
				}
				break;
		}
		if(cat_check==(size*size)){
			r.setVisibility(View.VISIBLE);
		}
	}
}
