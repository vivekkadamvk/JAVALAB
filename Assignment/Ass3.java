interface Exam { 
 void Percent_cal();
}

class Student {
 
 String name;
 int roll_no, Marks1, Marks2, Marks3, Marks4, Marks5;
 Student(String n, int rn, int m1, int m2, int m3, int m4, int m5) {
  
  name = n;
  roll_no = rn;
  Marks1 = m1;  Marks2 = m2;  Marks3 = m3;  Marks4 = m4;  Marks5 = m5;
 }
 void show() {
  System.out.println("\nStudent Name : "+name);
  System.out.println("Roll no : "+roll_no);
  System.out.println("Marks1 : "+Marks1);
  System.out.println("Marks2 : "+Marks2);
  System.out.println("Marks3 : "+Marks3);
  System.out.println("Marks4 : "+Marks4);
  System.out.println("Marks5 : "+Marks5);
 }
}

class Result extends Student implements Exam {
  float per;
 Result(String n,int rn,int m1,int m2, int m3, int m4, int m5) { 
  super(n,rn,m1,m2,m3,m4,m5);
 }
 public void Percent_cal() { 
  int tot = Marks1 + Marks2 + Marks3 + Marks4 + Marks5;
  per = (float)tot / 5;
 }
 void display() {
   show();
  System.out.println("Percentage = "+per);
  System.out.println("\n");
 } 
}

public class Ass3 {
 
 public static void main (String[] args) {
  
  Result r = new Result("Vivek Kadam",59,85,95,99,95,97);
  r.Percent_cal();
  r.display();


  Result s = new Result("Abhishek Kadam",63,95,90,99,95,87);
  s.Percent_cal();
  s.display();
 }
}