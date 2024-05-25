package com.zh.common.management.jmgk.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tong
 * @since 2024-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("car_bill")
public class CarBill implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车牌号
     */
    @TableField("car_num")
    private String carNum;

    /**
     * 宽
     */
    @TableField("car_wide")
    private String carWide;

    /**
     * 长
     */
    @TableField("car_long")
    private String carLong;

    /**
     * 前底高
     */
    @TableField("front_high")
    private String frontHigh;

    /**
     * 后底高
     */
    @TableField("back_high")
    private String backHigh;

    /**
     * 拉筋数
     */
    @TableField("tie_bar_num")
    private Integer tieBarNum;

    @TableField("bill_id")
    private Integer billId;

    /**
     * 添加时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 手机号
     */
    @TableField("account")
    private String account;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 身份证号
     */
    @TableField("id_no")
    private String idNo;

    @TableField("car_team")
    private String carTeam;

    @TableField("pfjd")
    private String pfjd;


}
