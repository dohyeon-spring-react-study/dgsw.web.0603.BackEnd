package kr.hs.dgsw.board_back.Controller;

import kr.hs.dgsw.board_back.Domain.Post;
import kr.hs.dgsw.board_back.Service.PostService;
import kr.hs.dgsw.board_back.Service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/board")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/list")
    public List<Post> findAll(){
        /*@Getter
        class TmpBoard{
            int id;
            String author;
            String title;
            LocalDateTime created;
            TmpBoard(int id, String author, String title, LocalDateTime created){
                this.id = id;
                this.author = author;
                this.title = title;
                this.created = created;
            }
        }
        List<TmpBoard> list = new ArrayList();
        list.add(new TmpBoard(1, "작성자1", "제목1", LocalDateTime.now()));*/
        return postService.findAll();
    }

    @GetMapping("/findid/{id}")
    public Post findById(@PathVariable Long id){
        return postService.findById(id);
    }

    @PostMapping("/addPost")
    public Long add(@RequestBody Post post){
        return postService.add(post);
    }

    @PutMapping("/modifyPost")
    public int modify(@RequestBody Post post){
        return postService.modify(post);
    }

    @DeleteMapping("/deletePost/{id}")
    public int deleteById(@PathVariable Long id){
        return postService.deleteById(id);
    }

    @PostMapping("/addHashmap")
    public Long addWithHashmap(@RequestBody Post post){
        return postService.addWithHashmap(post);
    }

    @GetMapping("/finduserid/{userId}")
    public List findByUserId(@PathVariable Long userId){
        return postService.findByUserId(userId);
    }

}
