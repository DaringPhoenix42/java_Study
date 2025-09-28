package OPPS;
class Demo {
    private String privateVar = "I am PRIVATE (only inside this class)";
    String defaultVar = "I am DEFAULT (package-private)";
    protected String protectedVar = "I am PROTECTED (package + subclasses)";
    public String publicVar = "I am PUBLIC (everywhere)";

    private void privateMethod() {
        System.out.println("Private Method: Accessible only inside Demo class");
    }

    void defaultMethod() {
        System.out.println("Default Method: Accessible inside package");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: Accessible in package + subclasses");
    }

    public void publicMethod() {
        System.out.println("Public Method: Accessible everywhere");
    }

    // Method to show access within same class
    public void showInsideClass() {
        System.out.println(privateVar);
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}

class SubDemo extends Demo {
    public void showInSubclass() {
        // System.out.println(privateVar);   // ❌ private not accessible
        // System.out.println(defaultVar);   // ❌ default not accessible (different file/package normally)
        System.out.println(protectedVar);    // ✅ protected accessible in subclass
        System.out.println(publicVar);       // ✅ public accessible
        // privateMethod();                  // ❌ private method not accessible
        // defaultMethod();                  // ❌ default not accessible outside package
        protectedMethod();                   // ✅ protected method accessible in subclass
        publicMethod();                      // ✅ public method accessible
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("--- Inside Demo class ---");
        d.showInsideClass();

        System.out.println("\n--- In Main using object ---");
        // System.out.println(d.privateVar);  // ❌ private not accessible
        System.out.println(d.defaultVar);    // ✅ default accessible (since same file, same package)
        System.out.println(d.protectedVar);  // ✅ protected accessible in same package
        System.out.println(d.publicVar);     // ✅ public accessible
        d.defaultMethod();                   // ✅
        d.protectedMethod();                 // ✅
        d.publicMethod();                    // ✅

        System.out.println("\n--- In Subclass ---");
        SubDemo sd = new SubDemo();
        sd.showInSubclass();
    }
}
