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
    <span class="w3-bar-item w3-right">Admin page</span>
</div>

<!-- Sidebar/menu -->
<jsp:include page="/admin/include/left-menu.jsp"/> <!--tách giao diện ra các file jsp khác nhau dùng jsp:include để nối vào-->


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

    <!-- Header -->
    <header class="w3-container" style="padding-top:22px">
        <h5><b><i class="fa fa-dashboard"></i> My Dashboard</b></h5>
    </header>

    <div class="w3-row-padding w3-margin-bottom">
        <form action="/action_page.php" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin">
            <h2 class="w3-center">Create Product</h2>
            <a href="/admin/product/list">Back to list</a>
            <div class="w3-row w3-section">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
                <div class="w3-rest">
                    <input class="w3-input w3-border" name="first" type="text" placeholder="First Name">
                </div>
            </div>

            <div class="w3-row w3-section">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-user"></i></div>
                <div class="w3-rest">
                    <input class="w3-input w3-border" name="last" type="text" placeholder="Last Name">
                </div>
            </div>

            <div class="w3-row w3-section">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-envelope-o"></i></div>
                <div class="w3-rest">
                    <input class="w3-input w3-border" name="email" type="text" placeholder="Email">
                </div>
            </div>

            <div class="w3-row w3-section">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-phone"></i></div>
                <div class="w3-rest">
                    <input class="w3-input w3-border" name="phone" type="text" placeholder="Phone">
                </div>
            </div>

            <div class="w3-row w3-section">
                <div class="w3-col" style="width:50px"><i class="w3-xxlarge fa fa-pencil"></i></div>
                <div class="w3-rest">
                    <input class="w3-input w3-border" name="message" type="text" placeholder="Message">
                </div>
            </div>

            <p class="w3-center">
                <button class="w3-button w3-section w3-blue w3-ripple"> Send </button>
            </p>
        </form>
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

