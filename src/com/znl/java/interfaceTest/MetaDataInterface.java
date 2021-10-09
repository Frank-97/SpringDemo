package com.znl.java.interfaceTest;

public interface MetaDataInterface {

    String metaDataCode = null;
    int delFlag = 0;
    
     String GetMetaDataInfo();

     void GetMetaDataList(String metaDataID);

     default void MetaData(){
         System.out.print("this is default method");
     }

     //两个接口都有的通用方法
    void methodA();

}
