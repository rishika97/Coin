package com.example.coin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class coin extends AppCompatActivity {
    Button flip;
    ImageView coin;
    Random r;
    int coinside;//0:heads and 1:tails
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);
        getSupportActionBar().setTitle("FLIP THE COIN");
        flip=findViewById(R.id.flip);
        coin=findViewById(R.id.coin);
        r=new Random();
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coinside=r.nextInt(2);
                if(coinside == 0)
                {
                    coin.setImageResource(R.drawable.head);
                    Toast.makeText(coin.this,"HEADS!!!",Toast.LENGTH_SHORT).show();
                }
                else if(coinside == 1)
                {
                    coin.setImageResource(R.drawable.tail);
                    Toast.makeText(coin.this,"TAILS!!!", Toast.LENGTH_SHORT).show();
                }
                RotateAnimation rt=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,
                        0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rt.setDuration(1000);
                coin.startAnimation(rt);
            }
        });
    }
}
