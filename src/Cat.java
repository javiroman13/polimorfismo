public class Cat extends Animal{

    public Cat (String name, String especie, String edad){
        super(name,especie,edad);
    }

    public String talk (){
        return"miau,miau";
    }

    public String toString() {
        System.out.println("nombre:"+getName());
        System.out.println("especie:"+getEspecie());
        System.out.println("edad:"+getEdad());
        return "";
    }
}
