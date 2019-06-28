int w = 600;
int l = 600;
int x = 300;
int y = 500;
int x2 = 1200;
int xspeed = 1;
int x2speed = -1;
void setup(){
  size(1500,1500);
  noFill();
  background(255,255,255);
  
}


void draw(){
  background(255,255,255);
  w =700;
  l = 700;
for( int i=0; i<50;i++){
  ellipse(x2,y,w,l);
  ellipse(x,y,w, l);
  w -= 20;
  l -= 20;
}
x+=xspeed;
x2+=x2speed;

 if( x2 <=400){
  x2speed = 1;
  }
   if(x2 >= 1100){
   
    x2speed = -1;
   
  }
 
    if(x >= 1100){
    
   xspeed = -1;
    
  }
   if(x<=400){
    xspeed = 1;
  }
 
    
  }

 
  
