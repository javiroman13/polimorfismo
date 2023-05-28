public class PetsStore {
    public static void main(String[] args) {
        Cat mascotas = new Cat("gato","garfiel", "3 años");

        mascotas.toString();
        System.out.println(mascotas.talk());

        System.out.println("............................................................");

        Dog mascota2= new Dog("tobi","firulais","2 años");

        mascota2.toString();
        System.out.println(mascota2.talk());

        System.out.println("............................................................");

        Rooster gallo = new Rooster("gallo","ningu","3 años");
        gallo.toString();
        System.out.println(gallo.talk());


    }
}


