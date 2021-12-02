package subProj_1251

import subProj_1251.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1251")
    name = "subProj 1251"

    buildType(subProj_bt_1251_5)
    buildType(subProj_bt_1251_0)
    buildType(subProj_bt_1251_2)
    buildType(subProj_bt_1251_1)
    buildType(subProj_bt_1251_4)
    buildType(subProj_bt_1251_3)
})
