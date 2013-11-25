
package org.sdmlib.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class ScreenShotRunnable implements Runnable{

	private Display display;
	private Control control;
	private String screenShotFileName;
	public ScreenShotRunnable(Display display, Control gui, String screenShotFilename){
		this.display=display;
		this.control=gui;
		this.screenShotFileName=screenShotFilename;
	}

	public void run() {
		GC gc = new GC(control);
		Point size = control.getSize();
		Image image = new Image(display, size.x-16, size.y-37);
		gc.copyArea(image, 0, 0);
		gc.dispose();
		
		ImageLoader loader = new ImageLoader();
	    loader.data = new ImageData[] {image.getImageData()};
	    loader.save("doc/"+screenShotFileName, SWT.IMAGE_PNG);
	
	    image.dispose();
	}
}
