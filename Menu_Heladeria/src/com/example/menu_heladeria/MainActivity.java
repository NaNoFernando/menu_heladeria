package com.example.menu_heladeria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uno(View vista){
    	Intent pu=new Intent(this,uno.class);
    	startActivity(pu);
    }
    public void dos(View vista){
    	Intent pd=new Intent(this,dos.class);
    	startActivity(pd);
    }
    public void tres(View vista){
    	Intent pt=new Intent(this,tres.class);
    	startActivity(pt);
    }
    public void cuatro(View vista){
    	Intent pc=new Intent(this,cuatro.class);
    	startActivity(pc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
