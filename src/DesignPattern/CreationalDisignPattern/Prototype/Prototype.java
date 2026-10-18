package DesignPattern.CreationalDisignPattern.Prototype;

public class Prototype {

    static class Employee implements Cloneable {
        private String name;
        private String department;
        private String city;

        public Employee(String name,String department,String city){
         this.name = name;
         this.department = department;
         this.city = city;
        }

        protected Employee clone() throws CloneNotSupportedException {
            try{
                return (Employee) super.clone();
            }catch(CloneNotSupportedException e){
                throw new RuntimeException(e);
            }
        }
        public void display(){
            System.out.println("Name: " + name + ", Department: " + department + ", City: " + city);
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee originalEmployee = new Employee("John Doe", "Engineering", "New York");
        Employee clonedEmployee = originalEmployee.clone();

        originalEmployee.display();
        clonedEmployee.display();
        System.out.println(originalEmployee == clonedEmployee); // false
    }
}
