package ec.epn.edu.git.calculator;

public class Calculator {
    private int answer;

    public int addition(int a, int b){
        return a+b;
    }
    public int substraction( int a, int b){
        return a-b;
    }

    public double division(int a, int b){
        return a/b;
    }

    public int getAnswer(){
        return answer;
    }

    public void setAnswer(){
        this.answer = answer;
    }

}
