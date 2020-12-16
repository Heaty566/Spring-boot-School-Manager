<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
      crossorigin="anonymous"
    />
    <title>Document</title>
    <style>
      .error {
        color: red;
        text-transform: capitalize;
      }
    </style>
  </head>
  <body>
    <div class="container-fuild">
      <div class="row">
        <jsp:include page="include/navbar.jsp" />
      </div>
      <div class="container my-4">
        <h2 class="text-center">Student Report</h2>

        <div class="row">
            <c:forEach var="item" items="${studentReport}">
            <div class="col-3 text-center">
              <h1>${item.key} </h1>
              <h5>${item.value} %</h5>
            </div>
            </c:forEach>
        </div>
 
        <div class="row">
          <div class="col-12">
            <div class="contianer_fluid">
                <table class="table">
                  <thead>
                    <tr>
                      <th scope="col">Name</th>
                      <th scope="col">GPA</th>
                  </thead>
                  <tbody>
                    <c:forEach var="item" items="${students}">
                      <tr>
                        <td>${item.getName()}</td>
                        <td>${item.getGpa()}</td>
                      </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
