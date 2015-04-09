package com.jash.viewanim;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = ((ImageView) findViewById(R.id.imageView));
        findViewById(R.id.button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //3.1以上使用
//        ViewPropertyAnimator animate = image.animate();
        //3.1以下使用
//        ViewPropertyAnimatorCompat animate1 = ViewCompat.animate(image);
//        animate1.rotationBy(3600);
//        animate1.rotationXBy(3600);
//        animate1.rotationYBy(3600);
////        animate1.translationXBy(100);
//        animate1.setInterpolator(new Interpolator() {
//            /**
//             *
//             * @param v 0~1线性增长
//             * @return 0~1 增长规率自己定义
//             */
//            @Override
//            public float getInterpolation(float v) {
//                return (float) Math.pow(v, 3);
//            }
//        });
//        animate1.setDuration(10000);
//        animate1.setListener(new ViewPropertyAnimatorListener() {
//            @Override
//            public void onAnimationStart(View view) {
//                Toast.makeText(MainActivity.this, "动画开始", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAnimationEnd(View view) {
//                Toast.makeText(MainActivity.this, "动画完成", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onAnimationCancel(View view) {
//
//            }
//        });
//        animate1.start();
        ViewCompat.animate(image).scaleY(2).scaleX(2).setDuration(1000).start();
    }
}
