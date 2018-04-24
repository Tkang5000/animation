float yPos = 0.0;
float xPos = 0.0;

float xDirection = 1.0;
float yDirection = 1.0;

void setup() {
  size(800, 600);
  background(0);
}

void draw() {
  background(0);
  
  println("yPos: " + yPos + " xPos: " + xPos + " width: " + width + " height: " + height);
  
  text(xPos + ", " + yPos, xPos, yPos - 10); 
  rect(xPos, yPos, 20, 20);

  float yBoundaryCheck = 0;
  if(yDirection == -1) {
    yBoundaryCheck = yPos;
  } else {
    yBoundaryCheck = yPos + 20;
  }
  
  if(yBoundaryCheck >= height) {
    yDirection = -1;
  } else if(yBoundaryCheck <= 0) {
    yDirection = 1;
  }  

  float xBoundaryCheck = 0;
  if(xDirection == -1) {
    xBoundaryCheck = xPos;
  } else {
    xBoundaryCheck = xPos + 20;
  }

  if(xBoundaryCheck >= width) {
    xDirection = -1;
  } else if(xBoundaryCheck <= 0) {
    xDirection = 1;
  }  
  
  yPos += yDirection;
  xPos += xDirection;
}
