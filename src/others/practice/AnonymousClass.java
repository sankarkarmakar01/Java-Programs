package others.practice;

public class AnonymousClass {

    OuterClass obj = new OuterClass() {
        @SuppressWarnings("unused")
        void sing() {

        }

        @Override
        public void outerMethod() {

        }
    };

    SuperInterface obj2 = new SuperInterface() {

        @Override
        public void interfaceMethod() {

        }
    };
}

class OuterClass {
    public void outerMethod() {

    }
}

interface SuperInterface {
    void interfaceMethod();
}