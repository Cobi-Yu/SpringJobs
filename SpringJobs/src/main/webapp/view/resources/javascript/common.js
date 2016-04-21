var contextRoot = "http://t1.java78.com:8080"; //Spring ContextRoot
var nodeContextRoot = "http://52.79.155.246:1337";//Node ContextRoot
var user;//현재 로그인한 사용자

//redirect할 함수 시작
var redirect = function(id,url){
	id.click(function(event){
		event.preventDefault();
		location.href=url;
	})
};
//redirect할 함수 끝

//로딩 이미지 시작
var loading ='<div class="wrap-loading"><div><img src="/view/resources/img/loading.gif" height="150" width="150"/></div></div>';

var addLoading = function(){
//	$('.content').addClass('display-none');
//	$('#footer').addClass('display-none');
	if($('.wrap-loading')){
		$('.text-center').append(loading);
	}
};

var removeLoading = function(){
	$('.wrap-loading').addClass('display-none');
	$('.content').removeClass('display-none');
	$('#footer').removeClass('display-none');
};
//로딩 이미지 끝

//모달창
var callModal = function(msg){
	$('.modal').modal({
		remote : '/view/common/modal/modal.html',
	});
	$('.modal').on('shown.bs.modal', function (e) {
		$('#modalMsg').text(msg);
	});
};
//모달 창 끝