<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/frame.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/global.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/header.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/footer.css" />

<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery-2.1.4.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/util.js"></script>


<script type="text/javascript">
    function searchBoxClick(id, value)
    {
        var txtBox=document.getElementById(id);
        if (txtBox.value == "Input to search...") {
            txtBox.value = "";
        }else if(txtBox.value == "") {
            txtBox.value = "Input to search...";
        }
    }
</script>
</head>
<body>
    <div id="__page__">
        <header>
            <div id="siteName">
                <a href="<%=request.getContextPath()%>">cFrost.net</a>
            </div>
            <nav>
                <a href="<%=request.getContextPath()%>/blog/blog">BLOG</a>
                &nbsp;&nbsp;&nbsp; <a
                    href="<%=request.getContextPath()%>/code.jsp">CODE</a>
                &nbsp;&nbsp;&nbsp; <a
                    href="<%=request.getContextPath()%>/disk.jsp">DISK</a>
                &nbsp;&nbsp;&nbsp; <a
                    href="<%=request.getContextPath()%>/about.jsp">ABOUT</a>
            </nav>
            <div id="userInfo">
                <a href="javascript:void(0);">cFrost</a>
                &nbsp;&nbsp;&nbsp; <a href="javascript:void(0);">注销</a>
            </div>
            <div id="searchForm">
                <form method="get" action="<%=request.getContextPath()%>/doSearch.action">
                    <span id="sboxs"><input id="sBox"
                        class="searchBox" type="text" name="search"
                        value="Input to search..."
                        onfocus="searchBoxClick(this.id); setStyle(this.id, 'inline', 'color:#000000')"
                        onblur="searchBoxClick(this.id); setStyle(this.id, 'clear')" />
                    </span><span id="sbtns"><input id="sBtn"
                        class="searchBtn" type="submit" value="Search" />
                    </span>
                </form>
            </div>
        </header>
        <div id="__body__">
            <div id="__view__">