package com.momo.game.gameplay.service;

import com.momo.game.gameplay.model.*;
import com.momo.game.gameplay.repository.HiepRepository;
import com.momo.game.gameplay.repository.StatusRepository;
import com.momo.game.gameplay.repository.TranDauRepository;
import com.momo.game.gameplay.repository.UserRrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class service {
    @Autowired
    private User user;
    @Autowired
    private TranDau tranDau;
    @Autowired
    private Hiep hiep;

    @Autowired
    private TranDauRepository tranDauRepository;
    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private HiepRepository hiepRepository;

    @Autowired
    private UserRrepository userRrepository;

    public ResponseSubmitResult submit(int idUser, int idTranDau, int idHiep, String key) {

        Optional<Status> stt = statusRepository.findByHiep(idHiep);

        Status status = stt.get();
        Optional<TranDau> td = tranDauRepository.findById(idTranDau);
        TranDau tranDau = td.get();

        String tenDoiThu="";
        int userStt=1;

        if(idUser==tranDau.getUser1().getId()) {
            tenDoiThu = userRrepository.findById(tranDau.getUser2().getId()).get().getName();
        }
        else {
            userStt=2;
            tenDoiThu = userRrepository.findById(tranDau.getUser1().getId()).get().getName();
        }
        if (status.getKey() == null)
            status.setKey(key);
        else {
           int ketQua= soSanh(key,status.getKey());
          if(userStt==1) {
              if (ketQua == 1) {
                  List<Hiep> listHiep = hiepRepository.findByTranDauAndKetQua(idTranDau, 1);


                  return new ResponseSubmitResult(status.getKey(), "thang", tenDoiThu, status.getStt() + "", listHiep.size() + 1, status.getStt() == 3);
              }
              if (ketQua == -1) {
                  List<Hiep> listHiep = hiepRepository.findByTranDauAndKetQua(idTranDau, 1);


                  return new ResponseSubmitResult(status.getKey(), "thua", tenDoiThu, status.getStt() + "", listHiep.size(), status.getStt() == 3);
              }
              if (ketQua == 0) {
                  List<Hiep> listHiep = hiepRepository.findByTranDauAndKetQua(idTranDau, 1);


                  return new ResponseSubmitResult(status.getKey(), "hoa", tenDoiThu, status.getStt() + "", listHiep.size(), status.getStt() == 3);
              }
          }
          else
          {
              if (ketQua == 1) {
                  List<Hiep> listHiep = hiepRepository.findByTranDauAndKetQua(idTranDau, -1);


                  return new ResponseSubmitResult(status.getKey(), "thang", tenDoiThu, status.getStt() + "", listHiep.size() + 1, status.getStt() == 3);
              }
              if (ketQua == -1) {
                  List<Hiep> listHiep = hiepRepository.findByTranDauAndKetQua(idTranDau, -1);


                  return new ResponseSubmitResult(status.getKey(), "thua", tenDoiThu, status.getStt() + "", listHiep.size(), status.getStt() == 3);
              }
              if (ketQua == 0) {
                  List<Hiep> listHiep = hiepRepository.findByTranDauAndKetQua(idTranDau, -1);


                  return new ResponseSubmitResult(status.getKey(), "hoa", tenDoiThu, status.getStt() + "", listHiep.size(), status.getStt() == 3);
              }
          }


        }
        return null;


    }
    public int soSanh(String key1, String key2) {

        if (key1.equals(key2))
            return 0;
        else {
            if (key1.equals("keo")) {
                if (key2.equals("bua"))
                    return -1;
                else
                    return 1;
            }
            else if (key1.equals("bua")) {
                if (key2.equals("bao"))
                    return -1;
                else
                    return 1;
            }
            else {
                if (key2.equals("keo"))
                    return -1;
                else
                    return 1;
            }
        }
    }


}
