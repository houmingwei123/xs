package com.hou.water.entity;

import java.time.LocalDate;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author hou
 * @since 2021-07-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SignRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 签到时间
     */
    private LocalDate signTime;

    /**
     * 用户uid
     */
    private Long uid;

    public static void main(String[] args) {
        System.out.println(new Date(2020, 9, 23, 0, 0, 0).getTime());
        System.out.println(new Date("2020/9/23 00:00:00").getTime());
    }


}
