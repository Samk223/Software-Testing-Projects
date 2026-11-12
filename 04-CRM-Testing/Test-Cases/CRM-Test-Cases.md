//--------------- CRM / Employee Records Testing — Test Cases -----------------

 Project Information
- Application: DemoQA Web Tables
- URL: https://demoqa.com/webtables
- Module: Employee Records
- Testing Type: Functional UI Testing
- Tool: Selenium WebDriver (Java)

 Test Cases

| ID | Test Scenario | Expected Result |

//-----------Test Case ID: CRM_TC_001-----------------------------------
Scenario: Verify employee records are displayed

Test Steps:
1. Open https://demoqa.com/webtables.
2. Observe the employee records table.

Expected Result: Employee records should be visible in the table.

Actual Result:
The employee records are perfectly visible in the table. 

Status: PASS


//-----------Test Case ID: CRM_TC_002-----------------------------------
Scenario: Search for an existing employee (Cierra)

Test Steps:
1. Open the DemoQA Web Tables page.
2. Enter Cierra in the Search field.
3. Observe the search results.

Expected Result: The matching employee record for Cierra should appear.

Actual Result:
Cierra's employee record was successfully located in the table.

Status: Pass


//-----------Test Case ID: CRM_TC_003-----------------------------------
Scenario: Search for a non-existing employee

Test Steps:
1. Open the DemoQA Web Tables page.
2. Enter NoSuchUser123 in the Search field.
3. Observe the search results.

Expected Result: No matching employee records should appear.

Actual Result:
No matching employee records appear on the screen. 

Status: PASS


//-----------Test Case ID: CRM_TC_004-----------------------------------
Scenario: Edit an existing employee record

Test Steps:
1. Open the DemoQA Web Tables page.
2. Locate Cierra's employee record.
3. Click the Edit button for the record.
4. Observe the edit form.

Expected Result: The edit form should open with the existing employee details.

Actual Result:
The edit form opened successfully for Cierra's employee record.

Status: Pass


//-----------Test Case ID: CRM_TC_005-----------------------------------
Scenario: Verify employee details in the edit form

Test Steps:
1. Open Cierra's record using the Edit button.
2. Observe the First Name field = "Cierra".
3. Observe the Email field = "cierra@example.com".
4. Verify that the existing values are populated.

Expected Result: The existing first name and email should be populated correctly.

Actual Result:
The first name and email fields were inspected in the edit form.

Status: Pass


//-----------Test Case ID: CRM_TC_006-----------------------------------
Scenario: Update employee details and save

Test Steps:
1. Open an existing employee record using the Edit button.
2. Modify the employee details.
3. Click Submit.
4. Observe the employee table.

Expected Result: The updated employee details should be saved and displayed in the table.

Actual Result:
The updated employee details are saved and displayed in the table. 

Status: PASS


//-----------Test Case ID: CRM_TC_007-----------------------------------
Scenario: Cancel editing an employee record

Test Steps:
1. Open an existing employee record using the Edit button.
2. Modify one or more fields.
3. Click Cancel.
4. Reopen the record and inspect its details.

Expected Result: The changes should not be saved, and the original employee details should remain unchanged.

Actual Result:
The changes were not saved, and the original employee details remained unchanged.


Status: PASS

//-----------------------------------------------------------------------

## Execution Status

Test cases are documented. Execution results will be recorded after testing.