package answers.laxmi.demo;

//This defines an interface named Pizza with a single method displaySize(). Interfaces in Java provide a way to define a contract that classes can implement. In this case, any class implementing the Pizza interface must provide an implementation for the displaySize() method//





public class enumin {

    interface Pizza {
        public void displaySize();
    }

    enum Size implements Pizza {
        SMALL, MEDIUM, LARGE, EXTRALARGE;

        public void displaySize() {
            System.out.println("The size is " + this);
        }
    }


        public static void main(String[] args) {
            Size.MEDIUM.displaySize();
        }
    }


