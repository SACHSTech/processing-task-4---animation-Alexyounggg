import processing.core.PApplet;

public class Sketch extends PApplet {


  /**
   * state global variables
   *  
   * */ 
  public float circleY = 50;
  public float circleX = 0;
  float speedY = 1;
  float speedX = 1;

  public float rectX = 0;
  public float rectY = 0;
  public float moveX = 195;
	public float bigX = width;

  public float sunX = 1;
  public float sunY = 75;
  public float moonX = -25;
  public float moonY = 90;
  public float hello = (float) 0.01;
  public float helloTwo = (float) 0.01;
  public boolean day = true;
  
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	  // put your size call here
    size(200, 200);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
  //taskOne();

  //taskTwo();

  taskThree();

   
  }
  
  // define other methods down here.
  
  public void taskOne(){
     // clear out old frames
     background(32);

     // draw current frame based on state
     ellipse(circleX, circleY, 50, 50);
     rect (0, 100, 200, 50);
   
     // modify state
     circleY = circleY + speedY;
     circleX = circleX + speedX;
 
     // Collision for the bottom
     if(circleY > 75|| circleY < 0){
       speedY = speedY * -1;
     }
 
     // Collision for the top
     if (circleX < 0 || circleX > width){
       speedX = speedX * -1;
       }
  }
  public void taskTwo(){

    background(0);
    rectX += 0.5;
    
    // White background
    fill(40, 50, 200);
    rect(rectX, rectY, width, height/2);  

    fill(255,250,250);
    rect(0, height/2, width, height/2);

     // Bottom snow ball
     fill(255,250,250);
     ellipse(bigX, height/2, (float) (width * 0.375), (float) (height * 0.375));
     
     // Middle snow ball
     fill(255,250,250);
     ellipse(bigX, height/4, width/4, height/4);
     
     // Top snow ball
     fill(255,250,250);
     ellipse(bigX, height/8, (float) (width * 0.1875), (float) (height * 0.1875));

     bigX += speedX;

     if (bigX < 0 || bigX > width){
      speedX *= -1;
   }
     
     // Sun
     fill(255,255,0);
     ellipse(moveX, height/40, width/8, height/8);
     
     moveX += 0.05;
     
  }

  public void taskThree(){
    background(32);

    fill(0,100,0);
    rect(0, height/2, width, 200);

    if (day == true){
      fill (0,0,255);
      rect(0, 0, width, height/2);

    }

    if (day == false){
      fill (0);
      rect(0, 0, width, height/2);

      fill(211,211,211);
      ellipse(5, 30, 10, 10);
      ellipse(187, 25, 10, 10);
      ellipse(154, 70, 10, 10);
      ellipse(110, 45, 10, 10);
      ellipse(87, 67, 10, 10);
      ellipse(43, 21, 10, 10);
      ellipse(78, 26, 10, 10);
      ellipse(100, 42, 10, 10);
      
      
    }
    fill(255, 255, 0);
    ellipse(sunX, sunY, 25, 25);

    fill(128,128,128);
    ellipse(moonX, moonY, 25, 25);

    if (moonX > width){
      moonX = -25;
      moonY = 90;
      sunX = 1;
      sunY = 75;
      hello = (float) 0.01;
      helloTwo = (float) 0.01;
      day = true;
    }
    
    if (sunX > width){
      moonX += 1;
      moonY += sin((float) 3.9 + helloTwo);
      helloTwo += 0.02;
      day = false;
    }
    
    sunX += 1;
    sunY += sin((float) 3.9 + hello); 

    hello += 0.025;
  



    

  


  }


}