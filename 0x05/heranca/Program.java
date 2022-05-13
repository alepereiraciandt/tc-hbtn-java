package heranca;

public class Program {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        Cachorro meuCachorro = new Cachorro();
        Object obj = meuCachorro;
        Animal umOutroAnimal = meuCachorro;

        System.out.println("meuAnimal eh um " + meuAnimal.getClass().getName().substring(8));
        System.out.println("meuCachorro eh um " + meuCachorro.getClass().getName().substring(8));
        System.out.println("obj eh um " + obj.getClass().getName().substring(8));
        System.out.println("umOutroAnimal eh um " + umOutroAnimal.getClass().getName().substring(8));
    }
}
