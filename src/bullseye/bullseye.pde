int red = 225;
int green= 0;
int blue = 0;
int size = 200;
void setup(){
  size(800, 800);



ellipse(400, 400, size, size);
fill(red, green, blue);
for(int i=0; i<20; i++){
if (i  % 2 == 0){
   green= 0;
  blue=0;
  ellipse(400, 400, size, size);
  size = size -5; 
}
else {
  green= 225;
  blue=225;
  ellipse(400, 400, size, size);
  size = size-5;

}
}
}