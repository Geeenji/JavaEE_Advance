package com.itwong.arguments;

public class Demo {
    public static void main(String[] args) {
//        Person p=new Person();
        usePerson(new Person());
        useAnimal(new Cat()); //只能传实例,扩展性好
        useFly(new Bird());
        Fly an=new Fly() {
            @Override
            public void fly() {
                System.out.println("an is flying");
            }
        };
        an.fly();
    }
    public static void usePerson(Person person){
        person.eat();
    }
    public static void useAnimal(Animal animal){
        animal.eat();
    }
    public static void useFly(Fly fly){
        fly.fly();
    }
}
