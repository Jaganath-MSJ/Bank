# Bank Account
```
## 1 – Register
## 2 – Login
```

### Register:
   - Get 
      1 Username 
      2 Email 
      3 Password
   - Check
      1 If username and email are already not existing.
      2 If password must have above length 8.
      3 If password must have one upper, number, special.
      4 If password must should not have repeat one letter in 3 times.
   - Create account
### Login:
   Get 
   - Username 
   - Email 
   - Password
   Check if username, email, password is already existed.
   Go to home screen.

## Home Screen:
## 1 – Bank Account
## 2 – Payments
## 3 – Invite Code
## 4 – Transaction
## 5 – Display All Details
## 6 – Logout

## Bank Account:
## 1 – Add Account
## 2 – Check Balance
## 3 – Add Amount
## 4 – Remove Account
## 5 – Go Back

### Add Account:
   Get 
   - Account number
   - IFSC number
   - Display name
   - Bank name
   - Balance
   - UPI id (if UPI id not given create as Display name + @ + Bank name)
   Add Account to the user.
### Check Balance:
   Print account details with balance.
### Add Amount:
   Get
   - Account number
   - IFSC number
   - Display name
   - Amount
   Find the account and add amount to balance.
   Print the balance.
### Remove Account:
   Get
   - Account number
   - IFSC number
   - Display name
   Find the account and remove the account from the user.


## Payments:
## 1 – UPI id Payment
## 2 – Account number Payment
## 3 – Go Back

### UPI id Payment:
   Get 
   - UPI id
   - Amount to the sender
   Find the account by using UPI id and send the amount.
### Account number Payment:
   Get
   - Account number
   - IFSC number
   - Amount to the sender
   Find the account by using account no and IFSC no and send the amount.


## Invite Code:
## 1 – Show Invite Code
## 2 – Show Earnings
   Create an invite code while creating account, invite code unique to add.
   While creating user give an invite code, add Rs 50 in the earning to the Owner of the invite code.

### Show Invite Code:
   Print the user invite code.
### Show Earnings:
   Print the earnings


## Transaction:
## 1 – Last 7 days transaction history
## 2 – Last 15 days transaction history
## 3 – Last 30 days transaction history
## 4 – All transaction history
## 5 – Go Back

### Last 7 days transaction history:
   Print the last 7 days transaction history
### Last 14 days transaction history:
   Print the last 14 days transaction history
### Last 30 days transaction history:
   Print the last 30 days transaction history
### All transaction history:
   Print the all transaction history


## Display All Details:
   Print all the details of user and his/her account details.
