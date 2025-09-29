package coreJava.basics.dataTypesAndVariables;

public class VariableScope {
    int instanceVar = 10;         // Instance variable
    static int staticVar = 20;    // Static variable

    void method() {
        int localVar = 30;        // Local variable
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("Static: " + staticVar);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.method();
    }
}
