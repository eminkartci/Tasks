
### Task 3
```
Title: Bank Account

1. Create a "Customer" object

    Properties
    ------------------------
    a. ID
    b. Name
    c. Surname
    d. Birth Year
    e. TCKN
    f. Balance

    Constructor
    ------------------------

    Behaviours
    ------------------------
    a. upload_money
    b. withdraw_money
    c. take_credit
    d. show_customer
    e. save_customer
    

2. Behaviout Explanations
   
   a -> customer can upload money to his/her balance
   b -> customer can withdraw money but s/he cannot withdraw greater than his/her account.
   c -> they can take credit
   d -> when you call this function the output should look like:
   
   ----------------> CUSTOMER {ID} <----------------
   Name         : ---
   Surname      : ---
   Birth Year   : ---
   TCKN         : ---
   Balance      : ---

   e -> when you call this function the data of the customer will be saved as txt file

3. Write a driver program

    a. Create a customer
    b. Get Name Surname ...
    c. Show the customer
    d. Deposit 100 tl
    e. Show the customer
    f. Withdraw 40 tl
    g. Show the customer
    h. Withdraw 170 tl
    i. Take 100 tl credit
    j. Show the customer


```
### Sample Case
```
===============> Welcome to Kartci Bank <===============

Author      : Emin Kartci
Date        : 12/02/2021
GitHub      : eminkartci
-----------------------------------------------------------------

Name: Emin
Surname: Kartci
Birth Year: 1999
TCKN: 111 111 111 11
Balance: 25

   ----------------> CUSTOMER 1 <----------------
   Name         : Emin
   Surname      : Kartci
   Birth Year   : 1999
   TCKN         : 111 111 111 11
   Balance      : 25

100 TL is added to the account !!
New Balance: 125 tl

   ----------------> CUSTOMER 1 <----------------
   Name         : Emin
   Surname      : Kartci
   Birth Year   : 1999
   TCKN         : 111 111 111 11
   Balance      : 125

40 TL is withdrawn
New Balance: 85 TL

   ----------------> CUSTOMER 1 <----------------
   Name         : Emin
   Surname      : Kartci
   Birth Year   : 1999
   TCKN         : 111 111 111 11
   Balance      : 85

170 TL cannot withdrawn !! You don't have enough money !!
Balance: 85 TL

100 TL credit is taken
New Balance: 185 TL

```
---
### Thanks
```
Author      : Emin Kartci
Date        : 12/02/2021
Difficulty  : Medium
Website     : eminkartci.com
```
