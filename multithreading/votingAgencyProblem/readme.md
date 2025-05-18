Problem: In a voting agency, there's a single bathroom that can accommodate up to 3 people at a time. The bathroom must be used exclusively by either Democrats or Republicans; mixed usage is not allowed.
Implement a system where threads representing individuals from each party request access to the bathroom, ensuring that only up to 3 people of the same party are allowed at once. Use appropriate synchronization mechanisms to manage access.


Key Constraints

    1. Maximum Capacity: The bathroom can hold up to 3 individuals.

    2. Exclusive Usage: Only individuals from the same party (either all Democrats or all Republicans) can use the bathroom simultaneously. Mixed usage is prohibited.

    3. Queue Management: When the bathroom is occupied, individuals must wait in a queue until space becomes available.
    Glassdoor

    4. Fair Access: The system should ensure that individuals are granted access to the bathroom in a fair and efficient manner.

//3 people of the same party can be allowed at max
// We can create 2 semaphores, each initialized with value 3
// Democrate will need to acquire a democrate sema but before that, democrate needs to check
// if the republican semaphore is still 3

//availablePermits()
// We also need a queue to place the waiting democrates or republican
// 
