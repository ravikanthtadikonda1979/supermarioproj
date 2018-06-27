<h2>Super Mario Navigation Path</h2>
<h4>Project Description</h4>

Once upon a time, the Mushroom kingdom was invaded by Koopa,the king of turtles. 
Mario, a loyal person to the Kingdom sets out on an adventurous mission to get 
independence. He needs to traverse through the kingdom and fight obstacles to 
ultimately face Koopa. Write a program to guide Mario with a simple navigation 
path. Code and document for the Super Mario that traverse through the kingdom 
and fight obstacles to ultimately face Koopa.

<h4>Goals</h4>

Write a program to guide Mario with a simple navigation path.
build: functional project


<h4>Required software components:</h4>

**JDK 8 - Java Development Kit - version 8**\
**Gradle 4.8.1** 

<h4>Technical: Top Level Architecture</h4>

<h5>_model classes:_</h5>
    **com.mario.model.Position.java :**\
        Holds the position of mario (value, altitute, index).
    **com.mario.model.Path.java:**\
        Holds the list of all positions in a particular altitude.
    
<h5>_repository classes:_</h5>
    **com.mario.respositories.MarioNavitionNavigationRepository.java**\
        Returns the collection of objects of Position
       
<h5>_service classes:_</h5>
These service classes are used to fetch the data from file into collection of List
   **com.mario.service.impl.FileServiceImpl.java**\
        Used to read input file as a stream/reader
    **com.mario.service.impl.PathServiceImpl.java**\
        Used to Converts the steam/reader to ArrayList

<h5>_business logic classes:_</h5>
       These classes perform business logic.\
    **com.mario.navigation.MarioNavigationPath.java**\
        performs final business logic to calculate Mario navigation path

<h5>_utility classes:_</h4>
    **com.mario.util.MarioNavigationUtil.java**\
        has static utility method that takes the filename as string and returns
        the navigation path as string
        
<h5>_application classes:_</h4>
    **com.mario.app.MarioNavigationApp.java**\
        entry point to the application that takes the filename as string and returns the
        final result
<br><br>



<h4>Test Cases:Unit Testing</h4>
<table>
<tr><td><h6>Files used in testing</h6></td></tr>
<tr><td>com.mario.service.FileServiceImplTest.java</td></tr>
<tr><td>com.mario.service.PathServiceImplTest.java</td></tr>
<tr><td>com.mario.repositories.MarioNavigationRepositoryTest.java</td></tr>
<tr><td>com.mario.navigation.MarioNavitionPathTest.java</td></tr>
<tr><td>com.mario.util.MarioNavigationPathUtilTest.java</td></tr>
<tr><td>com.mario.app.MarioNavigationPathAppTest.java</td></tr>
</table>


<h4> How to run this application</h4>
since I am using gradle wrapper just use below commands to run the current
application.

./gradlew runApplication

<h4> How to run unit test cases</h4>

./gradlew test

Code coverage is tested using Intellij jacoco plugin.
