# Bank Website
### 1 – [Register](#register)
### 2 – [Login](#login)

## Register:
   - Get 
      - Username 
      - Email 
      - Password
   - Check
      - If username and email are already not existing.
      - If password must have above length 8.
      - If password must have one upper, number, special.
      - If password must should not have repeat one letter in 3 times.
   - Create account
## Login:
   - Get 
      - Username 
      - Email 
      - Password
   - Check if username, email, password is already existed.
   - Go to [home screen](#home-screen).

# Home Screen:
### 1 – [Bank Account](#bank-account)
### 2 – [Payments](#payments)
### 3 – [Invite Code](#invite-code)
### 4 – [Transaction](#transaction)
### 5 – [Display All Details](#display-all-details)
### 6 – [Logout](#bank-website)

# Bank Account:
### 1 – [Add Account](#add-account)
### 2 – [Check Balance](#check-balance)
### 3 – [Add Amount](#add-amount)
### 4 – [Remove Account](#remove-account)
### 5 – [Go Back](#home-screen)

## Add Account:
   - Get 
      - Account number
      - IFSC number
      - Display name
      - Bank name
      - Balance
      - UPI id (if UPI id not given create as Display name + @ + Bank name)
   - Add Account to the user.
## Check Balance:
   - Print account details with balance.
## Add Amount:
   - Get
      - Account number
      - IFSC number
      - Display name
      - Amount
   - Find the account and add amount to balance.
   - Print the balance.
## Remove Account:
   - Get
      - Account number
      - IFSC number
      - Display name
   - Find the account and remove the account from the user.


# Payments:
### 1 – [UPI id Payment](#upi-id-payment)
### 2 – [Account number Payment](#account-number-payment)
### 3 – [Go Back](#home-screen)

## UPI id Payment:
   - Get 
      - UPI id
      - Amount to the sender
   - Find the account by using UPI id and send the amount.
## Account number Payment:
   - Get
      - Account number
      - IFSC number
      - Amount to the sender
   - Find the account by using account no and IFSC no and send the amount.


# Invite Code:
### 1 – [Show Invite Code](#show-invite-code)
### 2 – [Show Earnings](#show-earnings)
### 3 - [Go Back](#home-screen)
   - Create an invite code while creating account, invite code unique to add.
   - While creating user give an invite code, add Rs 50 in the earning to the Owner of the invite code.

## Show Invite Code:
   - Print the user invite code.
## Show Earnings:
   - Print the earnings


# Transaction:
### 1 – [Last 7 days transaction history](#last-7-days-transaction-history)
### 2 – [Last 15 days transaction history](#last-15-days-transaction-history)
### 3 – [Last 30 days transaction history](#last-30-days-transaction-history)
### 4 – [All transaction history](#all-transaction-history)
### 5 – [Go Back](#home-screen)

## Last 7 days transaction history:
   - Print the last 7 days transaction history
## Last 15 days transaction history:
   - Print the last 15 days transaction history
## Last 30 days transaction history:
   - Print the last 30 days transaction history
## All transaction history:
   - Print the all transaction history


# Display All Details:
   - Print all the details of user and his/her account details.
