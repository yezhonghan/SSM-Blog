package com.ssm.blog.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 菜单实体类
 */
@Data
public class Menu implements Serializable {
    private static final long serialVersionUID = 489914127235951698L;
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private Integer menuLevel;

    private String menuIcon;

    private Integer menuOrder;

}