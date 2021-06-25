# Saga-Chor
Saga Choreography Implementation Using SpringWebflux. Event Driven Microservices

Order Service
Payment Service
Inventory Service

Run all above 3 services.
user order service end points to create and monitor order
1. localhost:8080/order/all (list order)
2. localhost:8080/order/create POST call with below body
 {
	"userId":1,
	"productId":3
}
