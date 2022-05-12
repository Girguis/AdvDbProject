package DBEntites;

import DBEntites.Department;
import DBEntites.WorksOn;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-12T17:56:26")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, Department> dno;
    public static volatile SingularAttribute<Project, String> plocation;
    public static volatile SingularAttribute<Project, String> pname;
    public static volatile CollectionAttribute<Project, WorksOn> worksOnCollection;
    public static volatile SingularAttribute<Project, Integer> pnumber;

}