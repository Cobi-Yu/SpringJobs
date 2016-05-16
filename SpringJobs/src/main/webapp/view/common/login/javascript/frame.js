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
					if(!data.user.uphots[0]['phot']){//사진이 없을때
						$( "#upho" ).attr( "src", "/view/resources/img/unknown.jpg");
					}else{//사진이 있을때
						$( "#upho" ).attr( "src", data.user.uphots[0]['phot']);
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
						callModal('경고','계정정보가 올바르지 않습니다.');
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



$('#addComp').click(function(){
	if( (user==null) ){
		callModal('경고','로그인 해주세요');
	}else{
		$.ajax({
			url : contextRoot + "/company/getComp?uno="+user.uno,
			method : "GET",
			dataType : "json",
			headers : {
				"Accept" : "application/json",
				"Content-Type" : "application/json"
			},
			success : function(data, status) {
	        	console.log(data.cinfos);
				if(data.cinfos==null){
					$('#pfModal7table').load('/view/company/addCompany/Cinfos/modifiedComp.html');
				}else{
					$('#pfModal7table').load('/view/company/addCompany/Cinfos/getComp.html', function() {
	    				console.log(data.cinfos);
	    				$('#cct').text(data.cinfos.cct);
	    				$('#crgno').text(data.cinfos.crgno);
	    				$('#cnm').text(data.cinfos.cnm);
	    				$('#cscl').text(data.cinfos.cscl);
	    				$('#clo').text(data.cinfos.clo);
	    				$('#cnpl').text(data.cinfos.cnpl);
	    				$('#cint').text(data.cinfos.cint);	   
	    			});
				}
		
				$('#pfModal7').modal(); 
			}
		});
	}
}); 


//주소검색
	//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
	function sample4_execDaumPostcode() {
		new daum.Postcode(
				{
					oncomplete : function(data) {
						// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

						// 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
						// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
						var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
						var extraRoadAddr = ''; // 도로명 조합형 주소 변수

						// 법정동명이 있을 경우 추가한다. (법정리는 제외)
						// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
						if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
							extraRoadAddr += data.bname;
						}
						// 건물명이 있고, 공동주택일 경우 추가한다.
						if (data.buildingName !== '' && data.apartment === 'Y') {
							extraRoadAddr += (extraRoadAddr !== '' ? ', '
									+ data.buildingName : data.buildingName);
						}
						// 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
						if (extraRoadAddr !== '') {
							extraRoadAddr = ' (' + extraRoadAddr + ')';
						}
						// 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
						if (fullRoadAddr !== '') {
							fullRoadAddr += extraRoadAddr;
						}

						// 우편번호와 주소 정보를 해당 필드에 넣는다.
						document.getElementById('sample4_postcode').value = data.zonecode; //5자리 새우편번호 사용
						document.getElementById('sample4_roadAddress').value = fullRoadAddr;
						document.getElementById('sample4_jibunAddress').value = data.jibunAddress;

						// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
						if (data.autoRoadAddress) {
							//예상되는 도로명 주소에 조합형 주소를 추가한다.
							var expRoadAddr = data.autoRoadAddress
									+ extraRoadAddr;
							document.getElementById('guide').innerHTML = '(예상 도로명 주소 : '
									+ expRoadAddr + ')';

						} else if (data.autoJibunAddress) {
							var expJibunAddr = data.autoJibunAddress;
							document.getElementById('guide').innerHTML = '(예상 지번 주소 : '
									+ expJibunAddr + ')';

						} else {
							document.getElementById('guide').innerHTML = '';
						}
					}
				}).open();
	}    
	// 주소검색 js 끝
	
redirect($('#index'),'/view/index.html');
redirect($('#signUp'),'/view/common/addUser/addUser.html');
redirect($('#addJob'),'/view/company/addJob/addJob.html',true);
redirect($('#getJob'),'/view/company/getJob/getJob.html');
redirect($('#projectList'),'/view/developer/projectList/projectList.html');
redirect($('#addInfo'),'/view/developer/addInfo/addInfo.html',true); // 개인이력관리 링크
redirect($('#introduction'),'/view/common/introduction/springjobs.html'); // 스프링잡스 소개
redirect($('#addProject'),'/view/company/addProject/addProject.html',true);
redirect($('#SpringJobsIntro'),'/view/common/login/SpringJobs.html');
redirect($('#frame'),'/view/common/intro/intro.html');
redirect($('#developerList'),'/view/company/developerList/developerList.html');
redirect($('#myProject'),'/view/developer/myProject/myProject.html', true);