package DBEntites;

import DBEntites.DeptLocations;
import DBEntites.Employee;
import DBEntites.Project;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-07T20:51:33")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, Date> mgrstartdate;
    public static volatile SingularAttribute<Department, Integer> dno;
    public static volatile SingularAttribute<Department, Employee> mgrssn;
    public static volatile CollectionAttribute<Department, Employee> employeeCollection;
    public static volatile SingularAttribute<Department, String> dname;
    public static volatile CollectionAttribute<Department, DeptLocations> deptLocationsCollection;
    public static volatile CollectionAttribute<Department, Project> projectCollection;

}