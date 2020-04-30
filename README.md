# basicBoardProject
사용자 로그인과 테이블을 이용한 프로젝트

구현 목표
vue.js와 axios를 활용
테이블 조회, 수정, 삭제, 생성 기능 구현
검색기능 구현

개발 환경
Window pro
docker mysql
open jdk 1.8.0_202

개발도구 
intellij ultimate 2019.02

사용한 skills
JAVA, Spring Boot, vue.js

테이블 정보 
user_info
  user_id varchar(55) pk
  name varchar(55)
  created_at date
  updated_at date
  last_visited_at date

board_free
  board_id varchar(55) pk
  title varchar(55)
  writer varchar(55)
  contents varchar(500)
  created_at date
  updated_at date
  count int(11)
  user_id varchar(55) fk on delete cascade
