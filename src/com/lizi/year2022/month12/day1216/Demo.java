package com.lizi.year2022.month12.day1216;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lizi
 * @date 2022/12/16 16:48
 * @description TODO
 **/
public class Demo {
    public static void main(String[] args) {
        Map<Integer, Set<Long>> collect = Stream.of(new T(1, 1L), new T(1, 12L), new T(1, 13L),
                new T(2, 23L), new T(2, 23L))
                .collect(Collectors.groupingBy(T::getId, Collectors.mapping(T::getsId, Collectors.toSet())));


    }

}
class T{
    private Integer id;
    private Long sId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public T(Integer id, Long sId) {
        this.id = id;
        this.sId = sId;
    }
}
