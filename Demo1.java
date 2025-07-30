class Computer
{
    public void playMusic()
    {
        System.out.println("Playing music...");

    }

    public String getMeAPen(int cost)
    {
        if(cost>=10){
            return "Pen";
        }

        return "Nothing";
    }
}

public class Demo1
{
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);

    }
}











































// class Calculator{
//     int a;

//     public int add(int n1, int n2)
//     {
//         int r = n1 + n2;
//         // System.out.println("in add");
//         return r;
//     }
// }



// public class Demo1{
//     public static void main (String a[])
//     {
//         int num1=5;
//         int num2=4;

//         Calculator calc = new Calculator();

//         int result = calc.add(9,6);

//         System.out.println(result);
//     }
// }