<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>New User Registration Form</h1>
<form:form action="/register" modelAttribute="User">
Name:<form:input path="name"/><p></p>
Password:<form:password path="password"/><p></p>
Email:<form:email path="email"/><p></p>
Address:<form:input path="address"/><p></p>
Mobile_no:<form:input path="mno"/><p></p>
City:<form:input path="city"/><p></p>
state:<form:input path="state"/><p></p>
<input type="submit" value="submit">

</form:form>