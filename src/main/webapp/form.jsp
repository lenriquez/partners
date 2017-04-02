<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!doctype>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; UTF-8">
    <title>CIAT Partners</title>
    <style>
      .bs-example {
      margin-right: 0;
      margin-left: 0;
      background-color: #fff;
      border-color: #ddd;
      border-width: 1px;
      border-radius: 4px 4px 0 0;
      -webkit-box-shadow: none;
      box-shadow: none;
      padding: 45px 15px 15px;
      margin: 0 30px 30px;
      }
      .toggle.ios, .toggle-on.ios, .toggle-off.ios { border-radius: 20px; }
    </style>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link href="https://gitcdn.github.io/bootstrap-toggle/2.2.2/css/bootstrap-toggle.min.css" rel="stylesheet">
  </head>
  <body>
    <div class="container">
      <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
          <!-- Brand and toggle get grouped for better mobile display -->
          <div class="navbar-header">
            <a class="navbar-brand" href="#">CIAT Partners</a>
          </div>
        </div>
      </nav>
      <div class="bs-example" style="margin-top: 68px; border-style: double;">
        <div>
          <h3 style="text-align: center;">Request a new Institution or Branch</h3>
          <span id="nameHelp" style="color:red;text-align: center;" class="help-block">
            <s:property value="message"/>
          </span>
        </div>
        <div class="row bs-example bs-callout ">
          <s:property value="name"/>
          <form action="save" method="post">
            <div class="col-xs-12 form-group">
              <label style="margin-right: 30px;"> Is this institution a branch? </label>
              <s:checkbox id="chekcbox-ins" key="partnerModel.branch"  data-on="Yes" data-off="No" type="checkbox" data-style="ios"  data-toggle="toggle"/>
            </div>
            <div id="institutuion" style="display: none;" class="col-xs-12 form-group">
              <label>Select Institution Headquarter:</label>
              <s:select theme="simple" key="partnerModel.parent"  cssClass="form-control" list="partners" />
            </div>
            <div class="col-xs-6 form-group">
              <label>Acronym:</label> 
              <s:textfield theme="simple" key="partnerModel.acronym" maxlength="10" cssClass="form-control" label="User Name" />
            </div>
            <div class="form-group col-xs-6">
              <label>Type:</label>
              <s:select theme="simple"  key="partnerModel.type" cssClass="form-control" list="types" />
            </div>
            <div class="form-group col-xs-6">
              <label >City:</label>
              <s:textfield theme="simple" key="partnerModel.city" cssClass="form-control" label="User Name" />
            </div>
            <div class="form-group col-xs-6">
              <label >Name:</label>
              <s:textfield theme="simple" key="partnerModel.name" id="name_ins" cssClass="form-control" label="User Name" />
              <span id="nameHelp" style="display:none" class="help-block">The name field have max length of 10 words.</span>
            </div>
            <div class="form-group col-xs-6">
              <label for="userBean_username">Country:</label>
              <s:select theme="simple" key="partnerModel.country"  cssClass="form-control" list="countries" />
            </div>
            <div class="form-group col-xs-12">
              <label >WebSite:</label>
              <s:textfield theme="simple" cssClass="form-control" label="User Name" />
            </div>
            <div class="form-group col-xs-12">
              <button type="submit" class="btn btn-default">Submit</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
<script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="https://gitcdn.github.io/bootstrap-toggle/2.2.2/js/bootstrap-toggle.min.js"></script>
<script src="https://code.jquery.com/ui/1.9.2/jquery-ui.js" integrity="sha256-PsB+5ZEsBlDx9Fi/GXc1bZmC7wEQzZK4bM/VwNm1L6c=" crossorigin="anonymous"></script>
<script>
  $( "#chekcbox-ins" ).change(function(e) {
  	$( "#institutuion" ).toggle( "fade" );
  });
  var nameHelpdisplay = false;
  $("#name_ins").keypress(function(e){
   event.preventDefault();
   var input = $("#name_ins");
   var newValue=input.val() + e.key
   
   if (newValue.split(" ").length < 10){
    input.val(newValue);
   }else{
    if (!nameHelpdisplay){ 
    	$( "#nameHelp" ).toggle( "fadeIn" );
    	nameHelpdisplay = true
    }
   }
  });
</script>