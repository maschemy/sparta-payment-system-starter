package com.sparta.paymentsystem.domain.product.dto;

// 불변 데이터 전달이 목적,(팔드, 기본적인 생성자, equals,hashCode 같은 편의 메서드들을
// 자동으로 얻고 싶을 때 사용
public record ProductResponse(
    Long id,
    String name,
    int price,
    int stock,
    String description
){}
