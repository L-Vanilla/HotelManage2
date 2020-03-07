package com.neuedu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LeaguerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaguerExample() {
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

        public Criteria andLeaguerNameIsNull() {
            addCriterion("leaguer_name is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameIsNotNull() {
            addCriterion("leaguer_name is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameEqualTo(String value) {
            addCriterion("leaguer_name =", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameNotEqualTo(String value) {
            addCriterion("leaguer_name <>", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameGreaterThan(String value) {
            addCriterion("leaguer_name >", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_name >=", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameLessThan(String value) {
            addCriterion("leaguer_name <", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameLessThanOrEqualTo(String value) {
            addCriterion("leaguer_name <=", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameLike(String value) {
            addCriterion("leaguer_name like", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameNotLike(String value) {
            addCriterion("leaguer_name not like", value, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameIn(List<String> values) {
            addCriterion("leaguer_name in", values, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameNotIn(List<String> values) {
            addCriterion("leaguer_name not in", values, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameBetween(String value1, String value2) {
            addCriterion("leaguer_name between", value1, value2, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerNameNotBetween(String value1, String value2) {
            addCriterion("leaguer_name not between", value1, value2, "leaguerName");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexIsNull() {
            addCriterion("leaguer_sex is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexIsNotNull() {
            addCriterion("leaguer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexEqualTo(String value) {
            addCriterion("leaguer_sex =", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexNotEqualTo(String value) {
            addCriterion("leaguer_sex <>", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexGreaterThan(String value) {
            addCriterion("leaguer_sex >", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_sex >=", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexLessThan(String value) {
            addCriterion("leaguer_sex <", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexLessThanOrEqualTo(String value) {
            addCriterion("leaguer_sex <=", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexLike(String value) {
            addCriterion("leaguer_sex like", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexNotLike(String value) {
            addCriterion("leaguer_sex not like", value, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexIn(List<String> values) {
            addCriterion("leaguer_sex in", values, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexNotIn(List<String> values) {
            addCriterion("leaguer_sex not in", values, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexBetween(String value1, String value2) {
            addCriterion("leaguer_sex between", value1, value2, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerSexNotBetween(String value1, String value2) {
            addCriterion("leaguer_sex not between", value1, value2, "leaguerSex");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdIsNull() {
            addCriterion("leaguer_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdIsNotNull() {
            addCriterion("leaguer_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdEqualTo(String value) {
            addCriterion("leaguer_pwd =", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdNotEqualTo(String value) {
            addCriterion("leaguer_pwd <>", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdGreaterThan(String value) {
            addCriterion("leaguer_pwd >", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_pwd >=", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdLessThan(String value) {
            addCriterion("leaguer_pwd <", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdLessThanOrEqualTo(String value) {
            addCriterion("leaguer_pwd <=", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdLike(String value) {
            addCriterion("leaguer_pwd like", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdNotLike(String value) {
            addCriterion("leaguer_pwd not like", value, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdIn(List<String> values) {
            addCriterion("leaguer_pwd in", values, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdNotIn(List<String> values) {
            addCriterion("leaguer_pwd not in", values, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdBetween(String value1, String value2) {
            addCriterion("leaguer_pwd between", value1, value2, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerPwdNotBetween(String value1, String value2) {
            addCriterion("leaguer_pwd not between", value1, value2, "leaguerPwd");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelIsNull() {
            addCriterion("leaguer_tel is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelIsNotNull() {
            addCriterion("leaguer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelEqualTo(String value) {
            addCriterion("leaguer_tel =", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelNotEqualTo(String value) {
            addCriterion("leaguer_tel <>", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelGreaterThan(String value) {
            addCriterion("leaguer_tel >", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_tel >=", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelLessThan(String value) {
            addCriterion("leaguer_tel <", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelLessThanOrEqualTo(String value) {
            addCriterion("leaguer_tel <=", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelLike(String value) {
            addCriterion("leaguer_tel like", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelNotLike(String value) {
            addCriterion("leaguer_tel not like", value, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelIn(List<String> values) {
            addCriterion("leaguer_tel in", values, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelNotIn(List<String> values) {
            addCriterion("leaguer_tel not in", values, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelBetween(String value1, String value2) {
            addCriterion("leaguer_tel between", value1, value2, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerTelNotBetween(String value1, String value2) {
            addCriterion("leaguer_tel not between", value1, value2, "leaguerTel");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressIsNull() {
            addCriterion("leaguer_address is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressIsNotNull() {
            addCriterion("leaguer_address is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressEqualTo(String value) {
            addCriterion("leaguer_address =", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressNotEqualTo(String value) {
            addCriterion("leaguer_address <>", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressGreaterThan(String value) {
            addCriterion("leaguer_address >", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_address >=", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressLessThan(String value) {
            addCriterion("leaguer_address <", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressLessThanOrEqualTo(String value) {
            addCriterion("leaguer_address <=", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressLike(String value) {
            addCriterion("leaguer_address like", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressNotLike(String value) {
            addCriterion("leaguer_address not like", value, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressIn(List<String> values) {
            addCriterion("leaguer_address in", values, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressNotIn(List<String> values) {
            addCriterion("leaguer_address not in", values, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressBetween(String value1, String value2) {
            addCriterion("leaguer_address between", value1, value2, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerAddressNotBetween(String value1, String value2) {
            addCriterion("leaguer_address not between", value1, value2, "leaguerAddress");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailIsNull() {
            addCriterion("leaguer_email is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailIsNotNull() {
            addCriterion("leaguer_email is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailEqualTo(String value) {
            addCriterion("leaguer_email =", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailNotEqualTo(String value) {
            addCriterion("leaguer_email <>", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailGreaterThan(String value) {
            addCriterion("leaguer_email >", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_email >=", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailLessThan(String value) {
            addCriterion("leaguer_email <", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailLessThanOrEqualTo(String value) {
            addCriterion("leaguer_email <=", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailLike(String value) {
            addCriterion("leaguer_email like", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailNotLike(String value) {
            addCriterion("leaguer_email not like", value, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailIn(List<String> values) {
            addCriterion("leaguer_email in", values, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailNotIn(List<String> values) {
            addCriterion("leaguer_email not in", values, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailBetween(String value1, String value2) {
            addCriterion("leaguer_email between", value1, value2, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerEmailNotBetween(String value1, String value2) {
            addCriterion("leaguer_email not between", value1, value2, "leaguerEmail");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreIsNull() {
            addCriterion("leaguer_score is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreIsNotNull() {
            addCriterion("leaguer_score is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreEqualTo(Integer value) {
            addCriterion("leaguer_score =", value, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreNotEqualTo(Integer value) {
            addCriterion("leaguer_score <>", value, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreGreaterThan(Integer value) {
            addCriterion("leaguer_score >", value, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("leaguer_score >=", value, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreLessThan(Integer value) {
            addCriterion("leaguer_score <", value, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreLessThanOrEqualTo(Integer value) {
            addCriterion("leaguer_score <=", value, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreIn(List<Integer> values) {
            addCriterion("leaguer_score in", values, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreNotIn(List<Integer> values) {
            addCriterion("leaguer_score not in", values, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreBetween(Integer value1, Integer value2) {
            addCriterion("leaguer_score between", value1, value2, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("leaguer_score not between", value1, value2, "leaguerScore");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankIsNull() {
            addCriterion("leaguer_rank is null");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankIsNotNull() {
            addCriterion("leaguer_rank is not null");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankEqualTo(String value) {
            addCriterion("leaguer_rank =", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankNotEqualTo(String value) {
            addCriterion("leaguer_rank <>", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankGreaterThan(String value) {
            addCriterion("leaguer_rank >", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankGreaterThanOrEqualTo(String value) {
            addCriterion("leaguer_rank >=", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankLessThan(String value) {
            addCriterion("leaguer_rank <", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankLessThanOrEqualTo(String value) {
            addCriterion("leaguer_rank <=", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankLike(String value) {
            addCriterion("leaguer_rank like", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankNotLike(String value) {
            addCriterion("leaguer_rank not like", value, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankIn(List<String> values) {
            addCriterion("leaguer_rank in", values, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankNotIn(List<String> values) {
            addCriterion("leaguer_rank not in", values, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankBetween(String value1, String value2) {
            addCriterion("leaguer_rank between", value1, value2, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andLeaguerRankNotBetween(String value1, String value2) {
            addCriterion("leaguer_rank not between", value1, value2, "leaguerRank");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveIsNull() {
            addCriterion("time_lastlive is null");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveIsNotNull() {
            addCriterion("time_lastlive is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveEqualTo(Date value) {
            addCriterion("time_lastlive =", value, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveNotEqualTo(Date value) {
            addCriterion("time_lastlive <>", value, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveGreaterThan(Date value) {
            addCriterion("time_lastlive >", value, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveGreaterThanOrEqualTo(Date value) {
            addCriterion("time_lastlive >=", value, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveLessThan(Date value) {
            addCriterion("time_lastlive <", value, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveLessThanOrEqualTo(Date value) {
            addCriterion("time_lastlive <=", value, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveIn(List<Date> values) {
            addCriterion("time_lastlive in", values, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveNotIn(List<Date> values) {
            addCriterion("time_lastlive not in", values, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveBetween(Date value1, Date value2) {
            addCriterion("time_lastlive between", value1, value2, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastliveNotBetween(Date value1, Date value2) {
            addCriterion("time_lastlive not between", value1, value2, "timeLastlive");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderIsNull() {
            addCriterion("time_lastorder is null");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderIsNotNull() {
            addCriterion("time_lastorder is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderEqualTo(Date value) {
            addCriterion("time_lastorder =", value, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderNotEqualTo(Date value) {
            addCriterion("time_lastorder <>", value, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderGreaterThan(Date value) {
            addCriterion("time_lastorder >", value, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderGreaterThanOrEqualTo(Date value) {
            addCriterion("time_lastorder >=", value, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderLessThan(Date value) {
            addCriterion("time_lastorder <", value, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderLessThanOrEqualTo(Date value) {
            addCriterion("time_lastorder <=", value, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderIn(List<Date> values) {
            addCriterion("time_lastorder in", values, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderNotIn(List<Date> values) {
            addCriterion("time_lastorder not in", values, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderBetween(Date value1, Date value2) {
            addCriterion("time_lastorder between", value1, value2, "timeLastorder");
            return (Criteria) this;
        }

        public Criteria andTimeLastorderNotBetween(Date value1, Date value2) {
            addCriterion("time_lastorder not between", value1, value2, "timeLastorder");
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