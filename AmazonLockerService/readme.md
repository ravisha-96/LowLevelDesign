Requirements:

Actors - Customer, Admin

1. Customer places an order
2. Customer selects the locker location
3. Customer picks up the order
4. Customer returns the order

Admin
1. Admin creates locker
2. Admin decides what to do on the locker whose product not picked up by customer

1. System generates passcode for the locker
2. System authenticates the customer
3. Different sizes of locker to store different size of packages
4. Locker is assigned to the customer based on the size of the package
5. The package will be kept or placed inside the locker for 3 days only
6. Multiple locker at every location
7. When the customer picks up the order package from the locker, the locker's state is changed to closed, and the customer will no longer be able to open the locker with the given code.


Detailed Requirements
R1: While ordering the item(s), the customer can choose the nearest location to pick up the order package from the locker.

R2: One or more items can be contained in one order. An order will be placed in a package before the delivery.

R3: There can be different sizes of lockers including extra small, small, medium, large, extra large, and double extra large.

R4: The locker is assigned to the customer based on the size of the order package.




R5: When the order package is delivered to the locker location specified by the customer, a 6-digit code will be sent to the customer to open the locker.

R6: The package will be kept or placed inside the locker for three days only.

R7: If the customer does not pick up the package from their locker within three days, the refund process will be initiated and the customer won’t be allowed to pick up the package any longer.




R8: Only eligible packages can be placed in the locker such that the size of the package must be less than the size of the locker.

R9: There can be multiple lockers at every locker location.

R10: The Amazon Locker is accessed within a specific time. Every location has its opening and closing time. Therefore, the customer should pick up the package during this time period.




R11: The item can be returned to the Amazon Locker if it doesn’t match the expectation of the customer or is faulty, and there is a refund policy available for that product.

R12: To return an item, the customer needs to choose the nearest locker location. An available locker will be assigned to them based on the size and location.

R13: When the customer picks up the order package from the locker, the locker’s state is changed to closed, and the customer will no longer be able to open the locker with the given code.
