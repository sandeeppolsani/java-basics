public class ThisKey {
    int a;

    ThisKey(){
        this(123);
    }

    ThisKey(int a){
        this.a = a;
    }

    public int getA(int a){
        this.a = a;
        if(this.a<100){
            return this.getA(a+1);
        }

        return this.a;
    }

    public static void main(String[] args) {

        ThisKey key = new ThisKey();
        System.out.println(key.a);

        System.out.println(key.getA(50));

    }
}
