package com.mine.petpix;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	
	ImageView pet;
	Button cat;
	Drawable cat1, cat2;
	boolean toggle = true;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        pet = (ImageView) findViewById(R.id.view1);
        cat = (Button) findViewById (R.id.buttonCat);
        
        cat1 = getResources().getDrawable(R.drawable.cat1);
        cat2 = getResources().getDrawable(R.drawable.cat2);
        
        
        cat.setOnClickListener(new OnClickListener() {
        	public void onClick(View v) {
	    		 showPet(v);
	    	 }
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    public void showPet(View v){
    	
    	if (toggle)
    		pet.setImageDrawable(cat1);
    	else
    		pet.setImageDrawable(cat2);
    	
    	toggle = !toggle;
    	
    	
    }
    
}
