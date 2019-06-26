//package com.sergej.warehouse.services;
//
//import com.sergej.warehouse.dto.ClientsGetDTO;
//import com.sergej.warehouse.entities.CarBrand;
//import com.sergej.warehouse.entities.Inventory;
//import com.sergej.warehouse.repositories.ClientsRepo;
//import com.sergej.warehouse.dto.CarBrandGetDTO;
//import com.sergej.warehouse.dto.CarBrandPutDTO;
//import com.sergej.warehouse.repositories.CarBrandRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class CarBrandService {
//
//    @Autowired
//    private CarBrandRepo carBrandRepo;
//    @Autowired
//    private ClientsRepo clientsRepo;
//
//    public CarBrandService(CarBrandRepo carBrandRepo, ClientsRepo clientsRepo) {
//        this.carBrandRepo = carBrandRepo;
//        this.clientsRepo = clientsRepo;
//    }
//
//    @Transactional(readOnly = true)
//    public List<CarBrandGetDTO> finadAllCarBrandss() {
//        return carBrandRepo.findAll().stream().map(brand ->
//                new CarBrandGetDTO(brand.getTitle(),brand.getLogo())
//        ).collect(Collectors.toList());
//    }
//
////    @Transactional
////    public void savePhoto(CarBrandPutDTO studio) {
////        CarBrand carBrand = new CarBrand(studio.getTitle(), studio.getLogo(), studio.getCategory(), studio.getSize(),Collections.emptySet());
////        carBrandRepo.save(carBrand);
////    }
//
//    @Transactional
//    public CarBrandGetDTO findByTitle(String title) {
//        CarBrand carBrand = carBrandRepo.findByTitle(title);
//        if(carBrand != null){
//            return new CarBrandGetDTO(carBrand.getTitle(), carBrand.getLogo());
//        }
//        else {
//            return null;
//        }
//    }
//
//    @Transactional
//    public void delete(String title) {
//        carBrandRepo.deleteByTitle(title);
//    }
//
//
//    @Transactional
//    public void CreateNewCarBrand(CarBrandPutDTO carBrandPutDTO) {
//        CarBrand carBrand = new CarBrand();
//        carBrand.setTitle(carBrandPutDTO.getTitle());
//        carBrand.setLogo(carBrandPutDTO.getLogo());
//        carBrandRepo.save(carBrand);
//    }
//
//    @Transactional
//    public void update(String title, CarBrandPutDTO carBrandPutDTO) {
//        CarBrand carBrand = carBrandRepo.findByTitle(title);
//        if(carBrand != null){
//            carBrand.setTitle(carBrandPutDTO.getTitle());
//            carBrand.setLogo(carBrandPutDTO.getLogo());
//        }
//    }
//
//    @Transactional
//    public List<ClientsGetDTO> getAllBrandDealers(String title) {
//        CarBrand carBrand = carBrandRepo.findByTitle(title);
//        if(carBrand != null){
//            return carBrand.getInventories().stream().map(dealer ->
//                    new ClientsGetDTO(dealer.getTitle(),
//                            dealer.getType(),
//                            dealer.getCountry())
//                    ).collect(Collectors.toList());
//        }
//        return null;
//    }
//
//    @Transactional
//    public void addCarBrand(String brand_title, String dealer_title) {
//        CarBrand carBrand = carBrandRepo.findByTitle(brand_title);
//        Inventory inventory = clientsRepo.findByTitle(dealer_title);
//        if(carBrand != null){
//            carBrand.getInventories().add(inventory);
//        }
//    }
//}
