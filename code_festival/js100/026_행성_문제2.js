/**
 * ABOUT
 *
 * DATE: 2022-03-18
 * AUTHOR: jortier
 *
 * COMMENT:
 * if문을 통해 해당 단어가 들어오면 return하게 했다.
 * 하지만 object를 사용해서 키-값으로도 return하게 할 수 있다.
 */

function solution(planet){
  if(planet === '수성'){
    return 'Mercury';
  }else if(planet === '금성'){
    return 'Venus';
  }else if(planet === '지구'){
    return 'Earth';
  }else if(planet === '화성'){
    return 'Mars';
  }else if(planet === '목성'){
    return 'Jupiter';
  }else if(planet === '토성'){
    return 'Saturn';
  }else if(planet === '천왕성'){
    return 'Uranus';
  }else if(planet === '해왕성'){
    return 'Neptune';
  }else{
    return '잘못 입력하였습니다.';
  }
}

function solution2(planet){
  const planets = {
    '수성' : 'Mercury',
    '금성' : 'Venus',
    '지구' : 'Earth',
    '화성' : 'Mars',
    '목성' : 'Jupiter',
    '토성' : 'Saturn',
    '천왕성' : 'Uranus',
    '해왕성' : 'Neptune',
  };

  return planets[planet];
}