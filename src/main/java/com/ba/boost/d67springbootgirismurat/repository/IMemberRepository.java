package com.ba.boost.d67springbootgirismurat.repository;

import com.ba.boost.d67springbootgirismurat.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMemberRepository extends JpaRepository<MemberEntity, Long> {

}
