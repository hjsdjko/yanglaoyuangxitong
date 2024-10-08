package com.entity.model;

import com.entity.FuwuxiangmuYuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 服务项目预约
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FuwuxiangmuYuyueModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 服务项目
     */
    private Integer fuwuxiangmuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 预约时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fuwuxiangmuYuyueTime;


    /**
     * 审核状态
     */
    private Integer fuwuxiangmuYuyueYesnoTypes;


    /**
     * 审核回复
     */
    private String fuwuxiangmuYuyueYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fuwuxiangmuYuyueShenheTime;


    /**
     * 服务项目服务项目时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：服务项目
	 */
    public Integer getFuwuxiangmuId() {
        return fuwuxiangmuId;
    }


    /**
	 * 设置：服务项目
	 */
    public void setFuwuxiangmuId(Integer fuwuxiangmuId) {
        this.fuwuxiangmuId = fuwuxiangmuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：预约时间
	 */
    public Date getFuwuxiangmuYuyueTime() {
        return fuwuxiangmuYuyueTime;
    }


    /**
	 * 设置：预约时间
	 */
    public void setFuwuxiangmuYuyueTime(Date fuwuxiangmuYuyueTime) {
        this.fuwuxiangmuYuyueTime = fuwuxiangmuYuyueTime;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getFuwuxiangmuYuyueYesnoTypes() {
        return fuwuxiangmuYuyueYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setFuwuxiangmuYuyueYesnoTypes(Integer fuwuxiangmuYuyueYesnoTypes) {
        this.fuwuxiangmuYuyueYesnoTypes = fuwuxiangmuYuyueYesnoTypes;
    }
    /**
	 * 获取：审核回复
	 */
    public String getFuwuxiangmuYuyueYesnoText() {
        return fuwuxiangmuYuyueYesnoText;
    }


    /**
	 * 设置：审核回复
	 */
    public void setFuwuxiangmuYuyueYesnoText(String fuwuxiangmuYuyueYesnoText) {
        this.fuwuxiangmuYuyueYesnoText = fuwuxiangmuYuyueYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getFuwuxiangmuYuyueShenheTime() {
        return fuwuxiangmuYuyueShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setFuwuxiangmuYuyueShenheTime(Date fuwuxiangmuYuyueShenheTime) {
        this.fuwuxiangmuYuyueShenheTime = fuwuxiangmuYuyueShenheTime;
    }
    /**
	 * 获取：服务项目服务项目时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：服务项目服务项目时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
