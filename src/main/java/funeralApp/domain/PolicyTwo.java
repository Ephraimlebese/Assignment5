package funeralApp.domain;

/**
 * Created by student on 2016/04/06.
 */
public class PolicyTwo extends Policy
{
    @Override
    public String policyType(String type)
    {
        if(type.equalsIgnoreCase("Two"))
        {
            return "Policy 2";
        }
        else
        {
            return nextPolicy.policyType(type);
        }
    }
}
