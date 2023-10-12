package com.example.jpastudy.repository;

import com.example.jpastudy.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
  // 스프링 데이터 JPA의 메서드 네이밍 컨벤션을 따라 사용자 지정 쿼리 메서드를 정의하였다.
  // 이 네이밍 컨벤션에 따라 JPA는 메서드 이름을 분석하여 해당하는 쿼리를 생성 및 실행한다.

  // 주어진 사용자 이름과 나이보다 큰 모든 회원을 검색한다.
  List<Member> findByNameAndAgeGreaterThan(String name, int age);
  // 주어진 사용자 이름을 가진 모든 회원의 리스트를 반환한다.
  List<Member> findListByName(String name); // 컬렉션
  // 주어진 사용자 이름을 가진 단일 회원을 검색
  Member findMemberByName(String name); // 단건
  // 주어진 사용자 이름을 가진 회원을 검색하며, 결과가 없는 경우 Optional.empty()를 반환한다. 일치하는 회원이 있으면 Optional에 포장된 회원을 반환한다.
  Optional<Member> findOptionalByName(String name); // 단건 Optional
  // 주어진 나이에 해당하는 모든 회원을 페이지네이션과 함께 검색한다.
  Page<Member> findByAge(int age, Pageable pageable);
}
