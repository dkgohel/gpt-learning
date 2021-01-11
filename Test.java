interface Formula{
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
public class Test{
    public static void main(String[] args){
        Formula formula = new Formula(){
            public double calculate(int a){
                return sqrt(a*100);
            }
        };
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
    }
}