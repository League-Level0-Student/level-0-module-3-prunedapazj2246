void setup(){
size(1000,1000);
  int w =800;
  int l = 800;
  
  
}
 void draw(){
  int w =800;
  int l = 800;
   for(int i=1; i < 10; i++){
   if( i % 2 == 0){
     fill(#FF0000);
   }
   else{
     fill(#0311FF);
   }
   ellipse(500,500, w-(i*100), l-(i*100));
  
  //fill(#FF0000);
 // ellipse(500,500,w-200,l-200);
 // fill(#0311FF);
 // ellipse(500,500,w-300,l-300);
  // fill(#FF0000);
 // ellipse(500,500,w-400,l-400);
 // fill(#0311FF);
  //ellipse(500,500,w-500,l-500);
  // fill(#FF0000);
  //ellipse(500,500,w-600,l-600);
  //fill(#0311FF);
  //ellipse(500,500,w-700,l-700);
}
 }
