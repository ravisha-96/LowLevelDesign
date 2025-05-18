There is a practice football field with a capacity of 10.
Only players of same team can practive at a time on the field.
Multiple check-in or check-post, where players will login or logout (what is login/logout)
You need to allow/disallow players, they will stand in the queue if allowed/disallowed

Will you prevent starvation/efficiency 

Multiple entry/exists on 


2 queue implementation using array

Version 1:
Just make sure that only 10 members of a team are playing on the ground at once.
Do not worry about the starvation by other team players once  the ground is entered by the first team

Version 2:
Need to take care of starvation.
1. Make sure when waiting players of other team get entry after the timeout.
2. Make sure when waiting players of teamB exceeds the waiting player of team A by 15, empty the ground and make the
    ground available for the team B and vice versa
3. Make sure each player does not practice for more than 5 seconds