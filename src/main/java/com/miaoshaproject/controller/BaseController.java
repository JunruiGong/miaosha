package com.miaoshaproject.controller;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.error.EmBusinessError;
import com.miaoshaproject.response.CommonReturnType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: junruigong
 * @Date: 9/13/19
 * @Description: TODO
 */
public class BaseController {

    // 定义exceptionHandler解决未被controller层吸收的exception
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object handlerException(HttpServletRequest request, Exception e) {
        Map<String, Object> responseMap = new HashMap<>();
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            responseMap.put("errCode", businessException.getErrorCode());
            responseMap.put("errMsg", businessException.getErrMeg());
        } else {
            responseMap.put("errCode", EmBusinessError.USER_NOT_EXIST.getErrorCode());
            responseMap.put("errMsg", EmBusinessError.USER_NOT_EXIST.getErrMeg());
        }

        return CommonReturnType.create(responseMap, "fail");
    }

}
