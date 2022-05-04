package com.example.buildershelper;

import java.util.ArrayList;


import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class AttendanceReport extends Activity implements OnClickListener {
	
	Button submit;
	private SQLiteHelper SQLHelper;
	private int spinner1,spinner2,spinner3;
	String si,sk,sl;
	ListView lv ;
	ArrayList<String[]> DATA = new ArrayList<String[]>();
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attendance_report);
		submit=(Button)findViewById(R.id.button1);
		submit.setOnClickListener(this);
		SQLHelper = new SQLiteHelper(this);  
		
		
		 lv = (ListView) findViewById(R.id.listView1);
		 
		 
			String[] s2 = new String[] { "1", "2", "3", "4",
			"5", "6", "7", "8", "9", "10", "11", "12" ,"13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24" ,"25", "26", "27", "28", "29", "30" , "31"};
		 
		String[] s = new String[] { "1", "2", "3", "4",
		"5", "6", "7", "8", "9", "10", "11", "12" };
		String[] s1 = new String[] {  "2015","2016", "2017", "2018","2019", "2020", "2021","2022", "2023", "2024", "2025"};
final Spinner sp1 = (Spinner) findViewById(R.id.spinner1);	
final Spinner sp2 = (Spinner) findViewById(R.id.spinner2);	
final Spinner sp3 = (Spinner) findViewById(R.id.Spinner01);		
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, s);
sp1.setAdapter(adapter);
ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, s1);
sp2.setAdapter(adapter1);

ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, s2);
sp3.setAdapter(adapter2);

sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
		si=sp1.getSelectedItem().toString();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	
	}
});


sp2.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		sk=sp2.getSelectedItem().toString();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
});

sp3.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		sl=sp3.getSelectedItem().toString();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
});



	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		
		
		case R.id.button1:
			
			
			String smf=sl+"-"+si+"-"+sk;
			Toast.makeText(this, smf, 10).show();	
			DATA=SQLHelper.selectalldatabase(smf);
		     if(!DATA.isEmpty())
		    	 lv.setAdapter(new MyCustomBaseAdapter(this, DATA));
			break;
		}
	}
	
	
	
}
