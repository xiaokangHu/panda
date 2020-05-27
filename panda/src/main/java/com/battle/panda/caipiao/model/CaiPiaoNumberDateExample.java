//package com.battle.panda.caipiao.model;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CaiPiaoNumberDateExample {
//    protected String orderByClause;
//
//    protected boolean distinct;
//
//    protected List<Criteria> oredCriteria;
//
//    public CaiPiaoNumberDateExample() {
//        oredCriteria = new ArrayList<Criteria>();
//    }
//
//    public void setOrderByClause(String orderByClause) {
//        this.orderByClause = orderByClause;
//    }
//
//    public String getOrderByClause() {
//        return orderByClause;
//    }
//
//    public void setDistinct(boolean distinct) {
//        this.distinct = distinct;
//    }
//
//    public boolean isDistinct() {
//        return distinct;
//    }
//
//    public List<Criteria> getOredCriteria() {
//        return oredCriteria;
//    }
//
//    public void or(Criteria criteria) {
//        oredCriteria.add(criteria);
//    }
//
//    public Criteria or() {
//        Criteria criteria = createCriteriaInternal();
//        oredCriteria.add(criteria);
//        return criteria;
//    }
//
//    public Criteria createCriteria() {
//        Criteria criteria = createCriteriaInternal();
//        if (oredCriteria.size() == 0) {
//            oredCriteria.add(criteria);
//        }
//        return criteria;
//    }
//
//    protected Criteria createCriteriaInternal() {
//        Criteria criteria = new Criteria();
//        return criteria;
//    }
//
//    public void clear() {
//        oredCriteria.clear();
//        orderByClause = null;
//        distinct = false;
//    }
//
//    protected abstract static class GeneratedCriteria {
//        protected List<Criterion> criteria;
//
//        protected GeneratedCriteria() {
//            super();
//            criteria = new ArrayList<Criterion>();
//        }
//
//        public boolean isValid() {
//            return criteria.size() > 0;
//        }
//
//        public List<Criterion> getAllCriteria() {
//            return criteria;
//        }
//
//        public List<Criterion> getCriteria() {
//            return criteria;
//        }
//
//        protected void addCriterion(String condition) {
//            if (condition == null) {
//                throw new RuntimeException("Value for condition cannot be null");
//            }
//            criteria.add(new Criterion(condition));
//        }
//
//        protected void addCriterion(String condition, Object value, String property) {
//            if (value == null) {
//                throw new RuntimeException("Value for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value));
//        }
//
//        protected void addCriterion(String condition, Object value1, Object value2, String property) {
//            if (value1 == null || value2 == null) {
//                throw new RuntimeException("Between values for " + property + " cannot be null");
//            }
//            criteria.add(new Criterion(condition, value1, value2));
//        }
//
//        public Criteria andDateIsNull() {
//            addCriterion("date is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateIsNotNull() {
//            addCriterion("date is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateEqualTo(String value) {
//            addCriterion("date =", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateNotEqualTo(String value) {
//            addCriterion("date <>", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateGreaterThan(String value) {
//            addCriterion("date >", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateGreaterThanOrEqualTo(String value) {
//            addCriterion("date >=", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateLessThan(String value) {
//            addCriterion("date <", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateLessThanOrEqualTo(String value) {
//            addCriterion("date <=", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateLike(String value) {
//            addCriterion("date like", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateNotLike(String value) {
//            addCriterion("date not like", value, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateIn(List<String> values) {
//            addCriterion("date in", values, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateNotIn(List<String> values) {
//            addCriterion("date not in", values, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateBetween(String value1, String value2) {
//            addCriterion("date between", value1, value2, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andDateNotBetween(String value1, String value2) {
//            addCriterion("date not between", value1, value2, "date");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstIsNull() {
//            addCriterion("first is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstIsNotNull() {
//            addCriterion("first is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstEqualTo(String value) {
//            addCriterion("first =", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstNotEqualTo(String value) {
//            addCriterion("first <>", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstGreaterThan(String value) {
//            addCriterion("first >", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstGreaterThanOrEqualTo(String value) {
//            addCriterion("first >=", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstLessThan(String value) {
//            addCriterion("first <", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstLessThanOrEqualTo(String value) {
//            addCriterion("first <=", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstLike(String value) {
//            addCriterion("first like", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstNotLike(String value) {
//            addCriterion("first not like", value, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstIn(List<String> values) {
//            addCriterion("first in", values, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstNotIn(List<String> values) {
//            addCriterion("first not in", values, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstBetween(String value1, String value2) {
//            addCriterion("first between", value1, value2, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andFirstNotBetween(String value1, String value2) {
//            addCriterion("first not between", value1, value2, "first");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecIsNull() {
//            addCriterion("sec is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecIsNotNull() {
//            addCriterion("sec is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecEqualTo(String value) {
//            addCriterion("sec =", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecNotEqualTo(String value) {
//            addCriterion("sec <>", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecGreaterThan(String value) {
//            addCriterion("sec >", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecGreaterThanOrEqualTo(String value) {
//            addCriterion("sec >=", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecLessThan(String value) {
//            addCriterion("sec <", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecLessThanOrEqualTo(String value) {
//            addCriterion("sec <=", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecLike(String value) {
//            addCriterion("sec like", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecNotLike(String value) {
//            addCriterion("sec not like", value, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecIn(List<String> values) {
//            addCriterion("sec in", values, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecNotIn(List<String> values) {
//            addCriterion("sec not in", values, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecBetween(String value1, String value2) {
//            addCriterion("sec between", value1, value2, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andSecNotBetween(String value1, String value2) {
//            addCriterion("sec not between", value1, value2, "sec");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIsNull() {
//            addCriterion("third is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIsNotNull() {
//            addCriterion("third is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdEqualTo(String value) {
//            addCriterion("third =", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdNotEqualTo(String value) {
//            addCriterion("third <>", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdGreaterThan(String value) {
//            addCriterion("third >", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdGreaterThanOrEqualTo(String value) {
//            addCriterion("third >=", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdLessThan(String value) {
//            addCriterion("third <", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdLessThanOrEqualTo(String value) {
//            addCriterion("third <=", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdLike(String value) {
//            addCriterion("third like", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdNotLike(String value) {
//            addCriterion("third not like", value, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdIn(List<String> values) {
//            addCriterion("third in", values, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdNotIn(List<String> values) {
//            addCriterion("third not in", values, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdBetween(String value1, String value2) {
//            addCriterion("third between", value1, value2, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andThirdNotBetween(String value1, String value2) {
//            addCriterion("third not between", value1, value2, "third");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthIsNull() {
//            addCriterion("forth is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthIsNotNull() {
//            addCriterion("forth is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthEqualTo(String value) {
//            addCriterion("forth =", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthNotEqualTo(String value) {
//            addCriterion("forth <>", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthGreaterThan(String value) {
//            addCriterion("forth >", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthGreaterThanOrEqualTo(String value) {
//            addCriterion("forth >=", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthLessThan(String value) {
//            addCriterion("forth <", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthLessThanOrEqualTo(String value) {
//            addCriterion("forth <=", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthLike(String value) {
//            addCriterion("forth like", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthNotLike(String value) {
//            addCriterion("forth not like", value, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthIn(List<String> values) {
//            addCriterion("forth in", values, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthNotIn(List<String> values) {
//            addCriterion("forth not in", values, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthBetween(String value1, String value2) {
//            addCriterion("forth between", value1, value2, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andForthNotBetween(String value1, String value2) {
//            addCriterion("forth not between", value1, value2, "forth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethIsNull() {
//            addCriterion("fiveth is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethIsNotNull() {
//            addCriterion("fiveth is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethEqualTo(String value) {
//            addCriterion("fiveth =", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethNotEqualTo(String value) {
//            addCriterion("fiveth <>", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethGreaterThan(String value) {
//            addCriterion("fiveth >", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethGreaterThanOrEqualTo(String value) {
//            addCriterion("fiveth >=", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethLessThan(String value) {
//            addCriterion("fiveth <", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethLessThanOrEqualTo(String value) {
//            addCriterion("fiveth <=", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethLike(String value) {
//            addCriterion("fiveth like", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethNotLike(String value) {
//            addCriterion("fiveth not like", value, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethIn(List<String> values) {
//            addCriterion("fiveth in", values, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethNotIn(List<String> values) {
//            addCriterion("fiveth not in", values, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethBetween(String value1, String value2) {
//            addCriterion("fiveth between", value1, value2, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andFivethNotBetween(String value1, String value2) {
//            addCriterion("fiveth not between", value1, value2, "fiveth");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberIsNull() {
//            addCriterion("sumNumber is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberIsNotNull() {
//            addCriterion("sumNumber is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberEqualTo(String value) {
//            addCriterion("sumNumber =", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberNotEqualTo(String value) {
//            addCriterion("sumNumber <>", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberGreaterThan(String value) {
//            addCriterion("sumNumber >", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberGreaterThanOrEqualTo(String value) {
//            addCriterion("sumNumber >=", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberLessThan(String value) {
//            addCriterion("sumNumber <", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberLessThanOrEqualTo(String value) {
//            addCriterion("sumNumber <=", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberLike(String value) {
//            addCriterion("sumNumber like", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberNotLike(String value) {
//            addCriterion("sumNumber not like", value, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberIn(List<String> values) {
//            addCriterion("sumNumber in", values, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberNotIn(List<String> values) {
//            addCriterion("sumNumber not in", values, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberBetween(String value1, String value2) {
//            addCriterion("sumNumber between", value1, value2, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andSumnumberNotBetween(String value1, String value2) {
//            addCriterion("sumNumber not between", value1, value2, "sumnumber");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduIsNull() {
//            addCriterion("kuadu is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduIsNotNull() {
//            addCriterion("kuadu is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduEqualTo(String value) {
//            addCriterion("kuadu =", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduNotEqualTo(String value) {
//            addCriterion("kuadu <>", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduGreaterThan(String value) {
//            addCriterion("kuadu >", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduGreaterThanOrEqualTo(String value) {
//            addCriterion("kuadu >=", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduLessThan(String value) {
//            addCriterion("kuadu <", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduLessThanOrEqualTo(String value) {
//            addCriterion("kuadu <=", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduLike(String value) {
//            addCriterion("kuadu like", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduNotLike(String value) {
//            addCriterion("kuadu not like", value, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduIn(List<String> values) {
//            addCriterion("kuadu in", values, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduNotIn(List<String> values) {
//            addCriterion("kuadu not in", values, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduBetween(String value1, String value2) {
//            addCriterion("kuadu between", value1, value2, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andKuaduNotBetween(String value1, String value2) {
//            addCriterion("kuadu not between", value1, value2, "kuadu");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesIsNull() {
//            addCriterion("describes is null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesIsNotNull() {
//            addCriterion("describes is not null");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesEqualTo(String value) {
//            addCriterion("describes =", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesNotEqualTo(String value) {
//            addCriterion("describes <>", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesGreaterThan(String value) {
//            addCriterion("describes >", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesGreaterThanOrEqualTo(String value) {
//            addCriterion("describes >=", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesLessThan(String value) {
//            addCriterion("describes <", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesLessThanOrEqualTo(String value) {
//            addCriterion("describes <=", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesLike(String value) {
//            addCriterion("describes like", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesNotLike(String value) {
//            addCriterion("describes not like", value, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesIn(List<String> values) {
//            addCriterion("describes in", values, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesNotIn(List<String> values) {
//            addCriterion("describes not in", values, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesBetween(String value1, String value2) {
//            addCriterion("describes between", value1, value2, "describes");
//            return (Criteria) this;
//        }
//
//        public Criteria andDescribesNotBetween(String value1, String value2) {
//            addCriterion("describes not between", value1, value2, "describes");
//            return (Criteria) this;
//        }
//    }
//
//    public static class Criteria extends GeneratedCriteria {
//
//        protected Criteria() {
//            super();
//        }
//    }
//
//    public static class Criterion {
//        private String condition;
//
//        private Object value;
//
//        private Object secondValue;
//
//        private boolean noValue;
//
//        private boolean singleValue;
//
//        private boolean betweenValue;
//
//        private boolean listValue;
//
//        private String typeHandler;
//
//        public String getCondition() {
//            return condition;
//        }
//
//        public Object getValue() {
//            return value;
//        }
//
//        public Object getSecondValue() {
//            return secondValue;
//        }
//
//        public boolean isNoValue() {
//            return noValue;
//        }
//
//        public boolean isSingleValue() {
//            return singleValue;
//        }
//
//        public boolean isBetweenValue() {
//            return betweenValue;
//        }
//
//        public boolean isListValue() {
//            return listValue;
//        }
//
//        public String getTypeHandler() {
//            return typeHandler;
//        }
//
//        protected Criterion(String condition) {
//            super();
//            this.condition = condition;
//            this.typeHandler = null;
//            this.noValue = true;
//        }
//
//        protected Criterion(String condition, Object value, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.typeHandler = typeHandler;
//            if (value instanceof List<?>) {
//                this.listValue = true;
//            } else {
//                this.singleValue = true;
//            }
//        }
//
//        protected Criterion(String condition, Object value) {
//            this(condition, value, null);
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
//            super();
//            this.condition = condition;
//            this.value = value;
//            this.secondValue = secondValue;
//            this.typeHandler = typeHandler;
//            this.betweenValue = true;
//        }
//
//        protected Criterion(String condition, Object value, Object secondValue) {
//            this(condition, value, secondValue, null);
//        }
//    }
//}