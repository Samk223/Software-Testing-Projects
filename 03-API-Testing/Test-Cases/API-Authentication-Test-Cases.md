//-------------------- API Authentication Testing — Test Cases -----------------

 Project Details
- **Application:** DummyJSON API
- **Base URL:** https://dummyjson.com
- **Tool:** Postman
- **Module:** Authentication
- **Test Type:** Positive and Negative API Testing

//------------------------ Test Cases ----------------------------------
| ID | Test Scenario | Request | Expected Result | Actual Result | Status |

//-----------Test Case ID: API_TC_001-----------------------------------
Scenario: Login with valid credentials

Test Steps:
1. Open Postman.
2. Select POST method.
3. Enter URL: https://dummyjson.com/auth/login.
4. Select Body → raw → JSON.
5. Enter username: emilys and password: emilyspass.
6. Click Send.

Expected Result: API should return 200 OK with an access token and user details.

Actual Result:
API returned 200 OK, and the access token and user details were successfully received.

Status: Pass


//-----------Test Case ID: API_TC_002-----------------------------------
Scenario: Verify login response fields

Test Steps:
1. Send a POST request to /auth/login using valid credentials.
2. Observe the response body.
3. Verify that the accessToken field is present.
4. Verify that the user ID and username are returned.

Expected Result: Response should contain a non-empty access token and the expected user details.

Actual Result:
Access token, user ID, and username were successfully returned in the response.

Status: Pass


//-----------Test Case ID: API_TC_003-----------------------------------
Scenario: Access current user with a valid token

Test Steps:
1. Log in using valid credentials.
2. Save the returned access token.
3. Create a GET request to https://dummyjson.com/auth/me.
4. Select Authorization → Bearer Token.
5. Enter the saved access token.
6. Click Send.

Expected Result: API should return 200 OK with the authenticated user's details.

Actual Result:
API returned 200 OK, and Emily's user details were successfully received.

Status: Pass


//-----------Test Case ID: API_TC_004-----------------------------------
Scenario: Access current user without a token

Test Steps:
1. Create a GET request to https://dummyjson.com/auth/me.
2. Select Authorization → No Auth.
3. Ensure no authentication cookie or Authorization header is sent.
4. Click Send.

Expected Result: API should return 401 Unauthorized because no authentication token is provided.

Actual Result:
API returned 401 Unauthorized after removing the automatically stored access-token cookie.

Status: Pass


//-----------Test Case ID: API_TC_005-----------------------------------
Scenario: Access current user with an invalid token

Test Steps:
1. Create a GET request to https://dummyjson.com/auth/me.
2. Select Authorization → Bearer Token.
3. Enter an invalid token: invalid_token_12345.
4. Click Send.

Expected Result: API should return 401 Unauthorized because the provided token is invalid.

Actual Result:
API returned 401 Unauthorized when an invalid token was provided.

Status: Pass

//------------------------------------------------------------------------

 Automation Assertions
- Login status code is 200.
- Access token is returned and is a non-empty string.
- Login response contains expected user details.
- Authenticated user is Emily.
- User ID is returned.
- Missing token returns 401.
- Invalid token returns 401.

 Test Execution Summary
- Total test scenarios: 5
- Passed: 5
- Failed: 0
- Blocked: 0

**Overall Result:** PASS

## Notes
- Tests executed using Postman.
- Automated assertions were added using Post-response scripts.
- Access token was stored as a collection variable.
- The automatically stored access-token cookie was removed to isolate the missing-token test.
- Collection exported in Postman Collection Format v2.1.
