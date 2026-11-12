//------------------ API Authentication Testing — Execution Report -------------

 1. Project Information
- **Project:** DummyJSON API Authentication Testing
- **Application:** https://dummyjson.com
- **Tool:** Postman
- **Test Module:** Authentication
- **Execution Type:** Manual API execution with automated assertions

 2. Execution Summary

| Metric              | Result |

| Total test scenarios | 5 |
| Passed               | 5 |
| Failed               | 0 |
| Blocked              | 0 |
| Pass percentage      | 100% |

 3. Execution Details

| Test ID | Scenario | HTTP Status | Result |

| API_TC_001 | Login with valid credentials           | 200 | PASS |
| API_TC_002 | Verify login response fields           | 200 | PASS |
| API_TC_003 | Access current user with valid token   | 200 | PASS |
| API_TC_004 | Access current user without token      | 401 | PASS |
| API_TC_005 | Access current user with invalid token | 401 | PASS |

 4. Automated Test Results

- Login request: 3 assertions passed.
- Valid-token request: 3 assertions passed.
- Missing-token request: 1 assertion passed.
- Invalid-token request: 1 assertion passed.

**Total automated assertions: 8 passed.**

 5. Defects Observed

No confirmed application defects were identified during this test execution.

During testing, an automatically stored access-token cookie caused the missing-token request to return 200. The cookie was removed, and the test was repeated successfully with a 401 response.

 6. Conclusion

All five authentication test scenarios passed.

The API successfully handled valid authentication, missing-token requests, and invalid-token requests during this test execution.

 7. Evidence

Screenshots of Postman request responses and automated test results are stored in the Evidence folder.
