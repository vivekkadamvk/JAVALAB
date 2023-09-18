class Personal
{
  String name=new String();
  String fname=new String();
  String add=new String();
  String phno=new String();
  Personal(String a,String b,String c,String d)
  {
    name=a;    fname=b;   add=c;    phno=d;
  }
 void display()
 {
   System.out.println("Name is "+name);
    System.out.println("Address  "+add);
    System.out.println("Father's Name is "+fname);
   System.out.println("Contact number "+phno);
 }
}
class Education extends Personal
{
  int roll,age;
  char section;
  String branch=new String();
  Education(String a, String b, String c, String d, int e, int f, char  g, String h)
  {
   super(a,b,c,d);   roll=e;   age=f;  section=g;   branch=h;
  }
void display2()
 {
   super.display();
   System.out.println("Roll Number="+roll);
   System.out.println("AGE="+age);
   System.out.println("SECTION="+section);
   System.out.println("Branch is "+branch);
 }
}
class Ass2
{
  public static void main(String args[])
  {
    Education e=new Education("Vivek Kadam","Vijay Kadam","Shirdi","8625867057",59,19,'A',"Computer");
    e.display2();
   }
}