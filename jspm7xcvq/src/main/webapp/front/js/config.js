
var projectName = '房屋租售网站';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '房屋出租',
	url: './pages/fangwuchuzu/list.jsp'
}, 
{
	name: '房屋出售',
	url: './pages/fangwuchushou/list.jsp'
}, 
{
	name: '房屋资讯',
	url: './pages/fangwuzixun/list.jsp'
}, 

{
	name: '留言反馈',
	url: './pages/messages/list.jsp'
}
]

var adminurl =  "http://localhost:8080/jspm7xcvq/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋类型","menuJump":"列表","tableName":"fangwuleixing"}],"menu":"房屋类型管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房东","menuJump":"列表","tableName":"fangdong"}],"menu":"房东管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋出租","menuJump":"列表","tableName":"fangwuchuzu"}],"menu":"房屋出租管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋出售","menuJump":"列表","tableName":"fangwuchushou"}],"menu":"房屋出售管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"购买订单","menuJump":"列表","tableName":"goumaidingdan"}],"menu":"购买订单管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"房屋资讯","menuJump":"列表","tableName":"fangwuzixun"}],"menu":"房屋资讯管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","租赁"],"menu":"房屋出租列表","menuJump":"列表","tableName":"fangwuchuzu"}],"menu":"房屋出租模块"},{"child":[{"buttons":["查看","购买"],"menu":"房屋出售列表","menuJump":"列表","tableName":"fangwuchushou"}],"menu":"房屋出售模块"},{"child":[{"buttons":["查看"],"menu":"房屋资讯列表","menuJump":"列表","tableName":"fangwuzixun"}],"menu":"房屋资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"buttons":["查看","删除","支付"],"menu":"购买订单","menuJump":"列表","tableName":"goumaidingdan"}],"menu":"购买订单管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看","租赁"],"menu":"房屋出租列表","menuJump":"列表","tableName":"fangwuchuzu"}],"menu":"房屋出租模块"},{"child":[{"buttons":["查看","购买"],"menu":"房屋出售列表","menuJump":"列表","tableName":"fangwuchushou"}],"menu":"房屋出售模块"},{"child":[{"buttons":["查看"],"menu":"房屋资讯列表","menuJump":"列表","tableName":"fangwuzixun"}],"menu":"房屋资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","房屋出租","房屋出售"],"menu":"房屋信息","menuJump":"列表","tableName":"fangwuxinxi"}],"menu":"房屋信息管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"房屋出租","menuJump":"列表","tableName":"fangwuchuzu"}],"menu":"房屋出租管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"房屋出售","menuJump":"列表","tableName":"fangwuchushou"}],"menu":"房屋出售管理"},{"child":[{"buttons":["查看","审核"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"buttons":["查看","审核"],"menu":"购买订单","menuJump":"列表","tableName":"goumaidingdan"}],"menu":"购买订单管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"}],"frontMenu":[{"child":[{"buttons":["查看","租赁"],"menu":"房屋出租列表","menuJump":"列表","tableName":"fangwuchuzu"}],"menu":"房屋出租模块"},{"child":[{"buttons":["查看","购买"],"menu":"房屋出售列表","menuJump":"列表","tableName":"fangwuchushou"}],"menu":"房屋出售模块"},{"child":[{"buttons":["查看"],"menu":"房屋资讯列表","menuJump":"列表","tableName":"fangwuzixun"}],"menu":"房屋资讯模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"房东","tableName":"fangdong"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
