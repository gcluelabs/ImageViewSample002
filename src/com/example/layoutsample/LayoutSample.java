package com.example.layoutsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LayoutSample extends Activity {
	/**
	 * Text01
	 */
	TextView mText01;
	
	/**
	 * Button01
	 */
	Button mButton01;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Text01を取り込む
		mText01 = (TextView)findViewById(R.id.Text01);
		
		// Button01を取り込む
		mButton01 = (Button)findViewById(R.id.Button01);
		// Button01のイベント処理
		mButton01.setOnClickListener(new View.OnClickListener() {
			// Bottan01が押された場合の処理
			public void onClick(View v) {
				mText01.setText("Button01が押されました。");
			}
		});
	}
}
