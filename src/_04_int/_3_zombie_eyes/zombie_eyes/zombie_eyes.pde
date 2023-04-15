PImage face;



void setup() {
face = loadImage("face.jpeg");
size(900,700);
face.resize(width,height);
image(face, 0, 0);


}



void draw() {
fill(169,mouseX%255,255);
ellipse(500,275,150,200);
ellipse(345,275,150,200);
}
