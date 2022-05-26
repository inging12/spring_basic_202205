package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class Member {

    //호출안됨
    @Autowired(required = false)
    public void setNoBean1(Member member){
        System.out.println("setNoBean1 = " + member);
    }

    //null호출
    @Autowired
    public void setNoBean2(@Nullable Member member){
        System.out.println("setNoBean2 = " + member);
    }

    //Optional empty 호출
    @Autowired(required = false)
    public void setNoBean3(Optional<Member> member){
        System.out.println("setNoBean3 = " + member);
    }






    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
