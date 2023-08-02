public class Main {
    static public class A{
        private void test(){
            System.out.println("protected modifier");
        }

        protected  void testB(){
            System.out.println("it is protected");
        }
    }

    static public class B extends A{

    }

    public static void main(String[] args) {

    }
}