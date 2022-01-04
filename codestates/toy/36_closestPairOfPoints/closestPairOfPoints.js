// 좌표평면 위의 두 점 사이의 거리를 계산하는 함수입니다.
function calculateDistance(p1, p2) {
  const yDiff = p2[0] - p1[0];
  const xDiff = p2[1] - p1[1];
  return Math.sqrt(Math.pow(yDiff, 2) + Math.pow(xDiff, 2));
}

const closestPairOfPoints = function (points) {
  // TODO: 여기에 코드를 작성합니다.
};

/*
  입출력 예시 1번) 직각 삼각형을 찾아서 피타고라스의 정리를 쓴다.
  입출력 예시 2번) 모든 점의 x좌표가 0이어서 y좌표만 비교해주면 된다.

  
*/