# coffeeToy
객체지향언어의 사실과 오해에 기반한 객체 설계 연습


## 요구사항

1. 손님은 커피를 주문 할 수 있다.
2. 손님은 주문 할 항목을 커피 메뉴판을 통해 확인 할 수 있다.
3. 커피 메뉴판은 커피 메뉴를 알 수 있다.
4. 손님은 커피를 선택하고, 바리스타에게 커피를 주문한다.
5. 커피는 1개가 아닌 여러 개를 주문 할 수 있다.
6. 주문항목은 손님이 주문 할 커피를 가지고 있다.
7. 결제 시 결제 방법을 선택할 수 있다.(카드, 현금)
8. 카드는 결제 금액 + 부가세 3% 를 추가로 낸다.
9. 결제가 성공적으로 완료되면 바리스타는 해당 커피를 제작한다.   
9-1. 잔액부족으로 결제가 실패하면 다른 방식으로 결제를 유도한다.   
 9-1-1. 이어서 부족하면 결제가 취소된다.
10. 바리스타는 나름의 방식으로 해당 커피를 제작한다.
11. 커피 제작이 완료되면 손님에게 커피를 건네준다.
12. 이 때, 커피 판매 금액이 오늘 하루 정산에 들어간다.
13. 오늘 하루 판매 금액 - 재료 지출이 순수익이다.
14. 바리스타가 판매 금액 or 재료 지출량 or 순수익 조회를 요청하면 보여준다.

## 요구사항 추가
- 포인트 카드로 포인트 적립
