class activity3 {
    void mam(){
        System.out.println("Inside Mammal Class");
    }
}

class Lion extends activity3{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}

class Human extends activity3{
    void hum(){
        System.out.println("Inside Human Class");
    }
}

class Main3{
    public static void main(String[] args) {
        Lion obj=new Lion();
        obj.hum();
        obj.roar();
        obj.mam();
    }
}