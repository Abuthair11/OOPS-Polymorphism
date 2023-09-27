/**
 * @author abuthair on 27/09/23.
 * 10:42 am
 * @project OOPS-Polymorphism
 */
public class constructorOverloading {
    String name ;
    int Id;
    int mark;

    constructorOverloading(){

    }
    constructorOverloading(String name,int Id){
       this.name = name;
       this.Id = Id;
    }
    constructorOverloading(String name,int Id,int mark){
        this.name = name;
        this.Id = Id;
        this.mark = mark;
    }

}
