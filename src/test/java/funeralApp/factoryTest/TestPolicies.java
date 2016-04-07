package funeralApp.factoryTest;

import funeralApp.domain.Policy;
import funeralApp.domain.PolicyOne;
import funeralApp.domain.PolicyThree;
import funeralApp.domain.PolicyTwo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/04/03.
 */
public class TestPolicies
{
    Policy policyThree;
    Policy policyTwo;
    Policy policyOne;

    @Before
    public void setUp() throws Exception
    {
        policyOne = new PolicyOne();
        policyTwo = new PolicyTwo();
        policyThree = new PolicyThree();
    }

    @Test
    public void testPolicyThree() throws Exception
    {
        Assert.assertSame(policyOne.policyType("one"),"Policy 1");
        Assert.assertSame(policyTwo.policyType("two"),"Policy 2");
        Assert.assertSame(policyThree.policyType("three"),"Policy 3");
    }
}
