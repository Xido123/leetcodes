package jvm;

public class FinalizeEscapeGC {
    public static FinalizeEscapeGC SAVE_HOOK = null;
    public void isAlive(){
    System.out.println("yse,im alive");
    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    System.out.println("finalze method executed");
    FinalizeEscapeGC.SAVE_HOOK = this;
    }

  public static void main(String[] args) throws InterruptedException {
    //
      SAVE_HOOK = new FinalizeEscapeGC();
//      对象第一次拯救自己
      SAVE_HOOK = null;
      System.gc();
      Thread.sleep(500);
      if(SAVE_HOOK != null){
          SAVE_HOOK.isAlive();
      }else {
      System.out.println("i m ded");
      }

      SAVE_HOOK = null;
      System.gc();

      Thread.sleep(500);

      if(SAVE_HOOK!=null){
      SAVE_HOOK.isAlive();
      }else {
      System.out.println("dede");
      }

  }
}
