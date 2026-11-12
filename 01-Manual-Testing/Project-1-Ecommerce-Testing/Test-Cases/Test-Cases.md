//----------------Test Cases : E-commerce Website---------------------

Application: SauceDemo
Module: Login, Products, Cart and Checkout


//-----------Test Case ID: TC_001-----------------------------------
Scenario: Login with valid credentials

Test Steps:
1. Enter standard_user and secret_sauce.
2. Click Login.

Expected Result: User should successfully log in and see the Products page.

Actual Result: 
User successfully logged in, and the "Products page" is visible. 

Status: Pass 


//-----------Test Case ID: TC_002-----------------------------------
Scenario: Login with invalid password

Test Steps:
1. Enter username: standard_user.
2. Enter an incorrect password.
3. Click Login.

Expected Result: User should remain on the login page and see an appropriate error message.

Actual Result:
User is unable to log in. An appropriate error message is showcased reading "Epic sadface: Username and password do not match any user in this service". 

Status: Pass


//-----------Test Case ID: TC_003-----------------------------------
Scenario: Login with empty fields

Test Steps:
1. Leave the username field empty.
2. Leave the password field empty.
3. Click Login.

Expected Result: User should remain on the login page and see a validation message indicating that the username is required.

Actual Result:
User is unable to log in. An appropriate validation message is displayed, indicating the username is required. 

Status: Pass


//-----------Test Case ID: TC_004-----------------------------------
Scenario: Verify product listing

Test Steps:
1. Log in using valid credentials.
2. Observe the Products page.
3. Verify product names, prices and images.

Expected Result: Products should be displayed correctly with their names, prices and images.

Actual Result:
All products are displayed correctly with their actual names, prices, and images. 

Status: Pass


//-----------Test Case ID: TC_005-----------------------------------
Scenario: Add one product to cart

Test Steps:
1. Log in using valid credentials.
2. Select any one product.
3. Click Add to cart.

Expected Result: The selected product should be added to the cart and the cart icon should display the updated item count.

Actual Result:
The selected product gets added to the cart, and the cart icon displays the updated item count. 

Status: Pass


//-----------Test Case ID: TC_006-----------------------------------
Scenario: Remove product from product listing

Test Steps:
1. Log in using valid credentials.
2. Add one product to the cart.
3. Click Remove on the same product.

Expected Result: The product should be removed from the cart and the cart item count should update accordingly.

Actual Result:
The product is removed from the cart, and the cart item count is updated accordingly. 

Status: Pass


//-----------Test Case ID: TC_007-----------------------------------
Scenario: Verify product in shopping cart

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Click the shopping cart icon.

Expected Result: The cart page should display the selected product with the correct name, price and quantity.

Actual Result:
The cart page displays the selected product with the correct name, price, and quantity. 

Status: Pass


//-----------Test Case ID: TC_008-----------------------------------
Scenario: Continue shopping from cart

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Open the shopping cart.
4. Click Continue Shopping.

Expected Result: User should be redirected to the Products page.

Actual Result:
The user is redirected to the products page. 

Status: Pass


//-----------Test Case ID: TC_009-----------------------------------
Scenario: Checkout with empty information

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Open the shopping cart.
4. Click Checkout.
5. Leave all checkout information fields empty.
6. Click Continue.

Expected Result: User should remain on the checkout information page and see a validation message indicating that the first name is required.

Actual Result:
The user is unable to proceed to the next page without filling in all the required credentials on the checkout information page. An appropriate validation message is displayed, indicating the first name is required. 

Status: Pass


//-----------Test Case ID: TC_010-----------------------------------
Scenario: Complete checkout successfully

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Open the shopping cart.
4. Click Checkout.
5. Enter valid first name, last name and postal code.
6. Click Continue.
7. Review the order summary.
8. Click Finish.

Expected Result: Order should be completed successfully and the order confirmation page should be displayed.

Actual Result:
The order is completed successfully, and the order confirmation page is displayed. 

Status: Pass



//-----------Test Case ID: TC_011-----------------------------------
Scenario: Sort products by price (low to high)

Test Steps:
1. Log in using valid credentials.
2. Open the product sorting dropdown.
3. Select Price (low to high).

Expected Result: Products should be displayed in ascending order of price.

Actual Result:
All the products are displayed in an ascending order of their price. 

Status: Pass


//-----------Test Case ID: TC_012-----------------------------------
Scenario: Sort products by price (high to low)

Test Steps:
1. Log in using valid credentials.
2. Open the product sorting dropdown.
3. Select Price (high to low).

Expected Result: Products should be displayed in descending order of price.

Actual Result:
All products are displayed in descending order of their price. 

Status: Pass


//-----------Test Case ID: TC_013-----------------------------------
Scenario: Add multiple products to cart

Test Steps:
1. Log in using valid credentials.
2. Add three different products to the cart.
3. Observe the cart icon.

Expected Result: All three products should be added successfully and the cart count should display 3.

Actual Result:
All three products are added successfully, and the cart count is displaying 3. 

Status: Pass


//-----------Test Case ID: TC_014-----------------------------------
Scenario: Remove one product while retaining other products

Test Steps:
1. Log in using valid credentials.
2. Add three different products to the cart.
3. Remove one product from the Products page.
4. Open the cart.

Expected Result: The removed product should no longer appear in the cart. The other two products should remain.

Actual Result:
The removed product no longer appears on the cart page. The other two products remains visible. 

Status: Pass


//-----------Test Case ID: TC_015-----------------------------------
Scenario: Checkout with missing last name

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Open the cart and click Checkout.
4. Enter the first name.
5. Leave the last name empty.
6. Enter the postal code.
7. Click Continue.

Expected Result: User should remain on the checkout information page and see a validation message indicating that the last name is required.

Actual Result:
User is unable to proceed to the next page and remains on the checkout information page. Appropriate validation messages displayed reading "last name is required." 

Status: Pass


//-----------Test Case ID: TC_016-----------------------------------
Scenario: Checkout with missing postal code

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Open the cart and click Checkout.
4. Enter the first name and last name.
5. Leave the postal code empty.
6. Click Continue.

Expected Result: User should remain on the checkout information page and see a validation message indicating that the postal code is required.

Actual Result:
User is unable to proceed to the next page and remains on the checkout information page. Appropriate validation messages are displayed reading : "postal code is required". 
Status: Pass


//-----------Test Case ID: TC_017-----------------------------------
Scenario: Verify cart retains multiple selected products

Test Steps:
1. Log in using valid credentials.
2. Add two different products to the cart.
3. Open the cart.
4. Navigate back to the Products page.
5. Open the cart again.

Expected Result: Both previously selected products should still be displayed in the cart.

Actual Result:
Both previously selected products are still visible on the cart page. 

Status: Pass


//-----------Test Case ID: TC_018-----------------------------------
Scenario: Verify order summary calculation

Test Steps:
1. Log in using valid credentials.
2. Add two products with different prices to the cart.
3. Proceed to checkout.
4. Enter valid customer information.
5. Click Continue.
6. Verify the item total and displayed order total.

Expected Result: Item total should equal the sum of the selected product prices. Any displayed tax and final total should be calculated correctly.

Actual Result:
The item total is found equal to the sum of the selected product prices. Any displayed tax and final total are calculated correctly. 

Status: Pass


//-----------Test Case ID: TC_019-----------------------------------
Scenario: Verify logout functionality

Test Steps:
1. Log in using valid credentials.
2. Open the navigation menu.
3. Click Logout.

Expected Result: User should be logged out and redirected to the login page.

Actual Result:
The user is successfully logged out and redirected to the login page. 

Status: Pass


//-----------Test Case ID: TC_020-----------------------------------
Scenario: Verify login after logout

Test Steps:
1. Log in using valid credentials.
2. Click Logout.
3. Enter valid credentials again.
4. Click Login.

Expected Result: User should be able to log in successfully again and access the Products page.

Actual Result:
The user is able to log in successfully again and gets access to the products page. 

Status: Pass

