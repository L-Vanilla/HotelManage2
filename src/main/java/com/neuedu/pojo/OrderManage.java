package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class OrderManage extends MyPage{
    private Integer id;

    private Integer originalRoomId;

    private Integer currentRoomId;

    private Integer bookStatus;

    private Integer roomTypeId;

    private BigDecimal normalPrice;

    private BigDecimal discountPrice;

    private BigDecimal deposit;

    private String residents;

    private String credentialsType;

    private String credentialsNum;

    private String phone;

    private Date arrivalTime;

    private Date leaveTime;

    private Integer personNum;

    private Integer userId;

    private Integer memberId;

    private BigDecimal memberPrice;

    private String breakfast;

    private String timedWakeup;

    private String remarks;

    private Integer active;

    private Date createDate;

    private String roomsTypeName;

    private String userName;

    private String originalRoomName;

    private String currentRoomName;

    private OrderForm orderForm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOriginalRoomId() {
        return originalRoomId;
    }

    public void setOriginalRoomId(Integer originalRoomId) {
        this.originalRoomId = originalRoomId;
    }

    public Integer getCurrentRoomId() {
        return currentRoomId;
    }

    public void setCurrentRoomId(Integer currentRoomId) {
        this.currentRoomId = currentRoomId;
    }

    public Integer getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
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

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getResidents() {
        return residents;
    }

    public void setResidents(String residents) {
        this.residents = residents == null ? null : residents.trim();
    }

    public String getCredentialsType() {
        return credentialsType;
    }

    public void setCredentialsType(String credentialsType) {
        this.credentialsType = credentialsType == null ? null : credentialsType.trim();
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum == null ? null : credentialsNum.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast == null ? null : breakfast.trim();
    }

    public String getTimedWakeup() {
        return timedWakeup;
    }

    public void setTimedWakeup(String timedWakeup) {
        this.timedWakeup = timedWakeup == null ? null : timedWakeup.trim();
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

    public String getRoomsTypeName() {
        return roomsTypeName;
    }

    public void setRoomsTypeName(String roomsTypeName) {
        this.roomsTypeName = roomsTypeName == null ? null : roomsTypeName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOriginalRoomName() {
        return originalRoomName;
    }

    public void setOriginalRoomName(String originalRoomName) {
        this.originalRoomName = originalRoomName == null ? null : originalRoomName.trim();
    }

    public String getCurrentRoomName() {
        return currentRoomName;
    }

    public void setCurrentRoomName(String currentRoomName) {
        this.currentRoomName = currentRoomName == null ? null : currentRoomName.trim();
    }

    public OrderForm getOrderForm() {
        return orderForm;
    }

    public void setOrderForm(OrderForm orderForm) {
        this.orderForm = orderForm;
    }
}