package com.zar.demo.controller;

import com.zar.demo.pojo.Category;
import com.zar.demo.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * @author Anakin(Administrator)
 * @date 2018/9/14 15:10
 * 描述     ${TODO}
 */
@RestController
@RequestMapping("/category")
class CategoryController {

    @Autowired
    CategoryService mCategoryService;


    @ApiOperation(value = "获取分类信息", notes = "获取分类信息")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public List<Category> getCategoryList() {
        final List<Category> categories = mCategoryService.findAll();
        return categories;
    }


    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true,dataType = "int")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable int id) {
        final Category category = mCategoryService.get(id);
        return category;
    }
/*
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
*/

}
