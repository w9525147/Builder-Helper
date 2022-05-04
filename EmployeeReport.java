package com.example.buildershelper;

import java.util.Calendar;



import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class EmployeeReport extends Activity implements OnClickListener {
	
	private SQLiteHelper SQLHelper;
	private Button details;
    private Integer mYear;
    private Integer mMonth;
    private Integer mDay;
    TextView ab,tv2,tv3,tv4;
  
   String dob=null;
   String dob1=null;
    String income1=null;
    String income2=null;
    String balancea=null;
    String balancea1=null;
   int a3=0,b3=0,b4=0,c3=0;
	
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_employee_report);
		
		SQLHelper = new SQLiteHelper(this);  
		ab=(TextView)findViewById(R.id.textView6);
		//tv1=(TextView)findViewById(R.id.textView8);
		tv2=(TextView)findViewById(R.id.textView13);
		/*tv3=(TextView)findViewById(R.id.TextView03);
		tv4=(TextView)findViewById(R.id.TextView05);*/
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
        dob=month+"-"+year;
        
        //dob1=date+"-"+month+"-"+year;
        
        
        
       ab.setText(dob);
        String income1=SQLHelper.selectincome(dob);
        //tv1.setText(income1); 
        
       /* tv3.setText(dob1);
        String income2=SQLHelper.selectincome(dob1);*/
       
        income1=SQLHelper.selectincome(dob);
		String[] datae=new String[]{};
		
		/* income2=SQLHelper.selectincome(dob1);
			String[] datae1=new String[]{};*/
		
	 balancea=SQLHelper.selectbal1();
	 
	//  balancea1 = SQLHelper.selectbal1();	
		
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
        
        /*b1=(Button)findViewById(R.id.Button01);
        details.setOnClickListener(this);*/
        
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.employee_report, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		/*case R.id.Button01:
			
			
			Intent i = new Intent(EmployeeReport.this,EmployeeReport.class);
			
			String income1=SQLHelper.selectincome(dob);
	       // tv1.setText(income1);        
	       
	        income1=SQLHelper.selectincome(dob);
			String[] datae=new String[]{};
			
		 balancea1=SQLHelper.selectbal1();
		 
			//int	a3=Integer.parseInt(income1);
			int	b3=Integer.parseInt(balancea1);
			int	c3=a3-b3;
				String absd=Integer.toString(c3);
			
			//tv1.setText(income1);
			tv4.setText(balancea1);
			//tv3.setText(absd);
			//tv4.setText(absd);
			startActivity(i);
			break;*/

		case R.id.button2:
			
			
			//Intent in = new Intent(EmployeeReport.this,EmployeeReport.class);
			
			String income1=SQLHelper.selectincome(dob);
	       // tv1.setText(income1);        
	       
	        income1=SQLHelper.selectincome(dob);
			String[] datae=new String[]{};
			
		 balancea=SQLHelper.selectincome(income1);
		 
			//int	a3=Integer.parseInt(income1);
			int	b4=Integer.parseInt(balancea);
			/*int	c3=a3-b3;
				String absd=Integer.toString(c3);*/
			
			//tv1.setText(income1);
			tv2.setText(balancea);
			//tv3.setText(absd);
			//tv4.setText(absd);
			//startActivity(in);
			break;
		
		}
	
	
	}
}
