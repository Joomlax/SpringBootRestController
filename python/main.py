import requests
url = "http://www.localhost:8080/api/v1/student"

class makeRequest:
    def __init__(self,name,email,dob):
        self.name = name
        self.email = email
        self.dob = dob
    def setName(self,name):
        self.name = name
    def setEmail(self,email):
        self.email = email
    def setDob(self,dob):
        self.dob = dob
    def postReq(self):
        newObj = {
            "name": self.name,
            "email": self.email,
            "dob": self.dob
        }
        pReq = requests.post(url,json=newObj)
        print(pReq.text)

mr = makeRequest("aa", "bb", "cc")

tmpName = input("Please enter the name: ")
mr.setName(tmpName)

tmpEmail = input("Please enter the email: ")
mr.setName(tmpEmail)

tmpDob = input("Please enter the date of birth(yyyy-mm-dd): ")
mr.setName(tmpDob)

mr.postReq()



