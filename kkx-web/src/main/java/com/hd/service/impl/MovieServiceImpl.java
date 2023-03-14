package com.hd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hd.domain.Movie;
import com.hd.service.MovieService;
import com.hd.mapper.MovieMapper;
import org.springframework.stereotype.Service;

/**
* @author cwj
* @description 针对表【movie】的数据库操作Service实现
* @createDate 2023-03-14 21:32:48
*/
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements MovieService{

}




