// This is the Facebook_Graphics class
// Dr. Xiaolin Hu
// 04/05/2011

import java.awt.*;
import jpb.*;

public class Facebook_Graphics{

   private String name;
   private String content;
   DrawableFrame df;
   private Graphics g;

   public Facebook_Graphics(String nm){
       content = "undefined";
       name = nm;

       // Create drawable frame
       df = new DrawableFrame(name);
       df.show();
       df.setSize(200, 150);

       // Obtain graphics context
       g = df.getGraphicsContext();

       // display name
       g.drawString(name+"'s mood is undefined.", 20, 75);

       // Repaint frame
       df.repaint();

   }

   public void setContent(String newContent){
        content = newContent;
        if(content.equals("happy")){
            g.setColor(Color.red);
            g.fillRect(0, 0, 200, 150);
            g.setColor(Color.black);
            // display mood
            g.drawString(name+"'s mood is:"+ "happy", 20, 75);
        }
        else{
            g.setColor(Color.white);
            g.fillRect(0, 0, 200, 150);
            g.setColor(Color.black);
            g.drawString(name+"'s mood is:"+ content, 20, 75);
        }
        // Repaint frame
        df.repaint();
   }

   public String getContent(){
   	return content;
   }



}
