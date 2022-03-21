/**
 * ABOUT
 *
 * DATE: 2022-03-21
 * AUTHOR: jortier
 *
 * COMMENT:
 * entries()는 객체를 배열로 반환한다.
 * values()는 객체 속성들의 값을 배열로 반환한다.
 * 
 * 하나씩 차이를 구하며 작은 수가 나올때마다 치환해주면서 해결한다.
 */

const nationWidth = {
  'Korea': 220877,
  'Rusia': 17098242,
  'China': 9596961,
  'France': 543965,
  'Japan': 377915,
  'England': 242900,
}

const w = nationWidth['Korea'];

delete nationWidth['Korea'];

const entry = Object.entries(nationWidth);
const values = Object.values(nationWidth);

let gap = Math.max.apply(null, values);
let item = [];

for(let i in entry){
  if(gap > Math.abs(entry[i][1] - w)){
    gap = Math.abs(entry[i][1] - w);
    item = entry[i];
  }
}

console.log(item[0], item[1] - w);