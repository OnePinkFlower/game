package com.example.game;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {
	public MainActivity(){
		mainActivity=this;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvScore=(TextView) findViewById(R.id.tvScore);	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void clearScore(){
		Score=0;
		showScore();
	}
	public void showScore(){
		tvScore.setText(Score+"");
	}
	public void addScore(int s){
		Score+=s;
		showScore();
	}
	private int Score = 0;
	private TextView tvScore;
	private static MainActivity mainActivity =null;
	public static MainActivity getMainActivity(){
		return mainActivity;
	}
}
