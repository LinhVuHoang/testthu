<%
  request.setCharacterEncoding("utf-8");
  //thêm để không bị lỗi font chữ
%>
<!DOCTYPE html>
<html>
<head>
  <jsp:include page="/admin/include/header.jsp">
    <jsp:param name="title" value="My admin page"/>
    <jsp:param name="description" value="Admin area"/>
    <jsp:param name="keywords" value="Admin, page...."/>
  </jsp:include>
</head>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
  <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
  <span class="w3-bar-item w3-right">Create Product Form</span>
</div>

<!-- Sidebar/menu -->
<jsp:include page="/admin/include/left-menu.jsp"/> <!--tách giao diện ra các file jsp khác nhau dùng jsp:include để nối vào-->


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:22px">
    <h5><b><i class="fa fa-dashboard"></i>Food Form</b></h5>
  </header>

  <div class="w3-row-padding w3-margin-bottom">
    <form action="" method="post" class="w3-container">
      <div class="w3-margin">
        <label>Id</label>
        <input class="w3-input" name="id" type="text">
      </div>
      <div class="w3-margin">
        <label>Name</label>
        <input class="w3-input" name="name" type="text">
      </div>
      <div class="w3-margin">
        <label>Price</label>
        <input class="w3-input" name="price" type="text">
      </div><div class="w3-margin">
      <label>Description</label>
      <input class="w3-input" name="description" type="text">
    </div>
      <div class="w3-margin">
        <label>Thumbnail</label>
        <input class="w3-input" name="thumbnail" type="url">
      </div>
      <div class="w3-margin">
        <label>Status</label>
        <input class="w3-input" name="status" type="text">
      </div>
      <button class="w3-button  w3-blue w3-margin">Submit </button>
    </form>
  </div>
</div>
</body>
</html>
</div>
<!-- Footer -->
<footer class="w3-container w3-padding-16 w3-light-grey">
  <jsp:include page="/admin/include/footer.jsp"/>
</footer>

<!-- End page content -->
</div>

<jsp:include page="/admin/include/script.jsp"/>

</body>
</html>




