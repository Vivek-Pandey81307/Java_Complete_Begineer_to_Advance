public class class_java{
    public static void main(String[] args){
        Complex a =  new Complex(3,4);
        Complex b = new Complex(2,7);
        Complex c = a.add(b);
        Complex d = c.send();
        
    }
    
}
class Complex{
    int real;
    int img;
    Complex(){
        this.real = 0;
        this.img = 0;
        display();
    }
    Complex(int real,int img){
        this.real = real;
        this.img = img;
        display();
    }
    void display(){
        System.out.println(real+" + "+img+"i");
        
    }
    Complex add(Complex obj){
        return new Complex(real + obj.real,img + obj.img);
    }
    Complex send(){
        return this;
    }

}