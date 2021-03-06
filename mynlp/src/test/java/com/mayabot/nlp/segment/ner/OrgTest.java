package com.mayabot.nlp.segment.ner;

import com.mayabot.nlp.segment.Lexer;
import com.mayabot.nlp.segment.Lexers;
import com.mayabot.nlp.segment.utils.TokenizerTestHelp;
import org.junit.Test;

public class OrgTest {

    @Test
    public void test() {
        {
            String text = "这|是|上海|万|行|信息|科技|有限公司|的|财务|报表";

            Lexer tokenizer = Lexers.coreBuilder()
                    .build();

            TokenizerTestHelp.test(tokenizer, text);
        }


        {
            String text = "这|是|上海万行信息科技有限公司|的|财务|报表";

            Lexer tokenizer = Lexers.coreBuilder()
                    .withNer()
                    .build();


            TokenizerTestHelp.test(tokenizer, text);
        }


    }
}
