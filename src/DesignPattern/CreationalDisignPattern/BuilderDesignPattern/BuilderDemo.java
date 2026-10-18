package DesignPattern.CreationalDisignPattern.BuilderDesignPattern;

public class BuilderDemo {

    static class Employee {
        private String name;
        private int age;
        private String technology;
        private String city;
        private String company;
        private double salary;

        private Employee(Builder builder){
            this.name = builder.name;
            this.age = builder.age;
            this.technology = builder.technology;
            this.city = builder.city;
            this.company = builder.company;
            this.salary = builder.salary;

        }
        public static class Builder {
            private String name;
            private int age;
            private String technology;
            private String city;
            private String company;
            private double salary;

            public Builder name(String name){
                this.name = name;
                return this;
            }
            public Builder age(int age){
                this.age = age;
                return this;
            }
            public Builder technology(String technology){
                this.technology = technology;
                return this;
            }
            public Builder city(String city){
                this.city = city;
                return this;
            }
            public Builder company(String company){
                this.company = company;
                return this;
            }
            public Builder salary(double salary){
                this.salary = salary;
                return this;
            }
            public Employee build(){
                return new Employee(this);
            }
        }
    }
    public static void main(String[] args){
        Employee employee = new Employee.Builder()
                .name("Ashutosh Kumar")
                .age(35)
                .technology("Java")
                .city("Bangalore")
                .company("TCS")
                .salary(100000)
                .build();
        System.out.println("Employee Details: ");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Technology: " + employee.technology);
        System.out.println("City: " + employee.city);
        System.out.println("Company: " + employee.company);
        System.out.println("Salary: " + employee.salary);

    }
}
