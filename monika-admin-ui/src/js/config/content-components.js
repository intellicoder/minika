export default [
    {
        path: "/bookList",
        name: "bookList",
        component: (resolve) => require(['components/content/bookList'], resolve),
        meta: { title: '小说列表', icon: 'icon-paper' }
    }
]