package assignment;

public class String2 {
public static void main(String args [])
{
String s1 = "hello";
String s2 = " how are you";
String s3 = s1.concat( s2);
System.out.println(s3);
String s4 = s2.toUpperCase();
System.out.println(s4);
String s5 = s3.replace('a','@');
System.out.println(s5);
System.out.println(s3.contains("e"));
System.out.println(s3.equals(s5));

}
}
