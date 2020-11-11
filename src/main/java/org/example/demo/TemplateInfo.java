package org.example.demo;

import java.util.List;

/**
 * @Description 模板
 * @Author zhangtao02
 * @Date 2020/9/9
 **/
public class TemplateInfo {
    /**
     * 模板id
     */
    private Integer id;
    /**
     * 模板名字
     */
    private String name;
    /**
     * 模板贴士
     */
    private String tips;
    /**
     * 前端心态
     * 0：所有端都能用，一般的表单 1:H5页面，2：PCweb页面，3：PC弹窗组件（本期不做
     */
    private Integer templateType;
    /**
     * 模板材料配置
     */
    private List<TemplateMaterial> materials;
}
