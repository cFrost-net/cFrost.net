<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link rel="stylesheet" type="text/css"
    href="<%=request.getContextPath()%>/css/frame.css" />
<link rel="stylesheet" type="text/css"
    href="<%=request.getContextPath()%>/css/global.css" />
<link rel="stylesheet" type="text/css"
    href="<%=request.getContextPath()%>/css/header.css" />
<link rel="stylesheet" type="text/css"
    href="<%=request.getContextPath()%>/css/footer.css" />

<script type="text/javascript"
    src="<%=request.getContextPath()%>/scripts/lib/jquery-2.1.4.js"></script>
<script type="text/javascript"
    src="<%=request.getContextPath()%>/scripts/util.js"></script>
<script type="text/javascript"
    src="<%=request.getContextPath()%>/scripts/header.js"></script>
</head>
<body>
    <div id="__page__">
        <header>
            <div id="siteName">
                <a href="<%=request.getContextPath()%>/">cFrost.net</a>
            </div>
            <nav>
                <a href="<%=request.getContextPath()%>/blog/">BLOG</a>
                &nbsp;&nbsp;&nbsp;&nbsp;<a
                    href="<%=request.getContextPath()%>/code/">CODE</a>
                &nbsp;&nbsp;&nbsp;&nbsp;<a
                    href="<%=request.getContextPath()%>/disk/">DISK</a>
                &nbsp;&nbsp;&nbsp;&nbsp;<a
                    href="http://nexus.cfrost.net" target="_Blank">NEXUS</a>
                &nbsp;&nbsp;&nbsp;&nbsp;<a
                    href="http://mail.cfrost.net" target="_Blank">E-MAIL</a>
                &nbsp;&nbsp;&nbsp;&nbsp;<a
                    href="<%=request.getContextPath()%>/about/">ABOUT</a>
            </nav>
            <div id="sFms">
                <form id="searchForm" method="get"
                    action="<%=request.getContextPath()%>/doSearch.action">
                    <span id="sboxs"><input id="sBox"
                        class="searchBox" type="text" name="search"
                        value="Input to search..."
                        onfocus="searchBoxClick(this.id); setStyle(this.id, 'inline', 'color:#000000')"
                        onblur="searchBoxClick(this.id); setStyle(this.id, 'clear')" />
                    </span><span id="sbtns"><input id="sBtn"
                        class="searchBtn" type="submit" value="搜 索" />
                    </span>
                </form>
            </div>
            <div id="userInfo">
                <li><a href="javascript:void(0);"
                    onclick="userInfoClicked();">cFrost</a>&nbsp;<a
                    href="javascript:void(0);"
                    onclick="userInfoClicked();"><div id="kik"
                            class="img_triangle"></div></a>
                    <ul id="userMenu">
                        <li class="child_li"><a
                            href="javascript:void(0);">个人信息</a></li>
                        <li class="child_li"><a
                            href="javascript:void(0);">修改密码</a></li>
                        <li class="child_li"><a
                            href="javascript:void(0);">设置</a></li>
                        <li class="last_child_li"><a
                            href="javascript:void(0);">注销</a></li>
                    </ul>
                </li>
            </div>
        </header>
        <div id="__body__">
            <div id="__view__">