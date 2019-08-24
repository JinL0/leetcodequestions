package dfs;

import java.util.List;
import java.util.ArrayList;
public class nestedListWeightSum
{
    public static class NestedInteger {
        private List<NestedInteger> list;
        private Integer integer;

        public NestedInteger(List<NestedInteger> list){
            this.list = list;
        }

        public void add(NestedInteger nestedInteger) {
            if(this.list != null){
                this.list.add(nestedInteger);
            } else {
                this.list = new ArrayList();
                this.list.add(nestedInteger);
            }
        }

        public void setInteger(int num) {
            this.integer = num;
        }

        public NestedInteger(Integer integer){
            this.integer = integer;
        }

        public NestedInteger() {
            this.list = new ArrayList();
        }

        public boolean isInteger() {
            return integer != null;
        }

        public Integer getInteger() {
            return integer;
        }

        public List<NestedInteger> getList() {
            return list;
        }

        public String printNi(NestedInteger thisNi, StringBuilder sb){
            if(thisNi.isInteger()) {
                sb.append(thisNi.integer);
                sb.append(",");
            }
            sb.append("[");
            for(NestedInteger ni : thisNi.list){
                if(ni.isInteger()) {
                    sb.append(ni.integer);
                    sb.append(",");
                }
                else {
                    printNi(ni, sb);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public nestedListWeightSum()
    {

    }
    public int nestedListWeightSum(List<NestedInteger> nastedList)
    {
        return sumByLevel(nastedList, 1);
    }

    private int sumByLevel(List<NestedInteger> nastedList, int level)
    {
        int result = 0;
        if(nastedList == null || nastedList.size() == 0) return result;
        for (NestedInteger nestedInteger : nastedList)
        {
            if (nestedInteger.isInteger()) result += nestedInteger.getInteger() * level;
            else result += sumByLevel(nestedInteger.getList(), level + 1);
        }
        return result;
    }


}
