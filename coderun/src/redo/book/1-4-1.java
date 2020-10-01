// java使用泛型 
// memory就是泛型的例子

public class MemoryCell
{
    // public methods
    public Object read(){return storedValue;}
    publci void write(Object x ){storedValue = x;}
    private Object storedValue;
}

// 当我们使用这种策略时 
// 表的简单数组是西安

// java数据结构
public interface Collection <AnyType> extends Iterable<AnyType>{
    int size();
    boolean isEmpty();
    void clear();
    boolean contains(AnyType x);
    boolean add(AnyType x);
    boolean remove(AnyType x);
    java.util.Iterator<AnyType> iterator();

}
// Collection 接口扩展了Iterator接口 iterable iterable interable可以拥有
// 增强的for循环
//  实现iterator 接口 的集合必须提供一个称为iterator的方法 该方法返回一个
// 返回一个Iterator 类型的对象 时在java。util中定义的一个报

//  每个集合可创建一个实现iterator的对象并将当前位置的概念在对象内部中
public interface Iterator<AnyType>{
    boolean hasNext();
    AnyType next();
    void remove();
}

public static  <AnyType> void print (Collection<AnyType> coll){
    Iterator<AnyType> itr = coll.iterator();
    while(itr.hasNext()){
        AnyType item = itr.next();
        System.out.println(item);
    }
}














