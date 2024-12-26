package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 2; // 상속 or 같은패키지면 가능하다.
        // defaultValue = 1; // 다른 패키지는 접근 불가, 컴파일 오류
        // privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
        //defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent();

    }
}
/*
`publicValue = 1` : 부모의 `public` 필드에 접근한다. `public` 이므로 접근할 수 있다.
`protectedValue = 1` : 부모의 `protected` 필드에 접근한다. 자식과 부모는 다른 패키지이지만, **상속 관계
이므로 접근할 수 있다.**
`defaultValue = 1` : 부모의 `default` 필드에 접근한다. 자식과 부모가 다른 패키지이므로 접근할 수 없다.
`privateValue = 1` : 부모의 `private` 필드에 접근한다. `private` 은 모든 외부 접근을 막으므로 자식이라
도 호출할 수 없다.
 */