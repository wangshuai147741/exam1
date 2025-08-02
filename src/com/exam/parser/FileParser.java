package com.exam.parser;

import com.exam.model.DataRecord;
import java.io.IOException;
import java.util.List;

/**
 * 文件解析器接口
 */
public interface FileParser {
    /**
     * 解析文件
     * @param filePath 文件路径
     * @return 数据记录列表
     * @throws IOException 如果文件读取失败
     */
    List<DataRecord> parse(String filePath) throws IOException;
}
