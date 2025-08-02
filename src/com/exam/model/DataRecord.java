package com.exam.model;

import java.util.Set;

/**
 * 数据记录接口
 * 定义数据记录的基本操作
 */
public interface DataRecord {
    /**
     * 获取指定字段的值
     * @param fieldName 字段名
     * @return 字段值
     */
    Object getField(String fieldName);
    
    /**
     * 设置指定字段的值
     * @param fieldName 字段名
     * @param value 字段值
     */
    void setField(String fieldName, Object value);
    
    /**
     * 检查是否包含指定字段
     * @param fieldName 字段名
     * @return 是否包含
     */
    boolean hasField(String fieldName);
    
    /**
     * 获取所有字段名
     * @return 字段名集合
     */
    Set<String> getFieldNames();
}
