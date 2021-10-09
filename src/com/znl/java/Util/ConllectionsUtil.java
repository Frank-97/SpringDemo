package com.znl.java.Util;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Package: com.znl.java.Util
 * @ClassName: ConllectionsUtil
 * @Author Frank
 * @Data 2021-09-05-15:35
 * @Description:
 * Collections可以对List,Set,以及Map集合进行操作的工具类
 *
 * 测试一下API的用法：
 * 　　reverse():反转  倒序输出
 *
 */
public class ConllectionsUtil {

    @Test
    public void test(){

        List list = new ArrayList();
        list.add("123");
        list.add("234");
        list.add("456");
        list.add("122");
        list.add("125");
        list.add("123");
        Collections.reverse(list);

        System.out.println("反转"+list);

        Collections.shuffle(list);
        System.out.println("随机排序 ："+list);

        Collections.sort(list);
        System.out.println("自然排序："+list);



        List list1 = new ArrayList();
        list1.add("123");
        list1.add("234");

        Collections.swap(list1,0,1);
        System.out.println("交换元素："+list1);


        int frequency = Collections.frequency(list, "123");
        System.out.println("出现的频率："+frequency);


        List dest = new ArrayList(Arrays.asList(new Object[list1.size()]));
        Collections.copy(dest,list1);
        System.out.println(dest);
    }
}
