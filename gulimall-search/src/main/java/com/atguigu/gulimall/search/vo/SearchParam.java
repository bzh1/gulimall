package com.atguigu.gulimall.search.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 检索前端传递的数据
 */
@Data
public class SearchParam implements Serializable {


    // search?catelog3=225&catelog3=223&brand=1&brand=2&props=43:3g-4g-5g&props=45:4.7-5.0
    // &order=2:asc&priceFrom=100&priceTo=10000&pageNum=1&pageSize=12&keyword=手机
    private Long[] catelog3;//三级分类id

    private Long[] brand;//品牌id

    private String keyword;//检索的关键字

    // order=0:asc  排序规则   0:asc
    private String order;// 0：综合排序  1：销量  2：价格

    private Integer pageNum = 1;//分页信息

    //props=2:全高清&  如果前端想传入很多值    props=2:青年-老人-女士
	
	//2:win10-android-
	//3:4g
	//4:5.5   格式：  属性id：属性值1-属性值2
    private String[] props;//页面提交的数组

    private Integer pageSize = 1;

    private Integer priceFrom;//价格区间开始
    private Integer priceTo;//价格区间结束


}
