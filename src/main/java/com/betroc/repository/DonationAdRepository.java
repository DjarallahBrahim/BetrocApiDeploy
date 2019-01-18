package com.betroc.repository;

import com.betroc.model.DonationAd;
import com.betroc.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface DonationAdRepository extends AdvertisementBaseRepository<DonationAd> {

    List<DonationAd> findAllByUser(Optional<User> usr);

}
