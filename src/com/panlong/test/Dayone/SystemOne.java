package com.panlong.test.Dayone;
/*
* 3.1 currentTimeMillis方法

实际上，currentTimeMillis方法就是 获取当前系统时间与1970年01月01日00:00点之间的毫秒差值
3.2 arraycopy方法

- public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。

数组的拷贝动作是系统级的，性能很高。System.arraycopy方法具有5个参数，含义分别为：

  参数序号	参数名称   	参数类型  	参数含义
  1   	src    	Object	源数组
  2   	srcPos 	int   	源数组索引起始位置
  3   	dest   	Object	目标数组
  4   	destPos	int   	目标数组索引起始位置
  5   	length 	int   	复制元素个数




*/
public class SystemOne {
    public static void main(String[] args) {
        //获取当前时间毫秒值
        long time=System.currentTimeMillis();
        System.out.println(time);

        //验证for循环打印数字1-99999所需使用时间
        long start=System.currentTimeMillis();
        for (int i = 0; i < 99999; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("共耗时:"+(end-start));

//        练习
//
//        将src数组中前3个元素，复制到dest数组的前3个位置上复制元素前：
//        src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]复制元素后：src数组元素[1,2,3,4,5]，
//        dest数组元素[1,2,3,9,10]

        int[] src=new int[]{1,2,3,4,5};
        int[] dest=new int[]{6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);


    }
}
