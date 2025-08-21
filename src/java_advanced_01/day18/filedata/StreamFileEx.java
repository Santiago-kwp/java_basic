package java_advanced_01.day18.filedata;

import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileEx {
    public static void main(String[] args) throws URISyntaxException, IOException {



        Path path = Paths.get(StreamFileEx.class.getResource("data.txt").toURI());

        // Path로부터 파일을 열고 한 행씩 읽으면서 문자열 스트림 생성
        // 한 라인씩 처리하겠다. Files.lines 메소드
        Stream<String> stream = Files.lines(path, Charset.defaultCharset()); // UTF-8로 인코딩

        stream.forEach(System.out::println);
        stream.close();


    }
}
