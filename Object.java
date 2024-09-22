import java.lang.*;

public class Object implements  Cloneable{
    int a;

    public Object(){

    }
    public Object(int a){
        this.a = a;
    }
    public void sayHello(){
        System.out.println("Hi This is Hello from Object Class" + a);
    }

    public static void main(String [] args){
        Object obj = new Object();
        obj.sayHello();


        // Instantiation using newInstance();
        try {
            Object object = Object.class.newInstance();
            object.a = 12546;
            object.sayHello();
        } catch (Exception e){
            System.out.println(e.toString());
        }



        // Creating an object using clone method
        Object a =  new Object(123);
        a.sayHello();
        System.out.println(a);

        Object b = a.clone();
        b.sayHello();

        System.out.println(b);


    }

    @Override
    public Object clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Object) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
