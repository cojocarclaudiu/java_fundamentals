public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public double divide(int a, int b){
        return a/1.0/b;
    }

    public boolean isPositive(int a){
        return a >= 0 ? true : false;
    }

    public boolean isNegative(int a){
        return !isPositive(a);
    }

    public boolean isOdd(int a){
        return a%2==0? true : false;
    }

    public int min(int a, int b){
        return Math.min(a,b);
    }

    public int max(int a, int b){
        return Math.max(a,b);
    }

    public double average(int a, int b){
        return (a+b)/2.0;
    }

    public int power(int a, int b){
        return (int) Math.pow(a,b);
    }

}
