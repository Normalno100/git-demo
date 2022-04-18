package com.javacourse.se.lesson28;

public class Robot<T extends Head> {
        private Body body;
        private T head;

        public void  foo(Robot<?> ob){
                return ;
        }

        public Robot(Body body, T head) {
                this.body = body;
                this.head = head;
        }
}
