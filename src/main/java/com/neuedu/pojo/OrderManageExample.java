package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderManageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderManageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdIsNull() {
            addCriterion("original_room_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdIsNotNull() {
            addCriterion("original_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdEqualTo(Integer value) {
            addCriterion("original_room_id =", value, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdNotEqualTo(Integer value) {
            addCriterion("original_room_id <>", value, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdGreaterThan(Integer value) {
            addCriterion("original_room_id >", value, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_room_id >=", value, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdLessThan(Integer value) {
            addCriterion("original_room_id <", value, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("original_room_id <=", value, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdIn(List<Integer> values) {
            addCriterion("original_room_id in", values, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdNotIn(List<Integer> values) {
            addCriterion("original_room_id not in", values, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("original_room_id between", value1, value2, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("original_room_id not between", value1, value2, "originalRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdIsNull() {
            addCriterion("current_room_id is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdIsNotNull() {
            addCriterion("current_room_id is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdEqualTo(Integer value) {
            addCriterion("current_room_id =", value, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdNotEqualTo(Integer value) {
            addCriterion("current_room_id <>", value, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdGreaterThan(Integer value) {
            addCriterion("current_room_id >", value, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_room_id >=", value, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdLessThan(Integer value) {
            addCriterion("current_room_id <", value, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("current_room_id <=", value, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdIn(List<Integer> values) {
            addCriterion("current_room_id in", values, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdNotIn(List<Integer> values) {
            addCriterion("current_room_id not in", values, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("current_room_id between", value1, value2, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("current_room_id not between", value1, value2, "currentRoomId");
            return (Criteria) this;
        }

        public Criteria andBookStatusIsNull() {
            addCriterion("book_status is null");
            return (Criteria) this;
        }

        public Criteria andBookStatusIsNotNull() {
            addCriterion("book_status is not null");
            return (Criteria) this;
        }

        public Criteria andBookStatusEqualTo(Integer value) {
            addCriterion("book_status =", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotEqualTo(Integer value) {
            addCriterion("book_status <>", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusGreaterThan(Integer value) {
            addCriterion("book_status >", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_status >=", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLessThan(Integer value) {
            addCriterion("book_status <", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusLessThanOrEqualTo(Integer value) {
            addCriterion("book_status <=", value, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusIn(List<Integer> values) {
            addCriterion("book_status in", values, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotIn(List<Integer> values) {
            addCriterion("book_status not in", values, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusBetween(Integer value1, Integer value2) {
            addCriterion("book_status between", value1, value2, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andBookStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("book_status not between", value1, value2, "bookStatus");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNull() {
            addCriterion("room_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIsNotNull() {
            addCriterion("room_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdEqualTo(Integer value) {
            addCriterion("room_type_id =", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotEqualTo(Integer value) {
            addCriterion("room_type_id <>", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThan(Integer value) {
            addCriterion("room_type_id >", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_type_id >=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThan(Integer value) {
            addCriterion("room_type_id <", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("room_type_id <=", value, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdIn(List<Integer> values) {
            addCriterion("room_type_id in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotIn(List<Integer> values) {
            addCriterion("room_type_id not in", values, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("room_type_id between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("room_type_id not between", value1, value2, "roomTypeId");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIsNull() {
            addCriterion("normal_price is null");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIsNotNull() {
            addCriterion("normal_price is not null");
            return (Criteria) this;
        }

        public Criteria andNormalPriceEqualTo(BigDecimal value) {
            addCriterion("normal_price =", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotEqualTo(BigDecimal value) {
            addCriterion("normal_price <>", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceGreaterThan(BigDecimal value) {
            addCriterion("normal_price >", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("normal_price >=", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLessThan(BigDecimal value) {
            addCriterion("normal_price <", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("normal_price <=", value, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceIn(List<BigDecimal> values) {
            addCriterion("normal_price in", values, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotIn(List<BigDecimal> values) {
            addCriterion("normal_price not in", values, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("normal_price between", value1, value2, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andNormalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("normal_price not between", value1, value2, "normalPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andResidentsIsNull() {
            addCriterion("residents is null");
            return (Criteria) this;
        }

        public Criteria andResidentsIsNotNull() {
            addCriterion("residents is not null");
            return (Criteria) this;
        }

        public Criteria andResidentsEqualTo(String value) {
            addCriterion("residents =", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotEqualTo(String value) {
            addCriterion("residents <>", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsGreaterThan(String value) {
            addCriterion("residents >", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsGreaterThanOrEqualTo(String value) {
            addCriterion("residents >=", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsLessThan(String value) {
            addCriterion("residents <", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsLessThanOrEqualTo(String value) {
            addCriterion("residents <=", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsLike(String value) {
            addCriterion("residents like", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotLike(String value) {
            addCriterion("residents not like", value, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsIn(List<String> values) {
            addCriterion("residents in", values, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotIn(List<String> values) {
            addCriterion("residents not in", values, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsBetween(String value1, String value2) {
            addCriterion("residents between", value1, value2, "residents");
            return (Criteria) this;
        }

        public Criteria andResidentsNotBetween(String value1, String value2) {
            addCriterion("residents not between", value1, value2, "residents");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeIsNull() {
            addCriterion("credentials_type is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeIsNotNull() {
            addCriterion("credentials_type is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeEqualTo(String value) {
            addCriterion("credentials_type =", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotEqualTo(String value) {
            addCriterion("credentials_type <>", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeGreaterThan(String value) {
            addCriterion("credentials_type >", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_type >=", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeLessThan(String value) {
            addCriterion("credentials_type <", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeLessThanOrEqualTo(String value) {
            addCriterion("credentials_type <=", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeLike(String value) {
            addCriterion("credentials_type like", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotLike(String value) {
            addCriterion("credentials_type not like", value, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeIn(List<String> values) {
            addCriterion("credentials_type in", values, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotIn(List<String> values) {
            addCriterion("credentials_type not in", values, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeBetween(String value1, String value2) {
            addCriterion("credentials_type between", value1, value2, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsTypeNotBetween(String value1, String value2) {
            addCriterion("credentials_type not between", value1, value2, "credentialsType");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumIsNull() {
            addCriterion("credentials_num is null");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumIsNotNull() {
            addCriterion("credentials_num is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumEqualTo(String value) {
            addCriterion("credentials_num =", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumNotEqualTo(String value) {
            addCriterion("credentials_num <>", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumGreaterThan(String value) {
            addCriterion("credentials_num >", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumGreaterThanOrEqualTo(String value) {
            addCriterion("credentials_num >=", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumLessThan(String value) {
            addCriterion("credentials_num <", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumLessThanOrEqualTo(String value) {
            addCriterion("credentials_num <=", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumLike(String value) {
            addCriterion("credentials_num like", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumNotLike(String value) {
            addCriterion("credentials_num not like", value, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumIn(List<String> values) {
            addCriterion("credentials_num in", values, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumNotIn(List<String> values) {
            addCriterion("credentials_num not in", values, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumBetween(String value1, String value2) {
            addCriterion("credentials_num between", value1, value2, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andCredentialsNumNotBetween(String value1, String value2) {
            addCriterion("credentials_num not between", value1, value2, "credentialsNum");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(Date value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(Date value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(Date value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(Date value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(Date value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<Date> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<Date> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(Date value1, Date value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(Date value1, Date value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNull() {
            addCriterion("person_num is null");
            return (Criteria) this;
        }

        public Criteria andPersonNumIsNotNull() {
            addCriterion("person_num is not null");
            return (Criteria) this;
        }

        public Criteria andPersonNumEqualTo(Integer value) {
            addCriterion("person_num =", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotEqualTo(Integer value) {
            addCriterion("person_num <>", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThan(Integer value) {
            addCriterion("person_num >", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("person_num >=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThan(Integer value) {
            addCriterion("person_num <", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumLessThanOrEqualTo(Integer value) {
            addCriterion("person_num <=", value, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumIn(List<Integer> values) {
            addCriterion("person_num in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotIn(List<Integer> values) {
            addCriterion("person_num not in", values, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumBetween(Integer value1, Integer value2) {
            addCriterion("person_num between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andPersonNumNotBetween(Integer value1, Integer value2) {
            addCriterion("person_num not between", value1, value2, "personNum");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNull() {
            addCriterion("member_price is null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIsNotNull() {
            addCriterion("member_price is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPriceEqualTo(BigDecimal value) {
            addCriterion("member_price =", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotEqualTo(BigDecimal value) {
            addCriterion("member_price <>", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThan(BigDecimal value) {
            addCriterion("member_price >", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price >=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThan(BigDecimal value) {
            addCriterion("member_price <", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("member_price <=", value, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceIn(List<BigDecimal> values) {
            addCriterion("member_price in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotIn(List<BigDecimal> values) {
            addCriterion("member_price not in", values, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andMemberPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("member_price not between", value1, value2, "memberPrice");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNull() {
            addCriterion("breakfast is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastIsNotNull() {
            addCriterion("breakfast is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastEqualTo(String value) {
            addCriterion("breakfast =", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotEqualTo(String value) {
            addCriterion("breakfast <>", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThan(String value) {
            addCriterion("breakfast >", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastGreaterThanOrEqualTo(String value) {
            addCriterion("breakfast >=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThan(String value) {
            addCriterion("breakfast <", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLessThanOrEqualTo(String value) {
            addCriterion("breakfast <=", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastLike(String value) {
            addCriterion("breakfast like", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotLike(String value) {
            addCriterion("breakfast not like", value, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastIn(List<String> values) {
            addCriterion("breakfast in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotIn(List<String> values) {
            addCriterion("breakfast not in", values, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastBetween(String value1, String value2) {
            addCriterion("breakfast between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andBreakfastNotBetween(String value1, String value2) {
            addCriterion("breakfast not between", value1, value2, "breakfast");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupIsNull() {
            addCriterion("timed_wakeup is null");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupIsNotNull() {
            addCriterion("timed_wakeup is not null");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupEqualTo(String value) {
            addCriterion("timed_wakeup =", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupNotEqualTo(String value) {
            addCriterion("timed_wakeup <>", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupGreaterThan(String value) {
            addCriterion("timed_wakeup >", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupGreaterThanOrEqualTo(String value) {
            addCriterion("timed_wakeup >=", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupLessThan(String value) {
            addCriterion("timed_wakeup <", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupLessThanOrEqualTo(String value) {
            addCriterion("timed_wakeup <=", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupLike(String value) {
            addCriterion("timed_wakeup like", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupNotLike(String value) {
            addCriterion("timed_wakeup not like", value, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupIn(List<String> values) {
            addCriterion("timed_wakeup in", values, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupNotIn(List<String> values) {
            addCriterion("timed_wakeup not in", values, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupBetween(String value1, String value2) {
            addCriterion("timed_wakeup between", value1, value2, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andTimedWakeupNotBetween(String value1, String value2) {
            addCriterion("timed_wakeup not between", value1, value2, "timedWakeup");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameIsNull() {
            addCriterion("rooms_type_name is null");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameIsNotNull() {
            addCriterion("rooms_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameEqualTo(String value) {
            addCriterion("rooms_type_name =", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameNotEqualTo(String value) {
            addCriterion("rooms_type_name <>", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameGreaterThan(String value) {
            addCriterion("rooms_type_name >", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("rooms_type_name >=", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameLessThan(String value) {
            addCriterion("rooms_type_name <", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("rooms_type_name <=", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameLike(String value) {
            addCriterion("rooms_type_name like", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameNotLike(String value) {
            addCriterion("rooms_type_name not like", value, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameIn(List<String> values) {
            addCriterion("rooms_type_name in", values, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameNotIn(List<String> values) {
            addCriterion("rooms_type_name not in", values, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameBetween(String value1, String value2) {
            addCriterion("rooms_type_name between", value1, value2, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andRoomsTypeNameNotBetween(String value1, String value2) {
            addCriterion("rooms_type_name not between", value1, value2, "roomsTypeName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameIsNull() {
            addCriterion("original_room_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameIsNotNull() {
            addCriterion("original_room_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameEqualTo(String value) {
            addCriterion("original_room_name =", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameNotEqualTo(String value) {
            addCriterion("original_room_name <>", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameGreaterThan(String value) {
            addCriterion("original_room_name >", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_room_name >=", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameLessThan(String value) {
            addCriterion("original_room_name <", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameLessThanOrEqualTo(String value) {
            addCriterion("original_room_name <=", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameLike(String value) {
            addCriterion("original_room_name like", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameNotLike(String value) {
            addCriterion("original_room_name not like", value, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameIn(List<String> values) {
            addCriterion("original_room_name in", values, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameNotIn(List<String> values) {
            addCriterion("original_room_name not in", values, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameBetween(String value1, String value2) {
            addCriterion("original_room_name between", value1, value2, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andOriginalRoomNameNotBetween(String value1, String value2) {
            addCriterion("original_room_name not between", value1, value2, "originalRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameIsNull() {
            addCriterion("current_room_name is null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameIsNotNull() {
            addCriterion("current_room_name is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameEqualTo(String value) {
            addCriterion("current_room_name =", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameNotEqualTo(String value) {
            addCriterion("current_room_name <>", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameGreaterThan(String value) {
            addCriterion("current_room_name >", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("current_room_name >=", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameLessThan(String value) {
            addCriterion("current_room_name <", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameLessThanOrEqualTo(String value) {
            addCriterion("current_room_name <=", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameLike(String value) {
            addCriterion("current_room_name like", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameNotLike(String value) {
            addCriterion("current_room_name not like", value, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameIn(List<String> values) {
            addCriterion("current_room_name in", values, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameNotIn(List<String> values) {
            addCriterion("current_room_name not in", values, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameBetween(String value1, String value2) {
            addCriterion("current_room_name between", value1, value2, "currentRoomName");
            return (Criteria) this;
        }

        public Criteria andCurrentRoomNameNotBetween(String value1, String value2) {
            addCriterion("current_room_name not between", value1, value2, "currentRoomName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}