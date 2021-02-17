# passing-challenge

## Service APIs:

API 1: http://localhost:8080/api/service/all-challenge
API Description: Return all the questions associated with all the challenges

API 2: http://localhost:8080/api/service/passing-status?challengeId=Challenge1
API Description: Returns true since Challenge1 is passing

API 3: http://localhost:8080/api/service/passing-status?challengeId=Challenge2
API Description: Returns false since Challenge2 is not passing

API 4: http://localhost:8080/api/service/challenge?challengeId=Challenge1
API Description: Return all the questions associated with Challenge1

API 5: http://localhost:8080/api/service/challenge?challengeId=Challenge2
API Description: Return all the questions associated with Challenge2


## Test Cases:
Test Case 1: This will test the null value and return null
Method: shouldReturnNullWhenNullPassingChallengeListIsPassed
	
Test Case 2: This will test empty list and return null
Method: shouldReturnNullWhenEmptyPassingChallengeListIsPassed

Test Case 3: This will test the not passing case and return false
Method: shouldReturnFalseWhenPassingChallengeListFailingCollectionIsPassed

Test Case 4: This will test the passing case and return true
Method: shouldReturnTrueWhenEmptyPassingChallengeListPassingCollectionIsPassed
