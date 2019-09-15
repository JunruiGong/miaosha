package com.miaoshaproject.validator;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: junruigong
 * @Date: 9/14/19
 * @Description: TODO
 */
@Getter
@Setter
public class ValidationResult {

    // 校验结果是否有错
    private boolean hasErrors = false;

    // 存放错误信息的map
    private Map<String, String> errorMsgMap = new HashMap<>();

    // 实现通过的通过格式化字符串信息获取错误结果的msg方法
    public String getErrMsg() {
        return StringUtils.join(errorMsgMap.values().toArray(), ",");
    }


}
