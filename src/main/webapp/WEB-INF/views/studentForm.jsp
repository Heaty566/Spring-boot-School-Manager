<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
      <div class="container my-5">
        <div class="row">
          <div class="col-12 m-auto" style="width: 540px">
            <h2>Student Form</h2>
            <form:form method="GET" action="/student/handle-add-student" modelAttribute="student">
              <form:hidden path="id" />
              <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <form:input type="text" class="form-control" id="name" path="name" />
                <form:errors path="name" cssClass="error" />
              </div>
              <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <form:input type="number" class="form-control" id="age" path="age" />
                <form:errors path="age" cssClass="error" />
              </div>
              <div class="mb-3">
                <label for="year" class="form-label">Year</label>
                <form:input type="number" class="form-control" id="year" path="year" />
                <form:errors path="year" cssClass="error" />
              </div>
              <div class="mb-3">
                <label for="math" class="form-label">Math</label>
                <form:input type="number" class="form-control" id="math" path="math" />
                <form:errors path="math" cssClass="error" />
              </div>
              <div class="mb-3">
                <label for="physical" class="form-label">Physical</label>
                <form:input type="number" class="form-control" id="physical" path="physical" />
                <form:errors path="physical" cssClass="error" />
              </div>
              <div class="mb-3">
                <label for="chemistry" class="form-label">Chemistry</label>
                <form:input type="number" class="form-control" id="chemistry" path="chemistry" />
                <form:errors path="chemistry" cssClass="error" />
              </div>

              <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
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
