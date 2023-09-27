/**
 * @author abuthair on 27/09/23.
 * 10:44 am
 * @project OOPS-Polymorphism
 */
public class constructorOverloadingMain {
    public static void main(String[] args) {
        constructorOverloading overloading = new constructorOverloading();
        overloading.name ="Abu";
        overloading.Id=2;

        constructorOverloading overloading1 = new constructorOverloading("Sheik",2);
        constructorOverloading overloading2 = new constructorOverloading("tarefa ", 3, 300);

        System.out.println("1 "+overloading.mark);
        System.out.println("2 "+overloading1.mark);
        System.out.println("3 "+overloading2.mark);
    }
}
