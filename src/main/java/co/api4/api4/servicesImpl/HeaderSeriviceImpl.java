package co.api4.api4.servicesImpl;

import co.api4.api4.entites.Headers;
import co.api4.api4.service.HeaderService;
import org.springframework.stereotype.Service;


@Service
public class HeaderSeriviceImpl implements HeaderService {
    @Override
    public String HttpRequest(Headers headers) {
        return headers.getHostname();
    }
}
