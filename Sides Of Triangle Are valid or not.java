package practice;

import java.util.Scanner;


public class Triangle {

  public static void main(String[] args) {
Scanner in= new Scanner(System.in);
System.out.println("Enter three sides of triangle:");
double a=in.nextDouble();
double b=in.nextDouble();
double c=in.nextDouble();
if(a+b>c && b+c>a && a+c>b){
  System.out.println("Given sides of triangle are valid");
} else{
  System.out.println("Given sides of triangle are invalid");
}
  }

}
