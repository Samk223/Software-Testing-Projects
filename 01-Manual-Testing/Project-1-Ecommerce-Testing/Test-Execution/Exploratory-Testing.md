
// -------------Exploratory Testing – E-commerce Website-------------

Application: SauceDemo
Module: Shopping Cart and Authentication

//-----------Exploratory Test ID: ET_001----------------------------

Scenario: Verify cart persistence after logout and login.

Test Steps:
1. Log in using valid credentials.
2. Add two different products to the cart.
3. Note the cart item count.
4. Open the navigation menu.
5. Click Logout.
6. Log in again using the same credentials.
7. Observe the cart icon.
8. Open the cart and inspect its contents.

Expected Result:
To be determined based on the application's
cart persistence requirements.

Actual Result:
Both previously added products remain in the
cart after logout and logging in again.

Observation:
The cart contents persist across the logout
and login journey.

Defect Identified: No

Status: Observed – Further requirement verification needed


//-----------Exploratory Test ID: ET_002----------------------------

Scenario: Verify application behaviour after repeated Add to cart clicks.

Test Steps:
1. Log in using valid credentials.
2. Select one product.
3. Click Add to cart multiple times.
4. Observe the button label and cart count.
5. Open the cart and inspect the product entries.

Expected Result:
The application should handle repeated clicks consistently
without creating unintended duplicate cart entries.

Actual Result:
Application handles the repeated clicks consistently without creating unintended duplicate cart entries.It is handled by adding a remove button after every add-to-cart button clicked.
Amount is displayed correctly in the cart icon shown on the top left of the Products page. It Correctly increments and decrements the cart count on the basis of the Add to Cart and Remove buttons clicked consistently.   

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_003----------------------------

Scenario: Verify cart contents after browser refresh.

Test Steps:
1. Log in using valid credentials.
2. Add two different products to the cart.
3. Open the shopping cart.
4. Refresh the browser.
5. Inspect the cart count and product entries.

Expected Result:
The application should handle browser refresh without
unexpected or inconsistent cart contents.

Actual Result:
The application handles the browser refresh consistently, and the cart contents are displayed appropriately. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_004----------------------------

Scenario: Verify cart consistency during repeated navigation.

Test Steps:
1. Log in using valid credentials.
2. Add multiple products to the cart.
3. Open the shopping cart.
4. Click Continue Shopping.
5. Return to the cart.
6. Repeat the navigation several times.
7. Compare the cart count and product entries.

Expected Result:
Cart count and product details should remain consistent
during navigation between the Products and Cart pages.

Actual Result:
The cart count and the product details remain consistent during navigation between the two pages: products and the cart. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_005----------------------------

Scenario: Verify checkout behaviour using the browser Back button.

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Open the cart and click Checkout.
4. Enter valid customer information.
5. Click Continue to reach the order overview.
6. Press the browser Back button.
7. Inspect the checkout form and cart details.

Expected Result:
The application should handle backward navigation
without inconsistent checkout information or cart data.

Actual Result:
The application handles the backward navigation properly without inconsistent checkout information or card data. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_006----------------------------

Scenario: Verify checkout behaviour after browser refresh.

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Proceed to the checkout information page.
4. Enter valid customer information.
5. Continue to the order overview page.
6. Refresh the browser.
7. Observe the displayed page and order state.

Expected Result:
The application should handle page refresh without
unexpected navigation, data loss or inconsistent order state.

Actual Result:
The application handles the page refresh perfectly without unexpected navigation, data loss, or inconsistent order state. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_007----------------------------

Scenario: Verify application behaviour after repeated Finish clicks.

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Proceed through checkout to the order overview.
4. Click Finish.
5. Attempt repeated clicks if the button remains available.
6. Inspect the confirmation page and resulting order state.

Expected Result:
A single checkout action should complete the order
without creating unintended duplicate transactions.

Actual Result:
The situation is handled perfectly by redirecting The user to the checkout complete page after clicking the finish button.

Defect Identified: No
Status: Pass


//-----------Exploratory Test ID: ET_008----------------------------

Scenario: Verify checkout form handling of special characters and long inputs.

Test Steps:
1. Log in using valid credentials.
2. Add a product to the cart.
3. Proceed to the checkout information page.
4. Enter special characters in the first and last name fields.
5. Enter a long string in the customer information fields.
6. Enter a valid postal code.
7. Click Continue.
8. Observe validation messages and application behaviour.

Expected Result:
The application should handle unusual and lengthy input
consistently without unexpected errors or broken UI.

Actual Result:
The Application Handles the unusual and lengthy input consistently without unexpected errors or broken UI. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_009----------------------------

Scenario: Verify order summary calculation with multiple products.

Test Steps:
1. Log in using valid credentials.
2. Add two or more products with different prices.
3. Open the cart and note the product prices.
4. Proceed to checkout.
5. Enter valid customer information.
6. Continue to the order overview.
7. Independently calculate the item subtotal.
8. Compare the subtotal, tax and final total with the displayed values.

Expected Result:
The item subtotal should equal the sum of the selected
product prices. Tax and final total should be calculated
consistently with the application's pricing rules.

Actual Result:
The item subtotal matches the sum of the selected product prices. And the final total is calculated consistently with the application's pricing rules. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_010----------------------------

Scenario: Verify sorting selection after navigating between pages.

Test Steps:
1. Log in using valid credentials.
2. Select a product sorting option.
3. Open the shopping cart.
4. Click Continue Shopping.
5. Observe the sorting dropdown and product order.

Expected Result:
Sorting selection and product ordering should behave
consistently with the application's navigation design.

Actual Result:
Sorting, selection, and product ordering behave consistently with the application's navigation design. For the Swag Labs application, The sorting reverts back to its default sorting algorithm when the user comes back to the products page.  

Observation:
According to my observation, the products page should contain the same sorting order the user applied instead of reverting back to the default order when they return to the products page after navigating through the cart page 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_011----------------------------

Scenario: Verify responsive UI behaviour across different screen sizes.

Test Steps:
1. Open SauceDemo in Google Chrome.
2. Inspect the application at desktop resolution.
3. Resize the browser to tablet resolution.
4. Resize the browser to mobile resolution.
5. Inspect product cards, navigation menu, cart and buttons.
6. Check for overlapping or inaccessible elements.

Expected Result:
Important application controls should remain accessible
without unintended overlapping, clipping or layout issues.

Actual Result:
Important application controls remain accessible without unintended overlapping, clipping, or layout issues. 

Defect Identified: No

Status: Pass


//-----------Exploratory Test ID: ET_012----------------------------

Scenario: Verify cart consistency across multiple browser tabs.

Test Steps:
1. Open SauceDemo in two separate browser tabs.
2. Log in using the same credentials in both tabs.
3. Add a product to the cart in the first tab.
4. Switch to the second tab.
5. Inspect the cart count and contents.
6. Modify the cart in the second tab.
7. Return to the first tab and inspect the cart again.

Expected Result:
Cart state should behave consistently with the application's
session and synchronization design.

Actual Result:
The cart state behaves consistently with the application's session and synchronization design. When the user increments or decrements a particular product in one tab and tries to view the effect on another tab, they have to refresh the tab for the contents to update. 

Observation:
According to my observation, the update should happen dynamically instead of letting the user refresh the current page. If the cart is modified on one of the pages, the other page should automatically update its value rather than having the user refresh the particular page to view the updated content. 

Defect Identified: No

Status: Pass

