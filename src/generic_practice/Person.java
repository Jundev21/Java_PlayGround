package generic_practice;




class EmployeeInfo{

	public int rank;

	EmployeeInfo(int rank){
		this.rank = rank;
	}


}

class Employee<T,S>{
	public T info;
	public S id;
	Employee(T info, S id) {
		this.info = info;
		this.id = id;
	}

}


public class Person {

	public static void main(String[] args) {

		Integer id = Integer.valueOf(1);

		Employee<EmployeeInfo, Integer> p1 = new Employee<EmployeeInfo, Integer>(new EmployeeInfo(1), 2);

	}


}
