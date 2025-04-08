public class Yarik {
  void a() {
      System.out.println("y");
  }
}

class Aboba extends Yarik {
    @Override
    void a() {
        System.out.println("a");
    }
    void b(){

    }
}

class Hui extends Yarik {
    @Override
    void a() {
        System.out.println("hui");
    }
}

class C {
    C() {
        Yarik yarik = new Aboba();
        yarik.a();
        yarik = new Hui();
        yarik.a();
    }
}