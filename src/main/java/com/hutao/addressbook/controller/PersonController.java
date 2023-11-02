package com.hutao.addressbook.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hutao.addressbook.common.Result;
import com.hutao.addressbook.dto.PageDto;
import com.hutao.addressbook.entity.Person;
import com.hutao.addressbook.service.impl.PersonService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xxx
 * @date 2023/10/31 17:41
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Resource
    private PersonService personService;
    @GetMapping
    public Result<List<Person>> findAll(){
        return Result.success(personService.selectList(null));
    }
    // 新增用户
    @PostMapping
    public Result addPerson(@RequestBody Person person){
        personService.insert(person);
        return Result.success();

    }
    @PutMapping
    public Result update(@RequestBody Person person){
        Person personDo=new Person();
        personDo.setName(person.getName());
        personDo.setAddress(person.getAddress());
        personDo.setTelephone(person.getTelephone());
        UpdateWrapper<Person> queryWrapper=new UpdateWrapper<>();
        queryWrapper.eq("id",person.getId());


      personService.update(personDo,queryWrapper);
      return Result.success();
    }
    // 根据id查询用户
    @GetMapping("/{id}")
    public Result<Person> findById(@PathVariable("id") Long id){
      return Result.success(personService.selectById(id));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Long id){
         personService.deleteById(id);
         return Result.success();
    }
    // 分页查询用户
    @GetMapping("/page")
    public Result<PageDto<Person>> findPage(@RequestParam(defaultValue = "1") Integer pageNum,
                                       @RequestParam(defaultValue = "2") Integer pageSize,
                                       @RequestParam(required = false) String name) {
        IPage<Person> page=new Page<>(pageNum,pageSize);
        QueryWrapper<Person> queryWrapper = new QueryWrapper<>();
        if (name != null) {
            queryWrapper.like("name", name);
        }

        Long totalElements=personService.selectPage(page,queryWrapper).getTotal();
        Long pages=personService.selectPage(page,queryWrapper).getPages();

        return Result.success(new PageDto<Person>(totalElements,pages,personService.selectPage(page,queryWrapper).getRecords()) );
    }

}
