# not_have_72ms

**Set Up Project** 

   **1. clone the repository.**
   
      git clone -b master https://github.com/priyamanand77/not_have_72ms.git

   **2. Go to the folder**
         
      cd not_have_72ms

   **3. install the project.**
   
      mvn clean install

    
**3. Run the Project** 
1. i have created 2 ways to run 
   1. I have created a spring boot project and exposed 1 end point to solve the task
      1. run the spring boot project using mvn command 
      
              mvn clean spring-boot:run
         
      2. run the project using java
      
               java -jar <path_of_jar>
      3. Hit the postman endpoint
   2. I have used a main method to run the project as simple java project
      1. go to src/main/java/com/word/count/main
      2. run the application as normal java application
      3. you can see the output in console as well as new output.txt file would be generated in the same package
