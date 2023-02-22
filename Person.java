public class Person{
    private Stinrg name;
    public Person(String name){
        this.name = name;
    }

    static void attack(Person person){
        System.out.println(person.name + "님을 공격하였습니다");
    }
}