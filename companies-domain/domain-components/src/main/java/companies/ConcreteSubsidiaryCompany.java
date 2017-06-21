package companies;


public class ConcreteSubsidiaryCompany
        extends AbstractCompany<SubsidiaryCompany>
        implements SubsidiaryCompany {
    private Company parent;

    @Override
    public Company getParent() {
        return parent;
    }
}
