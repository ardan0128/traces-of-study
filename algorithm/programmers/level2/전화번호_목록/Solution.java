package programmers.level2.전화번호_목록;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution
 * 
 * ABOUT
 *
 * DATE: 2022-03-23
 * AUTHOR: jortier
 *
 * URL: https://programmers.co.kr/learn/courses/30/lessons/42577
 */
public class Solution {
  public boolean solution(String[] phone_book) {
    boolean answer = true;

    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < phone_book.length; i++) {
      map.put(phone_book[i], i);
    }

    for (int i = 0; i < phone_book.length; i++) {
      for (int j = 0; j < phone_book[i].length(); j++) {
        if (map.containsKey(phone_book[i].substring(0, j))) {
          return false;
        }
      }
    }

    return answer;
  }
}