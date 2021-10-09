package com.znl.java.enumz;

public class EnumTest {

    public static void main(String[] args) {
        int n = Number.Pay.getType();
        System.out.println("枚举值常量"+n);
        Number[] numbers = Number.values();
        System.out.println("使用Values方法获取全部枚举值");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(""+numbers[i]);
        }


        System.out.println(Number.valueOf("Pay").toString());

        System.out.println(Number.Pay.toString());
    }
}



enum MasterDataType {


    Spring("春天","春天里"),
    Summer("夏天",""),
    Winter("冬天","大约在冬季");


    private String name;
    private String describe;
    private MasterDataType(String name,String describe){
        this.name = name;
        this.describe = describe;
    };

    public String getName(){
        return name;
    }

    public String getDescribe(){
        return describe;
    }

}

enum Number{

    Pay(1),
    Wx3(2);

    private int type;

    private Number(int type){
       this.type = type;
    }

    public int getType(){
        return type;
    }

}
