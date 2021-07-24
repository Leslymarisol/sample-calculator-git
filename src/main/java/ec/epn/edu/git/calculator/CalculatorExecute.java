package ec.epn.edu.git.calculator;

public class CalculatorExecute {
    public static void main( String[] args){
        System.out.println("==Calculator Execute==");
        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println("c.addition(4,7)= "+addition);

        int sustraction= c.substraction(4,3);
        System.out.println("c.sustraction(4,3)="+sustraction);

    }
}
