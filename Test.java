class Student{
String name;
int roll_no;
int age;
void description(){
System.out.println("This is a student");
}
Student(){
    name="Unknown";
    age=0;
}
void setDetails(String n,int a)
{
          name=n;
          age=a;
}
void printDetails(){
     System.out.println("my name is"+name+"and my age is"+age);
}
void setName(String n,int a){
  name=n;
  roll_no=a;
}
String getName(){
        return name;
}
int getRoll(){
   return roll_no;
}
}


class Test{
public static void main(String[] args){
     //creating object st of class Student
      Student st1=new Student();
      Student st2=new Student();
      //st1.name="Nikhil";
         st1.setDetails("john",25);
         st2.setDetails("julie",20);
         st1.printDetails();
         st2.printDetails();
System.out.println("Student Name:" +st1.name);
        st1.setName("Nikhil",1);
        String st1_name=st1.getName();
        int st1_roll=st1.getRoll();
        System.out.println("Student Name:" +st1_name);
        System.out.println("Student roll_number:" +st1_roll);
      /*st1.roll_no=1;
      st1.description();
      st2.name="sahil";
      System.out.println(st1.name + " "+st1.roll_no);
      System.out.println(st2.name);*/
//System.out.println(st2.name,st2.roll_no);



}
}


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
rectangle rect = new Rectangle(2,4);
System.out.println(rect.getArea());
}
}