import java.util.*;

class Solution {

    public static int countResponseTimeRegressions(List<Integer> responseTimes) {

        if (responseTimes == null || responseTimes.size() <= 1) {
            return 0;
        }

        long sum = responseTimes.get(0);
        int count = 0;

        for (int i = 1; i < responseTimes.size(); i++) {

            long average = sum / i;

            if (responseTimes.get(i) > average) {
                count++;
            }

            sum += responseTimes.get(i);
        }

        return count;
    }
}
