import java.lang.reflect.Constructor;

public class ConstructorClass {

    int age = 26;
    String name = "Sandeep";

    public ConstructorClass(){
        System.out.println("The default constructor class");
    }

    public ConstructorClass(int age){
        this.age = age;
    }

    public  ConstructorClass(int age, String name){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args) {

        Class<ConstructorClass> person = ConstructorClass.class;
        Constructor[] constructors = person.getConstructors();
        for(Constructor constructor : constructors){
            System.out.println("\t");
            System.out.println(constructor.getName());
            System.out.println(constructor.toGenericString());
            System.out.println(constructor.toString());
            System.out.println(constructor.getDeclaringClass());
        }

    }
}
