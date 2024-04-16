package MethodsWithObjects.Maths;

public class ABNums {
    private int a;
    private int b;

    public ABNums(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int getA(){
        return this.a;
    }

    public int getB(){
        return this.b;
    }

    public String toString(){
        return "The values of a are " + a + "the values of b are " + b;
    }

}
