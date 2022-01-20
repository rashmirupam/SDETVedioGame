package override;

import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee(3 ," rashmi") ;
        Employee e1= new Employee(3 ," rashmi") ;
        System.out.println(e==e1);
        System.out.println(e.equals(e1));

        People p = new People(3, "female") ;
        People p1= new People(3, "female") ;
        System.out.println(p==p1);
        System.out.println(p.equals(p1));
            }
        }

    class Employee {
        int id;
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;

        }

    }


    class People {
        int count;
        String gender;

        public People(int count, String gender) {
            this.count = count;
            this.gender = gender;
        }
    }
