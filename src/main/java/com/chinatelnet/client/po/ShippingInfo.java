package com.chinatelnet.client.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
*
*  @author gengbin
*/
public class ShippingInfo implements Serializable {

    private static final long serialVersionUID = 1559031236995L;


    /**
    * 主键
    * 主键ID
    * isNullAble:0
    */
    private Integer shipId;

    /**
    * 物流公司名称
    * isNullAble:0
    */
    private String shipName;

    /**
    * 物流公司联系人
    * isNullAble:0
    */
    private String shipContact;

    /**
    * 物流公司联系电话
    * isNullAble:0
    */
    private String telephone;

    /**
    * 配送价格
    * isNullAble:0,defaultVal:0.00
    */
    private java.math.BigDecimal price;

    /**
    * 最后修改时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime modifiedTime;


    public void setShipId(Integer shipId){this.shipId = shipId;}

    public Integer getShipId(){return this.shipId;}

    public void setShipName(String shipName){this.shipName = shipName;}

    public String getShipName(){return this.shipName;}

    public void setShipContact(String shipContact){this.shipContact = shipContact;}

    public String getShipContact(){return this.shipContact;}

    public void setTelephone(String telephone){this.telephone = telephone;}

    public String getTelephone(){return this.telephone;}

    public void setPrice(java.math.BigDecimal price){this.price = price;}

    public java.math.BigDecimal getPrice(){return this.price;}

    public void setModifiedTime(java.time.LocalDateTime modifiedTime){this.modifiedTime = modifiedTime;}

    public java.time.LocalDateTime getModifiedTime(){return this.modifiedTime;}
    @Override
    public String toString() {
        return "ShippingInfo{" +
                "shipId='" + shipId + '\'' +
                "shipName='" + shipName + '\'' +
                "shipContact='" + shipContact + '\'' +
                "telephone='" + telephone + '\'' +
                "price='" + price + '\'' +
                "modifiedTime='" + modifiedTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ShippingInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(ShippingInfo set){
            this.set = set;
            return this;
        }

        public ShippingInfo getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends ShippingInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> shipIdList;

        public List<Integer> getShipIdList(){return this.shipIdList;}

        private Integer shipIdSt;

        private Integer shipIdEd;

        public Integer getShipIdSt(){return this.shipIdSt;}

        public Integer getShipIdEd(){return this.shipIdEd;}

        private List<String> shipNameList;

        public List<String> getShipNameList(){return this.shipNameList;}


        private List<String> fuzzyShipName;

        public List<String> getFuzzyShipName(){return this.fuzzyShipName;}

        private List<String> rightFuzzyShipName;

        public List<String> getRightFuzzyShipName(){return this.rightFuzzyShipName;}
        private List<String> shipContactList;

        public List<String> getShipContactList(){return this.shipContactList;}


        private List<String> fuzzyShipContact;

        public List<String> getFuzzyShipContact(){return this.fuzzyShipContact;}

        private List<String> rightFuzzyShipContact;

        public List<String> getRightFuzzyShipContact(){return this.rightFuzzyShipContact;}
        private List<String> telephoneList;

        public List<String> getTelephoneList(){return this.telephoneList;}


        private List<String> fuzzyTelephone;

        public List<String> getFuzzyTelephone(){return this.fuzzyTelephone;}

        private List<String> rightFuzzyTelephone;

        public List<String> getRightFuzzyTelephone(){return this.rightFuzzyTelephone;}
        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<java.time.LocalDateTime> modifiedTimeList;

        public List<java.time.LocalDateTime> getModifiedTimeList(){return this.modifiedTimeList;}

        private java.time.LocalDateTime modifiedTimeSt;

        private java.time.LocalDateTime modifiedTimeEd;

        public java.time.LocalDateTime getModifiedTimeSt(){return this.modifiedTimeSt;}

        public java.time.LocalDateTime getModifiedTimeEd(){return this.modifiedTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder shipIdBetWeen(Integer shipIdSt,Integer shipIdEd){
            this.shipIdSt = shipIdSt;
            this.shipIdEd = shipIdEd;
            return this;
        }

        public QueryBuilder shipIdGreaterEqThan(Integer shipIdSt){
            this.shipIdSt = shipIdSt;
            return this;
        }
        public QueryBuilder shipIdLessEqThan(Integer shipIdEd){
            this.shipIdEd = shipIdEd;
            return this;
        }


        public QueryBuilder shipId(Integer shipId){
            setShipId(shipId);
            return this;
        }

        public QueryBuilder shipIdList(Integer ... shipId){
            this.shipIdList = solveNullList(shipId);
            return this;
        }

        public QueryBuilder shipIdList(List<Integer> shipId){
            this.shipIdList = shipId;
            return this;
        }

        public QueryBuilder fetchShipId(){
            setFetchFields("fetchFields","shipId");
            return this;
        }

        public QueryBuilder excludeShipId(){
            setFetchFields("excludeFields","shipId");
            return this;
        }

        public QueryBuilder fuzzyShipName (List<String> fuzzyShipName){
            this.fuzzyShipName = fuzzyShipName;
            return this;
        }

        public QueryBuilder fuzzyShipName (String ... fuzzyShipName){
            this.fuzzyShipName = solveNullList(fuzzyShipName);
            return this;
        }

        public QueryBuilder rightFuzzyShipName (List<String> rightFuzzyShipName){
            this.rightFuzzyShipName = rightFuzzyShipName;
            return this;
        }

        public QueryBuilder rightFuzzyShipName (String ... rightFuzzyShipName){
            this.rightFuzzyShipName = solveNullList(rightFuzzyShipName);
            return this;
        }

        public QueryBuilder shipName(String shipName){
            setShipName(shipName);
            return this;
        }

        public QueryBuilder shipNameList(String ... shipName){
            this.shipNameList = solveNullList(shipName);
            return this;
        }

        public QueryBuilder shipNameList(List<String> shipName){
            this.shipNameList = shipName;
            return this;
        }

        public QueryBuilder fetchShipName(){
            setFetchFields("fetchFields","shipName");
            return this;
        }

        public QueryBuilder excludeShipName(){
            setFetchFields("excludeFields","shipName");
            return this;
        }

        public QueryBuilder fuzzyShipContact (List<String> fuzzyShipContact){
            this.fuzzyShipContact = fuzzyShipContact;
            return this;
        }

        public QueryBuilder fuzzyShipContact (String ... fuzzyShipContact){
            this.fuzzyShipContact = solveNullList(fuzzyShipContact);
            return this;
        }

        public QueryBuilder rightFuzzyShipContact (List<String> rightFuzzyShipContact){
            this.rightFuzzyShipContact = rightFuzzyShipContact;
            return this;
        }

        public QueryBuilder rightFuzzyShipContact (String ... rightFuzzyShipContact){
            this.rightFuzzyShipContact = solveNullList(rightFuzzyShipContact);
            return this;
        }

        public QueryBuilder shipContact(String shipContact){
            setShipContact(shipContact);
            return this;
        }

        public QueryBuilder shipContactList(String ... shipContact){
            this.shipContactList = solveNullList(shipContact);
            return this;
        }

        public QueryBuilder shipContactList(List<String> shipContact){
            this.shipContactList = shipContact;
            return this;
        }

        public QueryBuilder fetchShipContact(){
            setFetchFields("fetchFields","shipContact");
            return this;
        }

        public QueryBuilder excludeShipContact(){
            setFetchFields("excludeFields","shipContact");
            return this;
        }

        public QueryBuilder fuzzyTelephone (List<String> fuzzyTelephone){
            this.fuzzyTelephone = fuzzyTelephone;
            return this;
        }

        public QueryBuilder fuzzyTelephone (String ... fuzzyTelephone){
            this.fuzzyTelephone = solveNullList(fuzzyTelephone);
            return this;
        }

        public QueryBuilder rightFuzzyTelephone (List<String> rightFuzzyTelephone){
            this.rightFuzzyTelephone = rightFuzzyTelephone;
            return this;
        }

        public QueryBuilder rightFuzzyTelephone (String ... rightFuzzyTelephone){
            this.rightFuzzyTelephone = solveNullList(rightFuzzyTelephone);
            return this;
        }

        public QueryBuilder telephone(String telephone){
            setTelephone(telephone);
            return this;
        }

        public QueryBuilder telephoneList(String ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public QueryBuilder telephoneList(List<String> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public QueryBuilder fetchTelephone(){
            setFetchFields("fetchFields","telephone");
            return this;
        }

        public QueryBuilder excludeTelephone(){
            setFetchFields("excludeFields","telephone");
            return this;
        }

        public QueryBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public QueryBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public QueryBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public QueryBuilder price(java.math.BigDecimal price){
            setPrice(price);
            return this;
        }

        public QueryBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public QueryBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public QueryBuilder fetchPrice(){
            setFetchFields("fetchFields","price");
            return this;
        }

        public QueryBuilder excludePrice(){
            setFetchFields("excludeFields","price");
            return this;
        }

        public QueryBuilder modifiedTimeBetWeen(java.time.LocalDateTime modifiedTimeSt,java.time.LocalDateTime modifiedTimeEd){
            this.modifiedTimeSt = modifiedTimeSt;
            this.modifiedTimeEd = modifiedTimeEd;
            return this;
        }

        public QueryBuilder modifiedTimeGreaterEqThan(java.time.LocalDateTime modifiedTimeSt){
            this.modifiedTimeSt = modifiedTimeSt;
            return this;
        }
        public QueryBuilder modifiedTimeLessEqThan(java.time.LocalDateTime modifiedTimeEd){
            this.modifiedTimeEd = modifiedTimeEd;
            return this;
        }


        public QueryBuilder modifiedTime(java.time.LocalDateTime modifiedTime){
            setModifiedTime(modifiedTime);
            return this;
        }

        public QueryBuilder modifiedTimeList(java.time.LocalDateTime ... modifiedTime){
            this.modifiedTimeList = solveNullList(modifiedTime);
            return this;
        }

        public QueryBuilder modifiedTimeList(List<java.time.LocalDateTime> modifiedTime){
            this.modifiedTimeList = modifiedTime;
            return this;
        }

        public QueryBuilder fetchModifiedTime(){
            setFetchFields("fetchFields","modifiedTime");
            return this;
        }

        public QueryBuilder excludeModifiedTime(){
            setFetchFields("excludeFields","modifiedTime");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public ShippingInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> shipIdList;

        public List<Integer> getShipIdList(){return this.shipIdList;}

        private Integer shipIdSt;

        private Integer shipIdEd;

        public Integer getShipIdSt(){return this.shipIdSt;}

        public Integer getShipIdEd(){return this.shipIdEd;}

        private List<String> shipNameList;

        public List<String> getShipNameList(){return this.shipNameList;}


        private List<String> fuzzyShipName;

        public List<String> getFuzzyShipName(){return this.fuzzyShipName;}

        private List<String> rightFuzzyShipName;

        public List<String> getRightFuzzyShipName(){return this.rightFuzzyShipName;}
        private List<String> shipContactList;

        public List<String> getShipContactList(){return this.shipContactList;}


        private List<String> fuzzyShipContact;

        public List<String> getFuzzyShipContact(){return this.fuzzyShipContact;}

        private List<String> rightFuzzyShipContact;

        public List<String> getRightFuzzyShipContact(){return this.rightFuzzyShipContact;}
        private List<String> telephoneList;

        public List<String> getTelephoneList(){return this.telephoneList;}


        private List<String> fuzzyTelephone;

        public List<String> getFuzzyTelephone(){return this.fuzzyTelephone;}

        private List<String> rightFuzzyTelephone;

        public List<String> getRightFuzzyTelephone(){return this.rightFuzzyTelephone;}
        private List<java.math.BigDecimal> priceList;

        public List<java.math.BigDecimal> getPriceList(){return this.priceList;}

        private java.math.BigDecimal priceSt;

        private java.math.BigDecimal priceEd;

        public java.math.BigDecimal getPriceSt(){return this.priceSt;}

        public java.math.BigDecimal getPriceEd(){return this.priceEd;}

        private List<java.time.LocalDateTime> modifiedTimeList;

        public List<java.time.LocalDateTime> getModifiedTimeList(){return this.modifiedTimeList;}

        private java.time.LocalDateTime modifiedTimeSt;

        private java.time.LocalDateTime modifiedTimeEd;

        public java.time.LocalDateTime getModifiedTimeSt(){return this.modifiedTimeSt;}

        public java.time.LocalDateTime getModifiedTimeEd(){return this.modifiedTimeEd;}


        public ConditionBuilder shipIdBetWeen(Integer shipIdSt,Integer shipIdEd){
            this.shipIdSt = shipIdSt;
            this.shipIdEd = shipIdEd;
            return this;
        }

        public ConditionBuilder shipIdGreaterEqThan(Integer shipIdSt){
            this.shipIdSt = shipIdSt;
            return this;
        }
        public ConditionBuilder shipIdLessEqThan(Integer shipIdEd){
            this.shipIdEd = shipIdEd;
            return this;
        }


        public ConditionBuilder shipIdList(Integer ... shipId){
            this.shipIdList = solveNullList(shipId);
            return this;
        }

        public ConditionBuilder shipIdList(List<Integer> shipId){
            this.shipIdList = shipId;
            return this;
        }

        public ConditionBuilder fuzzyShipName (List<String> fuzzyShipName){
            this.fuzzyShipName = fuzzyShipName;
            return this;
        }

        public ConditionBuilder fuzzyShipName (String ... fuzzyShipName){
            this.fuzzyShipName = solveNullList(fuzzyShipName);
            return this;
        }

        public ConditionBuilder rightFuzzyShipName (List<String> rightFuzzyShipName){
            this.rightFuzzyShipName = rightFuzzyShipName;
            return this;
        }

        public ConditionBuilder rightFuzzyShipName (String ... rightFuzzyShipName){
            this.rightFuzzyShipName = solveNullList(rightFuzzyShipName);
            return this;
        }

        public ConditionBuilder shipNameList(String ... shipName){
            this.shipNameList = solveNullList(shipName);
            return this;
        }

        public ConditionBuilder shipNameList(List<String> shipName){
            this.shipNameList = shipName;
            return this;
        }

        public ConditionBuilder fuzzyShipContact (List<String> fuzzyShipContact){
            this.fuzzyShipContact = fuzzyShipContact;
            return this;
        }

        public ConditionBuilder fuzzyShipContact (String ... fuzzyShipContact){
            this.fuzzyShipContact = solveNullList(fuzzyShipContact);
            return this;
        }

        public ConditionBuilder rightFuzzyShipContact (List<String> rightFuzzyShipContact){
            this.rightFuzzyShipContact = rightFuzzyShipContact;
            return this;
        }

        public ConditionBuilder rightFuzzyShipContact (String ... rightFuzzyShipContact){
            this.rightFuzzyShipContact = solveNullList(rightFuzzyShipContact);
            return this;
        }

        public ConditionBuilder shipContactList(String ... shipContact){
            this.shipContactList = solveNullList(shipContact);
            return this;
        }

        public ConditionBuilder shipContactList(List<String> shipContact){
            this.shipContactList = shipContact;
            return this;
        }

        public ConditionBuilder fuzzyTelephone (List<String> fuzzyTelephone){
            this.fuzzyTelephone = fuzzyTelephone;
            return this;
        }

        public ConditionBuilder fuzzyTelephone (String ... fuzzyTelephone){
            this.fuzzyTelephone = solveNullList(fuzzyTelephone);
            return this;
        }

        public ConditionBuilder rightFuzzyTelephone (List<String> rightFuzzyTelephone){
            this.rightFuzzyTelephone = rightFuzzyTelephone;
            return this;
        }

        public ConditionBuilder rightFuzzyTelephone (String ... rightFuzzyTelephone){
            this.rightFuzzyTelephone = solveNullList(rightFuzzyTelephone);
            return this;
        }

        public ConditionBuilder telephoneList(String ... telephone){
            this.telephoneList = solveNullList(telephone);
            return this;
        }

        public ConditionBuilder telephoneList(List<String> telephone){
            this.telephoneList = telephone;
            return this;
        }

        public ConditionBuilder priceBetWeen(java.math.BigDecimal priceSt,java.math.BigDecimal priceEd){
            this.priceSt = priceSt;
            this.priceEd = priceEd;
            return this;
        }

        public ConditionBuilder priceGreaterEqThan(java.math.BigDecimal priceSt){
            this.priceSt = priceSt;
            return this;
        }
        public ConditionBuilder priceLessEqThan(java.math.BigDecimal priceEd){
            this.priceEd = priceEd;
            return this;
        }


        public ConditionBuilder priceList(java.math.BigDecimal ... price){
            this.priceList = solveNullList(price);
            return this;
        }

        public ConditionBuilder priceList(List<java.math.BigDecimal> price){
            this.priceList = price;
            return this;
        }

        public ConditionBuilder modifiedTimeBetWeen(java.time.LocalDateTime modifiedTimeSt,java.time.LocalDateTime modifiedTimeEd){
            this.modifiedTimeSt = modifiedTimeSt;
            this.modifiedTimeEd = modifiedTimeEd;
            return this;
        }

        public ConditionBuilder modifiedTimeGreaterEqThan(java.time.LocalDateTime modifiedTimeSt){
            this.modifiedTimeSt = modifiedTimeSt;
            return this;
        }
        public ConditionBuilder modifiedTimeLessEqThan(java.time.LocalDateTime modifiedTimeEd){
            this.modifiedTimeEd = modifiedTimeEd;
            return this;
        }


        public ConditionBuilder modifiedTimeList(java.time.LocalDateTime ... modifiedTime){
            this.modifiedTimeList = solveNullList(modifiedTime);
            return this;
        }

        public ConditionBuilder modifiedTimeList(List<java.time.LocalDateTime> modifiedTime){
            this.modifiedTimeList = modifiedTime;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private ShippingInfo obj;

        public Builder(){
            this.obj = new ShippingInfo();
        }

        public Builder shipId(Integer shipId){
            this.obj.setShipId(shipId);
            return this;
        }
        public Builder shipName(String shipName){
            this.obj.setShipName(shipName);
            return this;
        }
        public Builder shipContact(String shipContact){
            this.obj.setShipContact(shipContact);
            return this;
        }
        public Builder telephone(String telephone){
            this.obj.setTelephone(telephone);
            return this;
        }
        public Builder price(java.math.BigDecimal price){
            this.obj.setPrice(price);
            return this;
        }
        public Builder modifiedTime(java.time.LocalDateTime modifiedTime){
            this.obj.setModifiedTime(modifiedTime);
            return this;
        }
        public ShippingInfo build(){return obj;}
    }

}
