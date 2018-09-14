package com.zar.demo.service.impl;

import com.zar.demo.mapper.CategoryMapper;
import com.zar.demo.pojo.Category;
import com.zar.demo.pojo.CategoryExample;
import com.zar.demo.service.CategoryService;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Anakin(Administrator)
 * @date 2018/9/14 15:13
 * 描述     ${TODO}
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    /**
     * 会报错,但是不影响
     */
    @Autowired
    CategoryMapper mCategoryMapper;

    @Override
    public List<Category> findAll() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        List<Category> categories = mCategoryMapper.selectByExample(example);
        return categories;
    }

    @Override
    public Category get(int id) {
        return   mCategoryMapper.selectByPrimaryKey(id);
    }
}
