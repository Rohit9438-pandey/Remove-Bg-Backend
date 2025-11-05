package in.rohitproject.removebg.service.impl;

import in.rohitproject.removebg.client.ClipdropClient;
import in.rohitproject.removebg.service.RemoveBackgroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class RemoveBackgroundImpl implements RemoveBackgroundService {

    @Value("${clipdrop.apikey}")
    private String apiKey;


    private final ClipdropClient clipdropClient;

    @Override
    public byte[] removeBackground(MultipartFile file) {
     return clipdropClient.removeBackground(file , apiKey);
    }
}
