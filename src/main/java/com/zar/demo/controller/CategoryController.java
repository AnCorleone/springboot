package com.zar.demo.controller;

import com.zar.demo.pojo.Category;
import com.zar.demo.service.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
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


    @ApiOperation(value = "创建用户", notes = "根据Category对象创建用户")
    @ApiImplicitParam(name = "category", value = "用户详细实体category", required = true, dataType = "Category")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postCategory(@RequestBody Category category) {
        mCategoryService.put(category);
        return "success";
    }


    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable String id) {
        final Category category = mCategoryService.get(Integer.valueOf(id));
        return category;
    }

    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "String"),
            @ApiImplicitParam(name = "category", value = "用户详细实体Category", required = true, dataType = "Category")
    })
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable String id, @RequestBody Category category) {
        mCategoryService.update(category);
        return "success";
    }

    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable int id) {
        mCategoryService.delete(id);
        return "success";
    }


/*
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
*/


}
