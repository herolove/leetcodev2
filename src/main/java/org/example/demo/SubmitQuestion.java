package org.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/9/9
 **/
public class SubmitQuestion {
    /**
     * 模板id
     */
    private Integer templateId;
    /**
     * 附加的其他属性参数
     * 比如leadSign ：权益leadSign
     * 配置页面配置key 的名字
     */
    private Map<String, Object> attach = new HashMap<>();
    /**
     * 要提交的数据
     */
    private List<HtmlElement> elements;
}
