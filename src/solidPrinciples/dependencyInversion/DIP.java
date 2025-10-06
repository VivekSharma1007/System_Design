package solidPrinciples.dependencyInversion;

public class DIP {
    public static void main(String[] args) {
        RecommendationModel recommendationModel = new RecommendationModel(new TrendingRecommendation());
        recommendationModel.recommend();
    }
}

// abstraction
interface RecommendationStrategy {
    void recommend();
}

// Low level module
// abstraction is not dependent upon the details
class TrendingRecommendation implements RecommendationStrategy {

    @Override
    public void recommend() {

    }
}

class RecentRecommendation implements RecommendationStrategy {

    @Override
    public void recommend() {

    }
}

// High level module
class RecommendationModel {
    private RecommendationStrategy recommendationStrategy;
    public RecommendationModel(RecommendationStrategy recommendationStrategy) {
        this.recommendationStrategy = recommendationStrategy;
    }

    public void recommend() {
        recommendationStrategy.recommend();
    }
}
