package com.hd.common.utils;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chenwenjun
 * @date: 2023/2/18 17:44
 * @description: 一些排序算法
 */
public class SortUtil {

    public static void main(String[] args) {
        //Object[] c={0, 8, 2, 6, 0, 1, 5, 2, 6, 0, 15, 2, 15, 16, 4, 13, 17, 4, 18, 19};
        //数组长度
        int num=10;
        List list=new ArrayList();
        for(int i=0;i<num ;i++){
            int a= (int) (Math.random()*num);
            //System.out.println(a);
            list.add(a);
        }
        bubbleSort(list.toArray());
    }
    //冒泡排序
    public static Object[] bubbleSort(Object[] arr){
        if (ArrayUtils.isNotEmpty(arr)){
            //是否完成排序
            boolean isSort=false;
            //数组长度，需要排序的个数
            int arrLength=arr.length;
            //交换临时变量
            int temp;
            for (int j=0;j<arrLength-1;j++){
                isSort=true;
                //1.比较数组开头两个元素，如果左边元素更大则交换位置，否则不做操作
                for (int i=0;i<(arr.length-1)-j;i++) {
                    if ((int)arr[i]>(int)arr[i+1]){
                        temp=(int)arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                        isSort=false;
                    }
                }
                if (isSort){
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
