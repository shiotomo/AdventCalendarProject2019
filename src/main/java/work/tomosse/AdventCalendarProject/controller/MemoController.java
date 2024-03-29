package work.tomosse.AdventCalendarProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import work.tomosse.AdventCalendarProject.entity.Memo;
import work.tomosse.AdventCalendarProject.service.MemoService;

@Controller
@RequestMapping("/memos")
public class MemoController {

    @Autowired
    MemoService memoService;

    /**
     * メモ一覧表示
     *
     * @param mav
     * @return
     */
    @GetMapping
    public ModelAndView index(final ModelAndView mav) {
        mav.addObject("memoList", memoService.getMemo());
        mav.setViewName("index");
        return mav;
    }

    /**
     * メモ作成
     *
     * @param memo
     * @return
     */
    @PostMapping
    public String create(@ModelAttribute final Memo memo) {
        memoService.createMemo(memo);
        return "redirect:/memos";
    }

    /**
     * メモ更新
     *
     * @param memo
     * @return
     * @throws Exception
     */
    @PutMapping("/{id}")
    public String update(@ModelAttribute final Memo memo) throws Exception {
        memoService.updateMemo(memo);
        return "redirect:/memos";
    }

    /**
     * メモ削除
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable final Long id) {
        memoService.deleteMemo(id);
        return "redirect:/memos";
    }
}
