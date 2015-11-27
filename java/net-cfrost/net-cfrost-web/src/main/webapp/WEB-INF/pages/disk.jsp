<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        
        <link rel="stylesheet" type="text/css" href="css/frame.css" />
        <link rel="stylesheet" type="text/css" href="css/disk.css" />
        
        <script type="text/javascript" src="scripts/jquery-2.1.4.js"></script>
        <script type="text/javascript" src="scripts/util.js"></script>
        <script type="text/javascript" src="scripts/disk.js"></script>
            
        <title>cFrost.net</title>
    </head>
    <body>
        <div id="__view__">
            <div id="__body__" class="clearfix">
                <%@ include file="includes/header.jsp"%>
                <div id="__frame__">
                    <div id="disk_fileTableDiv">
                        <table id="disk_fileTable" cellspacing="0px">
                            <tr>
                                <th id="disk_fileName">File Name</th>
                                <th id="disk_uploadDate">Upload Date</th>
                                <th id="disk_fileSize">File Size</th>
                                <th id="disk_download">Download</th></tr>
                        </table>
                    </div>         
                </div>
            </div>
        </div>
        <%@ include file="includes/footer.jsp"%>
    </body>
</html>