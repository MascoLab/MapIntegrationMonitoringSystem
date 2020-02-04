$(document).ready(function(){
	
	$(".jsBtnShow1").on("click", function(){
		$( $(this).attr("href") ).show();
		return false;
	});
	$(".jsBtnClose1").on("click", function(){
		$( $(this).attr("href") ).hide();
		return false;
	});

	$("#header .btnClose").on("click", function(){
		if ( $(this).parent().parent().hasClass("closed") )
			$(this).parent().parent().removeClass("closed");
		else
			$(this).parent().parent().addClass("closed");
		return false;
	});

	$(".mBtn1 .iDelete").on("click", function(){
		$(this).parent().hide();
		return false;
	});

	$(".gMod1 .iClose").on("click", function(){
		$(this).parent().parent().parent().hide();
		return false;
	});




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
});