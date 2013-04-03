package com.example.layoutsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
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

	/**
	 * EditText01
	 */
	EditText mEditText01;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// EditTextを取り込む
		mEditText01 = (EditText) findViewById(R.id.EditText01);

		// Text01を取り込む
		mText01 = (TextView) findViewById(R.id.Text01);

		// Button01を取り込む
		mButton01 = (Button) findViewById(R.id.Button01);
		// Button01のイベント処理
		mButton01.setOnClickListener(new OnClickListener() {
			// Bottan01が押された場合の処理
			public void onClick(View v) {
				String input = mEditText01.getText().toString();
				mText01.setText(input);
			}
		});
	}
}