package com.panlong.test.Dayfour;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lianxi {
    public static void main(String[] args) {
        /*1.9 Map集合练习
需求：
计算一个字符串中每个字符出现次数。
分析：
1. 获取一个字符串对象
2. 创建一个Map集合，键代表字符，值代表次数。
3. 遍历字符串得到每个字符。
4. 判断Map中是否有该键。
5. 如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
6. 打印最终结果
*/

        HashMap<Character,Integer> map = new HashMap<>();
        String s="aaabbbcccdddddde";

        Integer count=1;
        for (int i = 0; i < s.length(); i++) {

            if(map.get(s.charAt(i))==null) {
                count=1;
                map.put(s.charAt(i),count++);
            }else{
                map.put(s.charAt(i),count++);
            }
        }
            Set<Map.Entry<Character, Integer>> set = map.entrySet();
            for (Map.Entry<Character, Integer> entry : set) {
                System.out.println(entry.getKey()+"="+entry.getValue());
            }

    }
}
