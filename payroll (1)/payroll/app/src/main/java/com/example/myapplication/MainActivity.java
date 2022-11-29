package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView; 
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
public class MainActivity extends Activity{
EditText pr,wh,ec,sc;
Button com;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
com=(Button)findViewById(R.id.compute);
pr=(EditText)findViewById(R.id.pr);
wh=(EditText)findViewById(R.id.wh);
ec=(EditText)findViewById(R.id.ec);
sc=(EditText)findViewById(R.id.sc);

com.setOnClickListener (new View.OnClickListener(){
   @Override
public void onClick(View v){
MainActivity2();
   }
   
   });
        
}
 public void MainActivity2(){          
  Intent intent=new Intent(this, j.class);
    double p=Double.parseDouble(pr.getText().toString());
double h=Double.parseDouble(wh.getText().toString());
String e=ec.getText().toString();
String s=sc.getText().toString();
double ot=40;
double ott=0,ottt=0;
double gp=0;
double p1=0;
double h1=40;
if(h>40){

ott=h-ot;
ottt=(1.5*p)*ott;
p1=p*h1;
gp=ottt+p1;
}else{
  p1=p*h1;
  gp=p1;
}
  
  intent.putExtra("hour",h);  
intent.putExtra("ecode",e);
intent.putExtra("p1",p1); 
intent.putExtra("gp",gp); 
  intent.putExtra("scode",s);
  intent.putExtra("ot",ottt);  
   startActivity(intent);
 }   }
