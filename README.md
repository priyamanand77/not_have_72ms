# not_have_72ms

**Set Up Project** 

   **1. clone the repository.**
   
      git clone -b master https://github.com/priyamanand77/not_have_72ms.git

   **2. install the project.**
   
      mvn clean install
![img_1.png](img_1.png)
![img_2.png](img_2.png)
    
**3. Run the Project** 
1. i have created 2 ways to run 
   1. I have created a spring boot project and exposed 1 end point to solve the task
      1. run the spring boot project using mvn command 
      
              mvn clean spring-boot:run
      ![img_3.png](img_3.png)
         
      2. run the project using java 
         
               java -jar <path_of_jar>
      ![img_4.png](img_4.png)
      3. Hit the postman endpoint 
      ![img_5.png](img_5.png)
   2. I have used a main method to run the project as simple java project
      1. go to src/main/java/com/word/count/main
      2. run the application as normal java application
      3. you can see the output in console as well as new output.txt file would be generated in the same package 
      4. ![img_6.png](img_6.png)
      5. ![img_7.png](img_7.png)