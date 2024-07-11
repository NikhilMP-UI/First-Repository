class Rectangle {
private int length;
private int breadth;
public Rectangle(int l, int b) {
length = l;
breadth = b;
}
public int getArea() {
return length * breadth;
}
}


class Area { 
public static void main(String[] args) {
Rectangle rect = new Rectangle(2,4);
System.out.println(rect.getArea());
}
}

class Static_Rectangle {

public static void printArea(int l, int b) {
System.out.println(l * b);
}
}
 class Static {
public static void main (String[] args) {
Rectangle.printArea(2,4);
}
}