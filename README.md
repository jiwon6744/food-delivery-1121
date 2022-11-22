![image](https://user-images.githubusercontent.com/487999/79708354-29074a80-82fa-11ea-80df-0db3962fb453.png)

# 서비스 시나리오

[이벤트스토밍]
![image](https://user-images.githubusercontent.com/12772082/203239532-2d7e1e05-a823-463a-a57b-6220b31e1617.png)

기능적 요구사항
1. 고객이 메뉴를 선택하여 주문한다.
2. 고객이 선택한 메뉴에 대해 결제한다.
3. 주문이 되면 주문 내역이 입점상점주인에게 주문정보가 전달된다.
4. 상점주는 주문을 수락하거나 거절할 수 있다.
5. 상점주는 요리시작때와 완료 시점에 시스템에 상태를 입력한다.
6. 고객은 아직 요리가 시작되지 않은 주문은 취소할 수 있다.
7. 요리가 완료되면 고객의 지역 인근의 라이더들에 의해 배송건 조회가 가능하다.
8. 라이더가 해당 요리를 pick한 후, pick했다고 앱을 통해 통보한다.
9. 고객이 주문상태를 중간중간 조회한다.
10. 주문상태가 바뀔 때 마다 카톡으로 알림을 보낸다.
11. 고객이 요리를 배달 받으면 배송확인 버튼을 탭하여, 모든 거래가 완료된다.
12. < 주문량이 많은 음식을 랭킹으로 보여준다>
13. < 배달이 완료된 후에 리뷰작성 한다>

# 체크포인트
# Saga (pub / Sub)
![image](https://user-images.githubusercontent.com/12772082/203246633-1a2602c9-37cb-4b7d-bd78-ddbe9e99a1f3.png)
![image](https://user-images.githubusercontent.com/12772082/203246777-1d0080aa-b2c7-45b8-970a-2d13b7e54227.png)

# CQRS
Command and Query Responsibility Segregation(명령과 조회의 책임 분리)
주문/결제/수락/거절/픽업/배송완료 상태변경, 고객이 수시로 상태확인 가능함

![image](https://user-images.githubusercontent.com/12772082/203261226-69bf703f-b5d9-4207-aaea-3699248b7379.png)
![image](https://user-images.githubusercontent.com/12772082/203261355-1cb2f730-bcbc-4679-a8b9-02103d6bcb50.png)

# Compensation / Correlation
주문 취소 : 'cancel', 고객이 주문취소 버튼을 누른다.
![image](https://user-images.githubusercontent.com/12772082/203264287-8f407399-fe18-47f3-90ee-0a3c25c7c5ce.png)
![image](https://user-images.githubusercontent.com/12772082/203264794-5a72122a-2dd7-4b1e-b5e8-38b2f69db72d.png)

# Request / Response
고객 정보(주소)를 가져오기 위한 요청
![image](https://user-images.githubusercontent.com/12772082/203265993-8036b329-f9f7-4210-889b-7bc2d345c97e.png)
![image](https://user-images.githubusercontent.com/12772082/203266652-4fb99144-f188-427f-9d7a-da03ead5e414.png)
# Circuit Breaker
고객 정보를 가져온다. 10초동안 응답 지연되면 에러발생
![image](https://user-images.githubusercontent.com/12772082/203271787-55488e4e-6df8-4836-9c68-77fe0d8ac3ce.png)
# GateWay
![image](https://user-images.githubusercontent.com/12772082/203267143-94e86569-96fd-4499-af6e-67d7d65174d6.png)

# 추가사항
1) 배달이 완료되면 리뷰 작성한다.

![image](https://user-images.githubusercontent.com/12772082/203269591-5d2629ec-fe2a-4f58-9d41-c007adfa87a5.png)
![image](https://user-images.githubusercontent.com/12772082/203270024-a13d310b-d536-4d31-842f-8cb395d8dbe6.png)

2) 배달주문이 많은 음식을 조회할 수 있다.

![image](https://user-images.githubusercontent.com/12772082/203273007-4ed9718c-22aa-4c54-9c66-569192dd646a.png)


