var $ = jQuery.noConflict();

$( function() {
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

	var baseWidth = $( window ).width() - 100;
	var half_BaseWidth = baseWidth / 2 - 5;
	// type : "blank"로 지정하면 blank widget 호출
	BIX5.dashboard.create( "dashboard1", "dashboardHolder", function( dashboard ) {
		var slides = [
			{
				slideName : "slide1",
				widgets : [
					{
						id : "chartHistory2DLine",
						x : 0,
						y : 0,
						width : baseWidth,
						height : 300, 
						type : "chart", 
						layoutType : "headless", 
						title : "",
						contentUrl : "./widget/getBaseWidget.view?widgetType=Chart&widgetName=History_2D_Line",
						options : {
							border : true
						}
					}, {
						id : "chartArea2DMS",
						x : 0,
						y : 310,
						width : half_BaseWidth,
						height : 300, 
						type : "chart", 
						layoutType : "headless", 
						title : "",
						contentUrl : "./widget/getBaseWidget.view?widgetType=Chart&widgetName=Area_2D_MS",
						options : {
							border : true
						}
					}, {
						id : "chartMultiSeries3D",
						x : half_BaseWidth + 10,
						y : 310,
						width : half_BaseWidth,
						height : 300, 
						type : "chart", 
						layoutType : "headless", 
						title : "",
						contentUrl : "./widget/getBaseWidget.view?widgetType=Chart&widgetName=Multi_Series_3D",
						options : {
							border : true
						}
					}, {
						id : "gridColumnSortingJSON",
						x : 0,
						y : 620,
						width : baseWidth,
						height : 300, 
						type : "grid", 
						layoutType : "headless", 
						title : "",
						contentUrl : "./widget/getBaseWidget.view?widgetType=Grid&widgetName=Column_Sorting_JSON",
						options : {
							border : true
						}
					}
				]
			}
		];

		dashboard.setData( slides );
		/*dashboard.setSlideWidth( $( "#dashboardHolder" ).width() );*/
		dashboard.setSlideWidth( $( window ).width() - 100 );
		dashboard.setSlideHeight( $( window ).height() - 70 );
		// slide 크기는 지정해서 넣는 수 밖에 없음
		// dashboard.setSlideWidth( $( "#dashboardHolder" ).width() );
		// dashboard.setSlideHeight( $( "#dashboardHolder" ).height() );
		//$( "#dashboardHolder" ).resize( function() {
		$( window ).resize( function() {
			/*
			dashboard.setSlideWidth( $( "#dashboardHolder" ).width() );
			dashboard.setSlideHeight( $( window ).height() - 70 );
			*/
			// BIX5.dashboard.resize();
		});

		// 오른쪽 BIX5 sidebar 내용
		var items = [
			{
				label : "일반",
				children : [
					{
						label : "차트",
						children : [
							{
								label : "서버 현황 정보", 
								title : "서버 현황 정보", 
								type : "chart", 
								contentUrl : "./widget/getBaseWidget.view?widgetType=Chart&widgetName=History_2D_Line", 
								options : {
									border : true
								}
							}, {
								label : "월별 과금형카메라 변경 현황", 
								title : "월별 과금형카메라 변경 현황", 
								type : "chart", 
								contentUrl : "./widget/getBaseWidget.view?widgetType=Chart&widgetName=Area_2D_MS", 
								options : {
									border : true
								}
							}, {
								label : "자동차전용도로 연장", 
								title : "자동차전용도로 연장", 
								type : "chart", 
								contentUrl : "./widget/getBaseWidget.view?widgetType=Chart&widgetName=Multi_Series_3D", 
								options : {
									border : true
								}
							}
						]
					}, {
						label : "표",
						children : [
							{ 
								label : "비용 정보", 
								title : "비용 정보", 
								type : "grid", 
								contentsOptions:{
									url : ""
								}
							}
						]
					}
				]
			}, {
				label : "테두리 사용",
				children : [
					{
						label : "ADAS",
						children : [
							{ 
								label : "도로종별별 ADAS 구축 연장", 
								title : "도로종별별 ADAS 구축 연장", 
								type : "iframe", 
								contentsOptions:{
									url : "./widget/getCustomWidget.view?widgetType=adas&widgetName=bar_stacked"
								}
							}
						]
					}, {
						label : "SAFE",
						children : [
							{ 
								label : "월별 과금형카메라 변경 현황", 
								title : "월별 과금형카메라 변경 현황", 
								type : "iframe", 
								contentsOptions:{
									url : "./widget/getCustomWidget.view?widgetType=safe&widgetName=column_stacked"
								}
							}
						]
					}, {
						label : "POI",
						children : [
							{ 
								label : "Core 및 Extended POI 보유 현황", 
								title : "Core 및 Extended POI 보유 현황", 
								type : "iframe", 
								contentsOptions:{
									url : "./widget/getCustomWidget.view?widgetType=poi&widgetName=dual_pie_chart"
								}
							}
						]
					}, {
						label : "HD",
						children : [
							{ 
								label : "도로종별별 HD 구축 연장", 
								title : "도로종별별 HD 구축 연장", 
								type : "iframe", 
								contentsOptions:{
									url : "./widget/getCustomWidget.view?widgetType=hd&widgetName=bar_stacked"
								}
							}
						]
					}, {
						label : "SD",
						children : [
							{ 
								label : "도로종별 기준 연장", 
								title : "도로종별 기준 연장", 
								type : "iframe", 
								contentsOptions:{
									url : "./widget/getCustomWidget.view?widgetType=sd&widgetName=Column_2D"
								}
							}, { 
								label : "자동차전용도로 연장", 
								title : "자동차전용도로 연장", 
								type : "iframe", 
								contentsOptions:{
									url : "./widget/getCustomWidget.view?widgetType=sd&widgetName=Multi_Series"
								}
							}
						]
					},
				]
			}, {
				label : "blank", 
				type : "blank", 
				options : {
					"border" : true,
					"borderColor" : "#a6a6a6",
					"borderWidth" : "1px"
				}
			}
		];
		dashboard.setWidgetPool( items );

		// var url = checkUrl(location.href);
		/*
		if(typeof localStorage !== "undefined" && localStorage.getItem(url) != null)
			data = JSON.parse(localStorage.getItem(url));
			dashboard.setData(data);
		*/
	}, 
	"100%", 
	"100%", {
		enabled : false, 
		gridlines : false
	});
	// DashBoard : enabled : 수정여부 / gridlines : 격자선 여부
});     	// jQuery document onready End
