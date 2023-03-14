package com.hd.common.utils;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: HuDi
 * @Date: 2023/3/14 22:09
 * @Description: TODO
 */
public class LayuiResult extends HashMap {
    private String code;
    private String msg;
    private long count;
    private List data;

    public LayuiResult(String code,String msg,long count,List data){
        super.put("code",code);
        super.put("msg",msg);
        super.put("count",data.size());
        super.put("data",data);
    }

    public static LayuiResult success(List data){
        return new LayuiResult("200","成功",data.size(),data);
    }
}
