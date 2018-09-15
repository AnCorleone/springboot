package com.zar.demo.service;

import com.zar.demo.pojo.Category;

import java.util.List;

/**
 * @author Anakin(Administrator)
 * @date 2018/9/14 15:12
 * 描述     ${TODO}
 */
public interface CategoryService {
    /**
     * 列表
     *
     * @return
     */
    List<Category> findAll();

    /**
     * 查找
     *
     * @param id
     * @return
     */
    Category get(int id);

    /**
     * 删除
     *
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 插入
     *
     * @param category
     */
    void put(Category category);

    /**
     * 更新
     *
     * @param category
     */
    void update(Category category);
}
