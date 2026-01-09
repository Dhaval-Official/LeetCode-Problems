package Problems.Problems_Mix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_3318 {
/*clean way
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = buildFrequency(nums, i, k);
            List<Integer> topElements = getTopX(freq, x);
            answer[i] = calculateSum(freq, topElements);
        }

        return answer;

    }

    public Map<Integer, Integer> buildFrequency(int[] nums, int start, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = start; i < start + k; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        return freq;
    }

    public List<Integer> getTopX(Map<Integer, Integer> freq, int x) {
        List<Integer> elements = new ArrayList<>(freq.keySet());

        elements.sort((a, b) -> {
//            int freqCompare = ;
            if (freq.get(b) - freq.get(a) != 0) {
                return freq.get(b) - freq.get(a);
            }
            return b - a;
        });

        return elements.subList(0, Math.min(x, elements.size()));
    }

    public int calculateSum(Map<Integer, Integer> freq, List<Integer> elements) {
        int sum = 0;

        for (int num : elements) {
            sum += num * freq.get(num);
        }

        return sum;
    }
*/


    /*Unclean Way*/
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            // Step 1: Frequency count
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // Step 2: Sort by frequency desc, value desc
            List<Integer> keys = new ArrayList<>(freq.keySet());
            keys.sort((a, b) -> {
                if (!freq.get(a).equals(freq.get(b))) {
                    return freq.get(b) - freq.get(a); // higher freq first
                }
                return b - a; // higher value first
            });

            // Step 3: Sum top x elements
            int sum = 0;
            for (int t = 0; t < Math.min(x, keys.size()); t++) {
                int val = keys.get(t);
                sum += val * freq.get(val);
            }

            answer[i] = sum;
        }

        return answer;
    }
}
