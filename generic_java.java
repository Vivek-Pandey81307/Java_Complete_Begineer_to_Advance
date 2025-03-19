public class generic_java{
    public static void main(String[] args){

        // Integer a = new Integer(23);
        Integer b = Integer.valueOf(27);
        Integer c = 15; // autoboxing
        int d = c; // unboxing

        // System.out.println(a + " " + a.getClass().getName());
        System.out.println(b + " " + b.getClass().getName());
        System.out.println(c + " "+ c.getClass().getName());
        // System.out.println(d + " " + d.getClass().getName());


        
        add<Integer> obj = new add<>(34,23);
        add<String> oj = new add<>("wazim","raju");
        
        generic_java objj = new generic_java();
        objj.gene(13);
        


        
        
    }
    public<E extends Number> void gene(E data){
        System.out.println(data);
    }
}

class add<T  >{
    T e;
    T d;
    
    
    add(T e,T d){
        this.e = e;
        this.d = d;
        display();
    }
    void display(){
        System.out.println(e + " " + d);
    }
}