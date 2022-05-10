package DBEntites;

import DBEntites.Employee;
import DBEntites.Project;
import DBEntites.WorksOnPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-07T20:51:33")
@StaticMetamodel(WorksOn.class)
public class WorksOn_ { 

    public static volatile SingularAttribute<WorksOn, BigDecimal> hours;
    public static volatile SingularAttribute<WorksOn, WorksOnPK> worksOnPK;
    public static volatile SingularAttribute<WorksOn, Project> project;
    public static volatile SingularAttribute<WorksOn, Employee> employee;

}