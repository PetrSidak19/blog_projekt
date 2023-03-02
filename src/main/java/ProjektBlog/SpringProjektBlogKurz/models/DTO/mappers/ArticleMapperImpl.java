package ProjektBlog.SpringProjektBlogKurz.models.DTO.mappers;

import ProjektBlog.SpringProjektBlogKurz.data.entities.ArticleEntity;
import ProjektBlog.SpringProjektBlogKurz.models.DTO.ArticleDTO;
import org.springframework.stereotype.Component;

//zde jsem nakonfiguroval iplementaci!!!!!! (pro maper)
@Component
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public ArticleEntity toEntity(ArticleDTO source) {
        if ( source == null ) {
            return null;
        }

        ArticleEntity articleEntity = new ArticleEntity();

        articleEntity.setTitle( source.getTitle() );
        articleEntity.setDescription( source.getDescription() );
        articleEntity.setContent( source.getContent() );

        return articleEntity;
    }

    @Override
    public ArticleDTO toDTO(ArticleEntity source) {
        return null;
    }
}

