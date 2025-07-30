class Mobile{
    String brand;
    int price;
    String name;

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class Static{
    public static void main(String a[]){

        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price =   1199;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price = 1899;
        obj2.name = "SmartPhone";

        obj1.show();
        obj2.show();


    }
}