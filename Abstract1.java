abstract class Vehicle{
public abstract int getWheel();
}
class Bus extends Vehicle{
    public int getWheel()
    {
        return 6;
    }
}
class Auto extends Vehicle{
    public  int getWheel()
    {
        return 3;        
    }
    }
public class Abstract1 {
    public static void main(String arg[])
    {
        Auto a=new Auto();
        System.out.println(a.getWheel());
        Bus b=new Vehicle();//will get error here child reference cannot hold parent object
        System.out.println(b.getWheel());
    }
}
