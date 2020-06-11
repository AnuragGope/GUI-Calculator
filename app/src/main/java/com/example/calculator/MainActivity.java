package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button ac,del,per,div,n7,n8,n9,n0,n1,n2,n3,n4,n5,n6,mul,add,sub,eql,dot,pi;
    public TextView tv1,tv2,tv3,tv4;
    public String a1,b1,c;
    String str="",str2=null,str3="",value,result="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ac=findViewById(R.id.button12);
        del=findViewById(R.id.button13);
        per=findViewById(R.id.button14);
        div=findViewById(R.id.button15);
        n7=findViewById(R.id.button17);
        n8=findViewById(R.id.button18);
        n9=findViewById(R.id.button19);
        mul=findViewById(R.id.button20);
        n4=findViewById(R.id.button22);
        n5=findViewById(R.id.button23);
        n6=findViewById(R.id.button24);
        sub=findViewById(R.id.button25);
        n1=findViewById(R.id.button27);
        n2=findViewById(R.id.button28);
        n3=findViewById(R.id.button29);
        add=findViewById(R.id.button30);
        pi=findViewById(R.id.button32);
        n0=findViewById(R.id.button33);
        dot=findViewById(R.id.button34);
        eql=findViewById(R.id.button35);
        tv1=findViewById(R.id.textView1);
        tv2=findViewById(R.id.textView2);
        tv3=findViewById(R.id.textView3);
        tv4=findViewById(R.id.textView4);

        getSupportActionBar().setTitle("GUI Calculator");

       n0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(str2==null ) {
                   str = str + "0";
                   tv1.setText(str);
               }
               if(str2!=null){
                   str3=str3+"0";
                   tv3.setText(str3);
               }
           }
       });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "1";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"1";
                    tv3.setText(str3);
                }
            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "2";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"2";
                    tv3.setText(str3);
                }
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "3";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"3";
                    tv3.setText(str3);
                }
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "4";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"4";
                    tv3.setText(str3);
                }
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "5";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"5";
                    tv3.setText(str3);
                }
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "6";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"6";
                    tv3.setText(str3);
                }
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "7";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"7";
                    tv3.setText(str3);
                }
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "8";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"8";
                    tv3.setText(str3);
                }
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = str + "9";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+"9";
                    tv3.setText(str3);
                }
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(str2==null) {
                    str = "3.141592653589";
                    tv1.setText(str);
                }
                if(str2!=null){
                    str3="3.141592653589";
                    tv3.setText(str3);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2="X";
                tv2.setText(str2);
                if(result!=""){
                    str=result;
                    tv1.setText(str);
                    str2="X";
                    tv2.setText(str2);
                    str3="";
                    tv3.setText(str3);
                    tv4.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2="/";
                tv2.setText(str2);
                if(result!=""){
                    str=result;
                    tv1.setText(str);
                    str2="/";
                    tv2.setText(str2);
                    str3="";
                    tv3.setText(str3);
                    tv4.setText("");
                }

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2="+";
                tv2.setText(str2);
                if(result!=""){
                    str=result;
                    tv1.setText(str);
                    str2="+";
                    tv2.setText(str2);
                    str3="";
                    tv3.setText(str3);
                    tv4.setText("");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2="-";
                tv2.setText(str2);
                if(result!=""){
                    str=result;
                    tv1.setText(str);
                    str2="-";
                    tv2.setText(str2);
                    str3="";
                    tv3.setText(str3);
                    tv4.setText("");
                }

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str2==null){
                str=str+".";
                tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3+".";
                    tv3.setText(str3);
                }

            }
        });
        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2="out of";
                tv2.setText(str2);
            }
        });


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 str="";
                 tv1.setText(str);
                 str2=null;
                 tv2.setText(str2);
                 str3="";
                 tv3.setText(str3);
                 tv4.setText("0");
                 result="";
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str2==null){
                   str=str.substring(0,str.length()-1);
                   tv1.setText(str);
                }
                if(str2!=null){
                    str3=str3.substring(0,str3.length()-1);
                    tv3.setText(str3);
                }

            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1= Double.parseDouble(str);
                double num2= Double.parseDouble(str3);
                double res=0;
                if(str2.equals("+")){
                    res=num1+num2;
                    result=String.valueOf(res);
                }
                if(str2.equals("-")){
                    res=num1-num2;
                    result=String.valueOf(res);
                }
                if(str2.equals("X")){
                    res=num1*num2;
                    result=String.valueOf(res);
                }
                if(str2.equals("/")){
                    res=num1/num2;
                    result=String.valueOf(res);
                }
                if(str2.equals("out of")){
                    res=(num1/num2)*100;
                    result=String.valueOf(res+"%");
                }
                tv4.setText(result);
            }
        });


    }
}
