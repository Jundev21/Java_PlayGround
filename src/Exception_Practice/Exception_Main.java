package Exception_Practice;



// 사용자 정의 예외처리
public class Exception_Main {


    private String password;

    public String getPassword(){


        return password;
    }

    public void setPassword(String password){

        if (password == null) {
            throw new PassWordException("비밀번호는 null일 수 없습니다");
        } else if (password.length() < 5) {
            throw new PassWordException(" 비밀번호는 5자 이상이여야합니다");
        } else if (password.matches("[a-zA-Z]+")) {
            throw new PassWordException("숫자 또는 특수문자가 포함되어야합니다");
        }

        this.password = password;

    }


    public static void main(String[] args) {

        Exception_Main test = new Exception_Main();


        try {

        test.setPassword("asdf");
            System.out.println("비밀번호 세팅이 완료되었습니다");

        } catch (PassWordException e) {

            System.out.println(e.getMessage());
        }

//        test.setPassword("asdf");
//        test.setPassword("asdffdfas");
//        test.setPassword("asdffd1!2!");


    }
}
