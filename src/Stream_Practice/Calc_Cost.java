package Stream_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Calc_Cost {

    List<Customer> getCustomer;

    Calc_Cost(){
        getCustomer = new ArrayList<>();
    }

    public void addCustomer(Customer c){

        getCustomer.add(c);

    }

    public void getAllName(){

        //collection 타입 제네럴로 적어줘야함
//        Stream<Customer> stream = getCustomer.stream();
//
//        stream.forEach(el->{
//            System.out.println(el.getName());
//        });

        getCustomer.stream().map(Customer::getName).forEach(System.out::println);


    }

    public void getAllCost(){

//        Stream<Customer> stream = getCustomer.stream();
//
//        int totalPrice = stream.reduce(0, (a, b) -> a.getPrice() + b.getPrice());

        int result = getCustomer.stream().map(Customer::getPrice).reduce(0, Integer::sum);

        System.out.println(result);
    }

    public void getDistinct(){


        List<Customer> distinctElements = getCustomer.stream().distinct()
                .collect( Collectors.toList() );



    }
    public void getFilterAge(){

//        Stream<Customer> stream = getCustomer.stream();
//
//        int result = stream.filter((el) -> el.getAge() >= 20);
//

//        getCustomer.stream().filter(el -> el.getAge() >= 20).map(el -> el.getName()).sorted().forEach(el->{
//            System.out.println(el);
//        });


        Stream<String> a = getCustomer.stream().filter(el -> el.getAge() >= 20).map(Customer::getName).sorted();

        a.forEach(System.out::println);



    }

}
