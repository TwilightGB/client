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
public class SupplierInfo implements Serializable {

    private static final long serialVersionUID = 1559031239788L;


    /**
    * 主键
    * 供应商ID
    * isNullAble:0
    */
    private Integer supplierId;

    /**
    * 供应商编码
    * isNullAble:0
    */
    private String supplierCode;

    /**
    * 供应商名称
    * isNullAble:0
    */
    private String supplierName;

    /**
    * 供应商类型：1.自营，2.平台
    * isNullAble:0
    */
    private Integer supplierType;

    /**
    * 供应商联系人
    * isNullAble:0
    */
    private String linkMan;

    /**
    * 联系电话
    * isNullAble:0
    */
    private String phoneNumber;

    /**
    * 供应商开户银行名称
    * isNullAble:0
    */
    private String bankName;

    /**
    * 银行账号
    * isNullAble:0
    */
    private String bankAccount;

    /**
    * 供应商地址
    * isNullAble:0
    */
    private String address;

    /**
    * 状态：0禁止，1启用
    * isNullAble:0,defaultVal:0
    */
    private Integer supplierStatus;

    /**
    * 最后修改时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime modifiedTime;


    public void setSupplierId(Integer supplierId){this.supplierId = supplierId;}

    public Integer getSupplierId(){return this.supplierId;}

    public void setSupplierCode(String supplierCode){this.supplierCode = supplierCode;}

    public String getSupplierCode(){return this.supplierCode;}

    public void setSupplierName(String supplierName){this.supplierName = supplierName;}

    public String getSupplierName(){return this.supplierName;}

    public void setSupplierType(Integer supplierType){this.supplierType = supplierType;}

    public Integer getSupplierType(){return this.supplierType;}

    public void setLinkMan(String linkMan){this.linkMan = linkMan;}

    public String getLinkMan(){return this.linkMan;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getPhoneNumber(){return this.phoneNumber;}

    public void setBankName(String bankName){this.bankName = bankName;}

    public String getBankName(){return this.bankName;}

    public void setBankAccount(String bankAccount){this.bankAccount = bankAccount;}

    public String getBankAccount(){return this.bankAccount;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setSupplierStatus(Integer supplierStatus){this.supplierStatus = supplierStatus;}

    public Integer getSupplierStatus(){return this.supplierStatus;}

    public void setModifiedTime(java.time.LocalDateTime modifiedTime){this.modifiedTime = modifiedTime;}

    public java.time.LocalDateTime getModifiedTime(){return this.modifiedTime;}
    @Override
    public String toString() {
        return "SupplierInfo{" +
                "supplierId='" + supplierId + '\'' +
                "supplierCode='" + supplierCode + '\'' +
                "supplierName='" + supplierName + '\'' +
                "supplierType='" + supplierType + '\'' +
                "linkMan='" + linkMan + '\'' +
                "phoneNumber='" + phoneNumber + '\'' +
                "bankName='" + bankName + '\'' +
                "bankAccount='" + bankAccount + '\'' +
                "address='" + address + '\'' +
                "supplierStatus='" + supplierStatus + '\'' +
                "modifiedTime='" + modifiedTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private SupplierInfo set;

        private ConditionBuilder where;

        public UpdateBuilder set(SupplierInfo set){
            this.set = set;
            return this;
        }

        public SupplierInfo getSet(){
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

    public static class QueryBuilder extends SupplierInfo{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Integer> supplierIdList;

        public List<Integer> getSupplierIdList(){return this.supplierIdList;}

        private Integer supplierIdSt;

        private Integer supplierIdEd;

        public Integer getSupplierIdSt(){return this.supplierIdSt;}

        public Integer getSupplierIdEd(){return this.supplierIdEd;}

        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
        private List<Integer> supplierTypeList;

        public List<Integer> getSupplierTypeList(){return this.supplierTypeList;}

        private Integer supplierTypeSt;

        private Integer supplierTypeEd;

        public Integer getSupplierTypeSt(){return this.supplierTypeSt;}

        public Integer getSupplierTypeEd(){return this.supplierTypeEd;}

        private List<String> linkManList;

        public List<String> getLinkManList(){return this.linkManList;}


        private List<String> fuzzyLinkMan;

        public List<String> getFuzzyLinkMan(){return this.fuzzyLinkMan;}

        private List<String> rightFuzzyLinkMan;

        public List<String> getRightFuzzyLinkMan(){return this.rightFuzzyLinkMan;}
        private List<String> phoneNumberList;

        public List<String> getPhoneNumberList(){return this.phoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
        private List<String> bankNameList;

        public List<String> getBankNameList(){return this.bankNameList;}


        private List<String> fuzzyBankName;

        public List<String> getFuzzyBankName(){return this.fuzzyBankName;}

        private List<String> rightFuzzyBankName;

        public List<String> getRightFuzzyBankName(){return this.rightFuzzyBankName;}
        private List<String> bankAccountList;

        public List<String> getBankAccountList(){return this.bankAccountList;}


        private List<String> fuzzyBankAccount;

        public List<String> getFuzzyBankAccount(){return this.fuzzyBankAccount;}

        private List<String> rightFuzzyBankAccount;

        public List<String> getRightFuzzyBankAccount(){return this.rightFuzzyBankAccount;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> supplierStatusList;

        public List<Integer> getSupplierStatusList(){return this.supplierStatusList;}

        private Integer supplierStatusSt;

        private Integer supplierStatusEd;

        public Integer getSupplierStatusSt(){return this.supplierStatusSt;}

        public Integer getSupplierStatusEd(){return this.supplierStatusEd;}

        private List<java.time.LocalDateTime> modifiedTimeList;

        public List<java.time.LocalDateTime> getModifiedTimeList(){return this.modifiedTimeList;}

        private java.time.LocalDateTime modifiedTimeSt;

        private java.time.LocalDateTime modifiedTimeEd;

        public java.time.LocalDateTime getModifiedTimeSt(){return this.modifiedTimeSt;}

        public java.time.LocalDateTime getModifiedTimeEd(){return this.modifiedTimeEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder supplierIdBetWeen(Integer supplierIdSt,Integer supplierIdEd){
            this.supplierIdSt = supplierIdSt;
            this.supplierIdEd = supplierIdEd;
            return this;
        }

        public QueryBuilder supplierIdGreaterEqThan(Integer supplierIdSt){
            this.supplierIdSt = supplierIdSt;
            return this;
        }
        public QueryBuilder supplierIdLessEqThan(Integer supplierIdEd){
            this.supplierIdEd = supplierIdEd;
            return this;
        }


        public QueryBuilder supplierId(Integer supplierId){
            setSupplierId(supplierId);
            return this;
        }

        public QueryBuilder supplierIdList(Integer ... supplierId){
            this.supplierIdList = solveNullList(supplierId);
            return this;
        }

        public QueryBuilder supplierIdList(List<Integer> supplierId){
            this.supplierIdList = supplierId;
            return this;
        }

        public QueryBuilder fetchSupplierId(){
            setFetchFields("fetchFields","supplierId");
            return this;
        }

        public QueryBuilder excludeSupplierId(){
            setFetchFields("excludeFields","supplierId");
            return this;
        }

        public QueryBuilder fuzzySupplierCode (List<String> fuzzySupplierCode){
            this.fuzzySupplierCode = fuzzySupplierCode;
            return this;
        }

        public QueryBuilder fuzzySupplierCode (String ... fuzzySupplierCode){
            this.fuzzySupplierCode = solveNullList(fuzzySupplierCode);
            return this;
        }

        public QueryBuilder rightFuzzySupplierCode (List<String> rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = rightFuzzySupplierCode;
            return this;
        }

        public QueryBuilder rightFuzzySupplierCode (String ... rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = solveNullList(rightFuzzySupplierCode);
            return this;
        }

        public QueryBuilder supplierCode(String supplierCode){
            setSupplierCode(supplierCode);
            return this;
        }

        public QueryBuilder supplierCodeList(String ... supplierCode){
            this.supplierCodeList = solveNullList(supplierCode);
            return this;
        }

        public QueryBuilder supplierCodeList(List<String> supplierCode){
            this.supplierCodeList = supplierCode;
            return this;
        }

        public QueryBuilder fetchSupplierCode(){
            setFetchFields("fetchFields","supplierCode");
            return this;
        }

        public QueryBuilder excludeSupplierCode(){
            setFetchFields("excludeFields","supplierCode");
            return this;
        }

        public QueryBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public QueryBuilder fuzzySupplierName (String ... fuzzySupplierName){
            this.fuzzySupplierName = solveNullList(fuzzySupplierName);
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public QueryBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            this.rightFuzzySupplierName = solveNullList(rightFuzzySupplierName);
            return this;
        }

        public QueryBuilder supplierName(String supplierName){
            setSupplierName(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(String ... supplierName){
            this.supplierNameList = solveNullList(supplierName);
            return this;
        }

        public QueryBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
            return this;
        }

        public QueryBuilder fetchSupplierName(){
            setFetchFields("fetchFields","supplierName");
            return this;
        }

        public QueryBuilder excludeSupplierName(){
            setFetchFields("excludeFields","supplierName");
            return this;
        }

        public QueryBuilder supplierTypeBetWeen(Integer supplierTypeSt,Integer supplierTypeEd){
            this.supplierTypeSt = supplierTypeSt;
            this.supplierTypeEd = supplierTypeEd;
            return this;
        }

        public QueryBuilder supplierTypeGreaterEqThan(Integer supplierTypeSt){
            this.supplierTypeSt = supplierTypeSt;
            return this;
        }
        public QueryBuilder supplierTypeLessEqThan(Integer supplierTypeEd){
            this.supplierTypeEd = supplierTypeEd;
            return this;
        }


        public QueryBuilder supplierType(Integer supplierType){
            setSupplierType(supplierType);
            return this;
        }

        public QueryBuilder supplierTypeList(Integer ... supplierType){
            this.supplierTypeList = solveNullList(supplierType);
            return this;
        }

        public QueryBuilder supplierTypeList(List<Integer> supplierType){
            this.supplierTypeList = supplierType;
            return this;
        }

        public QueryBuilder fetchSupplierType(){
            setFetchFields("fetchFields","supplierType");
            return this;
        }

        public QueryBuilder excludeSupplierType(){
            setFetchFields("excludeFields","supplierType");
            return this;
        }

        public QueryBuilder fuzzyLinkMan (List<String> fuzzyLinkMan){
            this.fuzzyLinkMan = fuzzyLinkMan;
            return this;
        }

        public QueryBuilder fuzzyLinkMan (String ... fuzzyLinkMan){
            this.fuzzyLinkMan = solveNullList(fuzzyLinkMan);
            return this;
        }

        public QueryBuilder rightFuzzyLinkMan (List<String> rightFuzzyLinkMan){
            this.rightFuzzyLinkMan = rightFuzzyLinkMan;
            return this;
        }

        public QueryBuilder rightFuzzyLinkMan (String ... rightFuzzyLinkMan){
            this.rightFuzzyLinkMan = solveNullList(rightFuzzyLinkMan);
            return this;
        }

        public QueryBuilder linkMan(String linkMan){
            setLinkMan(linkMan);
            return this;
        }

        public QueryBuilder linkManList(String ... linkMan){
            this.linkManList = solveNullList(linkMan);
            return this;
        }

        public QueryBuilder linkManList(List<String> linkMan){
            this.linkManList = linkMan;
            return this;
        }

        public QueryBuilder fetchLinkMan(){
            setFetchFields("fetchFields","linkMan");
            return this;
        }

        public QueryBuilder excludeLinkMan(){
            setFetchFields("excludeFields","linkMan");
            return this;
        }

        public QueryBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public QueryBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public QueryBuilder phoneNumber(String phoneNumber){
            setPhoneNumber(phoneNumber);
            return this;
        }

        public QueryBuilder phoneNumberList(String ... phoneNumber){
            this.phoneNumberList = solveNullList(phoneNumber);
            return this;
        }

        public QueryBuilder phoneNumberList(List<String> phoneNumber){
            this.phoneNumberList = phoneNumber;
            return this;
        }

        public QueryBuilder fetchPhoneNumber(){
            setFetchFields("fetchFields","phoneNumber");
            return this;
        }

        public QueryBuilder excludePhoneNumber(){
            setFetchFields("excludeFields","phoneNumber");
            return this;
        }

        public QueryBuilder fuzzyBankName (List<String> fuzzyBankName){
            this.fuzzyBankName = fuzzyBankName;
            return this;
        }

        public QueryBuilder fuzzyBankName (String ... fuzzyBankName){
            this.fuzzyBankName = solveNullList(fuzzyBankName);
            return this;
        }

        public QueryBuilder rightFuzzyBankName (List<String> rightFuzzyBankName){
            this.rightFuzzyBankName = rightFuzzyBankName;
            return this;
        }

        public QueryBuilder rightFuzzyBankName (String ... rightFuzzyBankName){
            this.rightFuzzyBankName = solveNullList(rightFuzzyBankName);
            return this;
        }

        public QueryBuilder bankName(String bankName){
            setBankName(bankName);
            return this;
        }

        public QueryBuilder bankNameList(String ... bankName){
            this.bankNameList = solveNullList(bankName);
            return this;
        }

        public QueryBuilder bankNameList(List<String> bankName){
            this.bankNameList = bankName;
            return this;
        }

        public QueryBuilder fetchBankName(){
            setFetchFields("fetchFields","bankName");
            return this;
        }

        public QueryBuilder excludeBankName(){
            setFetchFields("excludeFields","bankName");
            return this;
        }

        public QueryBuilder fuzzyBankAccount (List<String> fuzzyBankAccount){
            this.fuzzyBankAccount = fuzzyBankAccount;
            return this;
        }

        public QueryBuilder fuzzyBankAccount (String ... fuzzyBankAccount){
            this.fuzzyBankAccount = solveNullList(fuzzyBankAccount);
            return this;
        }

        public QueryBuilder rightFuzzyBankAccount (List<String> rightFuzzyBankAccount){
            this.rightFuzzyBankAccount = rightFuzzyBankAccount;
            return this;
        }

        public QueryBuilder rightFuzzyBankAccount (String ... rightFuzzyBankAccount){
            this.rightFuzzyBankAccount = solveNullList(rightFuzzyBankAccount);
            return this;
        }

        public QueryBuilder bankAccount(String bankAccount){
            setBankAccount(bankAccount);
            return this;
        }

        public QueryBuilder bankAccountList(String ... bankAccount){
            this.bankAccountList = solveNullList(bankAccount);
            return this;
        }

        public QueryBuilder bankAccountList(List<String> bankAccount){
            this.bankAccountList = bankAccount;
            return this;
        }

        public QueryBuilder fetchBankAccount(){
            setFetchFields("fetchFields","bankAccount");
            return this;
        }

        public QueryBuilder excludeBankAccount(){
            setFetchFields("excludeFields","bankAccount");
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

        public QueryBuilder supplierStatusBetWeen(Integer supplierStatusSt,Integer supplierStatusEd){
            this.supplierStatusSt = supplierStatusSt;
            this.supplierStatusEd = supplierStatusEd;
            return this;
        }

        public QueryBuilder supplierStatusGreaterEqThan(Integer supplierStatusSt){
            this.supplierStatusSt = supplierStatusSt;
            return this;
        }
        public QueryBuilder supplierStatusLessEqThan(Integer supplierStatusEd){
            this.supplierStatusEd = supplierStatusEd;
            return this;
        }


        public QueryBuilder supplierStatus(Integer supplierStatus){
            setSupplierStatus(supplierStatus);
            return this;
        }

        public QueryBuilder supplierStatusList(Integer ... supplierStatus){
            this.supplierStatusList = solveNullList(supplierStatus);
            return this;
        }

        public QueryBuilder supplierStatusList(List<Integer> supplierStatus){
            this.supplierStatusList = supplierStatus;
            return this;
        }

        public QueryBuilder fetchSupplierStatus(){
            setFetchFields("fetchFields","supplierStatus");
            return this;
        }

        public QueryBuilder excludeSupplierStatus(){
            setFetchFields("excludeFields","supplierStatus");
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

        public SupplierInfo build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Integer> supplierIdList;

        public List<Integer> getSupplierIdList(){return this.supplierIdList;}

        private Integer supplierIdSt;

        private Integer supplierIdEd;

        public Integer getSupplierIdSt(){return this.supplierIdSt;}

        public Integer getSupplierIdEd(){return this.supplierIdEd;}

        private List<String> supplierCodeList;

        public List<String> getSupplierCodeList(){return this.supplierCodeList;}


        private List<String> fuzzySupplierCode;

        public List<String> getFuzzySupplierCode(){return this.fuzzySupplierCode;}

        private List<String> rightFuzzySupplierCode;

        public List<String> getRightFuzzySupplierCode(){return this.rightFuzzySupplierCode;}
        private List<String> supplierNameList;

        public List<String> getSupplierNameList(){return this.supplierNameList;}


        private List<String> fuzzySupplierName;

        public List<String> getFuzzySupplierName(){return this.fuzzySupplierName;}

        private List<String> rightFuzzySupplierName;

        public List<String> getRightFuzzySupplierName(){return this.rightFuzzySupplierName;}
        private List<Integer> supplierTypeList;

        public List<Integer> getSupplierTypeList(){return this.supplierTypeList;}

        private Integer supplierTypeSt;

        private Integer supplierTypeEd;

        public Integer getSupplierTypeSt(){return this.supplierTypeSt;}

        public Integer getSupplierTypeEd(){return this.supplierTypeEd;}

        private List<String> linkManList;

        public List<String> getLinkManList(){return this.linkManList;}


        private List<String> fuzzyLinkMan;

        public List<String> getFuzzyLinkMan(){return this.fuzzyLinkMan;}

        private List<String> rightFuzzyLinkMan;

        public List<String> getRightFuzzyLinkMan(){return this.rightFuzzyLinkMan;}
        private List<String> phoneNumberList;

        public List<String> getPhoneNumberList(){return this.phoneNumberList;}


        private List<String> fuzzyPhoneNumber;

        public List<String> getFuzzyPhoneNumber(){return this.fuzzyPhoneNumber;}

        private List<String> rightFuzzyPhoneNumber;

        public List<String> getRightFuzzyPhoneNumber(){return this.rightFuzzyPhoneNumber;}
        private List<String> bankNameList;

        public List<String> getBankNameList(){return this.bankNameList;}


        private List<String> fuzzyBankName;

        public List<String> getFuzzyBankName(){return this.fuzzyBankName;}

        private List<String> rightFuzzyBankName;

        public List<String> getRightFuzzyBankName(){return this.rightFuzzyBankName;}
        private List<String> bankAccountList;

        public List<String> getBankAccountList(){return this.bankAccountList;}


        private List<String> fuzzyBankAccount;

        public List<String> getFuzzyBankAccount(){return this.fuzzyBankAccount;}

        private List<String> rightFuzzyBankAccount;

        public List<String> getRightFuzzyBankAccount(){return this.rightFuzzyBankAccount;}
        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> supplierStatusList;

        public List<Integer> getSupplierStatusList(){return this.supplierStatusList;}

        private Integer supplierStatusSt;

        private Integer supplierStatusEd;

        public Integer getSupplierStatusSt(){return this.supplierStatusSt;}

        public Integer getSupplierStatusEd(){return this.supplierStatusEd;}

        private List<java.time.LocalDateTime> modifiedTimeList;

        public List<java.time.LocalDateTime> getModifiedTimeList(){return this.modifiedTimeList;}

        private java.time.LocalDateTime modifiedTimeSt;

        private java.time.LocalDateTime modifiedTimeEd;

        public java.time.LocalDateTime getModifiedTimeSt(){return this.modifiedTimeSt;}

        public java.time.LocalDateTime getModifiedTimeEd(){return this.modifiedTimeEd;}


        public ConditionBuilder supplierIdBetWeen(Integer supplierIdSt,Integer supplierIdEd){
            this.supplierIdSt = supplierIdSt;
            this.supplierIdEd = supplierIdEd;
            return this;
        }

        public ConditionBuilder supplierIdGreaterEqThan(Integer supplierIdSt){
            this.supplierIdSt = supplierIdSt;
            return this;
        }
        public ConditionBuilder supplierIdLessEqThan(Integer supplierIdEd){
            this.supplierIdEd = supplierIdEd;
            return this;
        }


        public ConditionBuilder supplierIdList(Integer ... supplierId){
            this.supplierIdList = solveNullList(supplierId);
            return this;
        }

        public ConditionBuilder supplierIdList(List<Integer> supplierId){
            this.supplierIdList = supplierId;
            return this;
        }

        public ConditionBuilder fuzzySupplierCode (List<String> fuzzySupplierCode){
            this.fuzzySupplierCode = fuzzySupplierCode;
            return this;
        }

        public ConditionBuilder fuzzySupplierCode (String ... fuzzySupplierCode){
            this.fuzzySupplierCode = solveNullList(fuzzySupplierCode);
            return this;
        }

        public ConditionBuilder rightFuzzySupplierCode (List<String> rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = rightFuzzySupplierCode;
            return this;
        }

        public ConditionBuilder rightFuzzySupplierCode (String ... rightFuzzySupplierCode){
            this.rightFuzzySupplierCode = solveNullList(rightFuzzySupplierCode);
            return this;
        }

        public ConditionBuilder supplierCodeList(String ... supplierCode){
            this.supplierCodeList = solveNullList(supplierCode);
            return this;
        }

        public ConditionBuilder supplierCodeList(List<String> supplierCode){
            this.supplierCodeList = supplierCode;
            return this;
        }

        public ConditionBuilder fuzzySupplierName (List<String> fuzzySupplierName){
            this.fuzzySupplierName = fuzzySupplierName;
            return this;
        }

        public ConditionBuilder fuzzySupplierName (String ... fuzzySupplierName){
            this.fuzzySupplierName = solveNullList(fuzzySupplierName);
            return this;
        }

        public ConditionBuilder rightFuzzySupplierName (List<String> rightFuzzySupplierName){
            this.rightFuzzySupplierName = rightFuzzySupplierName;
            return this;
        }

        public ConditionBuilder rightFuzzySupplierName (String ... rightFuzzySupplierName){
            this.rightFuzzySupplierName = solveNullList(rightFuzzySupplierName);
            return this;
        }

        public ConditionBuilder supplierNameList(String ... supplierName){
            this.supplierNameList = solveNullList(supplierName);
            return this;
        }

        public ConditionBuilder supplierNameList(List<String> supplierName){
            this.supplierNameList = supplierName;
            return this;
        }

        public ConditionBuilder supplierTypeBetWeen(Integer supplierTypeSt,Integer supplierTypeEd){
            this.supplierTypeSt = supplierTypeSt;
            this.supplierTypeEd = supplierTypeEd;
            return this;
        }

        public ConditionBuilder supplierTypeGreaterEqThan(Integer supplierTypeSt){
            this.supplierTypeSt = supplierTypeSt;
            return this;
        }
        public ConditionBuilder supplierTypeLessEqThan(Integer supplierTypeEd){
            this.supplierTypeEd = supplierTypeEd;
            return this;
        }


        public ConditionBuilder supplierTypeList(Integer ... supplierType){
            this.supplierTypeList = solveNullList(supplierType);
            return this;
        }

        public ConditionBuilder supplierTypeList(List<Integer> supplierType){
            this.supplierTypeList = supplierType;
            return this;
        }

        public ConditionBuilder fuzzyLinkMan (List<String> fuzzyLinkMan){
            this.fuzzyLinkMan = fuzzyLinkMan;
            return this;
        }

        public ConditionBuilder fuzzyLinkMan (String ... fuzzyLinkMan){
            this.fuzzyLinkMan = solveNullList(fuzzyLinkMan);
            return this;
        }

        public ConditionBuilder rightFuzzyLinkMan (List<String> rightFuzzyLinkMan){
            this.rightFuzzyLinkMan = rightFuzzyLinkMan;
            return this;
        }

        public ConditionBuilder rightFuzzyLinkMan (String ... rightFuzzyLinkMan){
            this.rightFuzzyLinkMan = solveNullList(rightFuzzyLinkMan);
            return this;
        }

        public ConditionBuilder linkManList(String ... linkMan){
            this.linkManList = solveNullList(linkMan);
            return this;
        }

        public ConditionBuilder linkManList(List<String> linkMan){
            this.linkManList = linkMan;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNumber (List<String> fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = fuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder fuzzyPhoneNumber (String ... fuzzyPhoneNumber){
            this.fuzzyPhoneNumber = solveNullList(fuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (List<String> rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = rightFuzzyPhoneNumber;
            return this;
        }

        public ConditionBuilder rightFuzzyPhoneNumber (String ... rightFuzzyPhoneNumber){
            this.rightFuzzyPhoneNumber = solveNullList(rightFuzzyPhoneNumber);
            return this;
        }

        public ConditionBuilder phoneNumberList(String ... phoneNumber){
            this.phoneNumberList = solveNullList(phoneNumber);
            return this;
        }

        public ConditionBuilder phoneNumberList(List<String> phoneNumber){
            this.phoneNumberList = phoneNumber;
            return this;
        }

        public ConditionBuilder fuzzyBankName (List<String> fuzzyBankName){
            this.fuzzyBankName = fuzzyBankName;
            return this;
        }

        public ConditionBuilder fuzzyBankName (String ... fuzzyBankName){
            this.fuzzyBankName = solveNullList(fuzzyBankName);
            return this;
        }

        public ConditionBuilder rightFuzzyBankName (List<String> rightFuzzyBankName){
            this.rightFuzzyBankName = rightFuzzyBankName;
            return this;
        }

        public ConditionBuilder rightFuzzyBankName (String ... rightFuzzyBankName){
            this.rightFuzzyBankName = solveNullList(rightFuzzyBankName);
            return this;
        }

        public ConditionBuilder bankNameList(String ... bankName){
            this.bankNameList = solveNullList(bankName);
            return this;
        }

        public ConditionBuilder bankNameList(List<String> bankName){
            this.bankNameList = bankName;
            return this;
        }

        public ConditionBuilder fuzzyBankAccount (List<String> fuzzyBankAccount){
            this.fuzzyBankAccount = fuzzyBankAccount;
            return this;
        }

        public ConditionBuilder fuzzyBankAccount (String ... fuzzyBankAccount){
            this.fuzzyBankAccount = solveNullList(fuzzyBankAccount);
            return this;
        }

        public ConditionBuilder rightFuzzyBankAccount (List<String> rightFuzzyBankAccount){
            this.rightFuzzyBankAccount = rightFuzzyBankAccount;
            return this;
        }

        public ConditionBuilder rightFuzzyBankAccount (String ... rightFuzzyBankAccount){
            this.rightFuzzyBankAccount = solveNullList(rightFuzzyBankAccount);
            return this;
        }

        public ConditionBuilder bankAccountList(String ... bankAccount){
            this.bankAccountList = solveNullList(bankAccount);
            return this;
        }

        public ConditionBuilder bankAccountList(List<String> bankAccount){
            this.bankAccountList = bankAccount;
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

        public ConditionBuilder supplierStatusBetWeen(Integer supplierStatusSt,Integer supplierStatusEd){
            this.supplierStatusSt = supplierStatusSt;
            this.supplierStatusEd = supplierStatusEd;
            return this;
        }

        public ConditionBuilder supplierStatusGreaterEqThan(Integer supplierStatusSt){
            this.supplierStatusSt = supplierStatusSt;
            return this;
        }
        public ConditionBuilder supplierStatusLessEqThan(Integer supplierStatusEd){
            this.supplierStatusEd = supplierStatusEd;
            return this;
        }


        public ConditionBuilder supplierStatusList(Integer ... supplierStatus){
            this.supplierStatusList = solveNullList(supplierStatus);
            return this;
        }

        public ConditionBuilder supplierStatusList(List<Integer> supplierStatus){
            this.supplierStatusList = supplierStatus;
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

        private SupplierInfo obj;

        public Builder(){
            this.obj = new SupplierInfo();
        }

        public Builder supplierId(Integer supplierId){
            this.obj.setSupplierId(supplierId);
            return this;
        }
        public Builder supplierCode(String supplierCode){
            this.obj.setSupplierCode(supplierCode);
            return this;
        }
        public Builder supplierName(String supplierName){
            this.obj.setSupplierName(supplierName);
            return this;
        }
        public Builder supplierType(Integer supplierType){
            this.obj.setSupplierType(supplierType);
            return this;
        }
        public Builder linkMan(String linkMan){
            this.obj.setLinkMan(linkMan);
            return this;
        }
        public Builder phoneNumber(String phoneNumber){
            this.obj.setPhoneNumber(phoneNumber);
            return this;
        }
        public Builder bankName(String bankName){
            this.obj.setBankName(bankName);
            return this;
        }
        public Builder bankAccount(String bankAccount){
            this.obj.setBankAccount(bankAccount);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder supplierStatus(Integer supplierStatus){
            this.obj.setSupplierStatus(supplierStatus);
            return this;
        }
        public Builder modifiedTime(java.time.LocalDateTime modifiedTime){
            this.obj.setModifiedTime(modifiedTime);
            return this;
        }
        public SupplierInfo build(){return obj;}
    }

}
