package jvm;

public class ReferenceCountingGC {
    public Object instance  = null;
    private static final int _1mb = 1024 * 1024;
    /**
     * 这个成员的属性站带你内存
     */
    private byte[] bigSize = new byte[2* _1mb];
    public static void testGC(){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;
        System.gc();
    }

  public static void main(String[] args) {
    //
      ReferenceCountingGC.testGC();
  }
}
