Singleton Pattern
------------------------------

It is used when we want to have only 1 instance of a class throughout the application.

It can be achived in 4 ways
1. Eager Initialization
2. Lazy Initialization
    If multiple thread executes the null check at the same instant, then multiple objects will be created
3. Synchronized method
    - Locking is very expensive operation, If the method is accessed 10k times, 10k times lock will be put
4. Double Locking
    - Lock is put only once when the first object is created as we have 2 null checks, first null check avoid the use of lock if the object is already created.
    - This is the one which is used in industry.