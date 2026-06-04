interface Notifications{
void sendmessages(String message);
}
class MobileNotification implements Notifications{
public void sendmessages(String message){
System.out.println("sending mobile notification:"+message);
}
}
class EmailNotification implements Notifications{
public void sendmessages(String message){
System.out.println("sending email notification:"+message);
}
}
class JobNotification implements Notifications{
public void sendmessages(String message){
System.out.println("sending job notification:"+message);
}
}
class InstaNotification implements Notifications{
public void sendmessages(String message){
System.out.println("sending insta notification:"+message);
}
}
public class NotificationSystem{
public static void main(String[] args){
MobileNotification mn=new MobileNotification();
EmailNotification en=new EmailNotification();
JobNotification jn=new JobNotification();
InstaNotification in=new InstaNotification();
mn.sendmessages("hi");
en.sendmessages("enroll to this");
jn.sendmessages("you have got a offer letter");
in.sendmessages("reel");
}
}
