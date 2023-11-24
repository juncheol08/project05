## 📍Chunjae Project 05
천재교육 풀스택 JAVA 과정 2기 5차 개인 프로젝트 _Tsherpa 홈페이지
<br><br>

## 🖥️ 프로젝트 : TSHERPA (2023.11.03 - 2023.11.17)
<p align="center">온라인 중고거래 플랫폼</p>
<br>
<p align="center"></p>
<br><br>


### ⚙️ 개발 환경
<div align=center> 
<img src="https://img.shields.io/badge/html5-E34F26?style=for-the-badge&logo=html5&logoColor=white">
<img src="https://img.shields.io/badge/css-0769AD?style=for-the-badge&logo=css&logoColor=white">
<img src="https://img.shields.io/badge/bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white">
<img src="https://img.shields.io/badge/jquery-0769AD?style=for-the-badge&logo=jquery&logoColor=white">
<br>
<img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/intellijidea-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
<br>
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
<img src="https://img.shields.io/badge/fontawesome-339AF0?style=for-the-badge&logo=fontawesome&logoColor=white">
<br>
<img src="https://img.shields.io/badge/mariaDB-003545?style=for-the-badge&logo=mariaDB&logoColor=white">
<img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">
</div>
<br><br>

## ⚒프로젝트 설계


### 📂DATABASE - 테이블 ERD
<p align="center"><img alt="usecasediagram1" src="readme/tsherpa_my.png"></p>
<br><br>

### 📂DATABASE - 테이블 구현
#### ROLE
<p align="center"><img alt="role" src="readme/table/role.png"></p>

#### USER
<p align="center"><img alt="user" src="readme/table/user.png"></p>

#### MARKET
<p align="center"><img alt="MARKET" src="readme/table/market.png"></p>


#### CHATROOM
<p align="center"><img alt="CHATROOM" src="readme/table/chatRoom.png"></p>


#### CHATLIST
<p align="center"><img alt="CHATLIST" src="readme/table/chatList.png"></p>


#### MAINPHOTO
<p align="center"><img alt="MAINPHOTO" src="readme/table/mainphoto.png"></p>


#### PHOTOS
<p align="center"><img alt="PHOTOS" src="readme/table/photos.png"></p>


#### LIKES
<p align="center"><img alt="LIKES" src="readme/table/likes.png"></p>


#### REPORT
<p align="center"><img alt="REPORT" src="readme/table/report.png"></p>


#### FAQ
<p align="center"><img alt="FAQ" src="readme/table/faq.png"></p>

                    
#### NOTICE
<p align="center"><img alt="NOTICE" src="readme/table/notice.png"></p>

                    
#### QNA
<p align="center"><img alt="QNA" src="readme/table/qna.png"></p>


<br><br>

### 📂개념적 설계 (USECASE DIAGRAM)
<p align="center"><img alt="usecasediagram1" src="https://github.com/jungleGOGO/project05/assets/138674233/4a44440b-3ad5-4258-b937-e53af368f8dd"></p>
<br><br>


### 📂CLASS DIAGRAM
<p align="center"><img alt="usecasediagram1" src="readme/package.png"></p>


<br><br>

### 📂시퀀스 다이어그램 (Sequence Diagram)

#### 관리자
<p align="center"><img alt="시퀀스다이아그램1" src="https://github.com/jungleGOGO/project05/assets/138674233/f165e11f-2686-4908-a960-003fff962211"></p>


#### 팝니다
<p align="center"><img alt="시퀀스다이아그램1" src="https://github.com/jungleGOGO/project05/assets/138674233/757831e9-1cfc-42d9-9fa6-53f0a9f9e8f1"></p>
<br><br>

# 📎기능 구현
## 🗂 메인 페이지
<br>
<p align="center"><img alt="main" src="readme/구현화면/1메인화면.png"></p>


<br><br>

## 🗂 회원 기능
### 1. 로그인
- DB값 검증
- Spring Security 통한 로그인 인증 처리 및 권한 부여 구현
- 로그아웃
  <br>
<p align="center"><img alt="main" src="readme/구현화면/2로그인.png"></p>
  <br><br>

### 2. 회원가입
- 주소 API 연동
- ID 중복 체크
- 비밀번호 유효성 검사
  <br>
  <p align="center"><img alt="main" src="readme/구현화면/3회원가입.png"></p>
  <br><br>
 
  
### 3. 아이디 찾기
- 고객의 이메일, 전화번호 정보를 통한 아이디 존재 유무 검사
- 앞의 3자리만 보이도록 익명 처리
  <br>
  <p align="center"><img alt="main" src="readme/구현화면/4아이디찾기.png"></p>
  <br>
  <p align="center"><img alt="main" src="readme/구현화면/4아이디찾기2.png"></p>
  <br><br>

### 4. 비밀번호 찾기
- 네이버 메일 연동
- 가입한 이메일로 임시 비밀번호 발급
- 발급된 비밀번호 암호화 되어 DB에 저장
 <br>
 <p align="center"><img alt="main" src="readme/구현화면/6비밀번호찾이.png"></p>
  <br>
 <p align="center"><img alt="main" src="readme/구현화면/6비번찾기메일전송.png"></p>
  <br>
 <p align="center"><img alt="main" src="readme/구현화면/7비번찾기발급메일.png"></p>

<br><br>

### 5. 마이페이지
- 본인이 작성한 판매글, 신고내역, 찜 목록 확인 가능
- 회원정보 수정
- 비밀번호 수정
<br>
 <p align="center"><img alt="main" src="readme/구현화면/마이페이지.png"></p>

<br>
 <p align="center"><img alt="main" src="readme/구현화면/마이페이지_정보수정.png"></p>

<br>
 <p align="center"><img alt="main" src="readme/구현화면/마이페이지_비번변경.png"></p>
  <br>
## 🗂 장터 기능
### 1. 팝니다
- 비회원 : 열람 가능
- 회원 : 글쓰기/ 채팅 / 신고 / 찜하기 가능
- 네이버 지도 API 적용하여 상세주소 구현
  <br>
 <p align="center"><img alt="main" src="readme/구현화면/8팝니다리스트.png"></p>
 <br>
 <p align="center"><img alt="main" src="readme/구현화면/9팝니다상세.png"></p>
  <br><br>
  

### 2. 채팅
- stomp.js / socket.js 활용하여 구현
- 1 대 1 채팅 
- DB에 채팅 내용 실시간 반영
  <br>
   <p align="center"><img alt="main" src="readme/구현화면/10채팅방.png"></p>
   <br>
    <p align="center"><img alt="main" src="readme/구현화면/11채팅상세.png"></p>
  <br><br>


## 🗂 신고/ 찜하기 기능
- 회원만 신고 및 찜하기 가능
- 신고 : 이미 신고한 회원 중복 신고 방지
- AJAX 활용하여 찜하기 기능 구현
  <br>
      <p align="center"><img alt="main" src="readme/구현화면/12신고.png"></p>
<br>
<p align="center"><img alt="main" src="readme/구현화면/13신고.png"></p>
<br>
<p align="center"><img alt="main" src="readme/구현화면/14신고.png"></p>
  <br><br>

## 🗂 Q & A
### 1. 비로그인 및 회원 로그인 시
- 비로그인 시 Q & A 목록만 확인 가능하도록 구현
- 회원 로그인 시 질문글만 작성 가능
- 질문글을 작성한 사용자만 글 수정, 삭제 가능
  <br>
  <p align="center"><img alt="main" src="readme/구현화면/qna.png"></p>
  <br>


  <br><br>
  
### 2. 관리자 로그인 시
- 관리자 로그인 시 전체 게시글 CRUD 가능하도록 구현
- 관리자 페이지에서 미답변 질문 글 목록을 확인 후 바로 답변할 수 있도록 구현
  <br>

    <p align="center"><img alt="main" src="readme/구현화면/관리자_QNA.png"></p>
<br>

  <br><br>
  
## 🗂 공지사항
- 관리자만 공지사항 글 쓰기, 수정, 삭제 가능하도록 구현
- 회원은 공지사항 글 상세 보기만 가능하도록 구현
  <br>
    <p align="center"><img alt="main" src="readme/구현화면/관리자_공지.png"></p>

  <br><br>

## 🗂 FAQ
- FAQ 글 목록 화면 및 기능 구현
  <br>
      <p align="center"><img alt="main" src="readme/구현화면/faq.png"></p>

  <br><br>
  

## 🗂 관리자페이지
- 회원관리
- 커뮤니티 관리 : 공지사항 CRUD / 미답변 질문글 답변하기
- AJAX를 활요하여 신고된 회원 상태 변경
- 신고된 글 삭제 가능 
    <p align="center"><img alt="main" src="readme/구현화면/관리자_회원목록.png"></p>
    <br>
        <p align="center"><img alt="main" src="readme/구현화면/관리자_신고목록.png"></p>
        <br>
        <p align="center"><img alt="main" src="readme/구현화면/관리자_신고회원목록.png"></p>

      

