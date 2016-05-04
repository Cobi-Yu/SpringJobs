$('head').append( $('<link rel="stylesheet" type="text/css"/>').attr('href', '/view/common/login/css/freelancer.css') );

//로그인 체크
	$.ajax({
		url : contextRoot + "/loginCheck",
		method : "POST",
		dataType : "json",
		headers : {
			"Accept" : "application/json",
			"Content-Type" : "application/json"
		},
		beforeSend : addLoading,
		complete : removeLoading,
		success : function(data, status) {
			console.log(data.user);
			if (data.user) {
				$('#loginul').load('/view/common/login/loginSucess.html', function() {
					$('#uem').text(data.user.uem);
					$(this).next().children('a').text(data.user.unm);
					if(!data.user.upho){//사진이 없을때
						$( "#upho" ).attr( "src", "/view/resources/img/unknown.jpg");
					}else{//사진이 있을때
						$( "#upho" ).attr( "src", "/view/resources/img/unknown.jpg");
//						$( "#upho" ).attr( "src", data.user.upho);// 제대로 사진데이터 입력되면 꼭 주석풀어야됨 위에꺼 지우고
					}
				});
				user=data.user;
			}else{
				user=null;
			}
			$(document).trigger('frameComplete');
		},
		error:function(req,status,error){
			callModal('경고','알수없는 에러');
			user=null;
			$(document).trigger('frameComplete');
		}
	});
	
	if ($('.main').height() > $('.sidenav').height()) {
		$('.sidenav').height($('.main').height());
	}
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
				//로딩 이미지 추가 필수부분 시작
				beforeSend : addLoading,
				complete : removeLoading,
				//로딩 이미지 추가 필수부분 끝
				success : function(data, status) {
					console.log(data);
					if (data.user) {
						location.reload();
					} else {
						user=null;
						callModal('경고','아이디, 비밀번호가 맞지 않습니다.');
					}
				},
				error:function(req,status,error){
					callModal('경고','알수없는 에러');
					user=null;
				}
			});
		});

$('.dropdown').hover(function(){
	$(this).addClass('active');
},function(){
	$(this).removeClass('active');
});
$('.navbar-nav').css('left',$(window).width()/105+'%');
$(window).resize(function(){
	$('.navbar-nav').css('left',$(window).width()/90+'%');
	
});

redirect($('#index'),'/view/index.html');
redirect($('#signUp'),'/view/common/addUser/addUser.html');
redirect($('#addJob'),'/view/company/addJob/addJob.html',true);
redirect($('#getJob'),'/view/company/getJob/getJob.html');
redirect($('#projectList'),'/view/developer/projectList/projectList.html');
redirect($('#addInfo'),'/view/developer/addInfo/addInfo.html',true); // 개인이력관리 링크
redirect($('#introduction'),'/view/common/introduction/springjobs.html'); // 스프링잡스 소개
redirect($('#addProject'),'/view/company/addProject/addProject.html',true);
redirect($('#SpringJobsIntro'),'/view/common/login/SpringJobs.html');
redirect($('#frame'),'/view/common/login/frame.html');