1. Functional Interfaces are present in Java since 1.0
2. Those were referred as single abstract method interface, this is not categorised as Functional Interface
3. Any Interface with exactly one abstract methods are called single abstract methods
4. @FunctionalInterface annotation was introduced with Java8 , and all the methods with one abstract method are
   annotated with this interface
5. This is the optional interface, but it validates the class to make sure that there is only one abstract methods
6. New Functional Interfaces which were introduced in Java8
    1. Consumer
        1. Has BiConsumer extension
    2. Predicate
        1. Has BiPredicate Extension
    3. Function
        1. Has BiFunction, UnaryOperator , BinaryOperator Extension
    4. Supplier
7. Consumer (accept , andThen)
    1. Consumer is a function which consumes the value and performs operation on it
    2. We can chain as many consumers as we wish , using and then
    3. There is no output returned by Consumer Interface
    4. BiConsumer
        1. BiConsumer accepts 2 values as inputs performs operation on it
        2. It has on method accept and another default method and then
8. Predicate (test , not ,negate , or , and)
    1. Predicate accepts values as input and returns a boolean as output
    2. It has one test abstract method and 4 default methods
        1. and
        2. negate
        3. or
        4. not
    3. Predicate can also be chained to return values
    4. BiPredicate is with 2 parameters
9. Function (apply,andThen , compose)
    1. Function takes a value and returns a value back
    2. Function has apply abstract method and then ,compose default method
    3. UnaryOperator
        1. When input and output are of same type we can make use of Unary Operator
    4. BinaryOperator
        1. It acts on two input and returns one output
        2. BinaryOperator extends BiFunction interface
        3. If input and output are of same types , then in that case we make use of binary operator
        4. minBy
            1. accepts a comparator
            2. returns the smallest value out of the 2
        5. maxBy
            1. accepts a comparator
            2. returns the greatest value of the 2
10. Supplier
    1. It takes no input and returns an output
    
   