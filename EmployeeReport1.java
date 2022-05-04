package com.example.buildershelper;

import java.util.ArrayList;
import java.util.Calendar;

import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class EmployeeReport1 extends Activity implements OnClickListener  {

	private SQLiteHelper SQLHelper;
	private Button login,details;
  /*  private Integer mYear;
    private Integer mMonth;
    private Integer mDay;*/
    TextView ab,tv2;
    private int spinner1,spinner2,spinner3;
    
   String dob=null;
    String income1=null;
    String balancea1=null;
   int a3=0,b3=0,c3=0;
   
   String sk="";
   String sk1=""; String sk2="";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_employee_report1);
		
		SQLHelper = new SQLiteHelper(this);  
		
		
		String[] s2 = new String[] { "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "10", "11", "12" ,"13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24" ,"25", "26", "27", "28", "29", "30" , "31"};
			 
			String[] s = new String[] { "1", "2", "3", "4",
			"5", "6", "7", "8", "9", "10", "11", "12" };
			String[] s1 = new String[] {  "2015","2016", "2017", "2018","2019", "2020", "2021","2022", "2023", "2024", "2025"};
	
			final Spinner sp1 = (Spinner) findViewById(R.id.spinner1);	
	final Spinner sp2 = (Spinner) findViewById(R.id.spinner2);	
	final Spinner sp3 = (Spinner) findViewById(R.id.spinner3);		
		ab=(TextView)findViewById(R.id.textView6);
		//tv1=(TextView)findViewById(R.id.textView8);
		tv2=(TextView)findViewById(R.id.textView13);
		//tv3=(TextView)findViewById(R.id.textView14);
		//tv4=(TextView)findViewById(R.id.textView9);
		
		/*details=(Button)findViewById(R.id.button2);
		details.setOnClickListener(this);
		*/
		
		
		
		
	/*	final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
       
        int a=mMonth+1;
        int b=mDay;
        int c1=mYear;
        String month=Integer.toString(a);
        String date=Integer.toString(b);
        String year=Integer.toString(c1);
	 String dob = date+"-"+month+"-"+year;*/
	
	
	
	
	
        
        
        
       ab.setText(dob);
        String income1=SQLHelper.selectincome(dob);
      //  tv1.setText(income1);        
       
        income1=SQLHelper.selectincome(dob);
		String[] datae=new String[]{};
		
	 balancea1=SQLHelper.selectbal1();	
		
	/*int	a3=Integer.parseInt(income1);
	int	b3=Integer.parseInt(balancea);
	int	c3=a3-b3;
		String absd=Integer.toString(c3);*/
		
		/*tv1.setText(income1);
		tv2.setText(balancea);
		tv3.setText(absd);
		tv4.setText(absd);*/
		/*login=(Button)findViewById(R.id.button1);
        login.setOnClickListener(this);*/
        
        details=(Button)findViewById(R.id.button2);
        details.setOnClickListener(this);
        
        
       /*s.setOnItemSelectedListener(new OnItemSelectedListener() {

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
  */
		sp1.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			
			@Override
        	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
        			long arg3) {
        		// TODO Auto-generated method stub
        		sk=sp2.getSelectedItem().toString();
        		
        		Log.d("++++++++++++++++++++++++++++++++++++++++++++=",sk);
        		System.out.println(sk);
        	}

        	@Override
        	public void onNothingSelected(AdapterView<?> arg0) {
        		// TODO Auto-generated method stub
        		
        	}
			
		});
		
		
		sp2.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			
			@Override
        	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
        			long arg3) {
        		// TODO Auto-generated method stub
        		sk1=sp2.getSelectedItem().toString();
        		
        		Log.d("++++++++++++++++++++++++++++++++++++++++++++=",sk);
        		System.out.println(sk);
        	}

        	@Override
        	public void onNothingSelected(AdapterView<?> arg0) {
        		// TODO Auto-generated method stub
        		
        	}
			
		});
		sp3.setOnItemSelectedListener(new OnItemSelectedListener()
		{
			
			@Override
        	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
        			long arg3) {
        		// TODO Auto-generated method stub
        		sk2=sp2.getSelectedItem().toString();
        		
        		Log.d("++++++++++++++++++++++++++++++++++++++++++++=",sk);
        		System.out.println(sk);
        	}

        	@Override
        	public void onNothingSelected(AdapterView<?> arg0) {
        		// TODO Auto-generated method stub
        		
        	}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.employee_report1, menu);
		return true;
	}
	
	
	public void onClick(View v) {
		switch(v.getId())
		{
		/*case R.id.button1:
			
			Intent i = new Intent(EmployeeReport.this,
					EmployeeReport.class);
			startActivity(i);
			break;*/	 

		case R.id.button2:
			
			//Toast.makeText(this, dob, 10).show();
			//Intent in = new Intent(EmployeeReport1.this,EmployeeReport1.class);
			
			
			

			
		    	// lv.setAdapter(new MyCustomBaseAdapter(this, DATA));
			
			/*String income1=SQLHelper.selectincome(dob);
	       // tv1.setText(income1);        
	       
	        income1=SQLHelper.selectincome(dob);
			String[] datae=new String[]{};
			*/
		 balancea1=SQLHelper.selectbal1();
		 
			//int	a3=Integer.parseInt(income1);
			int	b3=Integer.parseInt(balancea1);
			/*int	c3=a3-b3;
				String absd=Integer.toString(c3);*/
			
			//tv1.setText(income1);
			tv2.setText(balancea1);
			//tv3.setText(absd);
			//tv4.setText(absd);
			//startActivity(in);
			break;
		
		}
	
	
	}
}



