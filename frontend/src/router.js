
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OderManager from "./components/listers/OderCards"
import OderDetail from "./components/listers/OderDetail"
import PaymentManager from "./components/listers/PaymentCards"
import PaymentDetail from "./components/listers/PaymentDetail"

import StoredOrderManager from "./components/listers/StoredOrderCards"
import StoredOrderDetail from "./components/listers/StoredOrderDetail"

import TopFoodView from "./components/TopFoodView"
import TopFoodViewDetail from "./components/TopFoodViewDetail"
import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import NotificationLogManager from "./components/listers/NotificationLogCards"
import NotificationLogDetail from "./components/listers/NotificationLogDetail"

import OrderStatusView from "./components/OrderStatusView"
import OrderStatusViewDetail from "./components/OrderStatusViewDetail"

export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/oders',
                name: 'OderManager',
                component: OderManager
            },
            {
                path: '/oders/:id',
                name: 'OderDetail',
                component: OderDetail
            },
            {
                path: '/payments',
                name: 'PaymentManager',
                component: PaymentManager
            },
            {
                path: '/payments/:id',
                name: 'PaymentDetail',
                component: PaymentDetail
            },

            {
                path: '/storedOrders',
                name: 'StoredOrderManager',
                component: StoredOrderManager
            },
            {
                path: '/storedOrders/:id',
                name: 'StoredOrderDetail',
                component: StoredOrderDetail
            },

            {
                path: '/topFoods',
                name: 'TopFoodView',
                component: TopFoodView
            },
            {
                path: '/topFoods/:id',
                name: 'TopFoodViewDetail',
                component: TopFoodViewDetail
            },
            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/notificationLogs',
                name: 'NotificationLogManager',
                component: NotificationLogManager
            },
            {
                path: '/notificationLogs/:id',
                name: 'NotificationLogDetail',
                component: NotificationLogDetail
            },

            {
                path: '/orderStatuses',
                name: 'OrderStatusView',
                component: OrderStatusView
            },
            {
                path: '/orderStatuses/:id',
                name: 'OrderStatusViewDetail',
                component: OrderStatusViewDetail
            },


    ]
})
