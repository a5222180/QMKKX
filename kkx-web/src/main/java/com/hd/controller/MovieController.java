package com.hd.controller;

import com.hd.common.utils.LayuiResult;
import com.hd.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: HuDi
 * @Date: 2023/3/14 21:39
 * @Description: TODO
 */
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @RequestMapping("list")
    public LayuiResult getList(){
        LayuiResult a=LayuiResult.success(movieService.list());
        return a;
    }
}
