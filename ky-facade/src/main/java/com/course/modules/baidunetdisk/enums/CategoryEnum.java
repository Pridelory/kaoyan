package com.course.modules.baidunetdisk.enums;

/**
 * 文件类型（百度云Api的命名）
 */
public enum CategoryEnum {

    VIDEO(1, "视频"),
    AUDIO(2, "音频"),
    PICTURE(3, "图片"),
    DOCUMENT(4, "文档"),
    APPLICATION(5, "应用"),
    OTHERTYPE(6, "其他"),
    SEED(7, "种子");


    private Integer value;
    private String desc;


    CategoryEnum(final Integer value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
