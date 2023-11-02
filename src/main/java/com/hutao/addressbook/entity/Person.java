package com.hutao.addressbook.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author xxx
 * @date 2023/10/31 17:30
 */
@Data
@TableName("person")
public class Person {
   private int id;
   private String name;
   private String address;
   private String telephone;

}
