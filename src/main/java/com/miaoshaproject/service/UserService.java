package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

/**
 * @Auther: junruigong
 * @Date: 9/12/19
 * @Description: TODO
 */
public interface UserService {

    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /**
     * validateLogin
     * @param telephone 用户注册的手机号
     * @param encrptPassword 加密后的密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telephone, String encrptPassword) throws BusinessException;

}
