package funeralApp.domain;

/**
 * Created by student on 2016/04/06.
 */
public class PolicyOne extends Policy {

    @Override
    public String policyType(String type)
    {
        if(type.equalsIgnoreCase("One"))
        {
            return "Policy 1";
        }
        else
        {
            return nextPolicy.policyType(type);
        }
    }
}
