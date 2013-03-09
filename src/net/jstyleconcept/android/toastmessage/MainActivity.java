package net.jstyleconcept.android.toastmessage;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	EditText editText;
	Button sendButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_mainactivity);
		editText=(EditText)findViewById(R.id.editText1);
		sendButton=(Button)findViewById(R.id.button1);
		sendButton.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this,editText.getText(),Toast.LENGTH_LONG).show();
				editText.setText("");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.layout_mainactivity,menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Intent intent=new Intent(MainActivity.this,SourceCodeActivity.class);
		switch(item.getOrder()) {
			case 0:
				startActivity(intent);
				break;
			case 1:
				finish();
				break;
		}
		return super.onOptionsItemSelected(item);
	}
}