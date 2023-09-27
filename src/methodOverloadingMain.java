/**
 * @author abuthair on 27/09/23.
 * 10:40 am
 * @project OOPS-Polymorphism
 */
public class methodOverloadingMain {
    public static void main(String[] args) {
        methodOverloading overloading = new methodOverloading();
        System.out.println(overloading.sum(13));
        overloading.sum(10,10);
        overloading.sum(20,10,20);

    }
}
