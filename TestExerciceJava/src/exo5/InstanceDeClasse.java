package exo5;

public class InstanceDeClasse {

    public static void run(){
        System.out.println("Exo 5 : Instance de classe");
        Person person = new Person("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }


    }
}
