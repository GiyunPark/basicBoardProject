# basicBoardProject
+ 사용자 로그인과 테이블을 이용한 프로젝트

> 구현 목표
  * **REST API 를 활용**
  * vue.js와 axios를 활용
  * 테이블 조회, 수정, 삭제, 생성 기능 구현
  * 검색기능 구현

> 개발 환경   
  * Window pro
  * docker mysql
  * open jdk 1.8.0_202

> 개발도구    
  * intellij ultimate 2019.02

> 사용한 skills   
  * JAVA, Spring Boot, vue.js

> 테이블 정보      
  * user_info   
&nbsp;&nbsp;&nbsp;&nbsp;user_id varchar(55) pk   
&nbsp;&nbsp;&nbsp;&nbsp;name varchar(55)   
&nbsp;&nbsp;&nbsp;&nbsp;updated_at date   
&nbsp;&nbsp;&nbsp;&nbsp;last_visited_at date   

  * board_free   
&nbsp;&nbsp;&nbsp;&nbsp;board_id varchar(55) pk   
&nbsp;&nbsp;&nbsp;&nbsp;title varchar(55)   
&nbsp;&nbsp;&nbsp;&nbsp;writer varchar(55)   
&nbsp;&nbsp;&nbsp;&nbsp;contents varchar(500)   
&nbsp;&nbsp;&nbsp;&nbsp;created_at date   
&nbsp;&nbsp;&nbsp;&nbsp;updated_at date   
&nbsp;&nbsp;&nbsp;&nbsp;count int(11)   
&nbsp;&nbsp;&nbsp;&nbsp;user_id varchar(55) fk on delete cascade   
