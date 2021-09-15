function solution(orders, course) {
  var answer = [];
  let orderObj = {};
  
  orders.map(order => {
    let menuArr = [...order].sort();

    let makeSet = (idx, str, arr) => {
      if(idx === arr.length){
        return;
      }
      
      for(let i = idx; i < arr.length; i += 1){
        let tempStr = str + arr[i];

        if(tempStr.length > 1){
          if(orderObj[tempStr] === undefined){
            orderObj[tempStr] = 1;
          }else{
            orderObj[tempStr] += 1;
          }
        }
        
        makeSet(i + 1, tempStr, arr);
      }
    }
    
    makeSet(0, '', menuArr);
  });

  course.map(item => {
    let max = 2;
    let selectMenu = [];
    for(let setMenu in orderObj){
      
      if(setMenu.length === item){
        if(orderObj[setMenu] > max){
          max = orderObj[setMenu];
          selectMenu = [setMenu];
        }else if(orderObj[setMenu] === max){
          selectMenu.push(setMenu);
        }
      }
    }
    answer = [...answer, ...selectMenu].sort();
  });
  
  return answer;
}

let orders1 = ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"];
let course1 = [2,3,4];

let orders2 = ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"];
let course2 = [2,3,5];

let orders3 = ["XYZ", "XWY", "WXA"];
let course3 = [2,3,4];

let result1 = solution(orders1, course1);
let result2 = solution(orders2, course2);
let result3 = solution(orders3, course3);

console.log(result1);
console.log(result2);
console.log(result3);