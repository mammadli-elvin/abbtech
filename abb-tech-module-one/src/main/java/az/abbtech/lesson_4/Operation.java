package az.abbtech.lesson_4;

// TODO:
//  Practice advanced enum features.
//  Create an enum called Operation with constants ADD, SUBTRACT, MULTIPLY, DIVIDE.
//  Each constant should implement a method apply(int x, int y) to perform the relevant arithmetic apply.

public enum Operation {
    ADD{
        @Override
        public double apply(int x, int y) {
            return x+y;
        }
    },

    SUBTRACTION {
        @Override
        public double apply(int x, int y) {
            return x-y;
        }
    },

    MULTIPLY {
        @Override
        public double apply(int x, int y) {
            return x*y;
        }
    },

    DIVIDE {
        @Override
        public double apply(int x, int y) {
            if(y==0) {
                throw new ArithmeticException("Division by zero");
            }
            return (double) x / y;
        }
    };

    public abstract double apply(int x, int y);
}
