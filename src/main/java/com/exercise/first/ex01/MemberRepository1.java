//package com.exercise.first.ex01;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class MemberRepository1 {
//
//    // private EntityManager entityManager;
//    @PersistenceContext // 영속성 컨텍스트 : 엔티티를 영구히 저장하는 환경
//    EntityManager em;
//
////    public void save(String username){
////        Member member = new Member();
////        member.setUsername(username);
////    }
//    public Long save(Member1 member){
//        em.persist(member);
//        return member.getId();
//    }
//
//    public Member1 find(Long id){
//        return em.find(Member1.class, id);
//    }
//}
