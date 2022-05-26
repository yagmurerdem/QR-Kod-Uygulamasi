package tr.com.cinigaz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.cinigaz.entities.KioskQrKodEntity;

@Repository
public interface QrKodRepository extends JpaRepository<KioskQrKodEntity,Long> {
    KioskQrKodEntity findKioskQrKodBykioskQrKodId(Long kioskQrKodId);
    KioskQrKodEntity getByTesisatKodAndIslemGuid (String tesisatKod, String islemGuid );

}
