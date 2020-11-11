package org.example.demo;

/**
 * @Description TODO
 * @Author zhangtao02
 * @Date 2020/9/9
 **/
public enum MaterialTypeEnum {
    INPUT("input"),
    TEXTAREA("textarea"),
    RADIO("radio"),
    CHECKBOX("checkbox");
    private String value;

    MaterialTypeEnum(String value) {
        this.value = value;
    }
}
