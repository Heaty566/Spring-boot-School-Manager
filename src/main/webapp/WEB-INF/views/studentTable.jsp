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
      <div class="container">
        <div class="row my-5">
          <div class="col-12">
            <div class="contianer_fluid">
                <table class="table">
                  <thead>
                    <tr>
                      <th scope="col">ID</th>
                      <th scope="col">Name</th>
                      <th scope="col">Age</th>
                      <th scope="col">Year</th>
                      <th scope="col">Math</th>
                      <th scope="col">Physical</th>
                      <th scope="col">Chemistry</th>
                      <th scope="col">GPA</th>
                      <th scope="col"></th>
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="item" items="${students}">
                      <tr>
                        <th>${item.getId()}</th>
                        <td>${item.getName()}</td>
                        <td>${item.getAge()}</td>
                        <td>${item.getYear()}</td>
                        <td>${item.getMath()}</td>
                        <td>${item.getPhysical()}</td>
                        <td>${item.getChemistry()}</td>
                        <td>${item.getGpa()}</td>
                        <td>
                          <a class="btn btn-primary btn-sm" href="/student/update/${item.getId()}"> Edit </a>
                          <a class="btn btn-danger btn-sm" href="/student/delete/${item.getId()}"> Delete </a>
                        </td>
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
