package com.sukohi.lib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

public class DisplaySize {

	@SuppressLint("NewApi")
	@SuppressWarnings("deprecation")
	public static Point get(Context context) {
			
		WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		Display display = windowManager.getDefaultDisplay();
		Point size = new Point();
	
		if(Integer.valueOf(android.os.Build.VERSION.SDK_INT) < Build.VERSION_CODES.HONEYCOMB_MR2) {
	   
			size.set(display.getWidth(), display.getHeight());
       
		} else {
	   
			display.getSize(size);
          
		}
		
		return size;
		
	}
	
}
/*** Example

	Point displaySize = DisplaySize.get(this);
	int displayWidth = displaySize.x;
	int displayHeight = displaySize.y;
		
***/
