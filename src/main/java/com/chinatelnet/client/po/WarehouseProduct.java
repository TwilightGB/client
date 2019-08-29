package com.chinatelnet.client.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
*
*  @author gengbin
*/
public class WarehouseProduct implements Serializable {

    private static final long serialVersionUID = 1559031241993L;


    /**
    * 主键
    * 商品库存ID
    * isNullAble:0
    */
    private Integer wpId;

    /**
    * 商品ID
    * isNullAble:0
    */
    private Integer productId;

    /**
    * 仓库ID
    * isNullAble:0
    */
    private Integer wId;

    /**
    * 当前商品数量
    * isNullAble:0,defaultVal:0
    */
    private Integer currentCnt;

    /**
    * 当前占用数据
    * isNullAble:0,defaultVal:0
    */
    private Integer lockCnt;

    /**
    * 在途数据
    * isNullAble:0,defaultVal:0
    */
    private Integer inTransitCnt;

    /**
    * 移动加权成本
    * isNullAble:0,defaultVal:0.00
    */
    private BigDecimal averageCost;

    /**
    * 最后修改时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private Date modifiedTime;

    public Integer getWpId() {
        return wpId;
    }

    public void setWpId(Integer wpId) {
        this.wpId = wpId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Integer getCurrentCnt() {
        return currentCnt;
    }

    public void setCurrentCnt(Integer currentCnt) {
        this.currentCnt = currentCnt;
    }

    public Integer getLockCnt() {
        return lockCnt;
    }

    public void setLockCnt(Integer lockCnt) {
        this.lockCnt = lockCnt;
    }

    public Integer getInTransitCnt() {
        return inTransitCnt;
    }

    public void setInTransitCnt(Integer inTransitCnt) {
        this.inTransitCnt = inTransitCnt;
    }

    public BigDecimal getAverageCost() {
        return averageCost;
    }

    public void setAverageCost(BigDecimal averageCost) {
        this.averageCost = averageCost;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
