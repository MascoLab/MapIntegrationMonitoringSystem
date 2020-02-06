    
	
 	var $ = jQuery.noConflict();

	$(function(){
		 // 대시보드 생성 전  BIX5 제품의 Assets 경로를 설정합니다. 
	BIX5.setAssetsPath("./BIX5/Assets/");
		//대시보드를 생성합니다.
	 //파라메터
	 // 1. 대시보드의 id (자바스크립트의 변수 규칙을 따릅니다.)
	 // 2. 대시보드가 위치할 div의 id ( 대시보드의 부모 div의 id입니다. )
	 // 3. 대시보드가 생성될 준비가 되면 실행되는 함수입니다. 파라미터로 Dashboard 전달됩니다.
	 // 4. 대시보드의 가로 사이즈
	 // 5. 대시보드의 세로 사이즈
	 // 6. 대시보드 옵션 object
	 //6-1. enabled 대시보드 수정 여부
	 //6-2. Gridlines 격자선 보이기 여부. 
	 
	 // type : "blank"로 지정하면 blank widget 호출
	 
 	 BIX5.dashboard.create("dashboard1", "dashboardHolder", function(dashboard){
 		 var slides = [{slideName:"slide1", 
 			 widgets:[
 				 /*
	        	 		{id:"daumMap", x:10,y:10,width:500,height:300, type:"blank", 
	                  	contentUrl:"/widgets/minTest/daumMapTest.html", options:{border:true, borderColor:"#ccc", borderWidth:"2px"}}
	         			,{id:"chart1", x:530,y:10,width:500,height:300, layoutType:"headless", type:"chart", 
    	                contentUrl:"./widget/getBaseWidget?widgetType=Chart&widgetName=Area_2D_MS", options:{border:true, borderColor:"#ccc", borderWidth:"2px"}}
	         			,{id:"chart2", x:1050,y:10,width:500,height:300, title : "chart2!", layoutType:"window", type:"chart", 
   	    	            contentUrl:"/widgets/Chart/Bar_2D_Wing_Stacked_Link.html", options:{border:true, borderColor:"#ccc", borderWidth:"2px"}}
	         			,{id:"chart3", x:530,y:330,width:500,height:300, title : "TEST", layoutType:"window", type:"chart",
         				contentUrl:"/widgets/Chart/Column_2D_MS_Stacked.html", options:{border:true, borderColor:"#ccc", borderWidth:"2px"}}
	         			,{id:"helloWorld1", x:10,y:330,width:500,height:300, layoutType:"headless", type:"html", 
	    	            contentUrl:"/widgets/minTest/test.html", options:{border:true, borderColor:"#ccc", borderWidth:"2px"}}
	         			,{id:"blank", x:1050,y:330,width:500,height:300, type:"blank", 
   	    	            contentUrl:"", options:{border:true, borderColor:"#ccc", borderWidth:"2px"}}
	         			*/
 				 		/*{
 				 			id:"chart1", 
 				 			x:0,
							y:0,
							width:500,height:300, type:"chart", layoutType:"window", title:"테스트 위젯", 
 				 			contentUrl:"./widget/getBaseWidget.view?widgetType=Chart&widgetName=Area_2D_MS", 
 				 			options:{
 				 				border:true, borderColor:"#ccc", borderWidth:"2px"
 				 			}
						},*/ /*{
							id:"iframe1", 
							x:510,
							y:0,
							width:500,height:300, type:"iframe", layoutType:"headless", title:"IFRAME 위젯",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=test&widgetName=server_status"
							}
						},*/ {
							id:"iframe2", 
							x:0,
							y:0,
							width:500,height:400, type:"iframe", layoutType:"headless", title:"Iframe Column Chart",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=sd&widgetName=Column_2D"
							}
						},{
							id:"iframe3", 
							x:520,
							y:0,
							width:500,height:400, type:"iframe", layoutType:"headless", title:"Iframe Multi Series Cart",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=sd&widgetName=Multi_Series"
							}
						},{
							id:"iframe4", 
							x:0,
							y:420,
							width:500,height:400, type:"iframe", layoutType:"headless", title:"Iframe Dual Pie Chart",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=poi&widgetName=dual_pie_chart"
							}
						},{
							id:"iframe5", 
							x:520,
							y:420,
							width:500,height:400, type:"iframe", layoutType:"headless", title:"Iframe Column Stacked",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=safe&widgetName=column_stacked"
							}
						},{
							id:"iframe6",
							x:1040,
							y:0,
							width:500,height:400, type:"iframe", layoutType:"headless", title:"Iframe Adas Bar Stacked",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=adas&widgetName=bar_stacked"
							}
						},{
							id:"iframe7",
							x:1040,
							y:420,
							width:500,height:400, type:"iframe", layoutType:"headless", title:"Iframe HD Bar Stacked",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=hd&widgetName=bar_stacked"
							width:500,height:500, type:"iframe", layoutType:"window", title:"IFRAME 위젯",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=test&widgetName=server_status"
							}
							width:500,height:500, type:"iframe", layoutType:"window", title:"IFRAME 위젯",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=test&widgetName=server_status"
							}
						}, {
							id:"layout1", 
							x : 0,
							y : 310,
							width:500,height:500, type:"iframe", layoutType:"headless", title:"IFRAME 위젯",
							contentsOptions:{
								url:"./widget/getCustomWidget.view?widgetType=test&widgetName=layout"
							}
						}
		         	]
	               }]
 		 dashboard.setData(slides);
//	     dashboard.setSlideWidth( 1024 );
//	     dashboard.setSlideHeight( 500 );

	     /*dashboard.setSlideWidth( $( "#dashboardHolder" ).width() );*/
	     dashboard.setSlideWidth( $( window ).width() );
	     dashboard.setSlideHeight( $( window ).height() - 70 );
	     // slide 크기는 지정해서 넣는 수 밖에 없음

//		dashboard.setSlideWidth( $( "#dashboardHolder" ).width() );
//		dashboard.setSlideHeight( $( "#dashboardHolder" ).height() );

//		$( "#dashboardHolder" ).resize( function() {

		$( window ).resize( function() {
/*
			dashboard.setSlideWidth( $( "#dashboardHolder" ).width() );
			dashboard.setSlideHeight( $( window ).height() - 70 );
*/
//			BIX5.dashboard.resize();
		});

	     // 오른쪽 BIX5 sidebar 내용
	     var items = [
	    	 {label:"Chart Widget", 
	    		 children:[
	             {label:"Line 2D", title:"Line_2D", type:"chart", contentUrl:"/widgets/Chart/Area_2D_MS.html", options:{border:true}},
	             {label:"Column 2D", title:"Column_2D", type:"chart", contentUrl:"/widgets/Chart/Column_2D.html", options:{border:true}},
	             {label:"Combi 2D Multi", title:"Combi_2D_Multi", type:"chart", contentUrl:"/widgets/Chart/Combi_2D_Multi.html", options:{border:true}},
	             {label:"Dash Lines", title:"Dash_Lines", type:"chart", contentUrl:"/widgets/Chart/Dash_Lines.html", options:{border:true}},
	             {label:"Bar 2D Wing Stacked", title:"Bar_2D_Wing_Stacked", type:"chart", contentUrl:"/widgets/Chart/Bar_2D_Wing_Stacked_Link.html", options:{border:true}},
	             {label:"Doughnut 2D", title:"Doughnut_2D", type:"chart", contentUrl:"/widgets/Chart/Doughnut_2D.html", options:{border:true}},
	             {label:"Equalizer2", title:"Equalizer2", type:"chart", contentUrl:"/widgets/Chart/Equalizer2.html", options:{border:true}},
	         ]},
	         {label:"TEST1", title:"TEST1",type:"chart",contentUrl:"",option:{border:true}},
             {label:"HelloWorld", title:"HelloWorld",type:"html",contentUrl:"/widgets/minTest/test.html",option:{border:true}},
             {label:"DaumMap", title:"DaumMap",type:"html",contentUrl:"/widgets/minTest/daumMapTest.html",option:{border:true}},
             {label:"blank", type:"blank", options: {"border":true,"borderColor":"#a6a6a6","borderWidth":"1px"}}
	     ];
	     dashboard.setWidgetPool(items);
	     
	     //var url = checkUrl(location.href);
	     
	     /*   
	     if(typeof localStorage !== "undefined" && localStorage.getItem(url) != null)
	         data = JSON.parse(localStorage.getItem(url));
	      
	     dashboard.setData(data);       
	     */
	     
	}, "100%", "100%", {enabled:false, gridlines:false});
 	 // DashBoard : enabled : 수정여부 / gridlines : 격자선 여부
	 });     	// jQuery document onready End
 	
 	
 	 


	