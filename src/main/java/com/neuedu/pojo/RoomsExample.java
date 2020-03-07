package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomsExample() {
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

        public Criteria andRoomIdIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("room_id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("room_id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("room_id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("room_id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("room_id like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("room_id not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("room_id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("room_id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("room_type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("room_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("room_type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("room_type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("room_type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("room_type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("room_type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("room_type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("room_type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("room_type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("room_type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("room_type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("room_type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("room_type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidIsNull() {
            addCriterion("room_typeid is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidIsNotNull() {
            addCriterion("room_typeid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidEqualTo(Integer value) {
            addCriterion("room_typeid =", value, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidNotEqualTo(Integer value) {
            addCriterion("room_typeid <>", value, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidGreaterThan(Integer value) {
            addCriterion("room_typeid >", value, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("room_typeid >=", value, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidLessThan(Integer value) {
            addCriterion("room_typeid <", value, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("room_typeid <=", value, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidIn(List<Integer> values) {
            addCriterion("room_typeid in", values, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidNotIn(List<Integer> values) {
            addCriterion("room_typeid not in", values, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidBetween(Integer value1, Integer value2) {
            addCriterion("room_typeid between", value1, value2, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("room_typeid not between", value1, value2, "roomTypeid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNull() {
            addCriterion("floor_name is null");
            return (Criteria) this;
        }

        public Criteria andFloorNameIsNotNull() {
            addCriterion("floor_name is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNameEqualTo(String value) {
            addCriterion("floor_name =", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotEqualTo(String value) {
            addCriterion("floor_name <>", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThan(String value) {
            addCriterion("floor_name >", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameGreaterThanOrEqualTo(String value) {
            addCriterion("floor_name >=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThan(String value) {
            addCriterion("floor_name <", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLessThanOrEqualTo(String value) {
            addCriterion("floor_name <=", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameLike(String value) {
            addCriterion("floor_name like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotLike(String value) {
            addCriterion("floor_name not like", value, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameIn(List<String> values) {
            addCriterion("floor_name in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotIn(List<String> values) {
            addCriterion("floor_name not in", values, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameBetween(String value1, String value2) {
            addCriterion("floor_name between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorNameNotBetween(String value1, String value2) {
            addCriterion("floor_name not between", value1, value2, "floorName");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNull() {
            addCriterion("floor_id is null");
            return (Criteria) this;
        }

        public Criteria andFloorIdIsNotNull() {
            addCriterion("floor_id is not null");
            return (Criteria) this;
        }

        public Criteria andFloorIdEqualTo(Integer value) {
            addCriterion("floor_id =", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotEqualTo(Integer value) {
            addCriterion("floor_id <>", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThan(Integer value) {
            addCriterion("floor_id >", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_id >=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThan(Integer value) {
            addCriterion("floor_id <", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdLessThanOrEqualTo(Integer value) {
            addCriterion("floor_id <=", value, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdIn(List<Integer> values) {
            addCriterion("floor_id in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotIn(List<Integer> values) {
            addCriterion("floor_id not in", values, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdBetween(Integer value1, Integer value2) {
            addCriterion("floor_id between", value1, value2, "floorId");
            return (Criteria) this;
        }

        public Criteria andFloorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_id not between", value1, value2, "floorId");
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

        public Criteria andGvipPriceIsNull() {
            addCriterion("gvip_price is null");
            return (Criteria) this;
        }

        public Criteria andGvipPriceIsNotNull() {
            addCriterion("gvip_price is not null");
            return (Criteria) this;
        }

        public Criteria andGvipPriceEqualTo(BigDecimal value) {
            addCriterion("gvip_price =", value, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceNotEqualTo(BigDecimal value) {
            addCriterion("gvip_price <>", value, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceGreaterThan(BigDecimal value) {
            addCriterion("gvip_price >", value, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gvip_price >=", value, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceLessThan(BigDecimal value) {
            addCriterion("gvip_price <", value, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gvip_price <=", value, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceIn(List<BigDecimal> values) {
            addCriterion("gvip_price in", values, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceNotIn(List<BigDecimal> values) {
            addCriterion("gvip_price not in", values, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gvip_price between", value1, value2, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andGvipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gvip_price not between", value1, value2, "gvipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceIsNull() {
            addCriterion("svip_price is null");
            return (Criteria) this;
        }

        public Criteria andSvipPriceIsNotNull() {
            addCriterion("svip_price is not null");
            return (Criteria) this;
        }

        public Criteria andSvipPriceEqualTo(BigDecimal value) {
            addCriterion("svip_price =", value, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceNotEqualTo(BigDecimal value) {
            addCriterion("svip_price <>", value, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceGreaterThan(BigDecimal value) {
            addCriterion("svip_price >", value, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("svip_price >=", value, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceLessThan(BigDecimal value) {
            addCriterion("svip_price <", value, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("svip_price <=", value, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceIn(List<BigDecimal> values) {
            addCriterion("svip_price in", values, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceNotIn(List<BigDecimal> values) {
            addCriterion("svip_price not in", values, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("svip_price between", value1, value2, "svipPrice");
            return (Criteria) this;
        }

        public Criteria andSvipPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("svip_price not between", value1, value2, "svipPrice");
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