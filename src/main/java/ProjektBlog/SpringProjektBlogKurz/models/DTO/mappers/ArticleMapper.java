package ProjektBlog.SpringProjektBlogKurz.models.DTO.mappers;

import ProjektBlog.SpringProjektBlogKurz.data.entities.ArticleEntity;
import ProjektBlog.SpringProjektBlogKurz.models.DTO.ArticleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArticleMapper {

    ArticleEntity toEntity(ArticleDTO source);

    ArticleDTO toDTO(ArticleEntity source); // <-- Nově přidaná metoda
}
