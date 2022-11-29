package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent; 

import android.widget.TextView; 
import com.example.myapplication.R;
public class j extends Activity { 

TextView scode,ecode,rate,ot,taxx,gros,net;
 double p,h,gp,p1,oat,tax=0,np=0;
  String es,cs;
    @Override

    protected void onCreate(Bundle savedInstanceState) { 

        super.onCreate(savedInstanceState); 

        setContentView(R.layout.kk); 

  

    rate = (TextView)findViewById(R.id.pr); 
    ot = (TextView)findViewById(R.id.ot); 
ecode = (TextView)findViewById(R.id.ec); 
scode = (TextView)findViewById(R.id.sc); 
taxx = (TextView)findViewById(R.id.tax); 
gros = (TextView)findViewById(R.id.gp);
net= (TextView)findViewById(R.id.np); 

Intent intent=this.getIntent();
  p1 = intent.getDoubleExtra("p1",0.00);
 rate.setText(" "+p1);
 es=intent.getStringExtra("ecode");
 ecode.setText(""+es);
 cs=intent.getStringExtra("scode");
 scode.setText(""+cs);
  oat=intent.getDoubleExtra("ot",0.00);
 ot.setText(""+oat);
 gp=intent.getDoubleExtra("gp",0.00);
 gros.setText(""+gp);
 
 if(scode.getText().toString().equalsIgnoreCase("N")||scode.getText().toString().equalsIgnoreCase("n")){
   taxx.setText("7%");
   tax=gp*0.07;
   np=gp-tax;
   net.setText(""+np);
 }else if(scode.getText().toString().equalsIgnoreCase("P")||scode.getText().toString().equalsIgnoreCase("p")){
   taxx.setText("7%");
   tax=gp*0.045;
   np=gp-tax;
   net.setText(""+np);
 }
 else{
 taxx.setText("No Tax");
 net.setText(""+gp);
 }

    } 
}