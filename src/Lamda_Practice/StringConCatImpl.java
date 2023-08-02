package Lamda_Practice;

public class StringConCatImpl implements StringConcat{
    @Override
    public void makeString(String s1, String s2) {

        StringBuffer sb = new StringBuffer();

        sb.append(s1);
        sb.append(s2);

        System.out.println(sb);
    }
}
