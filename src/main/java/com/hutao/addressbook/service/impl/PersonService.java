package com.hutao.addressbook.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hutao.addressbook.entity.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author xxx
 * @date 2023/10/31 17:39
 */
@Mapper
public interface PersonService extends BaseMapper<Person> {
}
