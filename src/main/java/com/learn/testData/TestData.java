package com.learn.testData;

import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.converter.IntegerConverter;
import io.github.sskorol.data.Sheet;
import io.github.sskorol.data.Source;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@Source(path = "users.xlsx")
//@Sheet(name = "sheet_1")
public class TestData {



        @Column(name = "USERNAME", index = 1)
        private String username;

        @Column(name = "TESTCASENAME", index = 0)
        private String testcasename;

        @Column(name = "PASSWORD", index = 2)
        private String password;

        @Column(name = "TESTNO",index=5,converterClass =  IntegerConverter.class)
        private int testno;

        @Column(name = "URL", index = 3)
        private String expectedurl;

        @Column(name = "TITLE", index = 4)
        private String expectedtitle;


        public String getPassword() {
                return password;
        }

        public String getUsername() {
                return username;
        }
        public String getTestCaseName() {
                return testcasename;
        }
        public int getTestNo() {
                return testno;
        }
        public String getExpectedURL() {
                return expectedurl;
        }
        public String getExpectedTitle() {
                return expectedtitle;
        }
}
