class Student1{
private int id;
public void setid(int id){
this.id=id;
}
public int getid(){
return id;
}
}
class Student
{
public static void main(String[] args)
{
Student1 ob=new Student1();
ob.setid(10);
System.out.println(ob);
System.out.println(ob.getid());
}
}