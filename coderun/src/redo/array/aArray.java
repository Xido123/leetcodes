package redo.array;

class mArray {

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
    public mArray(){
        elems = 0;
        length = 50;
        intArray = new int[length];
    }
//    构造函数 初始化一个长度为50 的数组
    public mArray(int length){
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
 public int getE(int i){


    if (i>=0 && i < elems) return intArray[i];
    else {
        System.out.println("数组下标越界");
        return -1;
    }
 }
/**
 * 查找元素
 * 查找的元素如果存在责则返回下标值
 * 如果不存在则返回 -1
 *
 *
 */
    public int findE(int val){

    System.out.println(intArray.length);
        for(int i = 0;i<intArray.length;i++){
      System.out.println(intArray[i]);
            if(val == intArray[i])
            return i;
        }
        return -1;
    }
    /*
     *
     * 删除元素
     * 刹
     * 删除元素
     * 如果删的元素不存在 直接返回false
     */




    public boolean deletee(int value) {
        for (int i = 0; i < intArray.length; i++) {

            if (intArray[i] == value) {
                for (int j = i; j < intArray.length; j++) {
                    intArray[j] = intArray[j+1];
                    return true;
                }
            }
        }

        return false;
    }
    /**
     * 修改数据
     * @param oldVal
     * @return
     */

    public boolean updatee(int oldVal,int newVal){
        for (int i= 0; i<intArray.length;i++ ) {
            if(intArray[ i ] == oldVal){
                    intArray[i] = newVal;
                    return true;
            }
        }
    System.out.println("数据不存在");
        return false;
    }

    public boolean deleteTest(int value){
        for(int i = 0; i<intArray.length;i++)
            if(intArray[i] == value)
                for(int j = i;j<intArray.length;j++){
                    if(j<intArray.length-1){
                        intArray[j] = intArray[j+1];
                        elems-=1;
                        } else{
                        elems-=1;
                    }





                }

                return false;

    }

  public static void main(String[] args) {
      //
      mArray c = new mArray(10);
      for(int i = 0;i<10;i++){
//        多情自古空余恨此恨绵绵无绝期
//          啦啦啦啦沧海已生效
//          涛涛两忘记
//          副程式崔狼yi
          c.add(i);
      }
    System.out.println(c.findE(6));
    System.out.println(c.deleteTest(4));

      for (int i : c.intArray ) {
      System.out.println(i+" ");
      }
  }



}
