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

**JDK 8 - Java Development Kit - version 8**
**Gradle 4.8.1**

<h4>Technical: Top Level Architecture</h4>
<table>
    <tr><td><h5>model classes:</h5></td></tr>
    <tr><td><h6>com.mario.model.Position.java :</h6>
        Holds the position of mario (value, altitute, index)</td></tr>
    <tr><td><h6>com.mario.model.Path.java:</h6> Holds the list of all positions in a particular altitude</td>/<tr>
</table>

<table>
    <tr><td><h5>repository classes:</h5></td></tr>
    <tr><td><h6>com.mario.respositories.MarioNavitionNavigationRepository.java:</h6> Returns the collection of objects of Position</td></tr>
</table>       

<table>
    <tr><td><h5>service classes:</h5></td></tr>
    <tr><td>These service classes are used to fetch the data from file into collection of List</td></tr>
    <tr><td><h6>com.mario.service.impl.FileServiceImpl.java:</h6> Used to read input file as a stream/reader</td></tr>
    <tr><td><h6>com.mario.service.impl.PathServiceImpl.java:</h6> Used to Converts the steam/reader to ArrayList</td></tr>
</table>

<table>
    <tr><td><h5>business logic classes:</h5></td></tr>
    <tr><td>These classes perform business logic</td></tr>
    <tr><td><h6>com.mario.navigation.MarioNavigationPath.java:</h6> Performs final business logic to calculate Mario navigation path</td></tr>
</table>

<table>
    <tr><td><h5>utility classes:</h4></td></tr>
    <tr><td><h6>com.mario.util.MarioNavigationUtil.java:</h6> Has static utility method that takes the filename as string and returns the navigation path as string</td></tr>
 </table>

<table>
    <tr><td><h5>application classes:</h4></td></tr>
    <tr><td><h6>com.mario.app.MarioNavigationApp.java:</h6> Entry point to the application that takes the filename as string and returns the final result</td></tr>
    </table>
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

Use below command to download project zip file

<h4>git clone https://github.com/ravikanthtadikonda1979/supermarioproj.git</h4>

Since I am using gradle wrapper just use below commands to run the current
application.

./gradlew runApplication

<h4> How to run unit test cases</h4>

./gradlew test

Code coverage is tested using Intellij jacoco plugin.





