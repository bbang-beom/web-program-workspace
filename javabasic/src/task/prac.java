package task;

import java.util.Arrays;
import java.util.Collections;

public class prac {
    public static void main(String[] args) {
        int[] diffs = {1, 5, 3};
        int[] times = {2, 4, 7};
        long limit = 30;
        long totalTime = 0;
        long result = 0;
        long maxLevel = 0;
        // diff ≤ level이면 퍼즐을 틀리지 않고 time_cur만큼의 시간을 사용하여 해결합니다.
        // diff > level이면, 퍼즐을 총 diff - level번 틀립니다. 

        // 퍼즐을 틀릴 때마다, time_cur만큼의 시간을 사용하며, 
        // 추가로 time_prev만큼의 시간을 사용해 이전 퍼즐을 다시 풀고 와야 합니다.
        // 이전 퍼즐을 다시 풀 때는 이전 퍼즐의 난이도에 상관없이 틀리지 않습니다
        // diff - level번 틀린 이후에 다시 퍼즐을 풀면 time_cur만큼의 시간을 사용하여 퍼즐을 해결합니다.
        // totalTime =  (diff - level) * (time_cur + time_prev) + time_cur
        Integer[] arrayDiffs = Arrays.stream(diffs).boxed().toArray(Integer[]::new);
        Arrays.sort(arrayDiffs, Collections.reverseOrder());
        maxLevel = arrayDiffs[0];
        for(int posLevel = 1; posLevel < maxLevel; posLevel++) {
            for(int i = 0; i < diffs.length; i++) {
                if(diffs[i] - posLevel > 0) {
                	totalTime += (long)(diffs[i] - posLevel) * (times[i] + times[i-1]) + times[i];
                	System.out.println(totalTime);
                } else {
                	totalTime += (long)times[i];
                	System.out.println(totalTime);
                }
            }
         if(totalTime <= limit) {
                result = posLevel;
                System.out.println(posLevel);
                break;
            } else{
            	totalTime = 0;
            }
        }
        System.out.println(result);
    }
}
