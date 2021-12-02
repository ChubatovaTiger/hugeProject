package subProj_812

import subProj_812.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_812")
    name = "subProj 812"

    buildType(subProj_bt_812_4)
    buildType(subProj_bt_812_3)
    buildType(subProj_bt_812_5)
    buildType(subProj_bt_812_0)
    buildType(subProj_bt_812_2)
    buildType(subProj_bt_812_1)
})
