# 🦁 2026 BE 과제 Repository Guide 🦁

백엔드 세션 과제를 제출하기 위한 레포지토리입니다.
아기사자들은 아래 가이드를 따라 제출해주세요.


## 📚 목차

* [🗓 제출 기한](#-제출-기한)
* [📁 제출 방식](#-제출-방식)
* [🚀 제출 방법 (Fork & PR)](#-제출-방법-fork--pr)
* [🔍 PR 처리 방식](#-pr-처리-방식)



## 🗓 제출 기한

* **차주 수요일 23:59까지 github 업로드 후 디스코드 '백엔드-과제제출' 링크 업로드**

  * ex) 4월 2일(목) 세션 → **4월 8일(수) 23:59까지**



## 📁 제출 방식

### 1. 레포지토리 구조

```
2026_BE_과제/
 └── 본인 github username/
     └── N회차 과제 폴더
           └── 코드파일들 업로드
```



### 2. 폴더 및 파일 규칙

* **폴더명:** 본인 GitHub username
* **폴더명:** N회차 과제
    - ex) 예시

        ```
        2sseul/
        └── N회차 과제 폴더
            └── 코드파일들 업로드
        ```


## 🚀 제출 방법 (Fork & PR)

### 1️⃣ Fork & Clone

```bash
# Fork 후
git clone https://github.com/본인아이디/2026_BE_Homework.git
cd 2026_BE_Homework
```

### 2️⃣ upstream 연결 (최초 1회)

```bash
git remote add upstream 원본레포주소(멋사Homework레포)
git remote -v
```

### 3️⃣ 브랜치 생성

```bash
git checkout -b username
```

예시

```bash
git checkout -b 2seul
```

### 4️⃣ 과제 작성 후 Commit

```bash
git add .
git commit -m "n회차 과제 제출"
```

### 5️⃣ Push

```bash
git push origin 브랜치이름
```

### 6️⃣ Pull Request 생성

* GitHub에서 **Compare & pull request 클릭**
* PR 생성
  - PR 제목: [이름] n회차 과제 제출
    - ex) [김이슬] 1회차 과제 제출

## 🔍 PR 처리 방식

* 제출된 PR은 **백엔드 운영진이 확인 후 merge**됩니다.
* 필요 시 수정 요청이 있을 수 있습니다.


##  🔄 (중요) 최신 상태 동기화

PR이 merge된 이후, 다음 작업(과제 업로드) 전 반드시 진행(개인 레포지토리에서)

```bash
git checkout main
git fetch upstream
git merge upstream/main
git push origin main
```
