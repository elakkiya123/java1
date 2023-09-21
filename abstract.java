//abstract class
abstract class animal{
    private String name;
    animal(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    //abstract method
    abstract void makesound();
    }
//concrete subclasses
class dog extends animal{
    dog(String name){
        super(name);
    }
    void makesound(){
        System.out.println(getname()+"bow bow");
    }
}
class cat extends animal{
    cat(String name){
        super(name);
    }
    void makesound(){
        System.out.println(getname()+"Meow Meow");
    }
}
class m{
    public static void main(String[] args){
animal d=new dog("tiger");
animal c=new cat("Angel");
d.makesound();
c.makesound();
    }
}