package subProj_1190

import subProj_1190.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1190")
    name = "subProj 1190"

    buildType(subProj_bt_1190_0)
    buildType(subProj_bt_1190_2)
    buildType(subProj_bt_1190_1)
    buildType(subProj_bt_1190_4)
    buildType(subProj_bt_1190_3)
    buildType(subProj_bt_1190_5)
})
