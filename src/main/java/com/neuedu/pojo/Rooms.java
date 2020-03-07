package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Rooms extends MyPage{
    private Integer id;

    private String roomId;

    private String roomType;

    private Integer roomTypeid;

    private Integer status;

    private String floorName;

    private Integer floorId;

    private BigDecimal normalPrice;

    private BigDecimal discountPrice;

    private BigDecimal gvipPrice;

    private BigDecimal svipPrice;

    private String remarks;

    private Integer active;

    private Date createDate;

    private Floor floor;

    private GuestType guestType;

    private BigDecimal price1;
    private BigDecimal price2;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public Integer getRoomTypeid() {
        return roomTypeid;
    }

    public void setRoomTypeid(Integer roomTypeid) {
        this.roomTypeid = roomTypeid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public BigDecimal getNormalPrice() {
        return normalPrice;
    }

    public void setNormalPrice(BigDecimal normalPrice) {
        this.normalPrice = normalPrice;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public BigDecimal getGvipPrice() {
        return gvipPrice;
    }

    public void setGvipPrice(BigDecimal gvipPrice) {
        this.gvipPrice = gvipPrice;
    }

    public BigDecimal getSvipPrice() {
        return svipPrice;
    }

    public void setSvipPrice(BigDecimal svipPrice) {
        this.svipPrice = svipPrice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public GuestType getGuestType() {
        return guestType;
    }

    public void setGuestType(GuestType guestType) {
        this.guestType = guestType;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }
}