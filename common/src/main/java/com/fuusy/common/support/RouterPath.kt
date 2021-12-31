package com.fuusy.common.support

/**
 * FileName: RouterActivityPath
 * Created by zlx on 2020/9/18 10:21
 * Email: 1170762202@qq.com
 * Description:
 */
class RouterPath {

    companion object{
        const val KEY_LIVEDATA_BUS_LOGIN = "KEY_LIVEDATA_BUS_LOGIN"
        const val KEY_PROJECT_ID = "KEY_PROJECT_ID"

        const val KEY_WEBVIEW_PATH = "KEY_WEBVIEW_PATH"
        const val KEY_WEBVIEW_TITLE = "KEY_WEBVIEW_TITLE"
    }

    /**
     * app组件
     */
    object Main {
        private const val MAIN = "/module_app"
        const val PATH_MAIN = MAIN + "/MainActivity"
    }

    /**
     * 登录组件
     */
    object Login {
        private const val LOGIN: String = "/module_login"
        const val PATH_LOGIN: String = LOGIN + "/LoginActivity"
        const val PATH_REGISTER: String = LOGIN + "/RegisterActivity"
    }

    /**
     * police组件
     */
    object Police {
        private const val POLICE = "/module_police"

        /**
         * 主页面
         */
        const val PAGER_POLICE = POLICE + "/police"

        //补卡
        const val PAGER_POLICE_BUKA = POLICE + "/buka"
        const val PAGER_LAWYER = POLICE + "/lawyer"
        const val PAGER_LEAVE = POLICE + "/leave"
        const val PAGER_MINE_LEAVE = POLICE + "/mine_leave"
    }

    /**
     * web 组件
     */
    object Web {
        private const val WEB = "/module_web"
        const val PATH_WEBVIEW = WEB + "/WebviewActivity"
    }

    /**
     * questions 组件
     */
    object Questions {
        private const val QUESTIONS = "/module_Questions"
        const val PATH_QUESTIONS = QUESTIONS + "/QuestionFg"
    }
}