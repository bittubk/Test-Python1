import java.applet.*;  
import java.awt.*;  
public class TestingApplets extends Applet{  
  
    public void paint(Graphics g){  
        g.drawString("Welcome To Java Applet" ,100 ,150);  
    }  
} 


/* 
<applet code="TestingApplets.class" width="300" height="300"> 
</applet> 
*/