package com.example.lificicledemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//R.layout.activity_main
		Log.i("MainActivity", "OnCreate LifeCicle");
		
		setContentView(R.layout.activity_first);
		
		EditText editText = (EditText) findViewById(R.id.edit_text_lificicle); 
		
		editText.setText("Ola Mundo");
		
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.i("MainActivity", "OnStart LifeCicle");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		Log.i("MainActivity", "OnResume LifeCicle");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		
		Log.i("MainActivity", "OnPause LifeCicle");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		
		Log.i("MainActivity", "OnStop LifeCicle");
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		Log.i("MainActivity", "OnDestroy LifeCicle");
	}



}
