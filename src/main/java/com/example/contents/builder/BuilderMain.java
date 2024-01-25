package com.example.contents.builder;

public class BuilderMain {
    public static void main(String[] args) {
        // User에는 총 8개의 필드가 있고,
        // 전체 필드를 받아 생성해주는 생성자가 있을 때,
        // username, email, firstName, lastName 만 넣어 초기화 하고 싶다면 ?
        // yujin, yujin@gmail.com, yujinm jung
        User newUser = new User(
                null,
                "yujin",
                null,
                "yujin@gamil.com",
                null,
                "Yujin",
                "Jung",
                null
        );


        // javeBean
        // 빈 객체 생성해두고 ,
        // setter 를 활용해 만들기
        User newUser2 = new User();
        newUser2.setUsername("yujin");
        newUser2.setEmail("yujin@gmail.com");
        //...


        User.UserBuilder userBuilder = new User.UserBuilder();
        // UserBuilder class 활용
        // 데이터를 할당해주고 내 자신을 돌려준다.
        User.UserBuilder a = userBuilder.id(1L);
        User.UserBuilder b = a.id(2L);
        User.UserBuilder c = b.email("yujin@gmail.com");

        User newUser3 = c.build();


        User newUser4 = User.builder()
                .id(1L)
                .username("yujin")
                .email("yujing@gmail.com")
                .build();
    }
}
