package services.tweetservice.serivces;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import services.tweetservice.domain.entity.Tweet;
import services.tweetservice.domain.entity.ValidationMarker;
import services.tweetservice.domain.request.TweetRequestTo;
import services.tweetservice.domain.response.TweetResponseTo;

import java.util.List;
import java.util.Optional;

public interface TweetService {
    @Validated(ValidationMarker.OnCreate.class)
    TweetResponseTo create(@Valid TweetRequestTo entity);

    List<TweetResponseTo> read();

    @Validated(ValidationMarker.OnUpdate.class)
    TweetResponseTo update(@Valid TweetRequestTo entity);

    void delete(Long id);

    TweetResponseTo findTweetById(Long id);

    Optional<Tweet> findTweetByIdExt(Long id);
}
