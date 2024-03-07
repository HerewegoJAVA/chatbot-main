package cn.bugstack.chatbot.api.domain.ai;

import java.io.IOException;

/**
 * @description:Redis hatGPT open ai 接口：https://beta.openai.com/account/api-keys
 * @author：1.9的阿云
 * @date: 2024/2/22
 * @Copyright： 沉淀、努力、成长，加油，早日找到心仪的工作，菩萨保佑别出BUG！
 */
public interface IOpenAI {

    String doChatGPT(String openAiKey, String question) throws IOException;

}
