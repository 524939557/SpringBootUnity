package info.xiaomo.core.base;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : xiaomo (https://xiaomo.info) (https://github.com/xiaomoinfo)
 * @version : 2017/1/11 16:42
 */
@Service
public interface BaseService<T> {

    T findById(Long id);

    T findByName(String name);

    List<T> findAll();

    Page<T> findAll(int start, int pageSize);

    boolean deleteById(Long id);

    boolean deleteByName(String name);

    boolean add(T model);

    boolean update(T model);

    boolean deleteByIds(List<Long> ids);
}
