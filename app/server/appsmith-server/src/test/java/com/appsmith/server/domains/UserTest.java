package com.appsmith.server.domains;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class UserTest {

    @Test
    public void testFirstNameFromFullName() {
        User one = new User();
        one.setName("Sherlock Holmes");
        assertThat(one.computeFirstName()).isEqualTo("Sherlock");
    }

    @Test
    public void testFirstNameFromEmail() {
        User one = new User();
        one.setEmail("sherlock@gmail.com");
        assertThat(one.computeFirstName()).isEqualTo("sherlock");
    }

    @Test
    public void testFirstNameFromFullNameAndEmail() {
        User one = new User();
        one.setName("Sherlock Holmes");
        one.setEmail("sherlock@gmail.com");
        assertThat(one.computeFirstName()).isEqualTo("Sherlock");
    }
    @Test
    public void startMono() {
        //通过fromCallable创建
        Mono.fromCallable(() -> "callable run ").subscribe(System.out::println);
        //通过fromSupplier创建
        Mono.fromSupplier(() -> "create from supplier").subscribe(System.out::println);
        Mono.create(sink->sink.success("create mono")).subscribe(System.out::println);
        Flux<Integer> flux = Flux.create(new Consumer<FluxSink<Integer>>() {
            @Override
            public void accept(FluxSink<Integer> fluxSink) {
                fluxSink.next(1);
                fluxSink.next(2);
                fluxSink.complete();
                fluxSink.next(3);
            }
        });

        Subscriber<Integer> subscriber = new Subscriber<Integer>() {

            @Override
            public void onSubscribe(Subscription subscription) {
                subscription.request(Integer.MAX_VALUE);
            }

            @Override
            public void onNext(Integer integer) {
                log.info("消费:{}", integer);
            }

            @Override
            public void onError(Throwable throwable) {
                log.info("异常:{}", throwable.getMessage());
            }

            @Override
            public void onComplete() {
                log.info("完成");
            }
        };
        flux.subscribe(subscriber);
    }

}
