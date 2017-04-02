<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; UTF-8">
    <title>CIAT Partners</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <script
      src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
      integrity="sha256-k2WSCIexGzOj3Euiig+TlR8gA0EmPjuc79OEeY5L45g="
      crossorigin="anonymous"></script>
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  </head>
  <body>
    <div class="container">
      <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <a class="navbar-brand" href="#">CIAT Partners</a>
          </div>
          <!-- Collect the nav links, forms, and other content for toggling -->
          <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
              <li ><a href="#">About</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li style="padding-top: 8px;">
                <input type="email" class="form-control" #search placeholder="Search">
              </li>
              <li class="dropdown" mdb-dropdown>
                <a href="#" class="dropdown-toggle" role="button" aria-haspopup="true" aria-expanded="false">Filters <span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="#">Actor</a></li>
                  <li><a href="#">Movie</a></li>
                  <li role="separator"  class="divider"></li>
                  <li><a href="#">Logout</a></li>
                </ul>
              </li>
            </ul>
          </div>
          <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
      </nav>
      <div style="margin-top: 68px;">
        <h3>List of Parnerts</h3>
        <table class="table table-hover">
          <thead>
            <tr>
              <th>Headquarter</th>
              <th>Acronym</th>
              <th>Name</th>
              <th>Location</th>
              <th style="text-align:center;">Remove</th>
            </tr>
          </thead>
          <tbody>
            <s:iterator  value="list">
              <tr>
                <td>
                	<s:if test="%{branch == true}">
						Yes
					</s:if>
					<s:else>
  						No
					</s:else>
                  <br/>
                </td>
                <td>
                  <s:property value="acronym"/>
                  <br/>
                </td>
                <td>
                  <s:property value="name"/>
                  <br/>
                </td>
                <td>
                  <s:property value="City"/>, 
                  <s:property value="Country"/>
                  <br/>
                </td>
                <td style="text-align:center;">
                  <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
                </td>
            </s:iterator>
          </tbody>
        </table>
        <p style="float: right !important;"><a class="btn btn-primary" href="<s:url action='form'/>">Add Partner</a></p>
      </div>
    </div>
  </body>
</html>