package my.project.poster.dto;

import my.project.poster.domain.Message;
import my.project.poster.domain.Views;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;


@JsonView(Views.FullMessage.class)
public class MessagePageDto {
    private List<Message> messages;
    private int currentPage;
    private int totalPages;

    public MessagePageDto(List<Message> messages, int currentPage, int totalPages) {
        this.messages = messages;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
