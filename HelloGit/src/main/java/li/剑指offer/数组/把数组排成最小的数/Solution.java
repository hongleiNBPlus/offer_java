package li.剑指offer.数组.把数组排成最小的数;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 题目描述：输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 *
 * 思路：将数组按拼接最小字符串来进行排序
 * 自定义comparator
 */

public class Solution {
    public String PrintMinNumber(int [] numbers){
        StringBuilder res = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : numbers) list.add(i);

        list.sort((o1, o2) -> {
            String s1 = o1 + "" + o2;
            String s2 = o2 + "" + o1;
            return s1.compareTo(s2);
        });
        for(int i : list) res.append(i);

        return res.toString();
    }
}
