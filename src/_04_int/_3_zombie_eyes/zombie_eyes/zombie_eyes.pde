
void setup() {
PImage face = loadImage("face.jpeg");
size(500, 500);
face.resize(500, 500);
image(face, 0, 0);
fill(mouseX,0,mouseY);


 








}
void draw() {
  fill(mouseX,0,mouseY);
ellipse(300, 230, 80, 110);
ellipse(200, 230, 80, 110);
}
