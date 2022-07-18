package application.service;

import application.service.client.ContractFeignClient;
import application.service.model.Contract;

public class BillingService {

    @Autowired
    ContractFeignClient contractFeignClient;

    // Code a imaginer dans une requête billing qui a besoin de récupérer les infos d'un contrat
    private Contract retrieveContract(String contractId) {
        return contractFeignClient.getContract(contractId);
    }
}
