package day37_overriding;

public class Product { /* 10. SORU */
    public static void main(String[] args) {
        
        M m = new M();         M n = new N(); 
        M o = new O();         O oo = new O(); 
        m.product(3);        n.product(3);
        oo.product(3);
    }
}
class M {
    int product(int i) {
        int result = i*i;
        System.out.print("{" + i + ", " + result + "}~");
        return result;
    }
}
class N extends M {
    int product (int i) {
        int result = i+i;
        System.out.print("[" + i + ", " + result + "]~");
        return result;
    }
}
class O extends M {
    int product (int i) {
        int result = i*2;
        System.out.print("(" + i + ", " + result + ")~");
        return result;
    }
}
