
import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;

    public Employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("g" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod implements Comparator<Employee>{
        BYNAME{
            @Override
            public int compare(Employee e1,Employee e2){
                return e1.getName().compareTo(e2.getName());
            }
        },
        BYSALARY{
            @Override
            public int compare(Employee e1,Employee e2){
                return Integer.compare(e1.getSalary(),e2.getSalary());
            }
        }
    };

    public List<Employee> sort(List<Employee> emps,final SortMethod method){
        List<Employee> empList = emps.stream().sorted(method).collect(Collectors.toList());
        return empList;
    }

    public boolean isCharacterPresentInAllNames(Collection<Employee> entities,String character){
        List<Employee> empList = (List<Employee>) entities;
        for(Employee e: empList){
            if(!e.getName().contains(character)){
                return false;
            }
        }
        return true;
    }
}

public class Source{
        public static void main(String[] args){
            Employee e1 = new Employee("Suresh",10000);
            Employee e2 = new Employee("Ram",50000);
            List<Employee> empList = new ArrayList<Employee>();
            empList.add(e1);
            empList.add(e2);
            EmployeeInfo empInfo = new EmployeeInfo();
            EmployeeInfo.SortMethod enum1 = EmployeeInfo.SortMethod.BYNAME;
            System.out.println(empInfo.sort(empList, enum1));
            System.out.println(empInfo.isCharacterPresentInAllNames(empList, "S"));
        }
}
