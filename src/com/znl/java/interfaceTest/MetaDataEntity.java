package com.znl.java.interfaceTest;

public class MetaDataEntity implements MetaDataCommon,MetaDataInterface{

    @Override
    public String GetMetaDataInfo() {
        return null;
    }

    @Override
    public void GetMetaDataList(String metaDataID) {

    }

    @Override
    public void MetaData() {

    }

    @Override
    public void methodA() {
        System.out.println("MetaDataEntity");
    }

    @Override
    public void methodB() {

    }
}
