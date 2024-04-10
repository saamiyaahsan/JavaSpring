 ## Things to be noted that the path for the project is home/coder/project  ## Very Important

## All the files come under this path initial path only :-  home/coder/project only  ##Very Important (keep it in mind)

## Entire Terminal Analysis of the project
coder@12ed35519315:~/project$ mvn clean install exec:java -Dexec.mainClass="com.iiht.training.elibrary.controller.BookInventoryController"
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.iiht.training.elibrary:elibrary-app >---------------
[INFO] Building elibrary-app 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ elibrary-app ---
[INFO] Deleting /home/coder/project/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ elibrary-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/coder/project/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ elibrary-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 7 source files to /home/coder/project/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[4,44] cannot find symbol
  symbol:   class BookNotFoundException
  location: package com.iiht.training.elibrary.exception
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[6,42] package com.iiht.training.elibrary.service does not exist
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[7,42] package com.iiht.training.elibrary.service does not exist
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[12,20] cannot find symbol
  symbol:   class BookInventoryService
  location: class com.iiht.training.elibrary.controller.BookInventoryController
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[12,68] cannot find symbol
  symbol:   class BookInventoryServiceImpl
  location: class com.iiht.training.elibrary.controller.BookInventoryController
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[52,16] no suitable constructor found for Book(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)
    constructor com.iiht.training.elibrary.model.Book.Book() is not applicable
      (actual and formal argument lists differ in length)
    constructor com.iiht.training.elibrary.model.Book.Book(java.lang.Integer,java.lang.String,java.lang.String,java.lang.Boolean,java.lang.String,java.lang.String) is not applicable
      (actual and formal argument lists differ in length)
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.913 s
[INFO] Finished at: 2024-04-10T11:19:35Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project elibrary-app: Compilation failure: Compilation failure: 
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[4,44] cannot find symbol
[ERROR]   symbol:   class BookNotFoundException
[ERROR]   location: package com.iiht.training.elibrary.exception
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[6,42] package com.iiht.training.elibrary.service does not exist
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[7,42] package com.iiht.training.elibrary.service does not exist
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[12,20] cannot find symbol
[ERROR]   symbol:   class BookInventoryService
[ERROR]   location: class com.iiht.training.elibrary.controller.BookInventoryController
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[12,68] cannot find symbol
[ERROR]   symbol:   class BookInventoryServiceImpl
[ERROR]   location: class com.iiht.training.elibrary.controller.BookInventoryController
[ERROR] /home/coder/project/src/main/java/com/iiht/training/elibrary/controller/BookInventoryController.java:[52,16] no suitable constructor found for Book(java.lang.String,java.lang.String,java.lang.String,java.lang.String,double)
[ERROR]     constructor com.iiht.training.elibrary.model.Book.Book() is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR]     constructor com.iiht.training.elibrary.model.Book.Book(java.lang.Integer,java.lang.String,java.lang.String,java.lang.Boolean,java.lang.String,java.lang.String) is not applicable
[ERROR]       (actual and formal argument lists differ in length)
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
coder@12ed35519315:~/project$ mvn clean install exec:java -Dexec.mainClass="com.iiht.training.elibrary.controller.BookInventoryController"
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.iiht.training.elibrary:elibrary-app >---------------
[INFO] Building elibrary-app 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ elibrary-app ---
[INFO] Deleting /home/coder/project/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ elibrary-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/coder/project/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ elibrary-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 7 source files to /home/coder/project/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ elibrary-app ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/coder/project/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ elibrary-app ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 9 source files to /home/coder/project/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.2:test (default-test) @ elibrary-app ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.iiht.training.elibrary.boundary.BoundaryTest

=>Test For : Book Issue Date Is Past Or Present  : PASSED

=>Test For : Book Issue Isbn Already Exists  : FAILED

=>Test For : Book Isbn Is Unique  : FAILED

=>Test For : Book Stream Is Fixed  : PASSED

TEST CASES EVALUATED : 4
PASSED : 2
FAILED : 2
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 12.041 s - in com.iiht.training.elibrary.boundary.BoundaryTest
[INFO] Running com.iiht.training.elibrary.functional.BookIssueUnitTest

=>Test For : Get All Issue Books  : PASSED

=>Test For : Issue Book  : FAILED

TEST CASES EVALUATED : 6
PASSED : 3
FAILED : 3
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.438 s - in com.iiht.training.elibrary.functional.BookIssueUnitTest
[INFO] Running com.iiht.training.elibrary.functional.BookUnitTest

=>Test For : Save Book  : FAILED

=>Test For : Get All Books  : PASSED

TEST CASES EVALUATED : 8
PASSED : 4
FAILED : 4
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.735 s - in com.iiht.training.elibrary.functional.BookUnitTest
[INFO] Running com.iiht.training.elibrary.exception.BookExceptionTest

=>Test For : Book Isbn Already Exists  : FAILED

TEST CASES EVALUATED : 9
PASSED : 4
FAILED : 5
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.867 s - in com.iiht.training.elibrary.exception.BookExceptionTest
[INFO] Running com.iiht.training.elibrary.exception.BookIssueExceptionTest

=>Test For : Book Issue Book Already Issued Exception  : FAILED

=>Test For : Book Issue I S B N Does Not Exists Exception  : FAILED

TEST CASES EVALUATED : 11
PASSED : 4
FAILED : 7
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 5.7 s - in com.iiht.training.elibrary.exception.BookIssueExceptionTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 11, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ elibrary-app ---
[INFO] Building jar: /home/coder/project/target/elibrary-app-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ elibrary-app ---
[INFO] Installing /home/coder/project/target/elibrary-app-0.0.1-SNAPSHOT.jar to /home/coder/.m2/repository/com/iiht/training/elibrary/elibrary-app/0.0.1-SNAPSHOT/elibrary-app-0.0.1-SNAPSHOT.jar
[INFO] Installing /home/coder/project/pom.xml to /home/coder/.m2/repository/com/iiht/training/elibrary/elibrary-app/0.0.1-SNAPSHOT/elibrary-app-0.0.1-SNAPSHOT.pom
[INFO] 
[INFO] --- exec-maven-plugin:3.2.0:java (default-cli) @ elibrary-app ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.046 s
[INFO] Finished at: 2024-04-10T11:21:47Z
[INFO] ------------------------------------------------------------------------
coder@12ed35519315:~/project$ 

## TABLE OF CONTENTS
1	Project Abstract	3
2	Common Constraints	3
3	Template Code Structure	3
3.1	Package: com.iiht.training.elibrary.model	3
3.2	Package: com.iiht.training.elibrary.inventory	3
3.3	Package: com.iiht.training.elibrary.exception	4
3.4	Package: com.iiht.training.elibrary.controller	5
4	Execution Steps to Follow	6

## 	PROJECT ABSTRACT
E-Library Console Application is a pure java application with Java collection, where it allows to manage the books and issue the books from the library.

## COMMON CONSTRAINTS
1.	Take console input of number of books: (n)
2.	Take input of details of each book and store it in a collection.
3.	Take input of details of books to be issued (only 1 book at a time)
4.	Take input of details of book to issue and store in a collection
5.	Show the books stock remained after issuing books

### Resources for consideration to solve the problem.
        3.2	PACKAGE: COM.IIHT.TRAINING.ELIBRARY.INVENTORY  (ignore uppercases)
BookInventory(class) :	This class contains all the methods which are used to write the business logic for the application.You can create any number of private methods in the class	Status : Partially implemented.

        3.4 PACKAGE: COM.IIHT.TRAINING.ELIBRARY.CONTROLLER  (ignore uppercases)
BookInventoryController(Class) : This is the class which has the main method. All the business logic methods of the BookInventory class will be called from this class.
Status : To be implemented

### EXECUTION STEPS TO FOLLOW 
1. All actions like build, compile, running application, running test cases will be through Command Terminal.
2. To open the command terminal the test takers need to go to the Application menu (Three horizontal lines at left top) -> Terminal -> New Terminal.
3. This editor Auto Saves the code.
4. If you want to exit(logout) and continue the coding later anytime (using Save & Exit option on Assessment Landing Page) then you need to use CTRL+Shift+B-command compulsorily on code IDE. This will push or save the updated contents in the internal git/repository. Else the code will not be available in the next login.
5. These are time bound assessments the timer would stop if you logout and while logging in back using the same credentials the timer would resume from the same time it was stopped from the previous logout.
6. To run your project use command: mvn clean install exec:java - Dexec.mainClass="com.iiht.training.elibrary.controller.BookInventoryController"
7. To test your project, use the command mvn test
8. You need to use CTRL+Shift+B - command compulsorily on code IDE, before final submission as well. This will push or save the updated contents in the internal git/repository, and will be used to evaluate the code quality

## Things to do:-
1) Make changes in the BookInventoryController.java file
2) Make changes in the BookInventory.java file 
3) While trying to retain the original structure of both the files as maximum as possible


## Expected outcome:- 
1) All the failed 7 test cases should pass
