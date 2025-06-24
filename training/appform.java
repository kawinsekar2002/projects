class appform{
String name;
int age;
public void display()
{
System.out.println(name);
System.out.println(age);
}
public static void main(String args[])
{
appform k=new appform();
k.name="kawin";
k.age=21;
k.display();
appform a= new appform();
a.name="geetha";
a.age=20;
a.display();
}
}