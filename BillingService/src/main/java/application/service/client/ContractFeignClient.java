package application.service.client;

import application.service.model.Contract;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("contract-service")
public class ContractFeignClient {
    @RequestMapping(
            method= RequestMethod.GET,
            value="/components/examples/ContractRequest",
            consumes="application.json"
    )
    public Contract getContract(@PathVariable("contractId") String contractId);
}
