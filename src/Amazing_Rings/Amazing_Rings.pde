void setup(){
  size(1500,1500);
  noFill();
}


void draw(){
int w = 500;
int l = 500;
int x = 300;
int y = 500;
int x2 = 1200;
for( int i=0; i<50;i++){
ellipse(x2,y,w,l);
  ellipse(x,y,w, l);
  w -= 20;
  l -= 20;
  x += 50;
  x2 -= 50;
}

}
