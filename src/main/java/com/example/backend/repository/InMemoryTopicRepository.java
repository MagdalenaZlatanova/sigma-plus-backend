package com.example.backend.repository;

import com.example.backend.model.Problem;
import com.example.backend.model.Topic;
import com.example.backend.model.Video;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class InMemoryTopicRepository {
    private List<Topic> topicList;

    @PostConstruct
    public void init() {
        topicList = new ArrayList<>();

        Problem condProb1 = new Problem("P and Q are considering to apply for a job. The probability that P applies for the job is 0.25, the probability that P applies for the job given that Q applies for the job is 0.5, and the probability that Q applies for the job given that P applies for the job is 0.33. Then the probability that P does not apply for the job given that Q does not apply for the job is",
                List.of("0.8", "0.9", "0.7", "0.25"), 0);
        Problem condProb2 = new Problem("A can solve 90% of the problems given in a book and B can solve 70%. What is the probability that at least one of them will soolve a problem, selected at random from the book?",
                List.of("0.16", "0.69", "0.97", "0.20"), 2);
        Problem condProb3 = new Problem("What is the probability that when a fair coin is tossed 2 times then at least one of them is heads?",
                List.of("0.25", "0.5", "0.75", "1"), 2);
        Problem condProb4 = new Problem("For two events R and S, let P(S)=p and P(R+S)=0.6. Then p equals",
                List.of("0.2, when R and S are independent", "0.2, when R and S are mutually disjoint", "Not determined in any case", "0.2, when R and S are dependent"), 1);

        Problem hypProb1 = new Problem("Which statement is not true about confidence intervals?",
                List.of("A confidence interval is an interval of values computed from sample data that is likely to include the true population value.",
                        "An approximate formula for a 95% confidence interval is sample estimate ± margin of error.",
                        "A confidence interval between 20% and 40% means that the population proportion lies between 20% and 40%.",
                        "A 99% confidence interval procedure has a higher probability of producing intervals that will include the population parameter than a 95% confidence interval procedure. "),
                2);
        Problem hypProb2 = new Problem("Which statement is not true about the 95% confidence level?",
                List.of("Confidence intervals computed by using the same procedure will include the true population value for 95% of all possible random samples taken from the population.",
                        "The procedure that is used to determine the confidence interval will provide an interval that includes the population parameter with probability of 0.95.",
                        "The probability that the true value of the population parameter falls between the bounds of an already computed confidence interval is roughly 95%. ",
                        " If we consider all possible randomly selected samples of the same size from a population, the 95% is the percentagage of those samples for which the confidence interval includes the population parameter. "),
                2);
        Problem hypProb3 = new Problem("Five hundred (500) random samples of size n=900 are taken from a large population in which 10% are left-handed. The proportion of the sample that is left-handed is found for each sample and a histogram of these 500 proportions is drawn. Which interval covers the range into which about 68% of the values in the histogram will fall?",
                List.of(".1 ± .010 Tocen",
                        ".1 ± .0134",
                        ".1 ± .0167",
                        ".1 ± .020 "),
                2);
        Problem hypProb4 = new Problem("A randomly selected sample of 400 students at a university with 15-week semesters was asked whether or not they think the semester should be shortened to 14 weeks (with longer classes). Fortysix percent (46%) of the 400 students surveyed answered \"yes.\" Which one of the following statements about the number 46% is correct?",
                List.of("It is a sample statistic. ",
                        "It is a population parameter.",
                        "It is a margin of error.",
                        "It is a standard error. "),
                0);
        Problem hypProb5 = new Problem("A poll is done to estimate the proportion of adult Americans who like their jobs. The poll is based on a random sample of 400 individuals. What is the “conservative” margin of error of this poll?",
                List.of("0.10",
                        " 0.05",
                        "0.04",
                        "0.025"),
                1);

        Problem rvProb1 = new Problem("Consider a dice with the property that that probability of a face with n dots showing up is proportional to n. The probability of face showing 4 dots is?",
                List.of(
                        "17",
                        "542",
                        "121",
                        "421"
                ),
                3);
        Problem rvProb2 = new Problem("Let X be a random variable with probability distribution function f (x)=0.2 for |x|<1 = 0.1 for 1 < |x| < 4 = 0 otherwise.\nThe probability P (0.5 < x < 5) is ___",
                List.of(
                        "0.3",
                        "0.5",
                        "0.4",
                        "0.8"
                ),
                2);
        Problem rvProb3 = new Problem("Mode is the value of x where f(x) is a maximum if X is continuous.",
                List.of(
                        "True",
                        "False"
                ),
                0);
        Problem rvProb4 = new Problem("E (XY)=E (X)E (Y) if x and y are independent.",
                List.of(
                        "True",
                        "False"
                ),
                0);
        Problem rvProb5 = new Problem("X is a variate between 0 and 3. The value of E(X2) is ____",
                List.of(
                        "8",
                        "7",
                        "27",
                        "9"
                ),
                3);
        Problem rvProb6 = new Problem("The random variables X and Y have variances 0.2 and 0.5 respectively. Let Z= 5X-2Y. The variance of Z is?",
                List.of(
                        "3",
                        "4",
                        "5",
                        "7"
                ),
                3);

        Problem linRegProb1 = new Problem("SSE can never be",
                List.of(
                        "larger than SST",
                        "smaller than SST",
                        "equal to 1",
                        "equal to zero"
                ),
                0);
        Problem linRegProb2 = new Problem("In regression analysis, the variable that is being predicted is the",
                List.of(
                        "response, or dependent, variable",
                        "independent variable",
                        "intervening variable",
                        "is usually x"
                ),
                0);
        Problem linRegProb3 = new Problem("The correlation coefficient is used to determine:",
                List.of(
                        "A specific value of the y-variable given a specific value of the x-variable",
                        "A specific value of the x-variable given a specific value of the y-variable",
                        "The strength of the relationship between the x and y variables",
                        "None of these"
                ),
                2);
        Problem linRegProb4 = new Problem("Larger values of r**2 (R2) imply that the observations are more closely grouped about the",
                List.of(
                        "average value of the independent variables",
                        "average value of the dependent variable",
                        "least squares line",
                        "origin"
                ),
                2);
        Problem linRegProb5 = new Problem("In a regression analysis if r**2 = 1, then",
                List.of(
                        "SSE must also be equal to one",
                        "SSE must be equal to zero",
                        "SSE can be any positive value",
                        "SSE must be negative"
                ),
                1);
        Problem bernProb1 = new Problem("Let X be the number of heads obtained in 40 independent tosses of a fair coin. Then X is a Binomial random variable with",
                List.of(
                        "n = 40, p = 0.",
                        "n = 0.5, p = 40.",
                        "n = 40, p = 0.5.",
                        "n = 100, p = 0."
                ),
                2);
        Problem bernProb2 = new Problem("What is the range of a Geometric random variable?",
                List.of(
                        "All integers.",
                        "All positive integers.",
                        "All non-negative integers.",
                        "All negative integers."
                ),
                2);
        Problem bernProb3 = new Problem("A Negative Binomial(r, p) random variable can be expressed as a sum of r Geometric(p) random variables. This statement is",
                List.of(
                        "True",
                        "False"
                ),
                0);


        Topic condTopic = new Topic("Conditional Probability",
                "Conditional probability is defined as the likelihood of an event or outcome occurring, based on the occurrence of a previous event or outcome.",
                "conditional.png",
                List.of(condProb1, condProb2, condProb3, condProb4),
                List.of(new Video("Independance", "https://www.youtube.com/embed/19Ql_Q3l0GA")));
        Topic bernTopic = new Topic("Bernoulli",
                "The Bernoulli distribution is a special case of the binomial distribution where a single trial is conducted (so n would be 1 for such a binomial distribution).",
                "bernulli.jpg",
                List.of(bernProb1, bernProb2, bernProb3),
                List.of(new Video("Bernoulli", "https://www.youtube.com/embed/O8vB1eInP_8")));

        Topic rvTopic = new Topic("Random Variables",
                "A random variable (also called random quantity, aleatory variable, or stochastic variable) is a mathematical formalization of a quantity or object which depends on random events.",
                "rv.jpg",
                List.of(rvProb1, rvProb2, rvProb3, rvProb4, rvProb5, rvProb6),
                List.of(new Video("Random Variables", "https://www.youtube.com/embed/3v9w79NhsfI")));

        Topic hypoTopic = new Topic("Hypothesis testing",
                "A statistical hypothesis test is a method of statistical inference used to decide whether the data at hand sufficiently support a particular hypothesis. Hypothesis testing allows us to make probabilistic statements about population parameters.",
                "HypothesisTesting_ST.jpg",
                List.of(hypProb1, hypProb2, hypProb3, hypProb4, hypProb5),
                List.of(new Video("Hypothesis testing", "https://www.youtube.com/embed/zJ8e_wAWUzE")));

        Topic linRegTopic = new Topic("Linear Regression",
                "Linear regression analysis is used to predict the value of a variable based on the value of another variable.",
                "linear-regression-plot.jpg",
                List.of(linRegProb1, linRegProb2, linRegProb3, linRegProb4, linRegProb5),
                List.of(new Video("Linear Regression", "https://www.youtube.com/embed/zPG4NjIkCjc")));

        topicList.add(condTopic);
        topicList.add(bernTopic);
        topicList.add(rvTopic);
        topicList.add(hypoTopic);
        topicList.add(linRegTopic);

    }

    public List<Topic> getAll() {
        return topicList;
    }

    public Topic getById(Long topicId) {
        return topicList.stream()
                .filter(topic -> topic.getId().equals(topicId))
                .findFirst()
                .orElse(null);
    }
}
