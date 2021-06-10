package com.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class closestDc {
}

// package whatever; // don't place package name!
/*

a-) Dado um pacote com um identificador (id), e destino (x,y) e
dois centros de expedição (A e B), cada um com identificador (id),
e posição (x,y). Escreva um algoritmo que identifica para qual centro
de expedição esse pacote deve ser enviado (ou seja: o centro de distribuição
mais próximo do destino).

euclidean_dist = sqrt( (x1-x2)^2 + (y1-y2)^2 )

*/
class Package {
    int id;
    int x;
    int y;

    Package(int id, int x, int y ) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
}


class DistributionCenter {
    int id;
    int x;
    int y;

    DistributionCenter(int id, int x, int y ) {
        this.id = id;
        this.x = x;
        this.y = y;
    }
}

class DistributionCenterRepository {
    List<DistributionCenter> distributionCenters;

    DistributionCenterRepository() {
        distributionCenters = new ArrayList<>();
        DistributionCenter dc1 = new DistributionCenter(1, 2000, 2000);
        DistributionCenter dc2 = new DistributionCenter(2,500, 500);
        DistributionCenter dc3 = new DistributionCenter(3,900, 900);
        DistributionCenter dc4 = new DistributionCenter(4,1200, 200);

        distributionCenters.add(dc1);
        distributionCenters.add(dc2);
        distributionCenters.add(dc3);
        distributionCenters.add(dc4);
    }

    public List<DistributionCenter> getDcs() {
        return distributionCenters;
    }
}

class RedirectService {
    DistributionCenterRepository repository;
    //banco em memoria que salva ultimas localizaçoes verificadas
    RedirectService(DistributionCenterRepository repository) {
        this.repository = repository;
    }

    Map<Integer, Integer> getCloserDcForMultiplePackages(List<Package> packages) {
        // pega localizacao de 1 por vez pacote
        // checa no banco de dados se essa localização (exata/proxima) ja foi processado
        // se foi, ja pega o dc destino
        // se n, faz o processo normal
        // ultimo passo adiciona no cache
        return packages.stream()
                .collect(Collectors.toMap(pack -> pack.id, this::getCloserDc));
    }

    Integer getCloserDc(Package pack) {
        int packageX = pack.x;
        int packageY = pack.y;
        Map<Integer, Double> dcMap = repository.getDcs().stream()
                .collect(Collectors.toMap(dc -> dc.id, dc -> euclideanDist(packageX, dc.x, packageY, dc.y)));
        Double collect = dcMap.values().stream().min(Double::compareTo).get();
        return dcMap.entrySet().stream().filter(v -> v.getValue().equals(collect)).findFirst().get().getKey();
    }

    double euclideanDist(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}

class Main {
    public static void main (String[] args) {
        DistributionCenterRepository repository = new DistributionCenterRepository();
        RedirectService redirectService = new RedirectService(repository);
        Package receivedPackage = new Package(1, 1000, 1000);
        Package receivedPackage2 = new Package(2, 2000, 2000);
        Package receivedPackage3 = new Package(3, 3000, 3000);

        List<Package> packages = new ArrayList<>();
        packages.add(receivedPackage);
        packages.add(receivedPackage2);
        packages.add(receivedPackage3);


        redirectService.getCloserDcForMultiplePackages(packages)
                .forEach((key, value) -> System.out.println("for package id " + key + " the closest dc is; " + value));
    }
}


//pacote = x = 1000 / y=1500
//DC = x = 400 / y = 1000
//DC = x = 2000/ y = 1300