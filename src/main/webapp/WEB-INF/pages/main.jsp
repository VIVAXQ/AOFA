<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<html>
<head>
    <title>C PAGE</title>

    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 5px;
            overflow: hidden;
            word-break: normal;
            border-color: ghostwhite;
            color: #333;
            background-color: azure;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 5px;
            overflow: hidden;
            word-break: normal;
            border-color: ghostwhite;
            color: #333;
            background-color: seashell;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>



<a href="../../index.jsp">Back to main menu</a>

<br/>
<br/>

<h1>C List</h1>

<c:if test="${!empty lisT}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Name</th>
            <th width="120">Date</th>
            <th width="120">Type</th>
            <th width="120">Sum</th>
            <th width="120">Place</th>
            <th width="120">ch</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${lisT}" var="tab">
            <tr>
                <td>${tab.id}</td>
                <td>${tab.name}</td>
                <td>${tab.date}</td>
                <td>${tab.type}</td>
                <td>${tab.sum}</td>
                <td>${tab.place}</td>
                <td>${tab.ch}</td>
                <td><a href="<c:url value='/edit/${tab.id}'/>">Correct</a></td>
                <td><a href="<c:url value='/remove/${tab.id}'/>">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>


<h1>Add C</h1>

<c:url var="addAction" value="/main/add"/>
<c:url var="addAction" value="/main/add"/>

<form:form action="${addAction}" commandName="tab">
    <table>
        <c:choose>
            <c:when test="${!empty tab.name}">
                <tr>
                    <td>
                        <form:label path="id">
                            <spring:message text="ID"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="id"  size="8" disabled="true"/>
                        <form:hidden path="id"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="name" >
                            <spring:message text="name"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="name"  size="8"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="date">
                            <spring:message text="date"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="date"  size="8"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="type">
                            <spring:message text="type"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="type"  size="8"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="sum">
                            <spring:message text="sum"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="sum"  size="8"/>
                        <form:hidden path="sum"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="place">
                            <spring:message text="place"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="place"  size="8"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="ch">
                            <spring:message text="ch"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="ch"  />
                        <select name="ch">
                            <option>0</option>
                            <option>1</option>
                        </select>
                    </td>
                </tr>
            </c:when>



            <c:otherwise>



                <tr>
                    <td>
                        <form:label path="name">
                            <spring:message text="name"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="name"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="date">
                            <spring:message text="Date"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="date"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="type">
                            <spring:message text="Type"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="type"/>
                    </td>
                </tr>

                <tr>
                    <td>
                        <form:label path="sum">
                            <spring:message text="Sum"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="sum"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="place">
                            <spring:message text="Place"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="place"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="ch">
                            <spring:message text="Ch"/>
                        </form:label>
                    </td>
                    <td>
                        <select name="ch">
                            <option>0</option>
                            <option>1</option>
                        </select>
                    </td>
                </tr>

            </c:otherwise>
        </c:choose>>




        <tr>
            <td colspan="2">
                <c:if test="${!empty tab.name}">
                    <input type="submit"
                           value="<spring:message text="Edit"/>"/>
                </c:if>
                <c:if test="${empty tab.name}">
                    <input type="submit"
                           value="<spring:message text="Add"/>"/>
                </c:if>
            </td>
        </tr>
    </table>
</form:form>


</body>
</html>
