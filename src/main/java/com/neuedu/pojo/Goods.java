package com.neuedu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Goods extends MyPage implements Serializable {

    private Integer id;

    private String goodsName;

    private Integer goodsTypeid;

    private BigDecimal goodsPrice;

    private String unit;

    private String notes;

    private Date createTime;

    private Integer active;

    private String goodsTypename;
//    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
//    @JoinColumn(name="goodsTypeid",referencedColumnName = "id")
    private GoodsType goodsType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsTypeid() {
        return goodsTypeid;
    }

    public void setGoodsTypeid(Integer goodsTypeid) {
        this.goodsTypeid = goodsTypeid;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getGoodsTypename() {
        return goodsTypename;
    }

    public void setGoodsTypename(String goodsTypename) {
        this.goodsTypename = goodsTypename == null ? null : goodsTypename.trim();
    }

    public GoodsType getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(GoodsType goodsType) {
        this.goodsType = goodsType;
    }
}