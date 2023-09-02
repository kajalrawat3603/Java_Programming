package unit01;
public class P3_Task_01_CalaculatorInJava {
public static void main(String[] args) {
Calculator obj = new Calculator();
System.out.println(obj.add(5, 6));
System.out.println(obj.sub(9,6));
System.out.println(obj.multi(3, 3));
System.out.println(obj.div(4,2));	
}
}
class Calculator{
int add(int a, int b) {
return (a+b); 
}
int sub(int a, int b) {
return (a-b); 
}
int multi(int a, int b) {
return (a*b); 
}
float div(int a, int b) {
return (a/b); 
}
}


