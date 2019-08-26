package dfs;


import java.util.HashSet;
import java.util.List;

public class wordLadders {
    public int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        if(wordList.isEmpty()){
            return 0;
        }
        HashSet<String> beginSet = new HashSet<>();
        HashSet<String> endSet = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        while(!beginSet.isEmpty() && !endSet.isEmpty()){
            if(beginSet.size() > endSet.size()){
                HashSet<String> temp = beginSet;
                beginSet = endSet;
                endSet = temp;
            }
            //Todo

        }
        return 0;
    }
}
