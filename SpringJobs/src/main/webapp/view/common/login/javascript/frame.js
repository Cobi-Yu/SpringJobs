//로그인 체크
$(document).ready(function() {
	$.ajax({
		url : contextRoot + "/loginCheck",
		method : "POST",
		dataType : "json",
		headers : {
			"Accept" : "application/json",
			"Content-Type" : "application/json"
		},
		success : function(data, status) {
			console.log(data.user);
			if (data.user) {
				$('#loginTable').load('loginSucess.html', function() {
					$('#uem').text(data.user.uem);
				});
				user=data.user;
			}else{
				user=null;
			}
		},
		error:function(req,status,error){
			user=null;
		}
	});
	
	if ($('.main').height() > $('.sidenav').height()) {
		$('.sidenav').height($('.main').height());
	}
});
// 로그인 체크 끝

// sub 상단바 시작
$('.dropdown').hover(function() {
	$(this).find('.dropdown-menu').stop(true, true).delay(50).fadeIn();
}, function() {
	$(this).find('.dropdown-menu').stop(true, true).delay(50).fadeOut();
});
// sub 상단바 끝

// 로그인 이벤트
$('#loginButton').click(
		function() {
			$.ajax({
				url : contextRoot + "/login",
				method : "POST",
				dataType : "json",
				data : '{"uem":"' + $("#uem").val() + '","upw":"'
						+ $("#upw").val() + '"}',
				headers : {
					"Accept" : "application/json",
					"Content-Type" : "application/json"
				},
				success : function(data, status) {
					console.log(data);
					if (data.user) {
						alert("로그인 완료");
						location.reload();
					} else {
						user=null;
						alert("로그인 실패");
					}
				},
				error:function(req,status,error){
					user=null;
				}
			});
		});
// 로그인 이벤트 끝
$('#signUp').click(function() {
	location.href = '../addUser/addUser.html';
})