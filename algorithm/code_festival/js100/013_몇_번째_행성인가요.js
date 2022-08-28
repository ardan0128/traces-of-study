/**
 * ABOUT
 *
 * DATE: 2022-03-17
 * AUTHOR: jortier
 *
 * COMMENT:
 * 입력 받은 수 - 1의 인자를 출력해도 되고,
 * 배열의 0번째를 비워두고 n을 배열의 인덱스로 출력해도 된다.
 */

function findPlanet(n){
  let planet = ['수성', '금성', '지구', '화성', '목성', '토성', '천왕성', '해왕성'];

  console.log(planet[n - 1]);
}