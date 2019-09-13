package com.miaoshaproject.error;

import com.miaoshaproject.response.CommonReturnType;

/**
 * @Auther: junruigong
 * @Date: 9/13/19
 * @Description: TODO
 */
public enum EmBusinessError implements CommonError {

    // 通用错误类型100001
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10002,"未知错误"),

    USER_NOT_EXIST(200001, "用户不存在")


    ;

    private int errCode;
    private String errMsg;

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }


    @Override
    public int getErrorCode() {
        return this.errCode;
    }

    @Override
    public String getErrMeg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
