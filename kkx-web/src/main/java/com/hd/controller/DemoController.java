package com.hd.controller;

import com.hd.common.utils.SortUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenwenjun
 * @date: 2023/2/19 16:03
 * @description: TODO
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    SortUtil sortUtil;
    @RequestMapping("sort")
    public void sort(){
        int num=10000;
        List list=new ArrayList();
        for(int i=0;i<num ;i++){
            int a= (int) (Math.random()*num);
            //System.out.println(a);
            list.add(a);
        }
        sortUtil.bubbleSort(list.toArray());
    }
}
