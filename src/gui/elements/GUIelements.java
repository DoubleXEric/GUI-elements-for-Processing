package gui.elements;


import processing.core.*;


public class GUIelements {
	
	private PApplet sketch;
	
	
	public final static String VERSION = "##library.prettyVersion##";
	

	public GUIelements(PApplet theParent) {
		this.sketch = theParent;
	}

	
	public static String version() {
		return VERSION;
	}

	
	public class button
	{
		int posX = 0;
		int posY = 0;
		int widthX = 50;
		int heightY = 25;
		
		int rBg = 255;
		int gBg = 255;
		int bBg = 255;
		
		int rBgSave = 255;
		int gBgSave = 255;
		int bBgSave = 255;
		
		int rFg = 0;
		int gFg = 0;
		int bFg = 0;
		
		int rBb = 0;
		int gBb = 0;
		int bBb = 0;
		
		
		
		String text = "";
		//float timer = 0;
		
		public button()
		{
			sketch.rectMode(sketch.LEFT);
			sketch.textAlign(sketch.CENTER);
			sketch.textSize(heightY / 3);
		}

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

		public void positionX(int inputPosX)
		{
			posX = inputPosX;
		}

		public void positionY (int inputPosY)
		{
			posY = inputPosY;
		}

		public void width (int inputWidthX)
		{
			widthX = inputWidthX;
		}

		public void height (int inputHeightY)
		{
			heightY = inputHeightY;
			sketch.textSize(heightY / 3);
		}

		public void content (String btContent)
		{
			text = btContent;
		}

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

		public void addToWindow()
		{
			sketch.background(255);
			
			sketch.fill(rBg, gBg, bBg);
			sketch.rect(posX, posY, posX + widthX, posY + heightY);

			sketch.fill(rFg, gFg, bFg);
			sketch.text(text, posX + (widthX / 2), posY + (heightY / 3 * 2));
		} 

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

		public void isHovered()
		{
			if (sketch.mouseX >= posX && sketch.mouseX <= posX + widthX && sketch.mouseY >= posY && sketch.mouseY <= posY + heightY) 
			{
				sketch.background(255);

				rBgSave = rBg;
				gBgSave = gBg;
				bBgSave = bBg;
				
				rBg = 100;
				gBg = 100;
				bBg = 100;
				
				addToWindow();
				
				rBg = rBgSave;
				gBg = gBgSave;
				bBg = bBgSave;
				
			}
			else
			{
				sketch.background(255);
				addToWindow();
			}
		}
	  
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	    
		public boolean isClicked()
		{
			//isHovered();
			if (sketch.mouseX >= posX && sketch.mouseX <= posX + widthX && sketch.mouseY >= posY && sketch.mouseY <= posY + heightY && sketch.mousePressed) 
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		public void background(int r, int g, int b)
		{
			rBg = r;
			gBg = g;
			bBg = b;
		}
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		public void foreground(int r, int g, int b)
		{
			rFg = r;
			gFg = g;
			bFg = b;;
		}
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		
		public void borderBrush(int r, int g, int b)
		{
			rBb = r;
			gBb = g;
			bBb = b;	
		}
	}
}

