package com.hd.controller;

import com.hd.common.utils.SortUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: HuDi
 * @Date: 2023/2/19 16:03
 * @Description: 一些测试接口
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    SortUtil sortUtil;
    @RequestMapping("sort")
    public void sort(){
        int num=100000;
        List<Object> list=new ArrayList<>();
        List<Object> list1=new ArrayList<>();
        for(int i=0;i<num ;i++){
            int a= (int) (Math.random()*num);
            //System.out.println(a);
            list.add(a);
            list1.add(a);
        }

        sortUtil.selectSort(list.toArray());
        sortUtil.bubbleSort(list1.toArray());

    }
}
