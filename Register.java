package com.example.buildershelper;

import com.quitz.test.db.SQLiteHelper;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity implements OnClickListener {
	
	private SQLiteHelper SQLHelper;
	Button insert,delete;
	EditText name,username,password,email,mobile;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		SQLHelper = new SQLiteHelper(this);    
        name=(EditText)findViewById(R.id.editText2);
        username=(EditText)findViewById(R.id.EditText01);
        password=(EditText)findViewById(R.id.editText3);
        email=(EditText)findViewById(R.id.editText4);
        mobile=(EditText)findViewById(R.id.editText5);
        insert=(Button)findViewById(R.id.button1);
        
        
        insert.setOnClickListener(this);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.button1:
			
			 String j=name.getText().toString();
			 String k=username.getText().toString();
			 String l=password.getText().toString();
			 String m=email.getText().toString();
			 String n=mobile.getText().toString();
			if(j.equals(""))
			{
				Toast.makeText(this, "Enter name", 10).show();	
			}
			else if(k.equals(""))
			{
				Toast.makeText(this, "Enter username", 10).show();	
			}
			else if(l.equals(""))
			{
				Toast.makeText(this, "Enter Password", 10).show();		
			}
			else if(m.equals(""))
			{
				Toast.makeText(this, "Enter email", 10).show();		
			}
			else if(n.equals(""))
			{
				Toast.makeText(this, "Enter mobile", 10).show();		
			}
			else
			
			{
			
			
		if(SQLHelper.insertData(name.getText().toString(),username.getText().toString(),password.getText().toString(),email.getText().toString(),mobile.getText().toString())<0){
			
			Toast.makeText(this, "Failed Insert data", 10).show();
		}else{
			Intent i = new Intent(Register.this,
					Login.class);
			startActivity(i);
		Toast.makeText(this, "Successfully Inserted", 10).show();
		}
		}
		break;
		
		
	}
	}
}
