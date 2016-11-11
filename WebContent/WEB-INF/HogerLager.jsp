<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hoger of lager</title>
</head>
<body>
Welk getal gok je?
<form method="post">
<input type="text" name="gok">
<br>
<input type=submit value=Verzend!>
hint: <%= request.getAttribute("hint") %>
<br>
Je hebt er <%= request.getAttribute("count") %> keer over gedaan.
</form>

</body>
</html>