public class Tasit {
    public void korna() {
        System.out.println("Araç korna çalıyor");
    }
}

class Motosiklet extends Tasit {
    @Override
    public void korna() {
        System.out.println("Motor korna çalıyor");
    }
}

class Araba extends Tasit {
    @Override
    public void korna() {
        System.out.println("Araba korna çalıyor");
    }
}

 