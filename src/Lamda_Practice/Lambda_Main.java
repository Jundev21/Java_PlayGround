package Lamda_Practice;

public class Lambda_Main {

    public static void main(String[] args) {


        Add addB = (x, y) -> {
            return x + y;
        };

        System.out.println(addB.add(2, 3));


        FindMax max = (x, y) -> {
            return x > y ? x : y;
        };

        StringConCatImpl stClass = new StringConCatImpl();

        stClass.makeString("ab", "cd");

        StringConcat strLamb = (x, y) -> {
            StringBuffer sb = new StringBuffer();
            sb.append(x);
            sb.append(y);
            System.out.println(sb);

        };

        strLamb.makeString("ef","gh");

        StringConcat strLamb2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {

                System.out.println("This is strLamb2");

            }
        };



    }
}
