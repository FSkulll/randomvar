import java.math.BigDecimal;
import java.util.*;

/**
 * Created by FSkul on 29.11.2016.
 */
public class Test {
    private static int n = 10000;
    public static void main(String[] args) {
//     random = new Random();
        Map<Double, Integer> map = new HashMap<Double, Integer>();
        Double key = Math.random();
        key = Math.round(key* Math.pow(10,4))/Math.pow(10,4);
//        for(int i = 0; i < n; i++){
//            try {
//                Integer a = Integer.parseInt(key.toString().replace("0.",""));
//                key = Math.pow(a,2);
//                key = Math.round(key* Math.pow(10,8))/Math.pow(10,8);
//
//                Long ln = Double.valueOf(key).longValue();
//                String str;
//                if(ln.toString().length() == 2) str = "0." + ln.toString();
//                if(ln.toString().length() < 6) str = "0." + ln.toString()+"000000";
//                else str = "0." + ln.toString().substring(2, 6);
//                key = Double.parseDouble(str);
//
//
//                //transform to 0.?
//                Double tmp = Math.round(key* Math.pow(10,1))/Math.pow(10,1);
//                Integer temp = map.get(tmp);
//                map.put(tmp, temp == null ? 1 : temp + 1);
//            } catch (NumberFormatException e) {
//                key = Math.random();
//                key = Math.round(key* Math.pow(10,4))/Math.pow(10,4);
//            }
//        }
        SortedMap<Double, Integer> test = new TreeMap<Double, Integer>(map);
        System.out.println(test);
    }
}
