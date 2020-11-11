package org.example.demo;

import java.util.List;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/9/9
 **/
public class TemplateMaterial {
    /**
     * html 标签类型 MaterialTypeEnum
     */
    private String tagType;
    /**
     *  标签说明
     */
    private String instruction;
    /**
     * 是否必填 1:必填
     */
    private Integer require;
    /**
     * 节点的html label标签
     */
    private String label;
    /**
     * 标签 属性 name
     */
    private String name;
    /**
     * 标签内容校验的正则表达式
     * regex
     */
    private String regex;
    /**
     * html tag element
     */
    private List<HtmlElement> elements;
}
