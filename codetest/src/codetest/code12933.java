package codetest;

import java.util.Arrays;
import java.util.Collections;

public class code12933 {

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
	


}
