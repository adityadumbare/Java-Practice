public class _13classcastexception {
    public static void main(String[] args) {
         A a=new A();
        B b=new B();
   //     System.out.println( a instanceof b);
       // b=a;
       // System.out.println(b.k);
    }
}
class A{
    int k=10;
}
class B{
    int k=23;
}
