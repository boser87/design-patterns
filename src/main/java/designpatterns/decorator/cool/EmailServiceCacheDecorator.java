package designpatterns.decorator.cool;

import java.util.Collection;

public class EmailServiceCacheDecorator implements IEmailService {

    private final IEmailService emailService;

    public EmailServiceCacheDecorator(IEmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void send(Email email) {
        emailService.send(email);
    }

    @Override
    public Collection<Email.EmailInfo> listEmails(int indexBegin, int indexEnd) {
        return null;
    }

    @Override
    public Email downloadEmail(Email.EmailInfo emailInfo) {
        return null;
    }
}
