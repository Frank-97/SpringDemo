package com.swj.test.instanceTest;

import com.znl.java.interfaceTest.MetaDataCommon;
import com.znl.java.interfaceTest.MetaDataEntity;
import com.znl.java.interfaceTest.MetaDataInterface;
import org.junit.Test;

public class TestInstrance {

    @Test
    public void TestInstanceMetaData(){
        MetaDataInterface entity1 = new MetaDataEntity();
        MetaDataCommon entity2 = new MetaDataEntity();
        entity1.methodA();
        entity2.methodA();
    }

}
