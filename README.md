# MIMI LOCKED: 등골오싹 대작전 (강씨의 여친 구출) - Escape Room

![image](https://github.com/user-attachments/assets/32ca70b9-8fae-401f-9df0-e68503b0ba3c)


## 프로젝트 소개

"MIMI LOCKED: 등골오싹 대작전"은 스릴러 및 공포 테마의 텍스트 기반 방탈출 게임입니다. 학교에 갇힌 여자친구를 구출하기 위해, 플레이어는 각 교실에 숨겨진 다양한 문제들을 풀어나가야 합니다.

## 주요 특징

- **몰입감 넘치는 스토리:** 스릴러와 공포 요소를 가미하여 긴장감과 몰입도를 높였습니다.
- **다양한 문제 해결:** 추리력과 문제 해결 능력을 요구하는 다채로운 문제들이 준비되어 있습니다.
- **단계별 난이도 구성:** 과학실, 미술실, 음악실, 컴퓨터실 순으로 진행되며, 각 방마다 난이도가 점차 상승합니다.
- **회원 시스템:** 회원가입 및 로그인 기능을 통해 게임 이용자 정보를 관리합니다.

## 게임 방법

1. 회원가입 후 로그인을 합니다.
2. 게임을 시작하여 과학실, 미술실, 음악실, 컴퓨터실 순으로 방을 탈출합니다.
3. 각 방에 주어진 문제를 해결하여 다음 방으로 이동합니다.
4. 최종 목표는 학교에 갇힌 여자친구를 구출하는 것입니다.

## 기술 스택

<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/apache tomcat-F8DC75?style=for-the-badge&logo=apachetomcat&logoColor=white">

## 데이터베이스 설계

### 테이블 목록

| 테이블명 | 테이블 ID | 비고 |
|---|---|---|
| 회원 | PLAYER | 회원 정보 관리 |

### 테이블 정의서

#### PLAYER 테이블

- **설명:** 회원 정보를 저장하는 테이블

| 컬럼명 | 컬럼 ID | 타입 | 길이 | NN | PK |
|---|---|---|---|---|---|
| PLAYER_ID | ID | VARCHAR | 50 | ✅ | ✅ |
| PLAYER_PW | PW | VARCHAR | 50 | ✅ |  |
| PLAYER_NAME | NAME | VARCHAR | 50 | ✅ |  |

#### Table 생성 스크립트

```sql
CREATE TABLE PLAYER (
    ID VARCHAR(50) PRIMARY KEY,
    PW VARCHAR(50) NOT NULL,
    NAME VARCHAR(50) NOT NULL
);
```

## 프로젝트 일정

- **12월 10일**
  - 아이디어 공유
  - 게임 코드 구현
  - 자료 조사 (문제 생성, BGM, 아스키 아트)
- **12월 11일**
  - 각 방 코드 조합
  - 그림 및 BGM 추가
  - 스토리 구상
  - 산출 문서 수정
- **12월 12일**
  - 최종 수정
  - 시연 영상 녹화
  - 발표 준비

## 팀원 소개

- **박민지**: 음악실 코드 구현, 산출 문서 작성 및 수정, PPT 제작
- **이현건**: 과학실 코드 구현, 전체적 코드 구현 및 수정, 아이디어 구상 및 발표
- **박창선**: 컴퓨터실 코드 구현, 클래스 통합 작업, 도트 아트 제작
- **강래우**: 미술실 코드 구현, 아이디어 구체화, 음향 담당 및 감독

