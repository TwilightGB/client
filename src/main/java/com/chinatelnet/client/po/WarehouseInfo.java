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
public class WarehouseInfo implements Serializable {

    private static final long serialVersionUID = 1559031145223L;


    /**
    * 主键
    * 仓库ID
    * isNullAble:0
    */
    private Integer wId;

    /**
    * 仓库编码
    * isNullAble:0
    */
    private String warehouseSn;

    /**
    * 仓库名称
    * isNullAble:0
    */
    private String warehoustName;

    /**
    * 仓库电话
    * isNullAble:0
    */
    private String warehousePhone;

    /**
    * 仓库联系人
    * isNullAble:0
    */
    private String contact;

    /**
    * 省
    * isNullAble:0
    */
    private Integer province;

    /**
    * 市
    * isNullAble:0
    */
    private Integer city;

    /**
    * 区
    * isNullAble:0
    */
    private Integer distrct;

    /**
    * 仓库地址
    * isNullAble:0
    */
    private String address;

    /**
    * 仓库状态：0禁用，1启用
    * isNullAble:0,defaultVal:1
    */
    private Integer warehouseStatus;

    /**
    * 最后修改时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime modifiedTime;


    public void setWId(Integer wId){this.wId = wId;}

    public Integer getWId(){return this.wId;}

    public void setWarehouseSn(String warehouseSn){this.warehouseSn = warehouseSn;}

    public String getWarehouseSn(){return this.warehouseSn;}

    public void setWarehoustName(String warehoustName){this.warehoustName = warehoustName;}

    public String getWarehoustName(){return this.warehoustName;}

    public void setWarehousePhone(String warehousePhone){this.warehousePhone = warehousePhone;}

    public String getWarehousePhone(){return this.warehousePhone;}

    public void setContact(String contact){this.contact = contact;}

    public String getContact(){return this.contact;}

    public void setProvince(Integer province){this.province = province;}

    public Integer getProvince(){return this.province;}

    public void setCity(Integer city){this.city = city;}

    public Integer getCity(){return this.city;}

    public void setDistrct(Integer distrct){this.distrct = distrct;}

    public Integer getDistrct(){return this.distrct;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setWarehouseStatus(Integer warehouseStatus){this.warehouseStatus = warehouseStatus;}

    public Integer getWarehouseStatus(){return this.warehouseStatus;}

    public void setModifiedTime(java.time.LocalDateTime modifiedTime){this.modifiedTime = modifiedTime;}

    public java.time.LocalDateTime getModifiedTime(){return this.modifiedTime;}
    @Override
    public String toString() {
        return "WarehouseInfo{" +
                "wId='" + wId + '\'' +
                "warehouseSn='" + warehouseSn + '\'' +
                "warehoustName='" + warehoustName + '\'' +
                "warehousePhone='" + warehousePhone + '\'' +
                "contact='" + contact + '\'' +
                "province='" + province + '\'' +
                "city='" + city + '\'' +
                "distrct='" + distrct + '\'' +
                "address='" + address + '\'' +
                "warehouseStatus='" + warehouseStatus + '\'' +
                "modifiedTime='" + modifiedTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private WarehouseInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(WarehouseInfo set){
            this.set = set;
            return this;
        }

        public WarehouseInfo getSet(){
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

    public static class QueryBuilder extends WarehouseInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> wIdList;

        public List<Integer> getWIdList(){return this.wIdList;}

        private Integer wIdSt;

        private Integer wIdEd;

        public Integer getWIdSt(){return this.wIdSt;}

        public Integer getWIdEd(){return this.wIdEd;}

        private List<String> warehouseSnList;

        public List<String> getWarehouseSnList(){return this.warehouseSnList;}


        private List<String> fuzzyWarehouseSn;

        public List<String> getFuzzyWarehouseSn(){return this.fuzzyWarehouseSn;}

        private List<String> rightFuzzyWarehouseSn;

        public List<String> getRightFuzzyWarehouseSn(){return this.rightFuzzyWarehouseSn;}
        private List<String> warehoustNameList;

        public List<String> getWarehoustNameList(){return this.warehoustNameList;}


        private List<String> fuzzyWarehoustName;

        public List<String> getFuzzyWarehoustName(){return this.fuzzyWarehoustName;}

        private List<String> rightFuzzyWarehoustName;

        public List<String> getRightFuzzyWarehoustName(){return this.rightFuzzyWarehoustName;}
        private List<String> warehousePhoneList;

        public List<String> getWarehousePhoneList(){return this.warehousePhoneList;}


        private List<String> fuzzyWarehousePhone;

        public List<String> getFuzzyWarehousePhone(){return this.fuzzyWarehousePhone;}

        private List<String> rightFuzzyWarehousePhone;

        public List<String> getRightFuzzyWarehousePhone(){return this.rightFuzzyWarehousePhone;}
        private List<String> contactList;

        public List<String> getContactList(){return this.contactList;}


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){return this.fuzzyContact;}

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){return this.rightFuzzyContact;}
        private List<Integer> provinceList;

        public List<Integer> getProvinceList(){return this.provinceList;}

        private Integer provinceSt;

        private Integer provinceEd;

        public Integer getProvinceSt(){return this.provinceSt;}

        public Integer getProvinceEd(){return this.provinceEd;}

        private List<Integer> cityList;

        public List<Integer> getCityList(){return this.cityList;}

        private Integer citySt;

        private Integer cityEd;

        public Integer getCitySt(){return this.citySt;}

        public Integer getCityEd(){return this.cityEd;}

        private List<Integer> distrctList;

        public List<Integer> getDistrctList(){return this.distrctList;}

        private Integer distrctSt;

        private Integer distrctEd;

        public Integer getDistrctSt(){return this.distrctSt;}

        public Integer getDistrctEd(){return this.distrctEd;}

        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> warehouseStatusList;

        public List<Integer> getWarehouseStatusList(){return this.warehouseStatusList;}

        private Integer warehouseStatusSt;

        private Integer warehouseStatusEd;

        public Integer getWarehouseStatusSt(){return this.warehouseStatusSt;}

        public Integer getWarehouseStatusEd(){return this.warehouseStatusEd;}

        private List<java.time.LocalDateTime> modifiedTimeList;

        public List<java.time.LocalDateTime> getModifiedTimeList(){return this.modifiedTimeList;}

        private java.time.LocalDateTime modifiedTimeSt;

        private java.time.LocalDateTime modifiedTimeEd;

        public java.time.LocalDateTime getModifiedTimeSt(){return this.modifiedTimeSt;}

        public java.time.LocalDateTime getModifiedTimeEd(){return this.modifiedTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder wIdBetWeen(Integer wIdSt,Integer wIdEd){
            this.wIdSt = wIdSt;
            this.wIdEd = wIdEd;
            return this;
        }

        public QueryBuilder wIdGreaterEqThan(Integer wIdSt){
            this.wIdSt = wIdSt;
            return this;
        }
        public QueryBuilder wIdLessEqThan(Integer wIdEd){
            this.wIdEd = wIdEd;
            return this;
        }


        public QueryBuilder wId(Integer wId){
            setWId(wId);
            return this;
        }

        public QueryBuilder wIdList(Integer ... wId){
            this.wIdList = solveNullList(wId);
            return this;
        }

        public QueryBuilder wIdList(List<Integer> wId){
            this.wIdList = wId;
            return this;
        }

        public QueryBuilder fetchWId(){
            setFetchFields("fetchFields","wId");
            return this;
        }

        public QueryBuilder excludeWId(){
            setFetchFields("excludeFields","wId");
            return this;
        }

        public QueryBuilder fuzzyWarehouseSn (List<String> fuzzyWarehouseSn){
            this.fuzzyWarehouseSn = fuzzyWarehouseSn;
            return this;
        }

        public QueryBuilder fuzzyWarehouseSn (String ... fuzzyWarehouseSn){
            this.fuzzyWarehouseSn = solveNullList(fuzzyWarehouseSn);
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseSn (List<String> rightFuzzyWarehouseSn){
            this.rightFuzzyWarehouseSn = rightFuzzyWarehouseSn;
            return this;
        }

        public QueryBuilder rightFuzzyWarehouseSn (String ... rightFuzzyWarehouseSn){
            this.rightFuzzyWarehouseSn = solveNullList(rightFuzzyWarehouseSn);
            return this;
        }

        public QueryBuilder warehouseSn(String warehouseSn){
            setWarehouseSn(warehouseSn);
            return this;
        }

        public QueryBuilder warehouseSnList(String ... warehouseSn){
            this.warehouseSnList = solveNullList(warehouseSn);
            return this;
        }

        public QueryBuilder warehouseSnList(List<String> warehouseSn){
            this.warehouseSnList = warehouseSn;
            return this;
        }

        public QueryBuilder fetchWarehouseSn(){
            setFetchFields("fetchFields","warehouseSn");
            return this;
        }

        public QueryBuilder excludeWarehouseSn(){
            setFetchFields("excludeFields","warehouseSn");
            return this;
        }

        public QueryBuilder fuzzyWarehoustName (List<String> fuzzyWarehoustName){
            this.fuzzyWarehoustName = fuzzyWarehoustName;
            return this;
        }

        public QueryBuilder fuzzyWarehoustName (String ... fuzzyWarehoustName){
            this.fuzzyWarehoustName = solveNullList(fuzzyWarehoustName);
            return this;
        }

        public QueryBuilder rightFuzzyWarehoustName (List<String> rightFuzzyWarehoustName){
            this.rightFuzzyWarehoustName = rightFuzzyWarehoustName;
            return this;
        }

        public QueryBuilder rightFuzzyWarehoustName (String ... rightFuzzyWarehoustName){
            this.rightFuzzyWarehoustName = solveNullList(rightFuzzyWarehoustName);
            return this;
        }

        public QueryBuilder warehoustName(String warehoustName){
            setWarehoustName(warehoustName);
            return this;
        }

        public QueryBuilder warehoustNameList(String ... warehoustName){
            this.warehoustNameList = solveNullList(warehoustName);
            return this;
        }

        public QueryBuilder warehoustNameList(List<String> warehoustName){
            this.warehoustNameList = warehoustName;
            return this;
        }

        public QueryBuilder fetchWarehoustName(){
            setFetchFields("fetchFields","warehoustName");
            return this;
        }

        public QueryBuilder excludeWarehoustName(){
            setFetchFields("excludeFields","warehoustName");
            return this;
        }

        public QueryBuilder fuzzyWarehousePhone (List<String> fuzzyWarehousePhone){
            this.fuzzyWarehousePhone = fuzzyWarehousePhone;
            return this;
        }

        public QueryBuilder fuzzyWarehousePhone (String ... fuzzyWarehousePhone){
            this.fuzzyWarehousePhone = solveNullList(fuzzyWarehousePhone);
            return this;
        }

        public QueryBuilder rightFuzzyWarehousePhone (List<String> rightFuzzyWarehousePhone){
            this.rightFuzzyWarehousePhone = rightFuzzyWarehousePhone;
            return this;
        }

        public QueryBuilder rightFuzzyWarehousePhone (String ... rightFuzzyWarehousePhone){
            this.rightFuzzyWarehousePhone = solveNullList(rightFuzzyWarehousePhone);
            return this;
        }

        public QueryBuilder warehousePhone(String warehousePhone){
            setWarehousePhone(warehousePhone);
            return this;
        }

        public QueryBuilder warehousePhoneList(String ... warehousePhone){
            this.warehousePhoneList = solveNullList(warehousePhone);
            return this;
        }

        public QueryBuilder warehousePhoneList(List<String> warehousePhone){
            this.warehousePhoneList = warehousePhone;
            return this;
        }

        public QueryBuilder fetchWarehousePhone(){
            setFetchFields("fetchFields","warehousePhone");
            return this;
        }

        public QueryBuilder excludeWarehousePhone(){
            setFetchFields("excludeFields","warehousePhone");
            return this;
        }

        public QueryBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public QueryBuilder fuzzyContact (String ... fuzzyContact){
            this.fuzzyContact = solveNullList(fuzzyContact);
            return this;
        }

        public QueryBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public QueryBuilder rightFuzzyContact (String ... rightFuzzyContact){
            this.rightFuzzyContact = solveNullList(rightFuzzyContact);
            return this;
        }

        public QueryBuilder contact(String contact){
            setContact(contact);
            return this;
        }

        public QueryBuilder contactList(String ... contact){
            this.contactList = solveNullList(contact);
            return this;
        }

        public QueryBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public QueryBuilder fetchContact(){
            setFetchFields("fetchFields","contact");
            return this;
        }

        public QueryBuilder excludeContact(){
            setFetchFields("excludeFields","contact");
            return this;
        }

        public QueryBuilder provinceBetWeen(Integer provinceSt,Integer provinceEd){
            this.provinceSt = provinceSt;
            this.provinceEd = provinceEd;
            return this;
        }

        public QueryBuilder provinceGreaterEqThan(Integer provinceSt){
            this.provinceSt = provinceSt;
            return this;
        }
        public QueryBuilder provinceLessEqThan(Integer provinceEd){
            this.provinceEd = provinceEd;
            return this;
        }


        public QueryBuilder province(Integer province){
            setProvince(province);
            return this;
        }

        public QueryBuilder provinceList(Integer ... province){
            this.provinceList = solveNullList(province);
            return this;
        }

        public QueryBuilder provinceList(List<Integer> province){
            this.provinceList = province;
            return this;
        }

        public QueryBuilder fetchProvince(){
            setFetchFields("fetchFields","province");
            return this;
        }

        public QueryBuilder excludeProvince(){
            setFetchFields("excludeFields","province");
            return this;
        }

        public QueryBuilder cityBetWeen(Integer citySt,Integer cityEd){
            this.citySt = citySt;
            this.cityEd = cityEd;
            return this;
        }

        public QueryBuilder cityGreaterEqThan(Integer citySt){
            this.citySt = citySt;
            return this;
        }
        public QueryBuilder cityLessEqThan(Integer cityEd){
            this.cityEd = cityEd;
            return this;
        }


        public QueryBuilder city(Integer city){
            setCity(city);
            return this;
        }

        public QueryBuilder cityList(Integer ... city){
            this.cityList = solveNullList(city);
            return this;
        }

        public QueryBuilder cityList(List<Integer> city){
            this.cityList = city;
            return this;
        }

        public QueryBuilder fetchCity(){
            setFetchFields("fetchFields","city");
            return this;
        }

        public QueryBuilder excludeCity(){
            setFetchFields("excludeFields","city");
            return this;
        }

        public QueryBuilder distrctBetWeen(Integer distrctSt,Integer distrctEd){
            this.distrctSt = distrctSt;
            this.distrctEd = distrctEd;
            return this;
        }

        public QueryBuilder distrctGreaterEqThan(Integer distrctSt){
            this.distrctSt = distrctSt;
            return this;
        }
        public QueryBuilder distrctLessEqThan(Integer distrctEd){
            this.distrctEd = distrctEd;
            return this;
        }


        public QueryBuilder distrct(Integer distrct){
            setDistrct(distrct);
            return this;
        }

        public QueryBuilder distrctList(Integer ... distrct){
            this.distrctList = solveNullList(distrct);
            return this;
        }

        public QueryBuilder distrctList(List<Integer> distrct){
            this.distrctList = distrct;
            return this;
        }

        public QueryBuilder fetchDistrct(){
            setFetchFields("fetchFields","distrct");
            return this;
        }

        public QueryBuilder excludeDistrct(){
            setFetchFields("excludeFields","distrct");
            return this;
        }

        public QueryBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address){
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress(){
            setFetchFields("fetchFields","address");
            return this;
        }

        public QueryBuilder excludeAddress(){
            setFetchFields("excludeFields","address");
            return this;
        }

        public QueryBuilder warehouseStatusBetWeen(Integer warehouseStatusSt,Integer warehouseStatusEd){
            this.warehouseStatusSt = warehouseStatusSt;
            this.warehouseStatusEd = warehouseStatusEd;
            return this;
        }

        public QueryBuilder warehouseStatusGreaterEqThan(Integer warehouseStatusSt){
            this.warehouseStatusSt = warehouseStatusSt;
            return this;
        }
        public QueryBuilder warehouseStatusLessEqThan(Integer warehouseStatusEd){
            this.warehouseStatusEd = warehouseStatusEd;
            return this;
        }


        public QueryBuilder warehouseStatus(Integer warehouseStatus){
            setWarehouseStatus(warehouseStatus);
            return this;
        }

        public QueryBuilder warehouseStatusList(Integer ... warehouseStatus){
            this.warehouseStatusList = solveNullList(warehouseStatus);
            return this;
        }

        public QueryBuilder warehouseStatusList(List<Integer> warehouseStatus){
            this.warehouseStatusList = warehouseStatus;
            return this;
        }

        public QueryBuilder fetchWarehouseStatus(){
            setFetchFields("fetchFields","warehouseStatus");
            return this;
        }

        public QueryBuilder excludeWarehouseStatus(){
            setFetchFields("excludeFields","warehouseStatus");
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

        public WarehouseInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> wIdList;

        public List<Integer> getWIdList(){return this.wIdList;}

        private Integer wIdSt;

        private Integer wIdEd;

        public Integer getWIdSt(){return this.wIdSt;}

        public Integer getWIdEd(){return this.wIdEd;}

        private List<String> warehouseSnList;

        public List<String> getWarehouseSnList(){return this.warehouseSnList;}


        private List<String> fuzzyWarehouseSn;

        public List<String> getFuzzyWarehouseSn(){return this.fuzzyWarehouseSn;}

        private List<String> rightFuzzyWarehouseSn;

        public List<String> getRightFuzzyWarehouseSn(){return this.rightFuzzyWarehouseSn;}
        private List<String> warehoustNameList;

        public List<String> getWarehoustNameList(){return this.warehoustNameList;}


        private List<String> fuzzyWarehoustName;

        public List<String> getFuzzyWarehoustName(){return this.fuzzyWarehoustName;}

        private List<String> rightFuzzyWarehoustName;

        public List<String> getRightFuzzyWarehoustName(){return this.rightFuzzyWarehoustName;}
        private List<String> warehousePhoneList;

        public List<String> getWarehousePhoneList(){return this.warehousePhoneList;}


        private List<String> fuzzyWarehousePhone;

        public List<String> getFuzzyWarehousePhone(){return this.fuzzyWarehousePhone;}

        private List<String> rightFuzzyWarehousePhone;

        public List<String> getRightFuzzyWarehousePhone(){return this.rightFuzzyWarehousePhone;}
        private List<String> contactList;

        public List<String> getContactList(){return this.contactList;}


        private List<String> fuzzyContact;

        public List<String> getFuzzyContact(){return this.fuzzyContact;}

        private List<String> rightFuzzyContact;

        public List<String> getRightFuzzyContact(){return this.rightFuzzyContact;}
        private List<Integer> provinceList;

        public List<Integer> getProvinceList(){return this.provinceList;}

        private Integer provinceSt;

        private Integer provinceEd;

        public Integer getProvinceSt(){return this.provinceSt;}

        public Integer getProvinceEd(){return this.provinceEd;}

        private List<Integer> cityList;

        public List<Integer> getCityList(){return this.cityList;}

        private Integer citySt;

        private Integer cityEd;

        public Integer getCitySt(){return this.citySt;}

        public Integer getCityEd(){return this.cityEd;}

        private List<Integer> distrctList;

        public List<Integer> getDistrctList(){return this.distrctList;}

        private Integer distrctSt;

        private Integer distrctEd;

        public Integer getDistrctSt(){return this.distrctSt;}

        public Integer getDistrctEd(){return this.distrctEd;}

        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> warehouseStatusList;

        public List<Integer> getWarehouseStatusList(){return this.warehouseStatusList;}

        private Integer warehouseStatusSt;

        private Integer warehouseStatusEd;

        public Integer getWarehouseStatusSt(){return this.warehouseStatusSt;}

        public Integer getWarehouseStatusEd(){return this.warehouseStatusEd;}

        private List<java.time.LocalDateTime> modifiedTimeList;

        public List<java.time.LocalDateTime> getModifiedTimeList(){return this.modifiedTimeList;}

        private java.time.LocalDateTime modifiedTimeSt;

        private java.time.LocalDateTime modifiedTimeEd;

        public java.time.LocalDateTime getModifiedTimeSt(){return this.modifiedTimeSt;}

        public java.time.LocalDateTime getModifiedTimeEd(){return this.modifiedTimeEd;}


        public ConditionBuilder wIdBetWeen(Integer wIdSt,Integer wIdEd){
            this.wIdSt = wIdSt;
            this.wIdEd = wIdEd;
            return this;
        }

        public ConditionBuilder wIdGreaterEqThan(Integer wIdSt){
            this.wIdSt = wIdSt;
            return this;
        }
        public ConditionBuilder wIdLessEqThan(Integer wIdEd){
            this.wIdEd = wIdEd;
            return this;
        }


        public ConditionBuilder wIdList(Integer ... wId){
            this.wIdList = solveNullList(wId);
            return this;
        }

        public ConditionBuilder wIdList(List<Integer> wId){
            this.wIdList = wId;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseSn (List<String> fuzzyWarehouseSn){
            this.fuzzyWarehouseSn = fuzzyWarehouseSn;
            return this;
        }

        public ConditionBuilder fuzzyWarehouseSn (String ... fuzzyWarehouseSn){
            this.fuzzyWarehouseSn = solveNullList(fuzzyWarehouseSn);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseSn (List<String> rightFuzzyWarehouseSn){
            this.rightFuzzyWarehouseSn = rightFuzzyWarehouseSn;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehouseSn (String ... rightFuzzyWarehouseSn){
            this.rightFuzzyWarehouseSn = solveNullList(rightFuzzyWarehouseSn);
            return this;
        }

        public ConditionBuilder warehouseSnList(String ... warehouseSn){
            this.warehouseSnList = solveNullList(warehouseSn);
            return this;
        }

        public ConditionBuilder warehouseSnList(List<String> warehouseSn){
            this.warehouseSnList = warehouseSn;
            return this;
        }

        public ConditionBuilder fuzzyWarehoustName (List<String> fuzzyWarehoustName){
            this.fuzzyWarehoustName = fuzzyWarehoustName;
            return this;
        }

        public ConditionBuilder fuzzyWarehoustName (String ... fuzzyWarehoustName){
            this.fuzzyWarehoustName = solveNullList(fuzzyWarehoustName);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehoustName (List<String> rightFuzzyWarehoustName){
            this.rightFuzzyWarehoustName = rightFuzzyWarehoustName;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehoustName (String ... rightFuzzyWarehoustName){
            this.rightFuzzyWarehoustName = solveNullList(rightFuzzyWarehoustName);
            return this;
        }

        public ConditionBuilder warehoustNameList(String ... warehoustName){
            this.warehoustNameList = solveNullList(warehoustName);
            return this;
        }

        public ConditionBuilder warehoustNameList(List<String> warehoustName){
            this.warehoustNameList = warehoustName;
            return this;
        }

        public ConditionBuilder fuzzyWarehousePhone (List<String> fuzzyWarehousePhone){
            this.fuzzyWarehousePhone = fuzzyWarehousePhone;
            return this;
        }

        public ConditionBuilder fuzzyWarehousePhone (String ... fuzzyWarehousePhone){
            this.fuzzyWarehousePhone = solveNullList(fuzzyWarehousePhone);
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousePhone (List<String> rightFuzzyWarehousePhone){
            this.rightFuzzyWarehousePhone = rightFuzzyWarehousePhone;
            return this;
        }

        public ConditionBuilder rightFuzzyWarehousePhone (String ... rightFuzzyWarehousePhone){
            this.rightFuzzyWarehousePhone = solveNullList(rightFuzzyWarehousePhone);
            return this;
        }

        public ConditionBuilder warehousePhoneList(String ... warehousePhone){
            this.warehousePhoneList = solveNullList(warehousePhone);
            return this;
        }

        public ConditionBuilder warehousePhoneList(List<String> warehousePhone){
            this.warehousePhoneList = warehousePhone;
            return this;
        }

        public ConditionBuilder fuzzyContact (List<String> fuzzyContact){
            this.fuzzyContact = fuzzyContact;
            return this;
        }

        public ConditionBuilder fuzzyContact (String ... fuzzyContact){
            this.fuzzyContact = solveNullList(fuzzyContact);
            return this;
        }

        public ConditionBuilder rightFuzzyContact (List<String> rightFuzzyContact){
            this.rightFuzzyContact = rightFuzzyContact;
            return this;
        }

        public ConditionBuilder rightFuzzyContact (String ... rightFuzzyContact){
            this.rightFuzzyContact = solveNullList(rightFuzzyContact);
            return this;
        }

        public ConditionBuilder contactList(String ... contact){
            this.contactList = solveNullList(contact);
            return this;
        }

        public ConditionBuilder contactList(List<String> contact){
            this.contactList = contact;
            return this;
        }

        public ConditionBuilder provinceBetWeen(Integer provinceSt,Integer provinceEd){
            this.provinceSt = provinceSt;
            this.provinceEd = provinceEd;
            return this;
        }

        public ConditionBuilder provinceGreaterEqThan(Integer provinceSt){
            this.provinceSt = provinceSt;
            return this;
        }
        public ConditionBuilder provinceLessEqThan(Integer provinceEd){
            this.provinceEd = provinceEd;
            return this;
        }


        public ConditionBuilder provinceList(Integer ... province){
            this.provinceList = solveNullList(province);
            return this;
        }

        public ConditionBuilder provinceList(List<Integer> province){
            this.provinceList = province;
            return this;
        }

        public ConditionBuilder cityBetWeen(Integer citySt,Integer cityEd){
            this.citySt = citySt;
            this.cityEd = cityEd;
            return this;
        }

        public ConditionBuilder cityGreaterEqThan(Integer citySt){
            this.citySt = citySt;
            return this;
        }
        public ConditionBuilder cityLessEqThan(Integer cityEd){
            this.cityEd = cityEd;
            return this;
        }


        public ConditionBuilder cityList(Integer ... city){
            this.cityList = solveNullList(city);
            return this;
        }

        public ConditionBuilder cityList(List<Integer> city){
            this.cityList = city;
            return this;
        }

        public ConditionBuilder distrctBetWeen(Integer distrctSt,Integer distrctEd){
            this.distrctSt = distrctSt;
            this.distrctEd = distrctEd;
            return this;
        }

        public ConditionBuilder distrctGreaterEqThan(Integer distrctSt){
            this.distrctSt = distrctSt;
            return this;
        }
        public ConditionBuilder distrctLessEqThan(Integer distrctEd){
            this.distrctEd = distrctEd;
            return this;
        }


        public ConditionBuilder distrctList(Integer ... distrct){
            this.distrctList = solveNullList(distrct);
            return this;
        }

        public ConditionBuilder distrctList(List<Integer> distrct){
            this.distrctList = distrct;
            return this;
        }

        public ConditionBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public ConditionBuilder warehouseStatusBetWeen(Integer warehouseStatusSt,Integer warehouseStatusEd){
            this.warehouseStatusSt = warehouseStatusSt;
            this.warehouseStatusEd = warehouseStatusEd;
            return this;
        }

        public ConditionBuilder warehouseStatusGreaterEqThan(Integer warehouseStatusSt){
            this.warehouseStatusSt = warehouseStatusSt;
            return this;
        }
        public ConditionBuilder warehouseStatusLessEqThan(Integer warehouseStatusEd){
            this.warehouseStatusEd = warehouseStatusEd;
            return this;
        }


        public ConditionBuilder warehouseStatusList(Integer ... warehouseStatus){
            this.warehouseStatusList = solveNullList(warehouseStatus);
            return this;
        }

        public ConditionBuilder warehouseStatusList(List<Integer> warehouseStatus){
            this.warehouseStatusList = warehouseStatus;
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

        private WarehouseInfo obj;

        public Builder(){
            this.obj = new WarehouseInfo();
        }

        public Builder wId(Integer wId){
            this.obj.setWId(wId);
            return this;
        }
        public Builder warehouseSn(String warehouseSn){
            this.obj.setWarehouseSn(warehouseSn);
            return this;
        }
        public Builder warehoustName(String warehoustName){
            this.obj.setWarehoustName(warehoustName);
            return this;
        }
        public Builder warehousePhone(String warehousePhone){
            this.obj.setWarehousePhone(warehousePhone);
            return this;
        }
        public Builder contact(String contact){
            this.obj.setContact(contact);
            return this;
        }
        public Builder province(Integer province){
            this.obj.setProvince(province);
            return this;
        }
        public Builder city(Integer city){
            this.obj.setCity(city);
            return this;
        }
        public Builder distrct(Integer distrct){
            this.obj.setDistrct(distrct);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder warehouseStatus(Integer warehouseStatus){
            this.obj.setWarehouseStatus(warehouseStatus);
            return this;
        }
        public Builder modifiedTime(java.time.LocalDateTime modifiedTime){
            this.obj.setModifiedTime(modifiedTime);
            return this;
        }
        public WarehouseInfo build(){return obj;}
    }

}
