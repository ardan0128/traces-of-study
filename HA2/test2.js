function test2(arr, id) {
  // TODO: 여기에 코드를 작성합니다.
  // 재귀를 사용한다

  // function find(arr, id){
  //   for(let i = 0; i < arr.length; i++){
  //     if(arr[i].id === id){
  //       result = arr[i];
  //       return;
  //     }

  //     if(arr[i].children !== undefined){
  //       test2(arr[i].children, id);
  //     }
  //   }
  // }

  // find(arr, id);

  // return result !== undefined ? result : null;

  // if(arr[0].id === id){
  //   return arr[0];
  // }

  // if(arr[0].children !== undefined){
  //   return test2(arr[0].children, id);
  // }

  // return test2(arr.slice(1), id);
  
  let result = null;
  for(let i = 0; i < arr.length; i++){
    if(arr[i].id === id){
      result = arr[i];
      return result;
    }

    if(arr[i].children !== undefined){
      result = test2(arr[i].children, id);
      if(result){
        return result
      };
    }
  }

  return result;
}

let input = [
  {
    id: 1,
    name: 'johnny',
  },
  {
    id: 2,
    name: 'ingi',
    children: [
      {
        id: 3,
        name: 'johnson',
      },
      {
        id: 5,
        name: 'steve',
        children: [
          {
            id: 6,
            name: 'lisa',
          },
        ],
      },
      {
        id: 11,
      },
    ],
  },
  {
    id: '13',
  },
];

console.log(`test1`);
let output = test2(input, 1);
console.log(output); // --> { id: 1, name: 'johnny' }

console.log(`test2`);
output = test2(input, 5);
console.log(output); // --> { id: 5, name: 'steve', children: [{ id: 6, name: 'lisa' }] }

console.log(`test3`);
output = test2(input, 99);
console.log(output); // --> null

const Lannisters = [
  {
    id: 55,
    name: 'Tywin Lannister',
    children: [
      {
        id: 57,
        name: 'Cersei Lannister',
        children: [
          { id: 12, name: 'Joffrey Baratheon' },
          { id: 98, name: 'Myrcella Baratheon' },
          { id: 25, name: 'Tommen Baratheon' },
        ],
      },
      {
        id: 62,
        name: 'Jaime Lannister',
      },
      {
        id: 69,
        name: 'Tyrion Lannister',
      },
    ],
  },
];

let outputTest = test2(Lannisters, 69);

console.log(outputTest);