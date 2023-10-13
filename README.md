
# Hi, I'm Mutasem! 👋


# ProgressSoft task



## FX Deal Data Warehouse
Suppose you are part of a scrum team developing data warehouse for Bloomberg to analyze FX deals. One of customer stories is to accept deals details from and persist them into DB.
## Request logic as following:
1) Request Fields(Deal Unique Id, From Currency ISO Code "Ordering Currency", To Currency ISO Code, Deal timestamp, Deal Amount in ordering currency).

2) Validate row structure.(e.g: Missing fields, Type format..etc. We do not expect you to cover all possible cases but we'll look to how you'll implement validations)

3) System should not import same request twice.

4) No rollback allowed, what every rows imported should be saved in DB.
## Database
go to src\main\resources\application.properties

then change the username and password to your own

create a database then put your database name

jdbc:mysql://localhost:3306/[databaseName]?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
## How to run
* mvn clean install to clean if exists files and install packages
* mvn spring-boot: run to start spring boot
## How to use
* after run a project, open a Posatman:

    1) select POST method
    2) put this url in box: http://localhost:8080/api/insertDeal
    3) insert data in Body section


* Request
    ```sh
    {
                
    "fromCurrency":"USD",
    "toCurrency":"CAD",
    "dealAmount": 423
    }
 ```