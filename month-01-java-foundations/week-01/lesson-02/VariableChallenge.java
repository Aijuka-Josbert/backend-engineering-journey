public class VariableChallenge{
String name;
int age;
double experience;
boolean knowJava;
long expectedSalary;

public static void main(String[]args){

VariableChallenge vc = new VariableChallenge();

vc.name = "Josbert";
vc.age = 25;
vc.experience = 2.5;
vc.knowJava = true;
vc.expectedSalary  = 2500000;

System.out.println(vc.name);
System.out.println(vc.age);
System.out.println(vc.experience);
System.out.println(vc.knowJava);
System.out.println(vc.expectedSalary);
}
}
//1. string only stores values that donot change yet age changes per time so only suitable for values that are constant
//2. no it cant 'yes' and 'no' are jhus stored in
//3. the decimal places are removed since int takes in whole numbers only
//4. declaring variables is creating memory or like creating a value where anitem is to be stored  forexample int age;
//while 
//assigning is the when a declared valued is given a value to store in its memory forexample age = 24;
