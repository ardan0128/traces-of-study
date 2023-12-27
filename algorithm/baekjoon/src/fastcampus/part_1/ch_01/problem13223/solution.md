### [13223] 소금 폭탄

시간계산!

### 풀이

1. 시, 분, 초 쪼개기
2. 각 단위 차이 구하기

가장 작은 단위로 통일하면 더 편할 수 있음

```java
int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
int targetSecondAmount = targetHour * 3600 + targetMinute * 60 + targetSecond;
int needSecondAmount = targetSecondAmount - currentSecondAmount;

if(needSecondAmount < 0){
  needSecondAmount += 24 * 3600;
}

int needHour = needSecondAmount / 3600;
int needMinute = (needSecondAmount % 3600) / 60;
int needSecond = needSecondAmount % 60;
```

문자열 포맷 코드

| 코드 | 설명                     |
| ---- | ------------------------ |
| %s   | 문자열(String)           |
| %c   | 문자 1개(character)      |
| %d   | 정수(Integer)            |
| %f   | 부동소수(floating-point) |
| %o   | 8진수                    |
| %x   | 16진수                   |
| %5   | Literal %(문자 % 자체)   |
