**Fork this repository and we will review your code from the fork.**

**Must perform code and workable application walk through.**


Acceptance Criteria:
---------------------------------------------------------------------------
1. Create a single page web application with a login screen (username, password).
2. Demonstrate user login and authentication using Spring Security.
3. Upon login, present user with the ability to upload document(s).
4. Develop a REST service to receive the document(s) and store in a database with below structure:
   
   documentID
   
   documentName

   document
   
   uploadUser

   uploadDate
   
5. Display success message on web page.
6. Ability to navigate to another page and show document list using angular data table with filter and sort options.
7. Allow users to delete document(s).
   	

Tech Stack:
------------------------------------------------------------------------------
Java 8+
Spring Boot  
Angular 6+  
MongoDB


# assignment-angular-springboot

There are two projects in this repository 

#angular_springboot -- angular project

## Start angular_springboot project

Run `ng serve` Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.


#docs -- spring boot project
## Start Spring boot project

mvn spring-boot:run or run main file DocsApplication.java


### LoginScreen
![Alt text](loginscreen.png?raw=true "Login screen")

### Register Screen
![Alt text](registerscreen.png?raw=true "Regsiter screen")

### HomeScreen
![Alt text](HomeScreen.png?raw=true "Home screen")


### File upload screen
![Alt text](FIleUploadScreen.png?raw=true "FIle Upload screen")

### Document Screen
![Alt text](documentscreen.png?raw=true "Document screen")


### DB Details
![Alt text](mongorepository.png?raw=true "Mongo DB repo screen")

### File storage collection
![Alt text](filestoragecollection.png?raw=true "File Storage screen")
