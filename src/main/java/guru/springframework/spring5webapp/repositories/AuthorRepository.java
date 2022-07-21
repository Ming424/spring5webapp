package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;


// REPOSITORY -> CRUD_REPO -> PagingAndSorting_REPO -> JPA_REPO
// CRUD: create, read, update and delete.
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
