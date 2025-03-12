public class inheritance {
    public static void main(String[] args){
        Dog d = new Dog(3,4);
        Dog c = new Dog();
        d.task(34);
        c.task();
    }
}
class Animal{
    int height;
    int weight;
    String speaks;
    int age;
    
    Animal(){
        height = 0;
        weight = 0;
        age = 0;
    }
    Animal(int height,int weight){
        this.height = height;
        this.weight = weight;
        
    }
    void task(String speaks){
        this.speaks  = speaks;
    }
    void display(){
        System.out.println("HEIGHT :"+height);
        System.out.println("WEIGHT :"+weight);
        System.out.println("AGE :"+age);
    }


}
class Dog extends Animal{

    
    Dog(){
        super();
    }
    Dog(int height,int weight){
        super(height,weight);
    }
    
    void display(){
        System.out.println("HEIGHT :"+height);
        System.out.println("WEIGHT :"+weight);
    }
    void task(int age){
        super.age = age;
        super.display();

    }
    void task(){
        display();

    }
}
// class Puppy extends Dog ,Animal{
// cannot do this java doesn't support multiple inheritance
// }
