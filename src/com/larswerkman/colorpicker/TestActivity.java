package com.larswerkman.colorpicker;

import android.app.Activity;
import android.os.Bundle;

import com.larswerkman.colorpicker.ColorPicker.OnColorChangedListener;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.example);
		
		ColorPicker cp = (ColorPicker) findViewById(R.id.picker);
		cp.setOnColorChangedListener(new OnColorChangedListener() {
			@Override
			public void onColorChanged(ColorPicker view, int newColor) {
				view.setOldCenterColor(newColor);
			}
		});
		
		SVBar svBar = (SVBar) findViewById(R.id.svbar);
		cp.addSVBar(svBar);
		
	}
}
