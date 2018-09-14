package com.zar.demo.service;

import com.zar.demo.pojo.Category;

import java.util.List;

/**
 * @author Anakin(Administrator)
 * @date 2018/9/14 15:12
 * 描述     ${TODO}
 */
public interface CategoryService {
   List<Category> findAll();
   Category get(int id);
}
