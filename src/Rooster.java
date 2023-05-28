public class Rooster extends Animal{

    public Rooster (String name, String especie, String edad){
        super(name,especie,edad);
    }

    public String talk (){
        return"kikiriki";
    }

    public String toString() {
        System.out.println("nombre:"+getName());
        System.out.println("especie:"+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }
}
