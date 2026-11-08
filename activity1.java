class activity1{
    int age,id;
    String name;
    void naming(String name){
        System.out.println("Name:"+name);
    }
}

class Child extends activity1{
    void ageN(int age){
        System.out.println("Age of student is:"+age);
    }
}

class Main{
    public static void main(String[] args) {
        Child s= new Child();
        s.naming("Nathan");
        s.ageN(16);
    }
}