import gui.elements.*;

GUIelements GUIelementsObject;
GUIelements.button buttonObject;

void setup()
{
  size(300, 300);
  
  GUIelementsObject = new GUIelements(this);
  buttonObject = new GUIelements(this).new button();
  
  buttonObject.positionX(75);
  buttonObject.positionY(20);
  buttonObject.width(150);
  buttonObject.height(50);
  buttonObject.content("Button");
  
  buttonObject.background(0, 0, 0);
  buttonObject.foreground(255, 255, 255);
  
  buttonObject.addToWindow();
}

void draw()
{
  buttonObject.isHovered();
  
  if(buttonObject.isClicked())
  {
    //do something...
  }
}
