package redo.array;

public class Array {

// 用数组封装一个数据结构
//
//
//
//
//
//
// 定义一个数组
   private int [] intArray;

//   定义数组的实际长度
    private int elems;

//    定义数组的最大长度
    private int length;
//    默认构造一个长度为50 的数组
    public Array(){
        elems = 0;
        length = 50;
        intArray = new int[length];
    }
//    构造函数 初始化一个长度为50 的数组
    public Array(int length){
        elems = 0;
        this.length = length;
        intArray = new int[length];

    }

    public int getSize(){
        return elems;
    }

    /**
     * 遍历显示数组
     *
     */
    public void printt(){
        for (int i:this.intArray){
            System.out.println(i+"");
        }
    }
/**
 * 添加元素
 */
    public boolean add(int item){
        if(elems < length-1){
            intArray[elems++] = item;
            return true;
        }else{
            return false;
        }
    }
/**
 * 根据下标获取元素
 */


}
