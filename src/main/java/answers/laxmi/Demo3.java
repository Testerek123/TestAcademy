package answers.laxmi;

/*
    In Java, an enum class may include a constructor like a regular class. These enum constructors are either
    private - accessible within the class
    or
    package-private - accessible within the package*/
    enum Size {

        // enum constants calling the enum constructors
        SMALL("The size is small."),
        MEDIUM("The size is medium."),
        LARGE("The size is large."),
        EXTRALARGE("The size is extra large.");

        private final String pizzaSize;

        // private enum constructor
        private Size(String pizzaSize) {
            this.pizzaSize = pizzaSize;
        }

        public String getSize() {
            return pizzaSize;
        }
    }

    class Main {
        public static void main(String[] args) {
            Size size = Size.SMALL;
            System.out.println(size.getSize());
        }
    }



