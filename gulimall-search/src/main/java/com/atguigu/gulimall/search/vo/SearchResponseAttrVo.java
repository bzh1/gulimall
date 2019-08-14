package com.atguigu.gulimall.search.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class SearchResponseAttrVo implements Serializable {

    private Long productAttributeId;//1  品牌
    //当前属性值的所有值
    private List<String> value = new ArrayList<>(); //JSON字符串 {catelogId:1,name:华为,logo:xxx},{id:2,name:小米}
    //属性名称
    private String name;//网络制式，分类   品牌
}
