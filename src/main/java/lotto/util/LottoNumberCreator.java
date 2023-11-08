package lotto.util;

import lotto.model.Lotto;
import lotto.model.LottoPrice;
import camp.nextstep.edu.missionutils.Randoms;
import lotto.model.TotalLotto;

import java.util.List;

public class LottoNumberCreator {
    public LottoNumberCreator(LottoPrice lottoPrice) {
        int numberForGenerateLottos = lottoPrice.getPrice() / 1000;
        createLottoTickets(numberForGenerateLottos);
    }

    private TotalLotto createLottoTickets(int numberForGenerateLottos) {
        TotalLotto totalLotto = new TotalLotto();
        for (int i = 0; i < numberForGenerateLottos; i++) {
            List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Lotto lotto = new Lotto(numbers);
            totalLotto.generateTotalLotto(lotto);
        }
        return totalLotto;
    }
}