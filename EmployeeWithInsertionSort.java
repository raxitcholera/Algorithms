import java.util.Arrays;

public class EmployeeWithInsertionSort 
{
	private Employee[] employees;

	public EmployeeWithInsertionSort(int size) {
		this.employees = new Employee[size];
	} 
	public void insertionSort (){
		int i,j;
		Employee temp;
		for(i=0;i<employees.length;i++) {
			temp=employees[i];
			j=i-1;
			while(j>=0 && employees[j].employeeNumber>temp.employeeNumber)
			{
				employees[j+1] = employees[j];
				j--;
			}
			employees[j+1] = temp;
		}
	}
	public static void main(String[] args){
        EmployeeWithInsertionSort list = new EmployeeWithInsertionSort(4);
        Employee emp1 = new Employee(123456789,"Rax1","Cholera","raxtest1@gmail.com");
        list.employees[0] = emp1;
        Employee emp2 = new Employee(987654321,"Rax2","Cholera","raxtest2@gmail.com");
        list.employees[1] = emp2;
        Employee emp3 = new Employee(192837465,"Rax3","Cholera","raxtes3@gmail.com");
        list.employees[2] = emp3;
        Employee emp4 = new Employee(912837465,"Rax4","Cholera","raxtest4@gmail.com");
        list.employees[3] = emp4;
        list.insertionSort();	
        System.out.println(Arrays.deepToString(list.employees));

	}

}

class Employee {
	public int employeeNumber;
	public String firstName;
	public String lastName;
	public String email;
	
	public Employee(int employeeNumber, String firstName, String lastName,String email) {
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public String toString() {
		return this.employeeNumber + " : " + this.email;
	}

}