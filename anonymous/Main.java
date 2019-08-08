public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        AddOper add = new AddOper();
        PrintCalcResult(add, 3.5f, 7.2f);

        PrintCalcResult(new IOperation() {
            @Override
            public float calc(float a, float b) {
                return a * b;
            }
        }, 3.5f, 7.2f);

        PrintCalcResult((a, b) -> a * b, 3.5f, 7.2f);
    }

    public static void PrintCalcResult(IOperation calc, float a, float b)
    {
        System.out.println(calc.calc(a, b));
    }
}
