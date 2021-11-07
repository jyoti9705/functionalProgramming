`1. Functional Interfaces are present in Java since 1.0

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


19. Sorting can also be done using comparator we will have to pass attribute name using which we want to compare in
    Comparator.comparing

20. .reversed is used to reverse the results of comparison

21. Stream API() : filter
    1. Filter is used to ignore specific datasets and only get data sets on which we want to iterate


22. Stream API() : reduce
    1. Reduce is a terminal operation
    2. To reduce contents of a stream into a single value
    3. Binary inputs
    4. We can also perform max and min using reduce function
    5. It is always safe to use optional when input can be empty or null array

23. Stream API : limit and Skip
    1. Limit
        1. Limits the n of elements to be processed in the stream
    2. Skip
        1. Skips n of elements from the list processing


24. Streams API : anyMatch , allMatch , noneMatch
    1. All the three take predicate as input and return Boolean as output
    2. AnyMatch
        1. Returns true if any element matches the predicate
    3. AllMatch
        1. Returns true if all elements matches the predicate
    4. NoneMatch
        1. Returns true if none of the elements matches the predicate

25. Streams API : findFirst , findAny
    1. Returns elements that matches the criteria
    2. Return type of both the functions are optional
    3. findFirst
        1. Returns first element that matches the criteria
    4. findAny
        1. Returns first element that matches the criteria

26. Short-circuiting Functions
    1. limit()
    2. findFirst()
    3. findAny()
    4. allMatch()
    5. anyMATCH()
    6. noneMatch()
    7. All of these functions do not iterate the whole stream to evaluate the result

27. Streams API : Factory Methods
    1. Of()
        1. Creates stream of certain values passed to this method
    2. iterate and generate are used to create infinite streams

28. Numeric Streams
    1. In normal stream each time when operation is performed unboxing is done from Integer wrapper class to int , to
       avoid this we should make use NumericStream
    2. Preferably for all numeric operations we should make use of Numeric Streams
    3. range(1,50) will give u range of elements from 1 to 49
    4. rangeClosed(1,50) will give all the elements from 1 to 50
    5. Types of Numeric Streams
        1. Int Stream
        2. Long Stream
    6. Double doesn't support range and rangeClosed
    7. Aggregate methods in Numeric Streams
        1. sum
        2. max
        3. min
        4. average
    8. Boxing
        1. Converting primitive type variable to Wrapper Class
    9. UnBoxing
        1. Converting wrapper class to primitive type
        2. mapToInt can be used
    10. MaptoObj
        1. Convert each element in numeric stream to obj
    11. MapToLong
        1. Convert a numeric stream to long stream
    12. MapTODouble
        1. Converts numeric stream to Double
29. Collect
    1. Collect results till stream is ended
    2. Joining
        1. Joining performs String concatenation on the elements in the stream
        2. Versions
            1. Joining without delimiter
                1. It will simply concat strings with space in them
            2. Joining with delimiter
                1. It will add delimiters specified between the Strings in the stream
            3. Joining with delimiter , prefix and Suffix
                1. It will add prefix , delimiter and Suffix to the Strings in the Stream
        3. Counting
            1. Collector returns total number of elements as a result
        4. Mapping
            1. Collector applies transformation function first and then collects the data in the collection
        5. MinBy
            1. MinBy is another terminal operation used in conjunction with comparator will return the lowest element
               depending upon characters passed
        6. MaxBy
            1. MaxBy is another terminal operation used in conjunction with comparator will return the highest element
               depending upon the character passed
        7. SummingInt and AveragingInt
            1. SummingInt
                1. Returns sum as return
            2. AverageInt
                1. Returns avg as a return
            3. Support is also provided for summingLong , SummingDouble , AveragingLong , Averaging double
        8. GroupingBy
            1. GroupingBy collector is equivalent to groupBy operation in SQL
            2. It is used to group elements based on property
            3. The output of GroupBy is going to be Map<K,V.
            4. Grouping By Types
                1. groupingBy(Classifier)
                2. groupingBy(classifier, downstream)
                3. groupingBy(classifier , supplier , downstream)
            5. MaxBy with GroupingBy
                1. Returns Map of key value with value as optional having content with max expected
            6. MinBy with GroupingBy
            7. CollectingAndThen With GroupingBy
        9. PartitioningBy
            1. Kind of GroupingBy
            2. accepts predicate as an input
            3. Return type of collector is Map<K,V>
                1. Key is the boolean value
            4. Versions of partitioningBy()
                1. one which accepts predicate as input
                2. another one accepting predicate and downstream as input

30. Streams Parallel Processing
    1. Parallel Streams source data in multiple parts , process them parallel and collects the data to return output
    2. Unless we do not specify that we want to use parallel , sequential stream would be called
    3. Parallel Stream uses Fork/Join Framework that got introduced in Java 7
    4. Number of Threads that are created == Number of threads available in machine
    5. Do not use parallel streams for mutable variables

31. Optional
    1. Used to represent Non-Null Value
    2. Avoids Null Pointer Exception
    3. Avoids Unnecessary Null Checks
    4. isPresent is used to identify if Optional has a value
    5. if not values is present in optional it gives optional.Empty as a result when ofNullable is used
    6. If Optional.Of is used and value passed is null then Optional.Of gives null pointer exception , because it
       expects us to have values all the time
    7. Optional.empty returns an empty object
    8. orElse method , orElse get , orElse throw
        1. orElse
            1. Returns value if present
            2. In rest scenario it will execute the orElse input
        2. orElseGet
            1. Accepts supplier as an input
        3. orElseThrow
            1. Throws an exception when data was not found
    9. isPresent
        1. checks if optional object has an value
        2. if value is present it will return true or else it will return false
    10. ifPresent
        1. ifPresent gives the value along with telling whether object is present or not
    11. filter , map , flatmap
        1. Filter gives u feasibility to use filter on optional object
        2. FlaTMap in optional context is used to get value of optional inside another optional object
32. Default and static methods in interfaces
    1. default keyword is used to identify a default method in an interface
    2. Default method can be overridden in implementation class
    3. Static method cannot be overridden in the code
    4. When we override default method the class which is overriding the method will be called
    5. Abstract Classes vs Interfaces
        1. Instance variables are not allowed in Interfaces
        2. A class and extend only one class but a class can implement multiple interfaces
        3. Does Java enabled Multiple Inheritance ?
            1. Yes
            2. But this was never possible before Java8
            3. Class that overrides default method will have more precedence over
            4. To override default method ,class should implement the interface
            5. Or the class should be sub-interface that extends the interface
            6. If you are implementing two interface with similar methods , you need to override the same method in
               implementation class to resolve the conflict
33. Date and Time Libraries
    1. New Date and Time libraries are LocalDate, LocalTime and LocalDateTime, and they are part of java.time package
    2. These new libraries are created taking inspiration from Joda-Time library
    3. All these classes are immutable
    4. Supporting classes like instant , Duration and Period etc
    5. Date and Calendar were used Prior 8 , but there were many limitations to it
    6. LocalDate is used to represent Date
        1. We can get values from LocalDate
        2. We can modify values in LocalDate
        3. Since LocalDate is immutable each time we modify the value the new instance of LocalDate is created
        4. We can create LocalDate by passing values
        5. We can convert LocalDate to LocalDateTime and ViceVersa
    7. LocalTime is used to represent time
        1. We can get values from LocalTime
        2. We can modify values in LocalTime
        3. Since LocalTime is immutable each time we modify the value the new instance of LocalDate is created
        4. We can create LocalTime by passing values
        5. We can convert LocalTime to LocalDateTime and ViceVersa
    8. LocalDateTime is used to represent both Date and Time
        1. We can get values from LocalDateTime
        2. We can modify values in LocalDateTime
        3. Since LocalDateTime is immutable each time we modify the value the new instance of LocalDate is created
        4. We can create LocalDateTime by passing values
        5. We can convert LocalDateTime to LocalTime,LocalDate and ViceVersa
    9. Period
        1. Date based representation of Time in Days, Months and Years and is part of java.time package
        2. Compatible with LocalDate
        3. It represents a period of time and not just a specific date and time
        4. Period can be used to calculate difference between two dates
    10. Duration
        1. Duration is time base representation of time in hours , minutes , seconds and nanoseconds
        2. Compatible with LocalTime and LocalDateTime
        3. It represents duration of time and not just specific time
    11. Instant
        1. Represent time in a machine-readable format
    12. TimeZones
        1. ZonedDateTime
            1. Represent Date/Time with its TimeZone
            2. Combination of ZoneOffSet and ZoneId
        2. ZoneOffSet
            1. Represent the offset time from UTC Time
        3. ZoneId
            1. Determines Zone to which this time belongs to
    13. DateTimeFormatter
        1. Introduced in Java8 as the part of java.time.format package
        2. Used to parse and format the LocalDate , LocalTime and LocalDateTime
        3. Parse
           1. Converting String to LocalDate/LocalTime/LocalDateTime
        4. Format
           1. Converting a LocalDate/LocalTime/LocalDateTime to a String
           
