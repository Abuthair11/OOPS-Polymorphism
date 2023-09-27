/**
 * @author abuthair on 27/09/23.
 * 11:02 am
 * @project OOPS-Polymorphism
 */
public class varArgDemo {
    void print(String Name, int... a){
        System.out.println("Hello "+Name);
        int sum = 0;
        for (int i:a) {
            sum = sum+i;
        }
        System.out.println("Sum" +sum);

    }
    void print(String name){
        System.out.println("have a good  day "+name);

    }

    public static void main(String[] args) {
        varArgDemo argDemo = new varArgDemo();
        argDemo.print("ram");
        argDemo.print("sam",20);
        argDemo.print("sita" , 20,30);
        argDemo.print("dhanush" , 30,30,30);
    }
}
