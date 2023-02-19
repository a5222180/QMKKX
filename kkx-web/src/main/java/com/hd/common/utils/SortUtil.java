package com.hd.common.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chenwenjun
 * @date: 2023/2/18 17:44
 * @description: 一些排序算法
 */
@Component
public class SortUtil {

    public static void main(String[] args) {
        SortUtil sortUtil=new SortUtil();
        //自定义数组
        //Object[] c={0, 8, 2, 6, 0, 1, 5, 2, 6, 0, 15, 2, 15, 16, 4, 13, 17, 4, 18, 19};
        //数组长度
        int num=10;
        //定义一个空集合存放数组
        List list=new ArrayList();
        for(int i=0;i<num ;i++){
            int a= (int) (Math.random()*num);
            //System.out.println(a);
            list.add(a);
        }
        sortUtil.bubbleSort(list.toArray());
    }
    //冒泡排序
    public  Object[] bubbleSort(Object[] arr){
        if (ArrayUtils.isNotEmpty(arr)){
            //是否完成排序
            boolean isSort=false;
            //数组长度，需要排序的个数
            int arrLength=arr.length;
            //交换临时变量
            int temp;
            for (int j=0;j<arrLength-1;j++){
                isSort=true;
                //每次循环完成后，则确定一个最大值，所以里层循环无需执行全部数组长度，需减去循环次数j
                for (int i=0;i<(arr.length-1)-j;i++) {
                    //比较数组开头两个元素，如果左边元素更大则交换位置，并且把isSort设置成未完成排序
                    if ((int)arr[i]>(int)arr[i+1]){
                        temp=(int)arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        isSort=false;
                    }
                }
                //for循环完成后，如果没有执行过交换，则认为数组已有序，跳出最外层循环
                if (isSort){
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
}
