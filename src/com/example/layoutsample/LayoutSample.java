package com.example.layoutsample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LayoutSample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button mButton01 = (Button)findViewById(R.id.Button01);
		// Button01のイベント処理
		mButton01.setOnClickListener(new View.OnClickListener() {
			// Button01が押された場合の処理
			public void onClick(View v) {
				Toast.makeText(LayoutSample.this, "Button01が押されました。", Toast.LENGTH_SHORT).show();

			}
		});
	}
}
