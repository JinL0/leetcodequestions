import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import dfs.nestedListWeightSum.NestedInteger;
import dfs.nestedListWeightSum;

import java.util.Arrays;
import java.util.List;

public class nestedListWeightSumTest {
    NestedInteger one = new NestedInteger(1);
    NestedInteger two = new NestedInteger(2);
    NestedInteger four = new NestedInteger(4);
    NestedInteger six = new NestedInteger(6);
    NestedInteger oneList = new NestedInteger(Arrays.asList(one, one));
    NestedInteger fourList = new NestedInteger(Arrays.asList(four));
    NestedInteger sixList = new NestedInteger(Arrays.asList(six));

    @Test
    public void testedWithTwoLevels()
    {
        List<NestedInteger> testList = Arrays.asList(oneList, two, oneList);
        nestedListWeightSum cons = new nestedListWeightSum();
        Assertions.assertEquals(cons.nestedListWeightSum(testList), 10);
    }

    @Test
    public void testNull()
    {
        nestedListWeightSum cons = new nestedListWeightSum();
        Assertions.assertEquals(cons.nestedListWeightSum(null), 0);
    }

    @Test
    public void testThreeLevelNestedlist()
    {
        fourList.getList().add(sixList);
        List<NestedInteger> testList = Arrays.asList(one, fourList);
        nestedListWeightSum cons = new nestedListWeightSum();
        Assertions.assertEquals(cons.nestedListWeightSum(testList), 27);
    }

}
