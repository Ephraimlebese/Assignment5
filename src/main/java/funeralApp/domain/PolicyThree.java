package funeralApp.domain;

/**
 * Created by student on 2016/04/06.
 */
public class PolicyThree extends Policy
{
    @Override
    public String policyType(String type)
    {
        if(type.equalsIgnoreCase("Three"))
        {
            return "Policy 3";
        }
        else
        {
            return nextPolicy.policyType(type);
        }
    }
}
