class Rectangle {
  double length;
  double width;

  Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }
  public double getArea(){
    return length * width;
  }
  public double getPerimeter(){
    return 2 * (length + width);
  }
}

class Square extends Rectangle {
  Square(double side) {
    super(side, side);
  }
}