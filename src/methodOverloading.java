/**
 * @author abuthair on 27/09/23.
 * 10:38 am
 * @project OOPS-Polymorphism
 */
public class methodOverloading {
    void sum(int a , int b){
       System.out.println(a+b);
    }
    void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }
    int sum(int a){
        return a;
    }
}
