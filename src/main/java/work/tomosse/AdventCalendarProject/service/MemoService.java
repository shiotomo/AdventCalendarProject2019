package work.tomosse.AdventCalendarProject.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.AdventCalendarProject.entity.Memo;
import work.tomosse.AdventCalendarProject.repository.MemoRepository;

@Service
public class MemoService {

    @Autowired
    MemoRepository memoRepository;

    /**
     * memoの一覧を返却する
     *
     * @return
     */
    public List<Memo> getMemo() {
        return memoRepository.findAll();
    }

    /**
     * memoを作成する
     *
     * @param body
     */
    public void createMemo(final Memo memo) {
        memo.setCreatedAt(new Date());
        memo.setUpdatedAt(new Date());
        memoRepository.save(memo);
    }

    /**
     * メモを更新する
     *
     * @param body
     * @throws Exception
     */
    public void updateMemo(final Memo memo) throws Exception {
        memo.setUpdatedAt(new Date());
        memoRepository.save(memo);
    }

    /**
     * memoを削除する
     *
     * @param id
     */
    public void deleteMemo(final Long id) {
        memoRepository.deleteById(id);
    }
}
