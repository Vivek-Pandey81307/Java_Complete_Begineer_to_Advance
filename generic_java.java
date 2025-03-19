public class generic_java{
    public static void main(String[] args){

        add<Integer> obj = new add<>(34,23);
        add<String> oj = new add<>("wazim","raju");

        
    }
}

class add<T >{
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