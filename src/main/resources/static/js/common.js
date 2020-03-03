$(document).ready(function(){
	$(".jsBtnShow1").on("click", function(){
		$(".modalBg").show();
		$( $(this).attr("href") ).show();
		return false;
	});
	$(".jsBtnClose1").on("click", function(){
		$( $(this).attr("href") ).hide();
		$(".modalBg").hide();
		return false;
	});
	
	$("#header .btnClose").on("click", function(){
		if ( $(this).parent().parent().hasClass("closed") )
			$(this).parent().parent().removeClass("closed");
		else
			$(this).parent().parent().addClass("closed");
		return false;
	});
	$(".gWidget .btnClose").on("click", function(){
		if ( $(this).parent().parent().hasClass("closedWidget") )
			$(this).parent().parent().removeClass("closedWidget");
		else
			$(this).parent().parent().addClass("closedWidget");
		return false;
	});

	$(".mTab1 .ls a.iDelete").on("click", function(){
		$(this).parent().hide();
		return false;
	});

	$(".gMod1 .iClose").on("click", function(){
		$(this).parent().parent().parent().hide();
		return false;
	});

	$(document).on("click", ".gDep .dep .link", function(){
		if ( $(this).parent().hasClass("open") )
		{
			$(this).parent().removeClass("open");
		}
		else
		{
			$(this).parent().addClass("open");
		}
		return false;
	});

	$(document).on("click",".jsBtnDep1", function(){
		var orgDep1Html = '<div class="gDep"><div class="dep dep1 open"><div class="link"><a href="###">System added</a></div><a href="###" class="add jsBtnDep1">+추가</a><div class="dep dep2 open">	<div class="link"><a href="###">System added</a></div><a href="###" class="add jsBtnDep2">+추가</a>	<div class="dep dep3"><div class="link"><a href="###">System added</a></div><a href="###" class="add jsBtnDep3">+추가</a></div></div></div></div>';
		$(this).parent().after( orgDep1Html );
		return false;
	});
	$(document).on("click",".jsBtnDep2", function(){
		var orgDep2Html = '<div class="dep dep2 open"><div class="link"><a href="###">System added</a></div><a href="###" class="add jsBtnDep2">+추가</a><div class="dep dep3"><div class="link i1"><a href="###">System added</a></div><a href="###" class="add jsBtnDep3">+추가</a></div></div>';
		$(this).parent().after( orgDep2Html );
		return false;
	});
	$(document).on("click",".jsBtnDep3", function(){
		var orgDep3Html = '<div class="dep dep3"><div class="link"><a href="###">System added</a></div><a href="###" class="add jsBtnDep3">+추가</a></div>';
		$(this).parent().after( orgDep3Html );
		return false;
	});

	$(".jsTab1 a").on("click", function(){
		$(this).parent().children().removeClass("selected");
		$(this).addClass("selected");
		$(this).parent().parent().parent().children(".con").addClass("hidden");
		$( $(this).attr("href") ).removeClass("hidden");
		if ( $(this).attr("href") == "#jsTabContent1_2" )
		{
			$(".lWidget").addClass("w2");
		}
		else
		{
			$(".lWidget").removeClass("w2");
		}
	});

	$(".postWidget").on("click", function() {
		$( $(this).attr("href") ).click();
	});
/*
	// CCTV View
	var container = document.getElementById( 'div_map' ),
	options = {
		center: new kakao.maps.LatLng(37.427527, 126.893165),
		level: 8 
	};
	
	var map = new kakao.maps.Map(container, options);

	var bounds = map.getBounds();

	var key = '1566268087863';
	var ReqType = '2';
	
	var MinX = '126.869072';
	var MaxX = '126.932434';
	var MinY = '37.418390 ';
	var MaxY = '37.454966';
	var type = 'ex';	// ex 고속도로, its 국도
	var CctvType = '1';	//1 : 실시간 스트리밍(HLS) / 2 : 동영상 파일 / 3 : 정지 영상
	var url = 'http://openapi.its.go.kr:8081/api/NCCTVInfo?'
			+'key=' + key
			+'&ReqType='+ReqType
			+'&MinX='+MinX
			+'&MaxX='+MaxX
			+'&MinY='+MinY
			+'&MaxY='+MaxY
			+'&type='+type
			+'&CctvType='+CctvType;
			
	$(function(){
		var json;
		
		$.get(url, function(data){
			json = $.xml2json(data);
			
			var positions = [];
			$.each(json.data,function(i, f){
				var obj = {
					title : f.cctvname,
					cctvurl : f.cctvurl,
					position : new kakao.maps.LatLng(f.coordy, f.coordx)
				}
				positions.push(obj);
			});
			
			var imageSrc = "http://t1.daumcdn.net/localimg/localimages/07/mapapidoc/markerStar.png";
			for (var i = 0; i < positions.length; i ++) {
				// 마커 이미지의 이미지 크기 입니다
				var imageSize = new kakao.maps.Size(24, 35);
				
				// 마커 이미지를 생성합니다
				var markerImage = new kakao.maps.MarkerImage(imageSrc, imageSize);
				
				// 마커를 생성합니다
				var marker = new kakao.maps.Marker({
					map: map, // 마커를 표시할 지도
					position: positions[i].position, // 마커를 표시할 위치
					title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
					image : markerImage // 마커 이미지
				});
				
				kakao.maps.event.addListener(marker, 'click', clickListener(positions[i].position, positions[i].title, positions[i].cctvurl));
			}
	  	});
    });

	function clickListener(position, title, cctvurl){
  		return function(){
    		$("#cctvView").children().remove();
    		
    		// div 생성
    		var content = 
    			'<video controls autoplay style="width: 345px; height:300px;">'
				+'<source src="'+cctvurl+'" type="video/mp4">'
				+'</video>'

    		$("#div_cctv").append(content);
  		}
  	}
*/

/*
	$(".nav-tabs").on("click", "a", function (e) {
		e.preventDefault();
		if (!$(this).hasClass('add-contact')) {
			$(this).tab('show');
		}
	})
	.on("click", "span", function () {
		var anchor = $(this).siblings('a');
		$(anchor.attr('href')).remove();
		$(this).parent().remove();
		$(".nav-tabs li").children('a').first().click();
	});

	$('.add-contact').click(function (e) {
		e.preventDefault();
		var id = $(".nav-tabs").children().length; //think about it ;)
		var tabId = 'contact_' + id;
		$(this).closest('li').before('<li><a href="#contact_' + id + '">New Tab</a> <span> x </span></li>');
		$('.tab-content').append('<div class="tab-pane" id="' + tabId + '">Contact Form: New Contact ' + id + '</div>');
		$('.nav-tabs li:nth-child(' + id + ') a').click();
	});
*/
});