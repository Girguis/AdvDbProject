package DBEntites;

import DBEntites.Department;
import DBEntites.Dependent;
import DBEntites.Employee;
import DBEntites.WorksOn;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-12T17:56:26")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, String> fname;
    public static volatile SingularAttribute<Employee, Date> bdate;
    public static volatile SingularAttribute<Employee, String> address;
    public static volatile SingularAttribute<Employee, Department> dno;
    public static volatile SingularAttribute<Employee, Character> sex;
    public static volatile CollectionAttribute<Employee, WorksOn> worksOnCollection;
    public static volatile SingularAttribute<Employee, String> phonenumber;
    public static volatile SingularAttribute<Employee, Character> minit;
    public static volatile SingularAttribute<Employee, Double> salary;
    public static volatile CollectionAttribute<Employee, Dependent> dependentCollection;
    public static volatile SingularAttribute<Employee, String> ssn;
    public static volatile CollectionAttribute<Employee, Department> departmentCollection;
    public static volatile SingularAttribute<Employee, Employee> superssn;
    public static volatile SingularAttribute<Employee, String> lname;
    public static volatile CollectionAttribute<Employee, Employee> employeeCollection;

}