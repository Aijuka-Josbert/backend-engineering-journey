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

System.out.println("Developer " + vc.name);
System.out.println("Age "+ vc.age);
System.out.println("Experience "+ vc.experience);
System.out.println("Knows Java " + vc.knowJava);
System.out.println("Expected salary " +vc.expectedSalary);
}
}
//1. The reason age should generally be an int is that age is a whole number used for numerical operations and comparisons.
//2. no it cant 'yes' and 'no' are jhus stored in
//3. the decimal places are removed since int takes in whole numbers only
//4. declaring variables is creating memory or like creating a value where anitem is to be stored  forexample int age;
//while 
//assigning is the when a declared valued is given a value to store in its memory forexample age = 24;
