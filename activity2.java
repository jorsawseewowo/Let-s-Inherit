public class activity2 {
    void eat(){
        System.out.println("Eating...Animal class...eat method");
    }
}

class Lion extends activity2{
    void roar(){
        System.out.println("Roar...Lion class...roar method");
    }
}

class BabyLion extends Lion{
    void whine(){
        System.out.println("Whining...BabyLion class...whine method");
    }
}

class Main2{
    public static void main(String[] args) {
        BabyLion obj=new  BabyLion();
        obj.whine();
        obj.roar();
        obj.eat();
    }
}