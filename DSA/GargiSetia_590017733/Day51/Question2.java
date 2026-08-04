import java.util.*;

class Solution {

    public static int firstInvalidRecord(List<List<String>> deliveries) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < deliveries.size(); i++) {

            List<String> record = deliveries.get(i);

            String vendor = record.get(0);
            String lot = record.get(1);
            String cert = record.get(2);

            String key = vendor + "#" + lot;

            if (!map.containsKey(key)) {
                map.put(key, cert);
            } else if (!map.get(key).equals(cert)) {
                return i;
            }
        }

        return -1;
    }
}