-- 회원
DROP TABLE IF EXISTS `USERS` RESTRICT;

-- 학교
DROP TABLE IF EXISTS `USCLS` RESTRICT;

-- 경력
DROP TABLE IF EXISTS `UEXPS` RESTRICT;

-- 기업정보
DROP TABLE IF EXISTS `CINFOS` RESTRICT;

-- 구인공고
DROP TABLE IF EXISTS `CRECS` RESTRICT;

-- 기업사진
DROP TABLE IF EXISTS `CPHOTS` RESTRICT;

-- 기업태그
DROP TABLE IF EXISTS `CTAGS` RESTRICT;

-- 자격증
DROP TABLE IF EXISTS `UCERTS` RESTRICT;

-- 외국어
DROP TABLE IF EXISTS `ULANS` RESTRICT;

-- 보유기술
DROP TABLE IF EXISTS `SKILLS` RESTRICT;

-- 기술연차
DROP TABLE IF EXISTS `YSKILLS` RESTRICT;

-- 기업등록프로젝트
DROP TABLE IF EXISTS `CPJTS` RESTRICT;

-- 프로젝트경력
DROP TABLE IF EXISTS `UPJTNO` RESTRICT;

-- 프로젝트정보문의게시판
DROP TABLE IF EXISTS `PJTBDS` RESTRICT;

-- 프로젝트첨부파일
DROP TABLE IF EXISTS `CPJTATCHS` RESTRICT;

-- 회원사진
DROP TABLE IF EXISTS `UPHOTS` RESTRICT;

-- 회원태그
DROP TABLE IF EXISTS `UTAGS` RESTRICT;

-- 구인정보첨부파일
DROP TABLE IF EXISTS `CREATCHS` RESTRICT;

-- 구인정보필요기술
DROP TABLE IF EXISTS `CRESKILLS` RESTRICT;

-- 프로젝트필요기술
DROP TABLE IF EXISTS `CPJTSKILLS` RESTRICT;

-- 구인정보문의게시판
DROP TABLE IF EXISTS `REBDS` RESTRICT;

-- 회원
CREATE TABLE `USERS` (
	`UNO`  INTEGER      NOT NULL COMMENT '회원일련번호', -- 회원일련번호
	`UNM`  VARCHAR(50)  NOT NULL COMMENT '회원이름', -- 회원이름
	`UENM` VARCHAR(50)  NULL     COMMENT '회원영문이름', -- 회원영문이름
	`UEM`  VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
	`UPW`  VARCHAR(20)  NOT NULL COMMENT '비밀번호', -- 비밀번호
	`UCO`  VARCHAR(20)  NULL     COMMENT '국적', -- 국적
	`USX`  VARCHAR(20)  NULL     COMMENT '성별', -- 성별
	`UCNF` VARCHAR(20)  NOT NULL COMMENT '인증여부', -- 인증여부
	`UBD`  DATE         NULL     COMMENT '생년월일', -- 생년월일
	`UPHO` VARCHAR(30)  NULL     COMMENT '연락처', -- 연락처
	`UADR` VARCHAR(255) NULL     COMMENT '거주지주소', -- 거주지주소
	`UURL` VARCHAR(255) NULL     COMMENT '회원주요URL', -- 회원주요URL
	`URES` TEXT         NULL     COMMENT '회원자기소개서' -- 회원자기소개서
)
COMMENT '회원';

-- 회원
ALTER TABLE `USERS`
	ADD CONSTRAINT `PK_USERS` -- 회원 기본키
		PRIMARY KEY (
			`UNO` -- 회원일련번호
		);

-- 회원 유니크 인덱스
CREATE UNIQUE INDEX `UIX_USERS`
	ON `USERS` ( -- 회원
		`UEM` ASC -- 이메일
	);

-- 학교
CREATE TABLE `USCLS` (
	`SCNO` INTEGER     NOT NULL COMMENT '학교일련번호', -- 학교일련번호
	`SCNM` VARCHAR(50) NOT NULL COMMENT '학교명', -- 학교명
	`SCMJ` VARCHAR(50) NOT NULL COMMENT '학교전공명', -- 학교전공명
	`SCGR` DOUBLE(5,2) NOT NULL COMMENT '학교성적', -- 학교성적
	`SCSD` DATE        NOT NULL COMMENT '학교입학일', -- 학교입학일
	`SCED` DATE        NOT NULL COMMENT '학교졸업일', -- 학교졸업일
	`UNO`  INTEGER     NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '학교';

-- 학교
ALTER TABLE `USCLS`
	ADD CONSTRAINT `PK_USCLS` -- 학교 기본키
		PRIMARY KEY (
			`SCNO` -- 학교일련번호
		);

-- 경력
CREATE TABLE `UEXPS` (
	`EXPNO` INTEGER     NOT NULL COMMENT '경력일련번호', -- 경력일련번호
	`EXPCN` VARCHAR(50) NOT NULL COMMENT '경력회사명', -- 경력회사명
	`EXPDN` VARCHAR(50) NOT NULL COMMENT '경력부서명', -- 경력부서명
	`EXPPY` INTEGER     NULL     COMMENT '경력급여', -- 경력급여
	`EXPSD` DATE        NOT NULL COMMENT '경력입사일', -- 경력입사일
	`EXPED` DATE        NOT NULL COMMENT '경력퇴사일', -- 경력퇴사일
	`EXPWC` TEXT        NOT NULL COMMENT '경력업무내용', -- 경력업무내용
	`EXPPT` VARCHAR(20) NULL     COMMENT '경력직책', -- 경력직책
	`UNO`   INTEGER     NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '경력';

-- 경력
ALTER TABLE `UEXPS`
	ADD CONSTRAINT `PK_UEXPS` -- 경력 기본키
		PRIMARY KEY (
			`EXPNO` -- 경력일련번호
		);

-- 기업정보
CREATE TABLE `CINFOS` (
	`CNO`   INTEGER      NOT NULL COMMENT '기업일련번호', -- 기업일련번호
	`CCT`   VARCHAR(20)  NOT NULL COMMENT '기업분야', -- 기업분야
	`CRGNO` INTEGER      NULL     COMMENT '사업자번호', -- 사업자번호
	`CNM`   VARCHAR(50)  NOT NULL COMMENT '회사명', -- 회사명
	`CSCL`  VARCHAR(20)  NULL     COMMENT '기업규모', -- 기업규모
	`CLO`   VARCHAR(255) NULL     COMMENT '기업위치', -- 기업위치
	`CNPL`  INTEGER      NULL     COMMENT '기업인원', -- 기업인원
	`CINT`  TEXT         NULL     COMMENT '기업설명' -- 기업설명
)
COMMENT '기업정보';

-- 기업정보
ALTER TABLE `CINFOS`
	ADD CONSTRAINT `PK_CINFOS` -- 기업정보 기본키
		PRIMARY KEY (
			`CNO` -- 기업일련번호
		);

-- 기업정보 유니크 인덱스
CREATE UNIQUE INDEX `UIX_CINFOS`
	ON `CINFOS` ( -- 기업정보
		`CRGNO` ASC -- 사업자번호
	);

-- 구인공고
CREATE TABLE `CRECS` (
	`RENO`  INTEGER      NOT NULL COMMENT '구인일련번호', -- 구인일련번호
	`RETL`  VARCHAR(100) NOT NULL COMMENT '채용공고제목', -- 채용공고제목
	`RECNM` VARCHAR(50)  NOT NULL COMMENT '회사명', -- 회사명
	`REWC`  TEXT         NOT NULL COMMENT '주요업무', -- 주요업무
	`RENPL` INTEGER      NOT NULL COMMENT '모집인원', -- 모집인원
	`RECHK` CHAR(1)      NOT NULL COMMENT '경력여부', -- 경력여부
	`REYR`  VARCHAR(20)  NULL     COMMENT '경력연차', -- 경력연차
	`REIDT` VARCHAR(20)  NOT NULL COMMENT '업계', -- 업계
	`REJP`  VARCHAR(20)  NOT NULL COMMENT '직종', -- 직종
	`RETP`  VARCHAR(20)  NOT NULL COMMENT '고용형태', -- 고용형태
	`REPAY` INTEGER      NULL     COMMENT '급여', -- 급여
	`RERG`  VARCHAR(50)  NULL     COMMENT '게시자', -- 게시자
	`RERD`  DATE         NOT NULL COMMENT '게시일', -- 게시일
	`REHTN` INTEGER      NULL     COMMENT '조회수', -- 조회수
	`REAR`  VARCHAR(255) NOT NULL COMMENT '지역', -- 지역
	`REWT`  VARCHAR(20)  NOT NULL COMMENT '근무형태', -- 근무형태
	`CNO`   INTEGER      NOT NULL COMMENT '기업일련번호' -- 기업일련번호
)
COMMENT '구인공고';

-- 구인공고
ALTER TABLE `CRECS`
	ADD CONSTRAINT `PK_CRECS` -- 구인공고 기본키
		PRIMARY KEY (
			`RENO` -- 구인일련번호
		);

-- 기업사진
CREATE TABLE `CPHOTS` (
	`CPHNO` INTEGER    NOT NULL COMMENT '사진일련번호', -- 사진일련번호
	`CPH`   MEDIUMBLOB NOT NULL COMMENT '사진', -- 사진
	`CNO`   INTEGER    NOT NULL COMMENT '기업일련번호' -- 기업일련번호
)
COMMENT '기업사진';

-- 기업사진
ALTER TABLE `CPHOTS`
	ADD CONSTRAINT `PK_CPHOTS` -- 기업사진 기본키
		PRIMARY KEY (
			`CPHNO` -- 사진일련번호
		);

-- 기업태그
CREATE TABLE `CTAGS` (
	`CEXNO` INTEGER     NOT NULL COMMENT '노출태그일련번호', -- 노출태그일련번호
	`CEXTG` VARCHAR(50) NOT NULL COMMENT '노출태그', -- 노출태그
	`CNO`   INTEGER     NOT NULL COMMENT '기업일련번호' -- 기업일련번호
)
COMMENT '기업태그';

-- 기업태그
ALTER TABLE `CTAGS`
	ADD CONSTRAINT `PK_CTAGS` -- 기업태그 기본키
		PRIMARY KEY (
			`CEXNO` -- 노출태그일련번호
		);

-- 자격증
CREATE TABLE `UCERTS` (
	`CTNO`   INTEGER      NOT NULL COMMENT '자격증일련번호', -- 자격증일련번호
	`CTNM`   VARCHAR(50)  NOT NULL COMMENT '자격증명', -- 자격증명
	`CTAG`   VARCHAR(50)  NOT NULL COMMENT '인증기관', -- 인증기관
	`CTUQNO` INTEGER      NOT NULL COMMENT '자격증번호', -- 자격증번호
	`CTSC`   INTEGER      NULL     COMMENT '점수', -- 점수
	`CTURL`  VARCHAR(255) NULL     COMMENT '자격증URL', -- 자격증URL
	`CTDY`   DATE         NULL     COMMENT '시험일', -- 시험일
	`CTSD`   DATE         NULL     COMMENT '발급일', -- 발급일
	`CTED`   DATE         NULL     COMMENT '만료일', -- 만료일
	`UNO`    INTEGER      NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '자격증';

-- 자격증
ALTER TABLE `UCERTS`
	ADD CONSTRAINT `PK_UCERTS` -- 자격증 기본키
		PRIMARY KEY (
			`CTNO` -- 자격증일련번호
		);

-- 외국어
CREATE TABLE `ULANS` (
	`LGNO`  INTEGER     NOT NULL COMMENT '외국어일련번호', -- 외국어일련번호
	`LGNM`  VARCHAR(50) NOT NULL COMMENT '외국어이름', -- 외국어이름
	`LGLVL` TEXT        NOT NULL COMMENT '외국어수준', -- 외국어수준
	`UNO`   INTEGER     NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '외국어';

-- 외국어
ALTER TABLE `ULANS`
	ADD CONSTRAINT `PK_ULANS` -- 외국어 기본키
		PRIMARY KEY (
			`LGNO` -- 외국어일련번호
		);

-- 보유기술
CREATE TABLE `SKILLS` (
	`SKNO` INTEGER      NOT NULL COMMENT '보유기술일련번호', -- 보유기술일련번호
	`SKNM` VARCHAR(100) NOT NULL COMMENT '기술명' -- 기술명
)
COMMENT '보유기술';

-- 보유기술
ALTER TABLE `SKILLS`
	ADD CONSTRAINT `PK_SKILLS` -- 보유기술 기본키
		PRIMARY KEY (
			`SKNO` -- 보유기술일련번호
		);

-- 기술연차
CREATE TABLE `YSKILLS` (
	`YSNO` INTEGER     NOT NULL COMMENT '기술연차일련번호', -- 기술연차일련번호
	`UNO`  INTEGER     NOT NULL COMMENT '회원일련번호', -- 회원일련번호
	`SKNO` INTEGER     NOT NULL COMMENT '보유기술일련번호', -- 보유기술일련번호
	`YSYR` VARCHAR(20) NOT NULL COMMENT '기술연차' -- 기술연차
)
COMMENT '기술연차';

-- 기술연차
ALTER TABLE `YSKILLS`
	ADD CONSTRAINT `PK_YSKILLS` -- 기술연차 기본키
		PRIMARY KEY (
			`YSNO` -- 기술연차일련번호
		);

-- 기업등록프로젝트
CREATE TABLE `CPJTS` (
	`CPJNO`  INTEGER      NOT NULL COMMENT '등록프로젝트일련번호', -- 등록프로젝트일련번호
	`CPJNM`  VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
	`CPJINT` TEXT         NOT NULL COMMENT '설명', -- 설명
	`CPJSK`  VARCHAR(20)  NOT NULL COMMENT '요구되는기술', -- 요구되는기술
	`CPJCHK` CHAR(1)      NOT NULL COMMENT '프로젝트경력여부', -- 프로젝트경력여부
	`CPJYR`  VARCHAR(20)  NULL     COMMENT '프로젝트경력연차', -- 프로젝트경력연차
	`CPJNPL` INTEGER      NOT NULL COMMENT '모집인원', -- 모집인원
	`CPJMNP` INTEGER      NOT NULL COMMENT '급여최소', -- 급여최소
	`CPJMAP` INTEGER      NOT NULL COMMENT '급여최대', -- 급여최대
	`CPJHTN` INTEGER      NULL     COMMENT '조회수', -- 조회수
	`CPJRD`  DATE         NOT NULL COMMENT '등록일', -- 등록일
	`CPJRG`  VARCHAR(50)  NOT NULL COMMENT '게시자', -- 게시자
	`CPJWT`  VARCHAR(20)  NOT NULL COMMENT '근무형태', -- 근무형태
	`CPJAR`  VARCHAR(255) NOT NULL COMMENT '지역명', -- 지역명
	`CNO`    INTEGER      NOT NULL COMMENT '기업일련번호' -- 기업일련번호
)
COMMENT '기업등록프로젝트';

-- 기업등록프로젝트
ALTER TABLE `CPJTS`
	ADD CONSTRAINT `PK_CPJTS` -- 기업등록프로젝트 기본키
		PRIMARY KEY (
			`CPJNO` -- 등록프로젝트일련번호
		);

-- 프로젝트경력
CREATE TABLE `UPJTNO` (
	`PJNO` INTEGER      NOT NULL COMMENT '프로젝트일련번호', -- 프로젝트일련번호
	`UNO`  INTEGER      NOT NULL COMMENT '회원일련번호', -- 회원일련번호
	`PJNM` VARCHAR(100) NOT NULL COMMENT '프로젝트제목', -- 프로젝트제목
	`PJSD` DATE         NOT NULL COMMENT '프로젝트시작일', -- 프로젝트시작일
	`PJED` DATE         NOT NULL COMMENT '프로젝트종료일', -- 프로젝트종료일
	`PJDT` TEXT         NOT NULL COMMENT '프로젝트상세설명', -- 프로젝트상세설명
	`PJPY` VARCHAR(50)  NULL     COMMENT '프로젝트참여자' -- 프로젝트참여자
)
COMMENT '프로젝트경력';

-- 프로젝트경력
ALTER TABLE `UPJTNO`
	ADD CONSTRAINT `PK_UPJTNO` -- 프로젝트경력 기본키
		PRIMARY KEY (
			`PJNO` -- 프로젝트일련번호
		);

-- 프로젝트정보문의게시판
CREATE TABLE `PJTBDS` (
	`PBNO`  INTEGER      NOT NULL COMMENT '문의게시판일련번호', -- 문의게시판일련번호
	`PBTL`  VARCHAR(100) NOT NULL COMMENT '게시물제목', -- 게시물제목
	`PBCT`  TEXT         NOT NULL COMMENT '게시물내용', -- 게시물내용
	`PBRD`  DATE         NOT NULL COMMENT '게시문등록일', -- 게시문등록일
	`PBRG`  VARCHAR(50)  NOT NULL COMMENT '게시문등록자', -- 게시문등록자
	`PBOP`  CHAR(1)      NOT NULL COMMENT '공개여부', -- 공개여부
	`CPJNO` INTEGER      NOT NULL COMMENT '등록프로젝트일련번호', -- 등록프로젝트일련번호
	`UNO`   INTEGER      NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '프로젝트정보문의게시판';

-- 프로젝트정보문의게시판
ALTER TABLE `PJTBDS`
	ADD CONSTRAINT `PK_PJTBDS` -- 프로젝트정보문의게시판 기본키
		PRIMARY KEY (
			`PBNO` -- 문의게시판일련번호
		);

-- 프로젝트첨부파일
CREATE TABLE `CPJTATCHS` (
	`CPJFNO` INTEGER    NOT NULL COMMENT '첨부파일일련번호', -- 첨부파일일련번호
	`CPJFNM` MEDIUMBLOB NOT NULL COMMENT '첨부파일', -- 첨부파일
	`CPJNO`  INTEGER    NOT NULL COMMENT '등록프로젝트일련번호' -- 등록프로젝트일련번호
)
COMMENT '프로젝트첨부파일';

-- 프로젝트첨부파일
ALTER TABLE `CPJTATCHS`
	ADD CONSTRAINT `PK_CPJTATCHS` -- 프로젝트첨부파일 기본키
		PRIMARY KEY (
			`CPJFNO` -- 첨부파일일련번호
		);

-- 회원사진
CREATE TABLE `UPHOTS` (
	`PHNO` INTEGER    NOT NULL COMMENT '사진일련번호', -- 사진일련번호
	`PHOT` MEDIUMBLOB NOT NULL COMMENT '사진', -- 사진
	`UNO`  INTEGER    NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '회원사진';

-- 회원사진
ALTER TABLE `UPHOTS`
	ADD CONSTRAINT `PK_UPHOTS` -- 회원사진 기본키
		PRIMARY KEY (
			`PHNO` -- 사진일련번호
		);

-- 회원태그
CREATE TABLE `UTAGS` (
	`UEXNO` INTEGER     NOT NULL COMMENT '노출태그일련번호', -- 노출태그일련번호
	`UEXTG` VARCHAR(50) NOT NULL COMMENT '노출태그', -- 노출태그
	`UNO`   INTEGER     NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '회원태그';

-- 회원태그
ALTER TABLE `UTAGS`
	ADD CONSTRAINT `PK_UTAGS` -- 회원태그 기본키
		PRIMARY KEY (
			`UEXNO` -- 노출태그일련번호
		);

-- 구인정보첨부파일
CREATE TABLE `CREATCHS` (
	`REFNO` INTEGER    NOT NULL COMMENT '첨부파일일련번호', -- 첨부파일일련번호
	`REFNM` MEDIUMBLOB NOT NULL COMMENT '첨부파일', -- 첨부파일
	`RENO`  INTEGER    NOT NULL COMMENT '구인일련번호' -- 구인일련번호
)
COMMENT '구인정보첨부파일';

-- 구인정보첨부파일
ALTER TABLE `CREATCHS`
	ADD CONSTRAINT `PK_CREATCHS` -- 구인정보첨부파일 기본키
		PRIMARY KEY (
			`REFNO` -- 첨부파일일련번호
		);

-- 구인정보필요기술
CREATE TABLE `CRESKILLS` (
	`RENO` INTEGER NOT NULL COMMENT '구인일련번호', -- 구인일련번호
	`SKNO` INTEGER NOT NULL COMMENT '보유기술일련번호' -- 보유기술일련번호
)
COMMENT '구인정보필요기술';

-- 구인정보필요기술
ALTER TABLE `CRESKILLS`
	ADD CONSTRAINT `PK_CRESKILLS` -- 구인정보필요기술 기본키
		PRIMARY KEY (
			`RENO`, -- 구인일련번호
			`SKNO`  -- 보유기술일련번호
		);

-- 프로젝트필요기술
CREATE TABLE `CPJTSKILLS` (
	`CPJNO` INTEGER NOT NULL COMMENT '등록프로젝트일련번호', -- 등록프로젝트일련번호
	`SKNO`  INTEGER NOT NULL COMMENT '보유기술일련번호' -- 보유기술일련번호
)
COMMENT '프로젝트필요기술';

-- 프로젝트필요기술
ALTER TABLE `CPJTSKILLS`
	ADD CONSTRAINT `PK_CPJTSKILLS` -- 프로젝트필요기술 기본키
		PRIMARY KEY (
			`CPJNO`, -- 등록프로젝트일련번호
			`SKNO`   -- 보유기술일련번호
		);

-- 구인정보문의게시판
CREATE TABLE `REBDS` (
	`RBNO` INTEGER      NOT NULL COMMENT '문의게시판일련번호', -- 문의게시판일련번호
	`RBTL` VARCHAR(100) NOT NULL COMMENT '게시물제목', -- 게시물제목
	`RBCT` TEXT         NOT NULL COMMENT '게시물내용', -- 게시물내용
	`RBRD` DATE         NOT NULL COMMENT '게시문등록일', -- 게시문등록일
	`RBRG` VARCHAR(50)  NOT NULL COMMENT '게시문등록자', -- 게시문등록자
	`RBOP` CHAR(1)      NOT NULL COMMENT '공개여부', -- 공개여부
	`RENO` INTEGER      NOT NULL COMMENT '구인일련번호', -- 구인일련번호
	`UNO`  INTEGER      NOT NULL COMMENT '회원일련번호' -- 회원일련번호
)
COMMENT '구인정보문의게시판';

-- 구인정보문의게시판
ALTER TABLE `REBDS`
	ADD CONSTRAINT `PK_REBDS` -- 구인정보문의게시판 기본키
		PRIMARY KEY (
			`RBNO` -- 문의게시판일련번호
		);

-- 학교
ALTER TABLE `USCLS`
	ADD CONSTRAINT `FK_USERS_TO_USCLS` -- 회원 -> 학교
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 경력
ALTER TABLE `UEXPS`
	ADD CONSTRAINT `FK_USERS_TO_UEXPS` -- 회원 -> 경력
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 구인공고
ALTER TABLE `CRECS`
	ADD CONSTRAINT `FK_CINFOS_TO_CRECS` -- 기업정보 -> 구인공고
		FOREIGN KEY (
			`CNO` -- 기업일련번호
		)
		REFERENCES `CINFOS` ( -- 기업정보
			`CNO` -- 기업일련번호
		);

-- 기업사진
ALTER TABLE `CPHOTS`
	ADD CONSTRAINT `FK_CINFOS_TO_CPHOTS` -- 기업정보 -> 기업사진
		FOREIGN KEY (
			`CNO` -- 기업일련번호
		)
		REFERENCES `CINFOS` ( -- 기업정보
			`CNO` -- 기업일련번호
		);

-- 기업태그
ALTER TABLE `CTAGS`
	ADD CONSTRAINT `FK_CINFOS_TO_CTAGS` -- 기업정보 -> 기업태그
		FOREIGN KEY (
			`CNO` -- 기업일련번호
		)
		REFERENCES `CINFOS` ( -- 기업정보
			`CNO` -- 기업일련번호
		);

-- 자격증
ALTER TABLE `UCERTS`
	ADD CONSTRAINT `FK_USERS_TO_UCERTS` -- 회원 -> 자격증
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 외국어
ALTER TABLE `ULANS`
	ADD CONSTRAINT `FK_USERS_TO_ULANS` -- 회원 -> 외국어
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 기술연차
ALTER TABLE `YSKILLS`
	ADD CONSTRAINT `FK_SKILLS_TO_YSKILLS` -- 보유기술 -> 기술연차
		FOREIGN KEY (
			`SKNO` -- 보유기술일련번호
		)
		REFERENCES `SKILLS` ( -- 보유기술
			`SKNO` -- 보유기술일련번호
		);

-- 기술연차
ALTER TABLE `YSKILLS`
	ADD CONSTRAINT `FK_USERS_TO_YSKILLS` -- 회원 -> 기술연차
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 기업등록프로젝트
ALTER TABLE `CPJTS`
	ADD CONSTRAINT `FK_CINFOS_TO_CPJTS` -- 기업정보 -> 기업등록프로젝트
		FOREIGN KEY (
			`CNO` -- 기업일련번호
		)
		REFERENCES `CINFOS` ( -- 기업정보
			`CNO` -- 기업일련번호
		);

-- 프로젝트경력
ALTER TABLE `UPJTNO`
	ADD CONSTRAINT `FK_USERS_TO_UPJTNO` -- 회원 -> 프로젝트경력
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 프로젝트정보문의게시판
ALTER TABLE `PJTBDS`
	ADD CONSTRAINT `FK_CPJTS_TO_PJTBDS` -- 기업등록프로젝트 -> 프로젝트정보문의게시판
		FOREIGN KEY (
			`CPJNO` -- 등록프로젝트일련번호
		)
		REFERENCES `CPJTS` ( -- 기업등록프로젝트
			`CPJNO` -- 등록프로젝트일련번호
		);

-- 프로젝트정보문의게시판
ALTER TABLE `PJTBDS`
	ADD CONSTRAINT `FK_USERS_TO_PJTBDS` -- 회원 -> 프로젝트정보문의게시판
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 프로젝트첨부파일
ALTER TABLE `CPJTATCHS`
	ADD CONSTRAINT `FK_CPJTS_TO_CPJTATCHS` -- 기업등록프로젝트 -> 프로젝트첨부파일
		FOREIGN KEY (
			`CPJNO` -- 등록프로젝트일련번호
		)
		REFERENCES `CPJTS` ( -- 기업등록프로젝트
			`CPJNO` -- 등록프로젝트일련번호
		);

-- 회원사진
ALTER TABLE `UPHOTS`
	ADD CONSTRAINT `FK_USERS_TO_UPHOTS` -- 회원 -> 회원사진
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 회원태그
ALTER TABLE `UTAGS`
	ADD CONSTRAINT `FK_USERS_TO_UTAGS` -- 회원 -> 회원태그
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);

-- 구인정보첨부파일
ALTER TABLE `CREATCHS`
	ADD CONSTRAINT `FK_CRECS_TO_CREATCHS` -- 구인공고 -> 구인정보첨부파일
		FOREIGN KEY (
			`RENO` -- 구인일련번호
		)
		REFERENCES `CRECS` ( -- 구인공고
			`RENO` -- 구인일련번호
		);

-- 구인정보필요기술
ALTER TABLE `CRESKILLS`
	ADD CONSTRAINT `FK_CRECS_TO_CRESKILLS` -- 구인공고 -> 구인정보필요기술
		FOREIGN KEY (
			`RENO` -- 구인일련번호
		)
		REFERENCES `CRECS` ( -- 구인공고
			`RENO` -- 구인일련번호
		);

-- 구인정보필요기술
ALTER TABLE `CRESKILLS`
	ADD CONSTRAINT `FK_SKILLS_TO_CRESKILLS` -- 보유기술 -> 구인정보필요기술
		FOREIGN KEY (
			`SKNO` -- 보유기술일련번호
		)
		REFERENCES `SKILLS` ( -- 보유기술
			`SKNO` -- 보유기술일련번호
		);

-- 프로젝트필요기술
ALTER TABLE `CPJTSKILLS`
	ADD CONSTRAINT `FK_CPJTS_TO_CPJTSKILLS` -- 기업등록프로젝트 -> 프로젝트필요기술
		FOREIGN KEY (
			`CPJNO` -- 등록프로젝트일련번호
		)
		REFERENCES `CPJTS` ( -- 기업등록프로젝트
			`CPJNO` -- 등록프로젝트일련번호
		);

-- 프로젝트필요기술
ALTER TABLE `CPJTSKILLS`
	ADD CONSTRAINT `FK_SKILLS_TO_CPJTSKILLS` -- 보유기술 -> 프로젝트필요기술
		FOREIGN KEY (
			`SKNO` -- 보유기술일련번호
		)
		REFERENCES `SKILLS` ( -- 보유기술
			`SKNO` -- 보유기술일련번호
		);

-- 구인정보문의게시판
ALTER TABLE `REBDS`
	ADD CONSTRAINT `FK_CRECS_TO_REBDS` -- 구인공고 -> 구인정보문의게시판
		FOREIGN KEY (
			`RENO` -- 구인일련번호
		)
		REFERENCES `CRECS` ( -- 구인공고
			`RENO` -- 구인일련번호
		);

-- 구인정보문의게시판
ALTER TABLE `REBDS`
	ADD CONSTRAINT `FK_USERS_TO_REBDS` -- 회원 -> 구인정보문의게시판
		FOREIGN KEY (
			`UNO` -- 회원일련번호
		)
		REFERENCES `USERS` ( -- 회원
			`UNO` -- 회원일련번호
		);



-- auto_increment 설정 시작--
alter table USERS modify UNO int auto_increment;
alter table USCLS modify SCNO int auto_increment;
alter table UEXPS modify EXPNO int auto_increment;
alter table CINFOS modify CNO int auto_increment;
alter table CRECS modify RENO int auto_increment;
alter table CPHOTS modify CPHNO int auto_increment;
alter table CTAGS modify CEXNO int auto_increment;
alter table UCERTS modify CTNO int auto_increment;
alter table ULANS modify LGNO int auto_increment;
alter table SKILLS modify SKNO int auto_increment;
alter table YSKILLS modify YSNO int auto_increment;
alter table CPJTS modify CPJNO int auto_increment;
alter table UPJTNO modify PJNO int auto_increment;
alter table PJTBDS modify PBNO int auto_increment;
alter table CPJTATCHS modify CPJFNO int auto_increment;
alter table UPHOTS modify PHNO int auto_increment;
alter table UTAGS modify UEXNO int auto_increment;
alter table CREATCHS modify REFNO int auto_increment;
alter table CRESKILLS modify RENO int auto_increment;
alter table CPJTSKILLS modify CPJNO int auto_increment;
alter table REBDS modify RBNO int auto_increment;
-- auto_increment 설정 끝--