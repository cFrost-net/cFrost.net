<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        
        <link rel="stylesheet" type="text/css" href="/css/frame.css" />
        <link rel="stylesheet" type="text/css" href="/css/disk.css" />
        
        <script type="text/javascript" src="/scripts/jquery-2.1.4.js"></script>
        <script type="text/javascript" src="/scripts/util.js"></script>
        <script type="text/javascript" src="/scripts/index.js"></script>
            
        <title>cFrost.net</title>
    </head>
    <body>
        <div id="__view__">
            <div id="__body__" class="clearfix">
                <?php include 'includes/header.html';?>
                
                <div id="__frame__">
                    <div id="progress" style="margin-left:10px">
                        <p>This site is being built...</p>
                        <?php
                            $requesturl=$_SERVER['HTTP_HOST'] . "/getProgress";
                            $ch= curl_init();
                            curl_setopt($ch, CURLOPT_URL, $requesturl);
                            curl_setopt($ch, CURLOPT_HEADER, 0);
                            curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
                            $contents=curl_exec($ch);
                            curl_close($ch);
                            $json = json_decode($contents, true);
                            $json_progress=$json['progress'];
                            //$progress = json_decode($progress_json, false);
                            $length = count($json_progress);
                            for($i=0; $i<$length;$i++){
                                echo "<p>";
                                echo $json_progress[$i]['content'];
                                echo "</p>";
                            }
                        ?>
                    </div>                 
                </div>
            </div>
        </div>
        <?php include 'includes/footer.html';?>
    </body>
</html>