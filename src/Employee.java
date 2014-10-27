class Employee extends Person{
    double annual_salary;
    int year;
    String NIN;     //National Insurance Number
    public  void run(Employee e){
	   e.name = "James Bond";
       e.gender = "Male";
       e.age = 30;
	   e.annual_salary = 10000000000.00;
	   e.year = 2014;
	   e.NIN = "007";
	   
	   System.out.println("Name: "+ e.name);
       System.out.println("Gender: "+ e.gender);
       System.out.println("Age: "+ e.age);
	   System.out.println("Annual Salary: "+ e.annual_salary);
	   System.out.println("Year: "+ e.year);
	   System.out.println("National Insurance Number: "+ e.NIN);
    }
}
