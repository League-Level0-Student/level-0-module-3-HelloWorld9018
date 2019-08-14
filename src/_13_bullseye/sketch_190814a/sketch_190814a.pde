
void setup(){
  size(800, 800);
}

void draw(){

for(int i=10; i>0; i--){
if (i  % 2 == 0){
  noStroke();
  fill(225, 0, 0);
  
  ellipse(400, 400, i*40, i*40);

}
else {
  
 
  noStroke();
  fill(0, 0, 0);
   
  ellipse(400, 400, i*40, i*40);


}
}
}