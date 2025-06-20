Barber Shop Problem:

    Implement the Barber Shop Problem using ReentrantLock and Condition.

    There is a barber and several customers. If there are no customers, the barber sleeps. If customers arrive, the barber cuts hair. If the shop is full, new customers must leave.

    Handle the synchronization and avoid race conditions.


💈 Barber Shop Problem — Core Setup

    There’s:

        One barber

        A limited number of chairs for waiting customers

    If there are no customers, the barber sleeps

    If a customer arrives:

        If the barber is free, they get a haircut

        If the barber is busy and a chair is free, the customer waits

        If no chairs are free — the shop is full, and the customer leaves

✅ So, When is the Shop Full?

    🛑 The shop is full when all the waiting chairs are occupied.

That is:

    There's 1 customer in the barber’s chair, and

    There are N customers sitting in the N waiting chairs

➡️ If a (N+1)th customer arrives while the barber is busy and all N chairs are full, the customer cannot wait and is turned away.
🪑 Example

Suppose the shop has:

    1 barber

    3 waiting chairs

Scenario:

    Barber is busy (cutting hair)

    3 customers are waiting in chairs

    A new (4th) customer arrives

➡️ The shop is now full, and the 4th customer must leave.