int counter = 0;
int timer = second();

void setup(){
 size(600, 600);
 
 
}

void draw(){
  //if(){
   // print("hello");
  //}
}

void mouseClicked(){
  if(timer < second() + 10){
    println(counter);
    counter ++;
  }
}
