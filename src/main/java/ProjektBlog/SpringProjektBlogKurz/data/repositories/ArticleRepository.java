package ProjektBlog.SpringProjektBlogKurz.data.repositories;

import ProjektBlog.SpringProjektBlogKurz.data.entities.ArticleEntity;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<ArticleEntity, Long> {
}
