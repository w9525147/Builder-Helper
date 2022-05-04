package com.example.buildershelper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class gituhub
		EAttendance1 extends Activity {
	
	SQLiteHelper sq;
	Button b,b1,b2;
	EditText no;
	TextView t1,t2,t3,t4,t5,t6,t7;
	 String h=null;
	 private Integer mYear;
	    private Integer mMonth;
	    private Integer mDay;
	    
	    String dob=null;
		 String dob1=null;
		 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eattendance1);
		
		
		
sq=new SQLiteHelper(this);
		
		b=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.Button01);
		b2=(Button)findViewById(R.id.button2);
		 no=(EditText) findViewById(R.id.editText1);
		t1=(TextView)findViewById(R.id.TextView01);
		t2=(TextView)findViewById(R.id.TextView03);
		t3=(TextView)findViewById(R.id.TextView05);
		t4=(TextView)findViewById(R.id.TextView07);
		t5=(TextView)findViewById(R.id.TextView09);
		t6=(TextView)findViewById(R.id.TextView11);
		t7=(TextView)findViewById(R.id.TextView13);
		
		
		
		
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
				t6.setText(r5);
				t7.setText(r6);

			
			
				

				final Calendar c = Calendar.getInstance();
		        mYear = c.get(Calendar.YEAR);
		        mMonth = c.get(Calendar.MONTH);
		        mDay = c.get(Calendar.DAY_OF_MONTH);
		       
		        int a=mMonth+1;
		        int b=mDay;
		        int c1=mYear;
		        String month=Integer.toString(a);
		        String date=Integer.toString(b);
		        String year=Integer.toString(c1);
			 String dob = date+"-"+month+"-"+year;
			
		       
		        String dob1=year+"-"+month;
				
		        t7.setText(dob);
		        t3.setText(dob1);
		        
		        

		        Calendar c2 = Calendar.getInstance();
				SimpleDateFormat sdf1 = new SimpleDateFormat(" h:m:s a");
				sdf1.setTimeZone(TimeZone.getTimeZone("GMT+5:30"));
				String strdate1 = sdf1.format(c2.getTime());
				
				
				t6.setText(strdate1);
				
				
			
					}
				});
		
		
	
		
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
		
				
			/*	String content="Parking Slot  :"+r+"\n"+"Date          :"+h+"\n"+"Vehicle No    :"+a+"\n"+"Time          :"+f+"\n"+"Vehicles Type :"+e+"\n"+"Parking Fare  :"+d+"\n"+"Mobile No     :"+b;
		final String name1=a+"pass";
	*/

	/*try { 
	       
	       byte[] content = null;
		final String TESTSTRING = new String(content);
           
	       String name1 = null;
		FileOutputStream fOut = openFileOutput(name1,
	                                                            MODE_WORLD_READABLE);
	       OutputStreamWriter osw = new OutputStreamWriter(fOut); 

	       // Write the string to the file
	       osw.write(TESTSTRING);

	        ensure that everything is
	        * really written out and close 
	       osw.flush();
	       osw.close();
	   	Log.d(r,"aaaaaaaaaaaaaaaaaaaaaa");
		
		int r=sq.insertData13( r1, r1, r2, r3, r4, r5, r6);

		Toast.makeText(getApplicationContext(), "Values Insertrd",Toast.LENGTH_SHORT).show();
	
	}
	catch (IOException ioe) 
    {
		ioe.printStackTrace();}
    }
	
				
				*/
				String datee=t1.getText().toString();
				String meterial=t2.getText().toString();
				String qty=t3.getText().toString();
				String amount=t4.getText().toString();
				String receivedfrom=t5.getText().toString();
				String time=t6.getText().toString();
				String monthyear=t7.getText().toString();
				
				
				String r2=sq.insertData1(datee,meterial,qty,amount,receivedfrom,time,monthyear);
				
				Toast.makeText(getApplicationContext(), "Attendance Marked ",Toast.LENGTH_SHORT).show();
				
			
				Intent in=new Intent(EAttendance1.this,Home.class);
				startActivity(in);
			
			
			}
			
				
			
		});
		
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eattendance1, menu);
		return true;
	}

}
