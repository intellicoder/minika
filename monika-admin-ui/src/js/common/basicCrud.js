/**
 * 提供通用crud方法的混入对象
 */
          
 const myMixin = {
    data() {
        return {
            isNoData: false,
            isShowLoding: true,
            name: "zhuzhiaaaa这里理工科"
        }
    },
    methods: {
        search() {
            alert("123aa"),
            this.msg = "傻逼"
        }
    },
    mounted() {
        alert(123)
    }
}
export default myMixin;