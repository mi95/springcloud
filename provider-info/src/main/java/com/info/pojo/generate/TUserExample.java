package com.info.pojo.generate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  xiaomi
 * @create  2020/11/17
 * 
 **/
public class TUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andFdIdIsNull() {
            addCriterion("fd_id is null");
            return (Criteria) this;
        }

        public Criteria andFdIdIsNotNull() {
            addCriterion("fd_id is not null");
            return (Criteria) this;
        }

        public Criteria andFdIdEqualTo(String value) {
            addCriterion("fd_id =", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotEqualTo(String value) {
            addCriterion("fd_id <>", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThan(String value) {
            addCriterion("fd_id >", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdGreaterThanOrEqualTo(String value) {
            addCriterion("fd_id >=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThan(String value) {
            addCriterion("fd_id <", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLessThanOrEqualTo(String value) {
            addCriterion("fd_id <=", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdLike(String value) {
            addCriterion("fd_id like", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotLike(String value) {
            addCriterion("fd_id not like", value, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdIn(List<String> values) {
            addCriterion("fd_id in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotIn(List<String> values) {
            addCriterion("fd_id not in", values, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdBetween(String value1, String value2) {
            addCriterion("fd_id between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdIdNotBetween(String value1, String value2) {
            addCriterion("fd_id not between", value1, value2, "fdId");
            return (Criteria) this;
        }

        public Criteria andFdNameIsNull() {
            addCriterion("fd_name is null");
            return (Criteria) this;
        }

        public Criteria andFdNameIsNotNull() {
            addCriterion("fd_name is not null");
            return (Criteria) this;
        }

        public Criteria andFdNameEqualTo(String value) {
            addCriterion("fd_name =", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotEqualTo(String value) {
            addCriterion("fd_name <>", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameGreaterThan(String value) {
            addCriterion("fd_name >", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameGreaterThanOrEqualTo(String value) {
            addCriterion("fd_name >=", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLessThan(String value) {
            addCriterion("fd_name <", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLessThanOrEqualTo(String value) {
            addCriterion("fd_name <=", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameLike(String value) {
            addCriterion("fd_name like", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotLike(String value) {
            addCriterion("fd_name not like", value, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameIn(List<String> values) {
            addCriterion("fd_name in", values, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotIn(List<String> values) {
            addCriterion("fd_name not in", values, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameBetween(String value1, String value2) {
            addCriterion("fd_name between", value1, value2, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNameNotBetween(String value1, String value2) {
            addCriterion("fd_name not between", value1, value2, "fdName");
            return (Criteria) this;
        }

        public Criteria andFdNoIsNull() {
            addCriterion("fd_no is null");
            return (Criteria) this;
        }

        public Criteria andFdNoIsNotNull() {
            addCriterion("fd_no is not null");
            return (Criteria) this;
        }

        public Criteria andFdNoEqualTo(String value) {
            addCriterion("fd_no =", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoNotEqualTo(String value) {
            addCriterion("fd_no <>", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoGreaterThan(String value) {
            addCriterion("fd_no >", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoGreaterThanOrEqualTo(String value) {
            addCriterion("fd_no >=", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoLessThan(String value) {
            addCriterion("fd_no <", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoLessThanOrEqualTo(String value) {
            addCriterion("fd_no <=", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoLike(String value) {
            addCriterion("fd_no like", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoNotLike(String value) {
            addCriterion("fd_no not like", value, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoIn(List<String> values) {
            addCriterion("fd_no in", values, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoNotIn(List<String> values) {
            addCriterion("fd_no not in", values, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoBetween(String value1, String value2) {
            addCriterion("fd_no between", value1, value2, "fdNo");
            return (Criteria) this;
        }

        public Criteria andFdNoNotBetween(String value1, String value2) {
            addCriterion("fd_no not between", value1, value2, "fdNo");
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