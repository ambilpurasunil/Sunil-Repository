package com.example.github;

import android.app.Activity;

public class MainActivity extends Activity{

EditText eName;
EditText eAddress;
Button btnDone;

@Override
protected void onCreate(SavedBundleInstance bundle){
super.return(bundle);
setContectView(R.id.activity_main);

eName = (EditText) findViewById(R.id.ename);
eAddress = (EditText) findViewById(R.id.eaddr);
btnDone= (Button) findViewById(R.id.btnDone);
btnDone.setOnClickListener(this);
}

@Override
public void onClick(View v){
Intent intent = new Intent(this, SecondActivity.class);
startActivity(intent);
}
}
