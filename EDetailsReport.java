package com.example.buildershelper;

import java.util.ArrayList;


import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class EDetailsReport extends Activity implements OnClickListener {
	
	
	Button submit;
	private SQLiteHelper SQLHelper;
	//private int spinner1,spinner2;
	
	
	String si,sk;
	ListView lv ;
	ArrayList<String[]> DATA = new ArrayList<String[]>();
	
	EditText ed1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edetails_report);
		submit=(Button)findViewById(R.id.button1);
		submit.setOnClickListener(this);
		
		ed1=(EditText) findViewById(R.id.editText1);
		
		/*String name=ed1.getText().toString();
		
		Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();*/
		
		SQLHelper = new SQLiteHelper(this);  
		
		
		 lv = (ListView) findViewById(R.id.listView1);
		 
		 
		 
		/*String[] s = new String[] { "ravi", "mohan", "lijith" };
		
final Spinner sp1 = (Spinner) findViewById(R.id.spinner1);	
	
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, s);
sp1.setAdapter(adapter);

sp1.setOnItemSelectedListener(new OnItemSelectedListener() {

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		
		sk=sp1.getSelectedItem().toString();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	
	}
});



*/

	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
		
		
		case R.id.button1:
			String sk=ed1.getText().toString();
			
			Toast.makeText(getApplicationContext(),sk,Toast.LENGTH_SHORT).show();
			
			String smf=sk;
			
			//Toast.makeText(this, smf, 10).show();	
			DATA=SQLHelper.selectalldatabase2(smf);
		     if(!DATA.isEmpty())
		    	 lv.setAdapter(new MyCustomBaseAdapter3(this, DATA));
			break;
		}
	}
	
	
	
}
