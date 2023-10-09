package com.fastcampus.projectbord.repository;

import com.fastcampus.projectbord.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;


public interface ArticleRepository extends JpaRepository<Article, Long> {
}