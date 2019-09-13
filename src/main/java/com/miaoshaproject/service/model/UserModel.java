package com.miaoshaproject.service.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: junruigong
 * @Date: 9/12/19
 * @Description: TODO
 */
@Getter
@Setter
public class UserModel {

    private Integer id;
    private String name;
    private Byte gender;
    private Integer age;
    private String telephone;
    private String registerMode;
    private String thirdPartyId;

    private String excrptPassword;


}