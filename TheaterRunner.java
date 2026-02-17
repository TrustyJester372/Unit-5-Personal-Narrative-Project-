import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // Create any 2D arrays & variables to be passed as parameters to constructor
    ImageFilter[][] images = {
      { new ImageFilter("T-Rex.png"), new ImageFilter("Spinosaurus.png") }, 
      { new ImageFilter("Velociraptor.png"), new ImageFilter("Dilophosaurus.png") }, 
      { new ImageFilter("Indominus.png"), new ImageFilter("Indoraptor.png") },
      { new ImageFilter("Baryonyx.png"), new ImageFilter("Carnotaurus.png") },
      /**List is about some of my favorite carnivores from the game Jurassic World Evolution 3, a game where you
      build your own Jurassic World, among other things. Each photo has a family unit (mother on the right, father
      on the left, juvenile in the front). Hybrids, which can't breed, are alone.*/
    };

    // Instantiate Scene subclass objects
    SceneOne scene1 = new SceneOne(images);

    
    // Call drawScene methods in each subclass
    scene1.drawScene();

    
    // Play scenes in Theater, in order of arguments
    Theater.playScenes(scene1);
    
  }
}
