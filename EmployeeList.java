package com.example.buildershelper;

import java.util.ArrayList;


import com.quitz.test.db.DBAdapter1;
import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class EmployeeList extends Activity {
	
	
	
	Button b;
	EditText no;
	TextView t1,t2,t3,t4,t5;
	 String h=null;
	 
	 SQLiteHelper sq;
	 
	
	
	String vn = null;
	String mn = null;
	String slot = null;
	String pf = null;
	String vt = null;
	String dt = null;
	String tm = null;
	
	SQLiteHelper db;
	// TextView tv;
	Button b1, b2;

	ListView listView;
	Adapter adapter;


	
	
	
	ArrayList<String> msgList;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_employee_list);
		
		sq=new SQLiteHelper(this);		
db=new SQLiteHelper(this);
		
b=(Button)findViewById(R.id.button1);

no=(EditText) findViewById(R.id.editText1);
t1=(TextView)findViewById(R.id.TextView01);
t2=(TextView)findViewById(R.id.TextView03);
t3=(TextView)findViewById(R.id.TextView05);
t4=(TextView)findViewById(R.id.TextView07);
t5=(TextView)findViewById(R.id.TextView09);

b.setOnClickListener(new View.OnClickListener() {
	
	
	
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		
		
		
		String eid=no.getText().toString();
		String loca1=no.getText().toString();
		String loca2=no.getText().toString();
		String loca3=no.getText().toString();
		String loca4=no.getText().toString();
		String loca5=no.getText().toString();
		String loca6=no.getText().toString();
		
		
	
		String  r=sq.getkey(eid);
		String  r1=sq.getkey1(loca1);
		String  r2=sq.getkey2(loca2);
		String  r3=sq.getkey3(loca3);
		String  r4=sq.getkey4(loca4);
		String  r5=sq.getkey5(loca5);
		String  r6=sq.getkey6(loca6);
		
		
		t1.setText(r);
		t2.setText(r1);
		t3.setText(r2);
		t4.setText(r3);
		t5.setText(r4);
		
	
	}
});
		
		msgList = new ArrayList<String>();

		listView = (ListView) findViewById(R.id.listView);

		db = new SQLiteHelper(this);

		//b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);

		final DBAdapter1 db = new DBAdapter1(EmployeeList.this);

		db.open();
		Cursor c = db.getAllContacts();
		if (c.moveToFirst()) {
			do {
				DisplayContact(c);
			} while (c.moveToNext());
		}
		db.close();

	/*	b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				 Intent in = new Intent(EmployeeList.this, EmployeeList.class);
				
				 startActivity(in);

			}

		});*/

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				adapter = new ArrayAdapter<String>(EmployeeList.this,
						android.R.layout.simple_list_item_1, msgList);
				listView.setAdapter((ListAdapter) adapter);

			}
		});

	}

	private void DisplayContact(Cursor c) {
		// TODO Auto-generated method stub

		msgList.add(c.getString(0));

		// Toast.makeText(
		// getBaseContext(),
		// "Name " + c.getString(0) + "\n" + "Msg: "
		// + c.getString(1) + "\n", Toast.LENGTH_LONG)
		// .show();

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.employee_list, menu);
		return true;
	}

}
