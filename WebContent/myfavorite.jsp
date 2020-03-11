
<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
 <%@ page import="com.travel.dao.Impl.CollectionDaoIpml" %>
 <%@ page import="com.travel.pojo.Collection"  %>
  <%@ page import="com.travel.pojo.User"  %>
 <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
 
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>驴友网-我的收藏</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/common.css">
        <link rel="stylesheet" href="css/index.css">
       <style>
           .tab-content .row>div {
            margin-top: 16px;
           } 
           .tab-content {
            margin-bottom: 36px;
           }
       </style>
      <script src="js/jquery-3.3.1.js"></script>
       
     
    </head>
    <body>
    <!--引入头部-->
    <div id="header"></div>
         <!-- 排行榜 start-->
        <section id="content">            
            <section class="dhxyi_jx">
                <div class="jx_top">
                    <div class="jx_tit">
                        <img src="images/icon_5.jpg" alt="">
                        <span>我的收藏</span>
                    </div>                    
                </div>
                <div class="jx_content">
                    <!-- Tab panes -->
                    <div class="tab-content">
                        <div role="tabpanel" class="tab-pane active" id="home">
                            <div class="row" >
                            
                            <!-- 商品循环 -->
                               
                                 
                            </div>
                        </div>                       
                    </div>
                </div>
                <div class="pageNum">
                    <ul  id="pageId">
                    <!--     <li><a href="">首页</a></li>
                        <li class="threeword"><a href="#">上一页</a></li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">6</a></li>
                        <li><a href="#">7</a></li>
                        <li><a href="#">8</a></li>
                        <li><a href="#">9</a></li>
                        <li><a href="#">10</a></li>
                        <li class="threeword"><a href="javascript:;">下一页</a></li>
                        <li class="threeword"><a href="javascript:;">末页</a></li> -->
                    </ul>
                </div>
            </section>                      
        </section>
        <!-- 排行榜 end-->
    	
         <!--引入尾部-->
    	<div id="footer"></div>
        <!--导入布局js，共享header和footer-->
        <script type="text/javascript" src="js/include.js"></script>
       <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
  <script>
      
       var curentPage = 1;   //当前第几页
       var pageCount =4;    //每一行显示的对象
       var pageRow=3;      //显示的行数
       var count =0;           //计数

       
       function loadPage(curentPage,pageCount){
    	   
    	   $.post("collection/add",{"curentPage":curentPage},function (data){
    
    		   count = parseInt(data.pageCount);
    		 //  alert("111111"+count);
          var content="";
            
                  
          for (var i = 0; i < data.listcount.length; i++) {
        	  
                       //循环打印<li></li>
                       content += '<div class="col-md-3">'+'<a href="route_detail.html?rid='+data.listcount[i].rid+' ">'+'<img src= "'+data.listcount[i].rimage+'" alt="">' +
                       ' <div class="has_border">' +
                       '<h3>'+data.listcount[i].rname+'</h3>' +
                       '<div class="price">网付价<em>￥</em><strong>' +
                      data.listcount[i].price+'</strong><em>起</em></div></div></a> </div>';
                   
                   }
                 
              
               $(".row").html(content);
         
               page(curentPage); 
    	   });
    	   }
      
    
      
      
       /**
        * 加载页码
        */
       function page(curentPage){
           var pre = curentPage-1;
           var next = curentPage +1;
           if (curentPage == 1){
               pre = 1;
           }
           if (next>= count) {
               next = count;
           }
     
           var start = curentPage-5;

           var end = start+9;


           // parseInt(data.pageCount)
           var page = '<li onclick="test('+1+')" class="threeword"><a href="#">首页</a></li>' +
               ' <li onclick="test('+pre+')" class="threeword"><a href="#">上一页</a></li>';
           if (start <= 0){
               start = 1;
               end = 10;
           }
           //count  总页数
           if (end >=count) {
               start = end-9;
               end = count;
               if(start<=0){
            	   start = 1;
               }
               //alert("end" + end + ":" + start);

           }

           for (var i = start; i <=end; i++) {
               if (i==curentPage) {
                   page+='<li onclick="test('+i+')" id="li'+i+'" class="curPage"><a  href="javascript:void(0);">'+i+'</a></li>';
               }else {
                   page+='<li onclick="test('+i+')" id="li'+i+'" class=""><a  href="javascript:void(0);">'+i+'</a></li>';
               }

           }
           page+= '<li onclick="test('+next+')" class="threeword"><a href="#">下一页</a></li>';
           $("#pageId").html(page);
       }

       /**
        * 点击事件 i 点击的当前页码
        */
       function test(i){
           var curentPage = i;
           loadPage(curentPage,pageCount);
          // page(curentPage);

           // var li = "li"+i;

           // $("#pageId").children().removeClass("curPage");
           // $("#"+li).addClass("curPage");
           scrollTo(0,0);
           //document.getElementById(li)
       }
       /**
        * 入口函数
        */
        $(function () {
           
              loadPage(curentPage,pageCount); 
          
             //     alert(count); 
                  
                
              });
        
       </script>
       
   
    </body>
</html>