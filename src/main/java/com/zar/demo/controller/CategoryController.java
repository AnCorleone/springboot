package com.zar.demo.controller;

import com.zar.demo.pojo.Category;
import com.zar.demo.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Anakin(Administrator)
 * @date 2018/9/14 15:10
 * 描述     ${TODO}
 */
@RestController
class CategoryController {

    @Autowired
    CategoryService mCategoryService;

    @RequestMapping("/list")
    public List<Category> listCategory() {
        System.out.println("##############");
        final List<Category> categories = mCategoryService.findAll();
        System.out.println("##############  categories   " + categories);
        return categories;
    }

    @RequestMapping("/get")
    public Category get() {
        final Category category = mCategoryService.get(1);
        return category;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
