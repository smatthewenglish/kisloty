package kisloty;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkisloty/ArticleController;", "", "repository", "Lkisloty/ArticleRepository;", "(Lkisloty/ArticleRepository;)V", "findAll", "", "Lkisloty/Article;", "findOne", "slug", "", "kisloty"})
@org.springframework.web.bind.annotation.RequestMapping(value = {"/api/article"})
@org.springframework.web.bind.annotation.RestController()
public final class ArticleController {
    private final kisloty.ArticleRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    public final java.lang.Iterable<kisloty.Article> findAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/{slug}"})
    public final kisloty.Article findOne(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.PathVariable()
    java.lang.String slug) {
        return null;
    }
    
    public ArticleController(@org.jetbrains.annotations.NotNull()
    kisloty.ArticleRepository repository) {
        super();
    }
}