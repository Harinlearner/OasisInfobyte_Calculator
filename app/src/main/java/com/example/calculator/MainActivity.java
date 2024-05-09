package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;



import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView show = (TextView) findViewById(R.id.t1);
        Button btn1 = (Button) findViewById(R.id.n1);
        Button btn2 = (Button) findViewById(R.id.n2);
        Button btn3 = (Button) findViewById(R.id.n3);
        Button btn4 = (Button) findViewById(R.id.n4);
        Button btn5 = (Button) findViewById(R.id.n5);
        Button btn6 = (Button) findViewById(R.id.n6);
        Button btn7 = (Button) findViewById(R.id.n7);
        Button btn8 = (Button) findViewById(R.id.n8);
        Button btn9 = (Button) findViewById(R.id.n9);
        Button btn0 = (Button) findViewById(R.id.n0);
        Button btnc = (Button) findViewById(R.id.clear);
        Button btndot = (Button) findViewById(R.id.dot);
        Button btna = (Button) findViewById(R.id.add);
        Button btns = (Button) findViewById(R.id.sub);
        Button btnd = (Button) findViewById(R.id.div);
        Button btnm = (Button) findViewById(R.id.mul);
        Button btne = (Button) findViewById(R.id.res);
        Button btnmo = (Button) findViewById(R.id.mod);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(1,show);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(2,show);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(3,show);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(4,show);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(5,show);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(6,show);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(7,show);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(8,show);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(9,show);
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(0,show);
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(10,show);
            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(11,show);
            }
        });

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(12,show);
            }
        });

        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(13,show);
            }
        });

        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(14,show);
            }
        });

        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(15,show);
            }
        });

        btnmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(16,show);
            }
        });
        WebView webView1 = new WebView(this);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eval(show,webView1);
            }
        });
    }
    static String s="";
    @SuppressLint("SetJavaScriptEnabled")
    public static void eval(TextView show, WebView webView1)
    {
            webView1.getSettings().setJavaScriptEnabled(true);
            webView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageFinished(WebView view, String url) {
                    webView1.evaluateJavascript("javascript:(" + s + ")", value -> {
                        if (value != null) {
                            show.setText(value + " ");
                        }
                    });
                }
            });
            webView1.loadData("", "text/html", null);
    }

    public static void calculator(int k,TextView show) {
        switch (k) {
            case 1:
                s += "1";
                break;
            case 2:
                s += "2";
                break;
            case 3:
                s += "3";
                break;
            case 4:
                s += "4";
                break;
            case 5:
                s += "5";
                break;
            case 6:
                s += "6";
                break;
            case 7:
                s += "7";
                break;
            case 8:
                s += "8";
                break;
            case 9:
                s += "9";
                break;
            case 0:
                s += "0";
                break;
            case 10:
                s="";
                show.setText("");
                break;
            case 11:
                s += ".";
                break;
            case 12:
                s += "+";
                break;
            case 13:
                s += "-";
                break;
            case 14:
                s += "*";
                break;
            case 15:
                s += "/";
                break;
            case 16:
                s += "%";
                break;

        }
        show.setText(s);

    }
}
