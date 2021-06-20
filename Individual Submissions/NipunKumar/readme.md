 # Passgen-java Cli Tool
 
 ### This is a simple cli tool which generates random password of default length 8
 
 ### Prerequisite
      
      In your system must install java-jdk 8.0 and proper setup of JAVA_HOME environment
 
 ### How To Use
 
   for using the tool you need to download
   [nipunpassgen.jar](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/Nipun%20Kumar/nipunpassgen.jar)
   
      or simply clone the repository and go to individual Submission/Nipun Kumar
      
    In the directory where you have nipunpassgen.jar open terminal and simply run this command
        java -jar nipunpassgen.jar  this will return a default 8 digit password using lower and uppercase char only.
  ![noflag](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/Nipun%20Kumar/snippets/noFlag.png)
  
 ### Length of Password 
 
    you can set the length of password by adding length flag like this java -jar nipunpassgen.jar -10.
    here 10 digit password will generated
![length](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/Nipun%20Kumar/snippets/length.png)

### Specifiy which type of charachter you want to use
    
      You can specify which type of charchter or digit you want to use for generating the password like this.
      
      java -jar nipunpassgen.jar -10 -ttff.(here t idicates true and f idicates false)
      
      as you can see we use a 2nd flag using some ttff--> 
        The 1st t indicates --> Using the lower case is true
        The 2nd t indicates --> Using the upper case is true
        The 3rd f indicates --> Using the Digit is false
        The 4th f indicates --> Using the Special char is false
        
      so as you can see this in generating the password we can specify the Type of charachter usage
      
![charuse](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/Nipun%20Kumar/snippets/charuse.png)
      
### Sample code for getting the output of 15 digit only number password
      
      java -jar nipunpassgen.jar -15 -fftf
![onlydigit](https://github.com/nipun2003/passgen-java/blob/master/Individual%20Submissions/Nipun%20Kumar/snippets/onlydigit.png)
      
