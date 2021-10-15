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

11. Lambda and Local Variables
    1. You are not allowed to use same local variable name as lambda parameters or inside local body
    2. You are not allowed to reassign value to local variable inside lambda expression
    3. No restrictions for instance variables

12. Effectively Final
    1. Variables to be used in Lambda are final are effectively final
    2. Advantages of using effectively final variables
        1. Easy to perform concurrency operations
        2. Promotes the functional style programming and demotes imperative style programming

13. Streams API
    1. Introduced as part of Java8
    2. main purpose is to perform operations on collections
    3. Parallel operations can easily be performed with Streams
    4. Stream is a sequence of elements that are created out of collections such as list or Arrays or any I/O Resources
    5. Stream operations can be performed sequentially or parallel
        1. To perform sequentially we will use .stream() method
        2. To perform parallel .parallelStream() is used
        3. Results are same
    6. Streams perform manipulation on collections in declarative way,means instead of worrying how to implement it we
       can make use of preexisting methods and ask for result
    7. Streams are lazy
        1. Not intermediate operations will be invoked unless terminal operations are invoked

14. Collections vs Streams
    1. Collections can modify or add elements at any time
    2. Streams cannot modify the elements , it is a fixed data set
    3. In Collections elements can be accessed in any order, but in streams data can be addressed one by one in a
       sequence
    4. Collections are eagerly constructed
    5. Unless the terminal operation is invoked no process is started in streams
    6. Collections can be traversed any no of times , Streams can be traversed only once
    7. External Iterations are performed on Collections , Internal Iterations are performed on streams

15. How to debug Stream Operations?
    1. .peek method can be used to debug stream after each operation

16. Stream API() : map
    1. map is used to convert from one form to another
    
17. Stream API() : flatmap
    1. transforms from one form of same type to another
    2. Used in Context where each element in stream represent multiple elements
       1. Stream<List>
       2. Stream<Arrays>

18. StreamAPI() : Distinct , Count ,Sorted
    1. Distinct
       1. Returns stream with unique elements
    2. Count
       1. Returns Long with total no of elements in the Stream
    3. Sorted
       1. Sort the elements in the stream
    

19. 
    