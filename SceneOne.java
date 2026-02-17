import org.code.theater.*;
import org.code.media.*;

public class SceneOne extends Scene {

  /** Instance Variables */
  private ImageFilter[][] images;
  
  /** Constructor */
  public SceneOne(ImageFilter[][] images) {
    this.images = images; 
  }

  /**
   * Top-level drawScene method which will draw the whole animation
   */
  public void drawScene() {
    topRow(50);
    secondRow();
    thirdRow(30, "horizontal");
    fourthRow(40); 

    
  }

  // other methods...
// Draws the images in first row and applies the color shift image filter to them
  public void topRow(int value) {
   for (ImageFilter img : images[0]) {
    /** (Applies for all filters being called) 
    draws the image before the filter, pauses for one second, applies filter, redraws image with
    said filter*/
     drawImage(img, 0, 0, 400, 400, 0);
    pause(1);

    img.colorShift(value);

    drawImage(img, 0, 0, 400, 400, 0);
    pause(1);

     
     
   }
    }
// Draws the images in second row and applies the negative image filter to them
  public void secondRow() {
    for (ImageFilter img : images[1]) {
      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);

      img.makeNegative();

      drawImage(img, 0, 0, 400, 400, 0);
      pause(1);
    }
  }
// Draws the images in third row and applies the image blur filter to them
  public void thirdRow(int length, String direction) {
    for (ImageFilter img : images[2]) {
      drawImage(img, 0, 0, 400, 400, 0); 
      pause(1); 

      img.motionBlur(length, direction);
      drawImage(img, 0, 0, 400, 400, 0); 
      pause(1);
    }
  }

  // Draws the images in fourth row and applies the darken image filter to them
  public void fourthRow (int value) {
    for (ImageFilter img : images[3]) {
      drawImage(img, 0, 0, 400, 400, 0); 
      pause(1); 

      img.darken(value); 

      drawImage(img, 0 , 0, 400, 400, 0);
      pause(1); 
    }
  }
  }
  

