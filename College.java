import java.util.Scanner;
class College
{
   String c_name;
   void display(String a)
   {
   	c_name = a;
       System.out.println("The name of the college is : " + c_name);
   }
}
class Teacher extends College
{
   String t_name;
   String sub_name;
  
   void show(String b, String c)
   {
   	t_name = b;
   	sub_name = c;
       System.out.println("The Teacher named " + t_name +  " teaches " + sub_name + " in " + c_name + ".");
   }
}
class Student extends Teacher
{
   String stu_name;
   String stu_id;
  
   void print(String d, String e)
   {
   	stu_name = d;
   	stu_id = e;
       System.out.println("The student named " + stu_name + " with student id " + stu_id + " learns " + sub_name + " from the teacher " + t_name + " at " + c_name + ".");
   }
}
class Details
{
   public static void main(String args[])
   {
   	String a,b,c,d,e;
       Scanner scan = new Scanner(System.in);
      
       System.out.print("Enter the college name : ");
       a = scan.nextLine();
      
       System.out.print("Enter the teacher name : ");
       b = scan.nextLine();
      
       System.out.print("Enter the subject name : ");
       c = scan.nextLine();
      
       System.out.print("Enter the student name : ");
       d = scan.nextLine();
      
       System.out.print("Enter the student id : ");
       e = scan.nextLine();
      
       scan.close();
      
       Student obj0 = new Student();
      
       obj0.display(a);
       obj0.show(b,c);
       obj0.print(d,e);
   }
}
