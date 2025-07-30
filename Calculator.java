class SCalculator{
    public int add(int n1, int n2){
        int result1 = n1 + n2;
        return result1;
    }

    public int diff(int n1, int n2){
        int result2 = n1 - n2;
        return result2;
    }

    public int prod(int n1, int n2){
        int result3 = n1 * n2;
        return result3;
    }

    public int div(int n1, int n2){
        int result4 = n1 / n2;
        return result4;
    }
}


public class Calculator{
    public static void main(String a[]){

        SCalculator obj = new SCalculator();
        int r1=obj.add(8,4);
        System.out.println(r1);

        int r2=obj.diff(8,4);
        System.out.println(r2);

        int r3=obj.prod(8,4);
        System.out.println(r3);

        int r4=obj.div(8,4);
        System.out.println(r4);
    }
}