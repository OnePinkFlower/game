package com.example.game;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {

	public Card(Context context) {
		super(context);
	
		 lab = new TextView(getContext());
		lab.setTextSize(32);
		lab.setBackgroundColor(0x33ffffff);
		lab.setGravity(Gravity.CENTER);
		LayoutParams lp = new LayoutParams(-1,-1);
		lp.setMargins(10, 10, 0, 0);
		addView(lab,lp);
		
		setNum(0);
	}

	private int num = 0;
	public int getNum(){
		return num;
	}
	
	public void setNum(int num){
		this.num = num;
		if(num<=0){
			lab.setText("");
		}else{
			lab.setText(num+"");
		}
	}
	public boolean equals(Card o){
		return getNum()==o.getNum();
	}
	
private TextView lab;
}

