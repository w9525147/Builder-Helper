package com.example.buildershelper;


import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ERegister extends Activity {
	
	SQLiteHelper sq;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_eregister);
		
		sq=new SQLiteHelper(this);

		final EditText e1=(EditText)findViewById(R.id.editText1);
		final EditText e2=(EditText)findViewById(R.id.EditText01);
		final EditText e3=(EditText)findViewById(R.id.EditText02);
		final EditText e4=(EditText)findViewById(R.id.EditText03);
		final EditText e5=(EditText)findViewById(R.id.EditText04);
		
		Button b=(Button)findViewById(R.id.button1);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				
				String ename=e1.getText().toString();
				String eid=e2.getText().toString();
				String eage=e3.getText().toString();
				String ect=e4.getText().toString();
				String ewag=e5.getText().toString();
			
				

				String r=sq.insertData6(ename, eid, eage, ect, ewag);
				/*Intent i=new Intent(ERegister.this,Login.class);
				startActivity(i);
				
				*/
				
				if (ename.length() != 0 && eid.length() != 0
						&& eage.length() != 0 && ect.length() != 0
						&& ewag.length() != 0)
				{
					Intent in=new Intent(ERegister.this,Home.class);
					startActivity(in);
					
					Toast.makeText(getApplicationContext(), "Registerd Successfully",Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Please fill the feilds",Toast.LENGTH_SHORT).show();
				}
					
			
				
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.eregister, menu);
		return true;
	}

}
