void setup(){
  size(400,400);
}
int x = 0;
int r = 0;
int x1 = 50;
int x2 = 300;



void draw(){
  background (0,0,0);
 fill(255,255,255); 
  rect(x1,350,100,50);
  rect(x2,300,100,100);
  x1--;
  x2--;
  
  if(x1 <= -50){
    x1= 450;
  }
  if(x2 <= -50){
    x1= 450;
  }
 //airplane 
 fill(255);
ellipse(100+x, 50, 100, 20);
ellipse(120+x, 50, 20, 60);
ellipse(80+x, 50, 20, 10);
ellipse(70+x, 40, 20, 20);
fill(0);
rect(70+x, 44, 10, 10);
rect(90+x, 44, 10, 10);
rect(110+x, 44, 10, 10);
fill(0, 255, 0);

stroke(25, 25, 25);
line(250, 250, 250, 150);
fill(0);
ellipse(250, 150, 30, 30);

  
  
}
