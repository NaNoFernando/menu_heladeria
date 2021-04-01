package com.example.menu_heladeria;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class cuatro extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro);
        AssetManager pam=getAssets();
        InputStream f=null;
        try{
        	f=pam.open("recetas3.txt");
        	String res=cargarArchivo(f);
        	
        	mostrarIngredientes(res);
        	mostrarPreparacion(res);
        }
        catch(IOException e){
        	Toast.makeText(this, e.getMessage(),1).show();
        }
    }
    public void salir(View vista){
    	Intent pu=new Intent(this,MainActivity.class);
    	startActivity(pu);
    }
    public void mostrarIngredientes(String a){
    	TextView b=(TextView)findViewById(R.id.txtIngredientes);
    	String [] vectorTexto=a.split("_");
    	b.setText(vectorTexto[10]);
    }
    public void mostrarPreparacion(String a){
    	TextView b=(TextView)findViewById(R.id.txtPreparacion);
    	String [] vectorTexto=a.split("_");
    	b.setText(vectorTexto[11]);
    }
    public String cargarArchivo(InputStream a) throws IOException{
    	
    	ByteArrayOutputStream vdatos=new ByteArrayOutputStream();
    	byte[] vbyte=new byte[1024];//leera bloque por bloque cada 1024 bytes, o puede ser 512 bytes
    	int largo=0;
    	while((largo=a.read(vbyte))>0){//del puntero "a" estara leyendo de 1024 bytes en 1024 bytes
    		vdatos.write(vbyte,0,largo);
    		
    	}
    	return new String(vdatos.toByteArray());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
