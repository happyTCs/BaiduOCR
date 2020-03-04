package com.baidu.ocr.demo;

import java.util.List;

public class MailPostEntity {


    /**
     * log_id : 3461306030665756729
     * direction : 0
     * words_result_num : 5
     * words_result : [{"words":"中国邮政"},{"words":"收件人:冯亚鲁"},{"words":"收件人电话:987654321"},{"words":"寄件人:侯程锦"},{"words":"寄件人电话:123456789"}]
     */

    private long log_id;
    private int direction;
    private int words_result_num;
    private List<WordsResultBean> words_result;

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getWords_result_num() {
        return words_result_num;
    }

    public void setWords_result_num(int words_result_num) {
        this.words_result_num = words_result_num;
    }

    public List<WordsResultBean> getWords_result() {
        return words_result;
    }

    public void setWords_result(List<WordsResultBean> words_result) {
        this.words_result = words_result;
    }

    public static class WordsResultBean {
        /**
         * words : 中国邮政
         */

        private String words;

        public String getWords() {
            return words;
        }

        public void setWords(String words) {
            this.words = words;
        }
    }
}
