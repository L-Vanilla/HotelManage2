package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderForm extends MyPage{
    private Integer id;

    private String roomId;

    private BigDecimal roomPrice;

    private BigDecimal deposit;

    private Integer livedDays;

    private BigDecimal livedPrice;

    private BigDecimal roomBill;

    private BigDecimal foodBill;

    private BigDecimal telBill;

    private BigDecimal totalBill;

    private BigDecimal rebackDeposit;

    private String payStyle;

    private BigDecimal realWages;

    private BigDecimal oddChange;

    private String user;

    private String remarks;

    private Integer active;

    private Date createDate;

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

    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public Integer getLivedDays() {
        return livedDays;
    }

    public void setLivedDays(Integer livedDays) {
        this.livedDays = livedDays;
    }

    public BigDecimal getLivedPrice() {
        return livedPrice;
    }

    public void setLivedPrice(BigDecimal livedPrice) {
        this.livedPrice = livedPrice;
    }

    public BigDecimal getRoomBill() {
        return roomBill;
    }

    public void setRoomBill(BigDecimal roomBill) {
        this.roomBill = roomBill;
    }

    public BigDecimal getFoodBill() {
        return foodBill;
    }

    public void setFoodBill(BigDecimal foodBill) {
        this.foodBill = foodBill;
    }

    public BigDecimal getTelBill() {
        return telBill;
    }

    public void setTelBill(BigDecimal telBill) {
        this.telBill = telBill;
    }

    public BigDecimal getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(BigDecimal totalBill) {
        this.totalBill = totalBill;
    }

    public BigDecimal getRebackDeposit() {
        return rebackDeposit;
    }

    public void setRebackDeposit(BigDecimal rebackDeposit) {
        this.rebackDeposit = rebackDeposit;
    }

    public String getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(String payStyle) {
        this.payStyle = payStyle == null ? null : payStyle.trim();
    }

    public BigDecimal getRealWages() {
        return realWages;
    }

    public void setRealWages(BigDecimal realWages) {
        this.realWages = realWages;
    }

    public BigDecimal getOddChange() {
        return oddChange;
    }

    public void setOddChange(BigDecimal oddChange) {
        this.oddChange = oddChange;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
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
}