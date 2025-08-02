package com.exam.validator;

/**
 * 验证规则接口
 */
public interface ValidationRule {
    /**
     * 验证值是否符合规则
     * @param value 待验证的值
     * @return 是否符合规则
     */
    boolean validate(Object value);
    
    /**
     * 获取错误信息
     * @return 错误信息
     */
    String getErrorMessage();
}
