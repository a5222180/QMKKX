package com.hd.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName movie
 */
@TableName(value ="movie")
@Data
public class Movie implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 影视名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 年份
     */
    @TableField(value = "year")
    private Object year;

    /**
     * 地区
     */
    @TableField(value = "area")
    private String area;

    /**
     * 影视类型
     */
    @TableField(value = "type")
    private String type;

    /**
     * 是否有资源
     */
    @TableField(value = "resource")
    private String resource;

    /**
     * 推荐指数
     */
    @TableField(value = "recommend")
    private String recommend;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private LocalDateTime updateTime;
}