var contextRoot = "http://t1.java78.com:8080"; //Spring ContextRoot
var nodeContextRoot = "http://52.79.155.246:1337";//Node ContextRoot
var user;//현재 로그인한 사용자

//redirect할 함수 시작
var redirect = function(id,url){
	id.click(function(event){
		event.preventDefault();
		location.href=url;
	});
};
//redirect할 함수 끝

//로딩 이미지 시작
var addLoading = function(){
	var loading ='<div class="wrap-loading"><img src="/view/resources/img/loading.gif" height="150" width="150"/></div>';
//	$('.content').addClass('display-none');
//	$('#footer').addClass('display-none');
	if($('.wrap-loading')){
		$('body').append(loading);
	}
};

var removeLoading = function(){
	$('.wrap-loading').remove();
	$('.content').removeClass('display-none');
	$('#footer').removeClass('display-none');
};
//로딩 이미지 끝

//URL 파싱
	var getUrlParameter = function (){  
	 
		   var ParameterObject = new Object();  
		   var locate = location.href;  
		 
		   if(locate.indexOf("?")==-1){  
		            return ParameterObject;  
		   }  
		 
		   var parameter = locate.split("?")[1];  
		   var paramAreay = parameter.split("&");  
		   
		   for ( var i=0; i<paramAreay.length; i++ )  {  
		         var tem = paramAreay[i].split("=");  
		         ParameterObject[tem[0]] = tem[1];  
		   }
		   
		   getUrlParameter = function () { 
			   return ParameterObject; 
		   }  
		       return ParameterObject;  
	   };  
//URL 파싱 끝

//모달창
var callModal = function(title, msg, url){
	$('.modal').modal({
		remote : '/view/common/modal/modal.html',
	});
	$('.modal').on('shown.bs.modal', function (e) {
		$('.modal-header').text(title);
		$('#modalMsg').text(msg);
		if(url){
			redirect($('#modalBtn'),url);
		}
	});
};
//모달 창 끝