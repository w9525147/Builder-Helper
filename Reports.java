package com.example.buildershelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Reports extends Activity {
	
	
	Button B1,B2,B3,B5,B6;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reports);
		
		
		
		B1=(Button)findViewById(R.id.button1);
		B2=(Button) findViewById(R.id.Button01);
		B3=(Button)findViewById(R.id.Button02);
		//B4=(Button)findViewById(R.id.button2);
		B5=(Button)findViewById(R.id.Button04);
		B6=(Button)findViewById(R.id.Button03);
		
		
		B1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Reports.this,AttendanceReport.class);
				startActivity(in);
				
			}
		});
		
		B2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent in=new Intent(Reports.this,PurchaseReport.class);
				startActivity(in);
				
			}
		});
		
		B3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Reports.this,EmployeeList.class);
				startActivity(in);
				
			}
		});
	/*	
		B4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Reports.this,EmployeeReport.class);
				startActivity(in);
				
				
				
			}
		});
		*/
B5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent in=new Intent(Reports.this,EmployeeDetails.class);
				startActivity(in);
				
				
				
			}
		});

B6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		Intent in=new Intent(Reports.this,EDetailsReport.class);
		startActivity(in);
		
		
	}
});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reports, menu);
		return true;
	}

}
