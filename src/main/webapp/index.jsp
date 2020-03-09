<!DOCTYPE html>
<html>

<body>

<form action="addRecord" method="post">
RollNumber: <input type="text" name="rollNumber"><br>
Name:<input type="text" name="name"><br>
UniversityName: <input type="text" name="universityName"><br>
<input type="submit">
</form>
<br><br>
<form action="searchRecord" method="get">
Enter RollNumber: <input type="text" name="rollNumber"><br>
<input type="submit">
</form>
<br><br>
<form action="SearchRecord" method="get">
<input type="submit" value="getRecord">
</form>

</body>
</html>
