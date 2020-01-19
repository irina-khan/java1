import java.util.*;
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String name , String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.println("Employee name: " + name + "; Employee position: " + position + "; e-mail: " + email + "; Phone number: " + phone + "; Salary: " + salary + "; Age: " + age);
    }

    public static void main(String[] args) {}
    public void arr(){

        Employee employee1 = new Employee("Ivan", "Manager" , "ivan@gmail.com", "12345678912", 30000, 43);

        Employee employee2 = new Employee("Petr" , "Saler", "Petr@yahoo.com", "123579882736", 25000,30);

        Employee employee3 = new Employee("Anna", "Secretary" , "Anna@gmail.com", "1236578954", 20000, 25);

        Employee employee4 = employee2;
        employee4.name = "Boris";
        employee4.email = "boris@mail.ru";
        employee4.phone = "12395128756";
        employee4.age = 27;

        Employee employee5 = employee2;
        employee5.name = "Kate";
        employee5.email = "kate@mail.ru";
        employee5.phone = "123456982357";
        employee5.age = 41;

        int empNum = 5;

        Employee[] empArr = new Employee[empNum];
        empArr[0] = employee1;
        empArr[1] = employee2;
        empArr[2] = employee3;
        empArr[3] = employee4;
        empArr[4] = employee5;

for(int i=0;i<empNum; i++){
    if (age >40)
        System.out.print(empArr[i]);
}

    }
}