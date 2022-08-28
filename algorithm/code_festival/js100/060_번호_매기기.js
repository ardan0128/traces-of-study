/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * 반복문을 이용해서 템플릿 리터럴을 사용하면 해결할 수 있다.
 */

const students = [
  '강은지',
  '김유정',
  '박현서',
  '최성훈',
  '홍유진',
  '박지호',
  '권윤일',
  '김채리',
  '한지호',
  '김진이',
  '김민호',
  '강채연'
];

for(let student in students){
  console.log(`번호: ${Number(student) + 1}, 이름: ${students[student]}`);
}