package kisloty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lkisloty/ArticleRepository;", "Lorg/springframework/data/repository/CrudRepository;", "Lkisloty/Article;", "", "findAllByOrderByAddedAtDesc", "", "findBySlug", "slug", "", "kisloty"})
public abstract interface ArticleRepository extends org.springframework.data.repository.CrudRepository<kisloty.Article, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable()
    public abstract kisloty.Article findBySlug(@org.jetbrains.annotations.NotNull()
    java.lang.String slug);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Iterable<kisloty.Article> findAllByOrderByAddedAtDesc();
}