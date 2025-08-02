package com.exam.processor;

import com.exam.model.DataRecord;
import java.util.List;

/**
 * 数据处理器接口
 */
public interface DataProcessor {
    /**
     * 处理数据记录
     * @param records 待处理的数据记录列表
     * @return 处理后的数据记录列表
     */
    List<DataRecord> process(List<DataRecord> records);
}
