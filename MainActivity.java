package com.example.buildershelper;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {
	private static int SPLASH_SCREEN_TIME = 1000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Handler().postDelayed(new Runnable() {

			public void run() {
				// This is method will be executed when SPLASH_SCREEN_TIME is
				// over, Now you can call your Home Screen
				Intent iHomeScreen = new Intent(getApplicationContext(),
						Login.class);
				startActivity(iHomeScreen);

				// Finish Current Splash Screen, as it should be visible only
				// once when application start
				finish();
			}

		}, SPLASH_SCREEN_TIME);
	}
}