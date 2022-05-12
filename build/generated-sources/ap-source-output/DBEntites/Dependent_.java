package DBEntites;

import DBEntites.DependentPK;
import DBEntites.Employee;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-05-12T17:56:26")
@StaticMetamodel(Dependent.class)
public class Dependent_ { 

    public static volatile SingularAttribute<Dependent, DependentPK> dependentPK;
    public static volatile SingularAttribute<Dependent, Date> bdate;
    public static volatile SingularAttribute<Dependent, Character> sex;
    public static volatile SingularAttribute<Dependent, String> relationship;
    public static volatile SingularAttribute<Dependent, Employee> employee;

}