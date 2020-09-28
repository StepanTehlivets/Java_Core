package ua.academy.lgs;

public class Rectangle {
 private int length;
 private int width;
 
 
 
  Rectangle (int length, int width){
	  this.length=length;
	  this.width=width;
  }
  Rectangle(){
	  this.length=50;
	  this.width=20;
  }
  
  public int area() {
	  return length*width;
  }
  public int perimeter () {
	  return length+length+width+width;
  }
}